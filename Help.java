import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
     private void prepare()
    {
        Helper helper = new Helper();
        addObject(helper, 422, 332);
        
        ExitButton exitbutton = new ExitButton();
        addObject(exitbutton, 481, 441);
        
        PlayGameButton playgamebutton = new PlayGameButton();
        addObject(playgamebutton, 351, 440
        );
    }
}
