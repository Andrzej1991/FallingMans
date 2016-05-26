package comm.example.andrzej.company.Screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

import comm.example.andrzej.company.FallingPeopleMain;

/**
 * Created by Andrzej on 2016-05-26.
 */
public class MainMenuOptions extends AbstractScreen implements Screen {

    private Texture backgroundTexture;
    public MainMenuOptions(FallingPeopleMain game) {
        super(game);
        init();
    }

     private void init() {
        backgroundTexture = new Texture("BG.png");
    }

    @Override
    public void render(float delta) {
        spriteBatch.begin();
        spriteBatch.draw(backgroundTexture, 0, 0);
        spriteBatch.end();

    }
}

