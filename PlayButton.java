import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends controlTitle
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
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
        Greenfoot.playSound("button.wav");
        //Greenfoot.setWorld (new Sky()) ; 
        Greenfoot.setWorld (new SelectLevel()) ;     
    }
    
    if (!mouseOver && Greenfoot.mouseMoved(this))
    {
        setImage("PlayNow2.png");
        mouseOver = true;
    }
    if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))
    {
       setImage("PlayNow.png");
       mouseOver = false;

    }
}
}
