package comm.example.andrzej.company;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Andrzej on 2016-05-26.
 */
public class MainMenuOptions extends AbstractScreen {

    public static Texture backgroundTexture;
    public static Sprite backgroundSprite;


    public MainMenuOptions(FallingPeopleMain game) {
        super(game);

    }


    private void loadTextures() {
        backgroundTexture = new Texture("chmury.jpg");
        backgroundSprite =new Sprite(backgroundTexture);


    }



    public void render() {
        spriteBatch.begin();
        renderBackground();

        spriteBatch.end();
    }
public void renderBackground() {
    backgroundSprite.draw(spriteBatch);
}
}