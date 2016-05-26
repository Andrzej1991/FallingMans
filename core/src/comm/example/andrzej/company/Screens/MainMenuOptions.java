package comm.example.andrzej.company.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import comm.example.andrzej.company.FallingPeopleMain;

/**
 * Created by Andrzej on 2016-05-26.
 */
public class MainMenuOptions extends AbstractScreen implements Screen {

    Stage stage;
    TextButton button;
    TextButton.TextButtonStyle textButtonStyle;
    BitmapFont font;
    Skin skin;
    TextureAtlas buttonAtlas;
    private Texture backgroundTexture;


    public MainMenuOptions(FallingPeopleMain game) {
        super(game);
        init();
    }

     private void init() {
        backgroundTexture = new Texture("BG.png");

         stage = new Stage();
         Gdx.input.setInputProcessor(stage);
         font = new BitmapFont();
         skin = new Skin();
         buttonAtlas = new TextureAtlas(Gdx.files.internal("button.pack"));
         skin.addRegions(buttonAtlas);
         textButtonStyle = new TextButton.TextButtonStyle();
         textButtonStyle.font = font;
         textButtonStyle.up = skin.getDrawable("up-button");
         textButtonStyle.down = skin.getDrawable("down-button");
         textButtonStyle.checked = skin.getDrawable("checked-button");
         button = new TextButton("Button1", textButtonStyle);
         stage.addActor(button);
    }

    @Override
    public void render(float delta) {
        spriteBatch.begin();
        spriteBatch.draw(backgroundTexture, 0, 0);
        stage.draw();
        spriteBatch.end();

    }
}

