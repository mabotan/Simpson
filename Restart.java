import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends SkyButton
{
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Restart();
    }
   
    public void Restart() {
    if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("button.wav");
            World w = getWorld();
            if(w instanceof Sky){
               ((Sky)getWorld()).stop();
            }
            if(w instanceof Sky2){
                 ((Sky2)getWorld()).stop();
            }
            if(w instanceof Sky3){
                 ((Sky3)getWorld()).stop();
            }
            Greenfoot.setWorld (new SelectLevel()) ;
    }
    } 
}
