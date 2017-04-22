package com.sorrer.core.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sorrer.utils.entity.Entity;

/* Ant superclass, represents various types of ants */
public abstract class AntBase extends Entity {
	
	protected Sprite sprite;
	
	public AntBase(Texture t, int posX, int posY) {
		this.sprite = new Sprite(t);
		this.sprite.setPosition(posX, posY);
	}
	public abstract void draw(SpriteBatch b);
}
