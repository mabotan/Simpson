import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGame2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGame2 extends World
{
    
    /**
     * Constructor for objects of class EndGame2.
     * 
     */
    public EndGame2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new ScoreResult(),400,300);
        addObject(new GameOver(),414,260);
       addObject(new Home(),340,336);
       addObject(new Restart(),478,336);
       addObject(new CountMoney(),455,392);
       
    }

}
