package com.rusic_game.screens;

	import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.badlogic.gdx.Gdx;
	import com.badlogic.gdx.Screen;
	import com.badlogic.gdx.graphics.GL20;
	import com.badlogic.gdx.graphics.Texture;
	import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rusic_game.Rusic_Game;

	public class ScoreScreen implements Screen{

		private Rusic_Game game;
		private SpriteBatch spriteBatch;
		private Texture settingsScreenTexture;
		private int width, height;
		public int deaths;
		public int powerups;
		public int distance;
		public ArrayList<String> songs;
		public ArrayList<Integer> highscores;
		
		//CONSTRUCTOR
		public ScoreScreen(Rusic_Game game, SpriteBatch spriteBatch) {
			this.game = game;
			this.spriteBatch = spriteBatch;
			songs = new ArrayList();
			highscores = new ArrayList();
			importData();
		}
		
		//THIS METHOD WILL BE USED TO READ IN DATA FROM assets/data/scores.txt
		public void importData(){
			String data = Gdx.files.internal("data/scores.txt").readString(); // THIS STRING HOLDS THE DATA FROM SCORES FILE
			Scanner s = new Scanner(data);
			s.next();
			deaths = s.nextInt();
			s.next();
			powerups = s.nextInt();
			s.next();
			distance = s.nextInt();
			s.nextLine();
			while(s.hasNext()){
				s.nextLine();
				songs.add(s.nextLine());
				highscores.add(s.nextInt());
				if(s.hasNext()){
					s.nextLine();
				}
			}
		}
		
		@Override
		public void render(float delta) {
			//CLEARS SCREEN
			Gdx.gl.glClearColor(0, 0, 0, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			//CHANGES TO MAINSCREEN WHEN TOUCHED
			if(Gdx.input.justTouched()){
				game.setScreen(game.mainScreen);
			}	
			spriteBatch.begin();
			spriteBatch.draw(settingsScreenTexture, 0, 0, width, height);
			spriteBatch.end();
		}
		@Override
		public void resize(int width, int height) {
			this.width = width;
			this.height= height;
			
			
		}
		@Override
		public void show() {
			settingsScreenTexture = new Texture(Gdx.files.internal("images/SettingsScreen.png"));
			
		}
		@Override
		public void hide() {
			
		}
		@Override
		public void pause() {
			
		}
		@Override
		public void resume() {
			
		}
		@Override
		public void dispose() {
			
		}
	}