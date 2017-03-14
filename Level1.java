import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends SelectButton
{
    /**
     * Act - do whatever the Level1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean mouseOver =false;
    
    public void act() 
    {
        active();
    }
    
    public void active()
    {
    if (Greenfoot.mouseClicked(this) )
	{
        Greenfoot.playSound("good.mp3");
        Greenfoot.setWorld (new Sky()) ;     
    }
    
    if (!mouseOver && Greenfoot.mouseMoved(this))
    {
        setImage("Level12.png");
        mouseOver = true;
    }
    if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))
    {
       setImage("Level11.png");
       mouseOver = false;

    }
}
}
