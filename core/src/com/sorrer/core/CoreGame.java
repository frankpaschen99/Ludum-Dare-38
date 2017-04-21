package com.sorrer.core;

import com.badlogic.gdx.Game;
import com.sorrer.core.screens.SplashScreen;

public class CoreGame extends Game{
	
	@Override
	public void create () {
		setScreen(new SplashScreen(this));
		// testing branches 4-21-17
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
