package comm.example.andrzej.company.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import comm.example.andrzej.company.FallingPeopleMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = FallingPeopleMain.GAME_NAME;
		config.width = FallingPeopleMain.WIDTH;
		config.height = FallingPeopleMain.HEIGHT;

		config.resizable = false;
		new LwjglApplication(new FallingPeopleMain(), config);
	}
}
