import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Button
{
    boolean mouseOver =false;
    /**
     * Act - do whatever the ExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        BackHome ();
        Active();
    }
    
    public void BackHome () {
    if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("button.wav");
            Greenfoot.setWorld (new MyWorld()) ;
    }
    
    }
    public void Active(){
        if (!mouseOver && Greenfoot.mouseMoved(this))
        {
            setImage("exitButton2.PNG");
            mouseOver = true;
        }
        if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))
        {
           setImage("exitButton.png");
           mouseOver = false;

         }
    }
}
