import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonFly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonFly extends Monster
{
    private int speed = 5;
    int x=1;
    int delay=5;
    int countDelay=2; 
    /**
     * Act - do whatever the MonFly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       walk();
       changeImage();
       dead();
    }
    
    public void walk(){
        setLocation(getX()-speed,getY());
    }
    
    public void changeImage(){
       if( countDelay == delay){
             if(x<2){
                x++;
                }else{
                   x=1;
           }
           GreenfootImage g = new GreenfootImage("images/monster_bin"+x+".png");
           setImage(g);
           countDelay=0;
          }else{
          countDelay++;

        }
   }
 }