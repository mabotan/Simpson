import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends SkyButton
{
    
    /**
     * Act - do whatever the Home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        BackMenu();
        
    }
   
    public void BackMenu() {
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
            Greenfoot.setWorld (new MyWorld()) ;
    }
    }
}
