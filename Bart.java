import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bart extends Player
{
    public GreenfootSound song;
    /**
     * Act - do whatever the Bart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    boolean timeout = false;
    boolean canJump = true;
    int jump = 10;
    int count = 61;
    int currentY = 0;
    public Bart(){
        score = 0;
    }
    public void act() 
    {
        if(getWorld().getObjects(MonBig.class).size() == 0) getWorld(). addObject(new MonBig(), 750, 400);
        if(currentY == 0) currentY = getY();
        checkHit();
        World w = getWorld();
        chk();
          if(count>0){
          count--;
        }
      
        if(count==0){
          count=61;
        }
        
        
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
           World w = getWorld();
           Greenfoot.playSound("fail.mp3");
           if(w instanceof Sky){
               ((Sky)getWorld()).stop();
                Greenfoot.setWorld (new EndGame2(((Sky)getWorld()).getScore()));
            }
             if(w instanceof Sky2){
                 ((Sky2)getWorld()).stop();
                Greenfoot.setWorld (new EndGame2(((Sky2)getWorld()).getScore()));
            }
             if(w instanceof Sky3){
                 ((Sky3)getWorld()).stop();
                Greenfoot.setWorld (new EndGame2(((Sky3)getWorld()).getScore()));
            }
         }
         
    }
    
    public void chk(){

        if(Greenfoot.isKeyDown("space")&&canJump){
            for(int i =0;i<20;i++){
                if(i<10){
                    setLocation(getX(),getY()-i);
                }
            }
         
        // Greenfoot.playSound("Jumping.mp3");
         
        }
        else{
            if(currentY > getY() + 10){
             
            setLocation(getX(),getY()+6);
           }
        }

    }
    

    
  
    }

    
    

