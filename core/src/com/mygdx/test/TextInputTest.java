package com.mygdx.test;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class TextInputTest extends Game {

	String TAG="TextInputTest";
	MyListener myListener;
	AScreen aScreen;

	@Override
	public void create () {
		Gdx.app.log(TAG,"create");
		myListener=new MyListener();
		aScreen=new AScreen(this);
		setScreen(aScreen);
	}

	@Override
	public void resize(int w,int h){
		Gdx.app.log(TAG,"resize");
		super.resize(w,h);
	}

	@Override
	public void render(){
		super.render();
	}

	@Override
	public void pause(){
		Gdx.app.log(TAG,"pause");
		super.pause();
	}

	@Override
	public void resume(){
		Gdx.app.log(TAG,"resume");
		super.resume();
	}

	@Override
	public void dispose () {
		Gdx.app.log(TAG,"dispose");
		super.dispose();
	}
}
