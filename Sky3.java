import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky3 extends World
{
    public static GreenfootSound music = new GreenfootSound("sound.sky3.mp3");

    /**
     * Constructor for objects of class Sky3.
     * 
     */
    public void act(){
        music.playLoop();
    }
    
    public Sky3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
        TopBG3 topbg = new TopBG3();
        addObject(topbg, 400, 85);
        
        MidBG3 midbg = new MidBG3();
        addObject(midbg, 400, 310);
        
        BotBG3 botbg = new BotBG3();
        addObject(botbg, 400, 530);
    }
}
