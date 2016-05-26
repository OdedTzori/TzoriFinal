package com.odedtzori.game.states;

import com.badLogic.gdx.graphics.Texture;
import com.badLogic.gdx.graphics.g2d.SpriteBatch;
import com.odedtzori.game.FlappyDemo;

/**
 * Created by Oded on 5/24/2016.
 */
public class PlayState extends State {
    private Bird bird;
    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Bird(50, 1000);
        cam.setToOrtho(false, FlappyDemo.WIDTH / 2, FlappyDemo.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {
        bird.update(dt);
        if(gdx.input.justTouched())
            bird.jump();
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bird.getTexture(), bird.getPosition().x, bird.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
