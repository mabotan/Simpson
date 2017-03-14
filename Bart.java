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
    int score = 0;
    boolean timeout = false;
    public Bart(){
        score = 0;
    }
    public void act() 
    {
        checkHit();
        World w = getWorld();
        
        /*if(w instanceof Sky){
             timeout = ((Sky)getWorld()).isTimeout();
        }
             if(w instanceof Sky2){
             timeout = ((Sky2)getWorld()).isTimeout();
        }
        
             if(w instanceof Sky3){
             timeout = ((Sky3)getWorld()).isTimeout();
        }
        if(timeout){
            getWorld().removeObject(this);
        }
        else{*/
            if(w instanceof Sky){
                ((Sky)getWorld()).randomMonster();
                score = ((Sky)getWorld()).getScore();
            }
             if(w instanceof Sky2){
                ((Sky2)getWorld()).randomMonster();
                score = ((Sky2)getWorld()).getScore();
            }
             if(w instanceof Sky3){
                ((Sky3)getWorld()).randomMonster();
                score = ((Sky3)getWorld()).getScore();
            }
            
        
            
            /*
            if(isTouching(Monster.class)){
                
                Greenfoot.setWorld (new EndGame());
                
            }
            
        
            /*if(isTouching(Monster.class)){
                World ww = getWorld();
                if(ww instanceof Sky){
                    ((Sky)getWorld()).music.stop();
                }
                 if(ww instanceof Sky2){
                    ((Sky2)getWorld()).music.stop();
                }
                 if(ww instanceof Sky3){
                    ((Sky3)getWorld()).music.stop();
                }*/
                //Greenfoot.playSound("fail.mp3");
                /*getWorld().addObject(new ScoreResult(),400,300);
                getWorld().addObject(new GameOver(),414,260);
                getWorld().addObject(new Home(),340,336);
                getWorld().addObject(new Restart(),478,336);
                getWorld().addObject(new CountMoney(),455,392);*/
            }
      public void checkHit(){
         if(isTouching(Monster.class)){
           Greenfoot.setWorld (new EndGame2());       
         }
    }
}
    
    

