package com.sorrer.core.screens;

import com.badlogic.gdx.Screen;
import com.sorrer.core.CoreGame;

public class MainMenuScreen implements Screen {
	CoreGame game;
	
	public MainMenuScreen(CoreGame game) {
		this.game = game;
		
		//Temporary Place Holder

	}
	
	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		game.setScreen(new GameScreen(game));
	}

	@Override
	public void resize(int width, int height) {
		
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
