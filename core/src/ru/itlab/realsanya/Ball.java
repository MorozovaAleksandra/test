package ru.itlab.realsanya;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Ball {


        public Sprite ballSprite;// спрайт для отображения мяча
        public Vector2 position = new Vector2(); // вектор для обозначения позиции
        public Vector2 velocity = new Vector2(); // вектор для обозначения скорости

        public void render(SpriteBatch batch){
            batch.begin();
            ballSprite.draw(batch);
            batch.end();
        }

        public void update() {
    }
}
