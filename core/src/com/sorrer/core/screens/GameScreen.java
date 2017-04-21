package com.sorrer.core.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.sorrer.core.CoreGame;
import com.sorrer.utils.CamUtils;

public class GameScreen implements Screen {

	CoreGame game;
	OrthographicCamera cam;
	OrthographicCamera uicam;
	SpriteBatch b;
	ShapeRenderer sr;

	World world;

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
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		update();
	}

	public void update() {
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
