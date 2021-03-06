package com.rusic_game;

import java.util.ArrayList;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rusic_game.screens.GameScreen;
import com.rusic_game.screens.MainScreen;
import com.rusic_game.screens.MusicSelectScreen;
import com.rusic_game.screens.ScoreScreen;
import com.rusic_game.screens.SettingScreen;
import com.rusic_game.screens.SplashScreen;


public class Rusic_Game extends Game {

	private SpriteBatch spriteBatch;
	public MainScreen mainScreen;
	public GameScreen gameScreen;
	public SplashScreen splashScreen;
	public SettingScreen settingsScreen;
	public MusicSelectScreen musicSelectScreen;
	public ScoreScreen scoreScreen;
	public ArrayList<String> musicinfo;
	public ArrayList<String> musicpath;
	public boolean isAndroid;

	@Override
	public void create() {
		
		Texture.setEnforcePotImages(false);
		spriteBatch = new SpriteBatch();
		splashScreen = new SplashScreen(this, spriteBatch);
		mainScreen = new MainScreen(this, spriteBatch);
		gameScreen = new GameScreen(this, spriteBatch);
		settingsScreen = new SettingScreen(this, spriteBatch);
		musicSelectScreen = new MusicSelectScreen(this, spriteBatch);
		scoreScreen = new ScoreScreen(this, spriteBatch);
		setScreen(splashScreen);
	}
	
	public Rusic_Game() {
		
	}
	
	public Rusic_Game(ArrayList<String> musicpath, ArrayList<String> musicinfo,boolean isAndroid){
		this.musicinfo=musicinfo;
		this.musicpath=musicpath;
		this.isAndroid=isAndroid;
	}

	@Override
	public void dispose() {

	}

	@Override
	public void render() {		
		super.render();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	
}