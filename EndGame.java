import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGame extends World
{

    /**
     * Constructor for objects of class EndGame.
     * 
     */
    int score = 0;
    public EndGame(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        //Greenfoot.playSound("good.mp3");
        addObject(new ScoreResult(),400,300);
        addObject(new Win(),414,260);
        addObject(new Home(),340,336);
        addObject(new Restart(),478,336);
        this.score = score;
    }
    public void act(){
        showText(""+score,455,392);
    }
    
}
