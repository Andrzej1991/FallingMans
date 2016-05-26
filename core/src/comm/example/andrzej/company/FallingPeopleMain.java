package comm.example.andrzej.company;

import com.badlogic.gdx.Game;

import comm.example.andrzej.company.Screens.SplashScreen;

public class FallingPeopleMain extends Game {
	public final static String GAME_NAME = "Help The Falling Mans";
	public final static int WIDTH = 480;
	public final static int HEIGHT = 720;

	private boolean paused;

	@Override
	public void create () {
      this.setScreen(new SplashScreen(this));
	}

	public boolean isPaused() {return paused;}

	public void setPaused(boolean paused) {this.paused = paused;}
}
