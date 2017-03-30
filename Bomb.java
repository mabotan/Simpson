import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x = 0;
    public Bomb(){

    }
    public void act() 
    {
        move(3);
        if(getY() >= getWorld().getHeight()-10 || getY() <= 0 || getX() >= getWorld().getWidth()-10
        || getX() <= 0){
           int num =  Greenfoot.getRandomNumber(3);
            x = (x+(30*num))%360;
            setRotation(x);
        }
    }    
}
