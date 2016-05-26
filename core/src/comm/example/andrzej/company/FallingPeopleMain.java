package comm.example.andrzej.company;

import com.badlogic.gdx.Game;

public class FallingPeopleMain extends Game {
	public final static String GAME_NAME = "Help The Falling Mans";
	public final static int WIDTH = 480;
	public final static int HEIGHT = 720;

	@Override
	public void create () {
      this.setScreen(new SplashScreen(this));
	}


}
