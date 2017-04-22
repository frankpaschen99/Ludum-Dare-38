package com.sorrer.core.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.sorrer.utils.Assets;
import com.sorrer.utils.PrintLog;

import box2dLight.RayHandler;

public class WorkerAnt extends AntBase {
	
	public WorkerAnt(int posX, int posY) {
				
		super(Assets.manager.get(Assets.worker_ant), posY, posY);

	}
	
	@Override
	public void update() {
		// Perform update logic 
	}
	
	@Override
	public void draw(SpriteBatch b, ShapeRenderer sr) {
	
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLights(RayHandler rayH) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vector2 getPos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPos(float x, float y) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vector2 getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void draw(SpriteBatch b) {
		sprite.draw(b);
		PrintLog.printGame("Sprite pos: " + this.sprite.getX() + ", " + this.sprite.getY());
	}

}
