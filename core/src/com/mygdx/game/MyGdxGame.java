package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.resolvers.ExternalFileHandleResolver;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.google.protobuf.*;
import com.google.protobuf.AbstractMessage.Builder;

public class MyGdxGame extends ApplicationAdapter {
	Builder kdk;
	SpriteBatch batch;
	Texture img;
	Texture playerSprite;
	TextureRegion playerStance;
	
	TiledMap map;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		playerSprite = new Texture("BODY_animation.png");
		playerStance = new TextureRegion(playerSprite, 0, 0, 64, 64);
//		map = new TmxMapLoader(new ExternalFileHandleResolver()).load("map.tmx");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
//		batch.draw(img, 0, 0);
		batch.draw(playerStance, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		playerSprite.dispose();
	}
}
