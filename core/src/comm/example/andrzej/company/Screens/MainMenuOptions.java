package comm.example.andrzej.company.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

import comm.example.andrzej.company.FallingPeopleMain;

/**
 * Created by Andrzej on 2016-05-26.
 */
public class MainMenuOptions extends AbstractScreen implements Screen {

    private Texture newGameButton;
    private Texture exitGameButton;
    private Texture highScoresButton;
    private Texture background;





    public MainMenuOptions(FallingPeopleMain game) {
        super(game);
        init();



    }



    private void init() {
        newGameButton = new Texture("newGameButton.jpg");
         exitGameButton = new Texture("exitGameButton.jpg");
         highScoresButton = new Texture("highScoresGameButton.jpg");
         background = new Texture("test.png");


    }
    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        float x = Gdx.graphics.getWidth();
        float y = Gdx.graphics.getHeight();


    }

    @Override
    public void render(float delta) {
        spriteBatch.begin();

        spriteBatch.draw(background,(FallingPeopleMain.WIDTH/2)- camera.position.x, camera.position.y);

        spriteBatch.draw(newGameButton, 180, 380);
        spriteBatch.draw(highScoresButton, 180, 340);
        spriteBatch.draw(exitGameButton, 180, 300);

        spriteBatch.end();

    }
}

