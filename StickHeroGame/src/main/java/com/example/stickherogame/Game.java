package com.example.stickherogame;


import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayDeque;
import java.util.Queue;



public class Game implements Render,Movable {
    private int HighScore;
    private ControllerSceneTwo controllerSceneTwo;

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
    }

    private boolean isFinished;
    private Player player;
    public static Queue<Platform> platforms;
    public static Queue<Cherry> cherries;
    private final int PLATFORM_COUNT=2;
    private int CURRENT_PLATFORM_COUNT;

    public int getCURRENT_PLATFORM_COUNT() {
        return CURRENT_PLATFORM_COUNT;
    }

    public void setCURRENT_PLATFORM_COUNT(int CURRENT_PLATFORM_COUNT) {
        this.CURRENT_PLATFORM_COUNT = CURRENT_PLATFORM_COUNT;
    }

    public Game(boolean value, ControllerSceneTwo cont2, int platform_count){
        this.isFinished=value;
        Game.platforms= new ArrayDeque<>();
        Game.cherries=new ArrayDeque<>();
        this.controllerSceneTwo=cont2;
        this.CURRENT_PLATFORM_COUNT=platform_count;
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
    public void runner(){
        // run the game until not finished
        while (isFinished==false){


        }
        Platform.randomGenerator();
        Platform.randomGenerator();
        Platform platformStart = platforms.remove();
        Platform platformEnd = platforms.remove();
        controllerSceneTwo.renderPlatforms(platformStart,platformEnd);

    }

    public void start(){
        // called for first time only
        //generate 2 platforms
        Platform.randomGenerator();
        Platform.randomGenerator();
        //update the current platfrom count
        setCURRENT_PLATFORM_COUNT(2);
        //add the platform to screen
        Platform platform1 = Game.platforms.remove();
        Platform platform2 = Game.platforms.remove();
        controllerSceneTwo.renderPlatforms(platform1,platform2);
        //now load a player object
        Image playerImage = new Image(getClass().getResource("/com/example/stickherogame/Images/player-removebg-preview.png").toExternalForm());
        Player player = new Player(0,0,45,80,null,50,50,playerImage);
        //now perform calculation on setLayoutX for player object
        player.setLayoutX(97);
        //now add player to screen
        controllerSceneTwo.renderPlayerObject(player);
    }


}
