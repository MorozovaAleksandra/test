package ru.itlab.realsanya;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Basket implements Screen {
    SpriteBatch batch;
    Texture img;
    int speed = 80;
    int x = 0;
    int y = 0;

    @Override
    public void show() {
        batch = new SpriteBatch();
        img = new Texture("shopping-cart (1).png");
    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
        x += speed * delta;
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
