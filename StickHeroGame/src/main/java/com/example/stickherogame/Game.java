package com.example.stickherogame;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.LongStream;

public class Game implements Render,Movable {
    private int HighScore;

    public int getHighScore() {
        return HighScore;
    }

    public void setHighScore(int highScore) {
        HighScore = highScore;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
        Game.platforms= new ArrayDeque<>();
        Game.cherries=new ArrayDeque<>();
    }

    private boolean isFinished;
    private Player player;
    public static Queue<Platform> platforms;
    public static Queue<Cherry> cherries;
    private final int PLATFORM_COUNT=2;

    public Game(boolean value){
        this.isFinished=value;
    }
    @Override
    public double move(double distance) {
        return 0;
    }

    @Override
    public void render() {
    }

    public void changeScene1to2(){}
    public void generatePlatforms(){}
    public void generateCherries(){}
    Player renderPlayer(){
        return null;
    }
    Cherry renderCherries(){
        return null;
    }
    public boolean isSuccessfull(){
        return false;
    }
    public void changeScene2to3(){}
    public void runner(){}
}