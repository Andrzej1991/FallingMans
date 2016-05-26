package comm.example.andrzej.company;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Andrzej on 2016-05-26.
 */
public class SplashScreen extends AbstractScreen {
    
    private Texture splashIMG;
    
    public SplashScreen(final FallingPeopleMain game){
        super(game);
        init();

      com.badlogic.gdx.utils.Timer.schedule(new com.badlogic.gdx.utils.Timer.Task() {
          @Override
          public void run() {
              game.setScreen(new MainMenuOptions(game));
          }
      }, 3);
    }

    private void init() {
        splashIMG = new Texture("chmury.jpg");
    }
    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();

        spriteBatch.draw(splashIMG, 0, 0);

        spriteBatch.end();
    }
}
