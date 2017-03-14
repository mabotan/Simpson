import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList ;
/**
 * Write a description of class Ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammo extends ToolMethod
{
    private int delay = 3  ;
   // private CollectMoney collectmoney ;
   // private int points = 0;
    private boolean hit = false ; 
    boolean ishit = false;
    public int start =1;
    /**
     * Act - do whatever the Ammo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(10);
       
       if(ishit){
            if(start<10){
                GreenfootImage g = new GreenfootImage("images/Explore/bomb"+start+".png");
                setImage(g);
                start++;
            }else{
                
            removeTouching(Monster.class);
            if(getWorld() instanceof Sky){
               ((Sky)getWorld()).setScore(5); 
            (getWorld()).removeObject(this); 
            }
            if(getWorld() instanceof Sky2){
               ((Sky2)getWorld()).setScore(5); 
            (getWorld()).removeObject(this); 
            }
            if(getWorld() instanceof Sky3){
               ((Sky3)getWorld()).setScore(5); 
            (getWorld()).removeObject(this); 
            }

            }
        }else 
        if(isTouching(Monster.class)){
             ishit=true;
        }else     
        if(isAtEdge()){
            (getWorld()).removeObject(this);
            //System.out.println(1);
        }
    }
    
    public Ammo(int x,int y){
        double dx = x-127;
        double dy = y-386;
        double angle = Math.atan2(dy,dx)*180.0/Math.PI;
        setRotation( (int)angle);
    
    }
    
    
}
