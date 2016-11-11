package com.mygdx.test;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

/**
 * Created by peter on 11/10/16.
 */

public class MyListener implements Input.TextInputListener {

    @Override
    public void input(String text){
        Gdx.app.log("listener input",text);
    }

    @Override
    public void canceled(){
        Gdx.app.log("listener canceled","");
    }

}
