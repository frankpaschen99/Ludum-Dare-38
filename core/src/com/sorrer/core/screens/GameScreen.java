package com.sorrer.core.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.World;
import com.sorrer.core.CoreGame;
import com.sorrer.core.entities.WorkerAnt;
import com.sorrer.utils.CamUtils;
import com.sorrer.utils.PrintLog;

public class GameScreen implements Screen {

	CoreGame game;
	OrthographicCamera cam;
	OrthographicCamera uicam;
	SpriteBatch b;
	ShapeRenderer sr;

	World world;
	
	WorkerAnt w;

	public GameScreen(CoreGame g) {
		this.game = g;

		this.world = new World(new Vector2(), false);

		this.b = new SpriteBatch();
		this.sr = new ShapeRenderer();

		this.cam = new OrthographicCamera();
		this.uicam = new OrthographicCamera();
		uicam.viewportWidth = Gdx.graphics.getWidth();
		uicam.viewportHeight = Gdx.graphics.getHeight();
		uicam.position.set(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, 0);
		uicam.update();

		cam.viewportWidth = Gdx.graphics.getWidth();
		cam.viewportHeight = Gdx.graphics.getHeight();
		cam.position.set(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, 0);
		cam.update();
		CamUtils.curCam = this.cam;
		
		w = new WorkerAnt(0, 0);
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		// perform update logic here
		cam.update();
		b.setProjectionMatrix(cam.combined);
		
		Gdx.gl.glClearColor( 0, 0, 0, 1 );
	    Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );
	    
	    
	    
		b.begin();

	    w.draw(b);
	    
	    b.end();

		// Camera Movement (arrow keys) 
	    Vector3 velocity = new Vector3();
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			Vector3 velUp = new Vector3();
			velUp.y = -1;
			velocity.add(velUp);
		}
		else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			Vector3 velDown = new Vector3();
			velDown.y = 1;
			velocity.add(velDown);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			Vector3 velLeft = new Vector3();
			velLeft.x = 1;
			velocity.add(velLeft);
		}
		else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			Vector3 velRight = new Vector3();
			velRight.x = -1;
			velocity.add(velRight);
		}
		float length = (float) Math.sqrt((Math.pow(velocity.x, 2)) + (Math.pow(velocity.y, 2)));

		if (length > 0.001) {
			velocity.nor();
			PrintLog.printGame("camera translated");
			cam.translate(velocity.x, velocity.y);
		}

	}

	@Override
	public void resize(int width, int height) {
		cam.viewportWidth = Gdx.graphics.getWidth();
		cam.viewportHeight = Gdx.graphics.getHeight();
		cam.update();
		uicam.viewportWidth = Gdx.graphics.getWidth();
		uicam.viewportHeight = Gdx.graphics.getHeight();
		uicam.position.set(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, 0);
		uicam.update();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {

	}

}
