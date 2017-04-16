package com.sorrer.core.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.sorrer.core.CoreGame;

public class GameScreen implements Screen{
	
	CoreGame game;
	OrthographicCamera cam;
	OrthographicCamera uicam;
	SpriteBatch b;
	ShapeRenderer sr;
	
	World world;
	
	
	
	public GameScreen(CoreGame g){
	}
	
	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		update();
	}
	
	public void update(){
	}

	@Override
	public void resize(int width, int height) {
		cam.viewportWidth = Gdx.graphics.getWidth();
		cam.viewportHeight = Gdx.graphics.getHeight();
		cam.update();
		uicam.viewportWidth = Gdx.graphics.getWidth();
		uicam.viewportHeight = Gdx.graphics.getHeight();
		uicam.position.set(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2, 0);
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
