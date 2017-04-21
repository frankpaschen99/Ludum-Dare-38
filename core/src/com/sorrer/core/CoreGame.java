package com.sorrer.core;

import com.badlogic.gdx.Game;
import com.sorrer.core.screens.SplashScreen;

public class CoreGame extends Game{
	// fucc u niBBa
	@Override
	public void create () {
		setScreen(new SplashScreen(this));
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
