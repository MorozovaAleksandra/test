package ru.itlab.realsanya;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

public class MainActivity extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;
    Basket screen;
    int speed = 2;
//    double speedSecond = 0.5;
    int x = 0;
    int y = 0;
//    int z = 0, w = 640;
    Texture strawberry;
    static Ball ball; // экземпляр мяча
    static Texture ballTexture; // текстура для мяча
    private static final float BALL_RESIZE_FACTOR = 2500f;
    public static Array<Ball> strawberrys = new Array<Ball>();
    int height = 640;
    int width = 320;

    public void initialize(){
        ball = new Ball();
        ballTexture = new Texture(Gdx.files.internal("strawberry (2).png"));
        ball.ballSprite = new Sprite(ballTexture);
        ball.ballSprite.setSize(ball.ballSprite.getWidth()* (width/BALL_RESIZE_FACTOR),
                ball.ballSprite.getHeight()*(width/BALL_RESIZE_FACTOR));
        ball.position.set(0.0f, height-ball.ballSprite.getHeight());
        ball.velocity.set(0, -5);
    }
    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("shopping-cart (1).png");
//        ball = new Ball();
//        ballTexture = new Texture(Gdx.files.internal("strawberry (2).png"));
//        ball.ballSprite = new Sprite(ballTexture);
//        ball.ballSprite.setSize(ball.ballSprite.getWidth()* (width/BALL_RESIZE_FACTOR),
//                ball.ballSprite.getHeight()*(width/BALL_RESIZE_FACTOR));
//        ball.position.set(0.0f, height-ball.ballSprite.getHeight());
//        ball.velocity.set(0, -5);

    }

    public void render() {
        Gdx.gl.glClearColor(0, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, x, y);
        if (Gdx.input.isButtonPressed(Input.Buttons.RIGHT)) {
            x += speed;
        }
        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
            x -= speed;
        }
        batch.end();
        ball.update();
        ball.render(batch);
//        for (int i = 0; i < 10; i++) {
//            batch.begin();
////            z = (int) Math.random();
//            batch.draw(strawberry,(int) Math.random(), w);
//            w -= speedSecond;
//            batch.end();
//        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
        strawberry.dispose();
        ballTexture.dispose();
    }
}
