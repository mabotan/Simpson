import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky2 extends World
{
    public static GreenfootSound music = new GreenfootSound("sound.sky3.mp3");
    
    /**
     * Constructor for objects of class Sky2.
     * 
     */
    
    public void act(){
         music.playLoop();
    }
    public Sky2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
        TopBG2 topbg = new TopBG2();
        addObject(topbg, 400, 85);
        
        MidBG2 midbg = new MidBG2();
        addObject(midbg, 400, 310);
        
        BotBG2 botbg = new BotBG2();
        addObject(botbg, 400, 530);
    }
}
