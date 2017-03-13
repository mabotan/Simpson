import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        PlayButton playbutton = new PlayButton();
        addObject(playbutton, 415, 512);
        playbutton.setLocation(410, 511);
        
        HowToPlay howtoplay = new HowToPlay();
        addObject(howtoplay, 451, 332);
        howtoplay.setLocation(414, 343);
    }
}
