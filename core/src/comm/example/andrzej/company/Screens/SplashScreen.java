package comm.example.andrzej.company.Screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;

import comm.example.andrzej.company.FallingPeopleMain;

/**
 * Created by Andrzej on 2016-05-26.
 */
public class SplashScreen extends AbstractScreen {
    
    private Texture splashIMG;
    
    public SplashScreen(final FallingPeopleMain game){
        super(game);
        init();

      Timer.schedule(new Timer.Task() {
          @Override
          public void run() {
              game.setScreen(new MainMenuOptions(game));
          }
      }, 3);
    }

    private void init() {
        splashIMG = new Texture("chmury.png");
    }
    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();

        spriteBatch.draw(splashIMG, 0, 0);

        spriteBatch.end();
    }
}
