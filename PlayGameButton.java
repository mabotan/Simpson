import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayGameButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayGameButton extends Button
{
    boolean mouseOver =false;
    /**
     * Act - do whatever the PlayGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        PlayGame();
        Active();
    }
    
    public void PlayGame() {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("button.wav");
            //Greenfoot.setWorld (new Sky()) ; 
            Greenfoot.setWorld (new SelectLevel()) ;
        }
    }
    public void Active(){
        if (!mouseOver && Greenfoot.mouseMoved(this))
        {
            setImage("PlayButton2.PNG");
            mouseOver = true;
        }
        if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))
        {
           setImage("PlayButton1.PNG");
           mouseOver = false;

         }
    }
   
}
