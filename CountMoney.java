import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CountMoney here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountMoney extends Actor
{
    /**
     * Act - do whatever the CountMoney wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getWorld() instanceof Sky){
        int score = ((Sky)getWorld()).getScore();
        Color c = new Color(255,255,255,0);
        setImage(new GreenfootImage(""+score,22,Color.BLACK,c));
        }
        if(getWorld() instanceof Sky2){
        int score = ((Sky2)getWorld()).getScore();
        Color c = new Color(255,255,255,0);
        setImage(new GreenfootImage(""+score,22,Color.BLACK,c));
        }
        if(getWorld() instanceof Sky3){
        int score = ((Sky3)getWorld()).getScore();
        Color c = new Color(255,255,255,0);
        setImage(new GreenfootImage(""+score,22,Color.BLACK,c));
        }
        
    }    
}
