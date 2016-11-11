package com.mygdx.test;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class AScreen extends ScreenAdapter {

    private final TextInputTest game;

    public AScreen(TextInputTest libGdxAdventure) {
        this.game = libGdxAdventure;
    }

    public void show(){
        Gdx.input.getTextInput(game.myListener,"Textinput","text","some hint");
    }

    @Override
    public void render(float delta){
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
