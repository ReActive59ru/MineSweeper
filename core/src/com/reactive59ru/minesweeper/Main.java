package com.reactive59ru.minesweeper;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.reactive59ru.minesweeper.View.GameScreen;

public class Main extends Game {

	private Screen gameScreen;

	@Override
	public void create () {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}


}
