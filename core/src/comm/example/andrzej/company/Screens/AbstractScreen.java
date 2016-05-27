package comm.example.andrzej.company.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

import comm.example.andrzej.company.FallingPeopleMain;

/**
 * Created by Andrzej on 2016-05-26.
 */
public class AbstractScreen implements Screen{
    protected FallingPeopleMain game;
    protected OrthographicCamera camera;
    protected Stage stage;
    protected SpriteBatch spriteBatch;



    public AbstractScreen (FallingPeopleMain game){
        this.game = game;
        createCamera();
        stage = new Stage(new StretchViewport(FallingPeopleMain.WIDTH, FallingPeopleMain.HEIGHT, camera));
        spriteBatch = new SpriteBatch();
        Gdx.input.setInputProcessor(stage);
    }


    private void createCamera() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, FallingPeopleMain.WIDTH /2, FallingPeopleMain.HEIGHT/ 2);
        camera.update();

    }


    @Override
    public void show() {}

    @Override
    public void render(float delta) {
       clearScreen();
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);

    }

    private void clearScreen() {
       Gdx.gl.glClearColor(0, 0, 0, 0);
       Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {game.setPaused(true);}

    @Override
    public void resume() {game.setPaused(false);}

    @Override
    public void hide() {}

    @Override
    public void dispose() {game.dispose();}
}
