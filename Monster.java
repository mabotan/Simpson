import greenfoot.*;

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends ToolMethod
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        dead();
        removeTouching(Ammo.class);
    }    
    //public void hit
    public void dead(){
        if(getX()==0){
            getWorld().removeObject(this);
        }
        
        
    }
}
