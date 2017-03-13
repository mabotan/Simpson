import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bart extends Player
{
    /**
     * Act - do whatever the Bart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ((Sky)getWorld()).randomMonster();
        if(isTouching(Monster.class)){
            Greenfoot.stop();
        }
    }   
}
