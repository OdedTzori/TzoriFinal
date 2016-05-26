package com.odedtzori.game.states;

import com.badLogic.gdx.graphics.Texture;
import com.badLogic.gdx.graphics.g2d.SpriteBatch;
import com.odedtzori.game.FlappyDemo;

/**
 * Created by Oded on 5/23/2016.
 */
public class MenuState extends State {
    private Texture background;
    private Texture playBtn;
    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        background = new Texture("playBtn.png");
    }

    @Override
    public void handleInput() {
        if(gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
        sb.draw(playBtn, (FlappyDemo.WIDTH / 2) - (PlayBtn.getWidth() / 2), (FlappyDemo.HEIGHT / 2))
        sb.end();
    }

    @Override
    public void dispose(){
        background.dispose();
        playBtn.dispose();
    }
}
