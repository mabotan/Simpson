import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{
    public int BartPosX;
    public int BartPosY; 
    private int score=0;
    public static GreenfootSound music = new GreenfootSound("pataponsound.mp3");
   
    
    /**
     * Constructor for objects of class Sky.
     * 
     */
    
    int a;
    private boolean timeout = false;
    
    public void stop(){
        music.stop();
    }
    
    public Sky()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
        randomMonster();
        setPaintOrder(CountMoney.class,CollectMoney.class);
        this.score = 0;

        a = 500;
    }
    
    private void prepare()
    {
        TopBG topbg = new TopBG();
        addObject(topbg, 400, 85);
        
        MidBG midbg = new MidBG();
        addObject(midbg, 400, 310);
        
        BotBG botbg = new BotBG();
        addObject(botbg, 400, 530);
        
        Bart bart = new Bart();
        addObject(bart, 134, 417);
        
        CountMoney countmoney = new CountMoney();
        addObject(countmoney, 724, 22);
        
        CollectMoney collectmoney = new CollectMoney();
        addObject(collectmoney, 720, 20);
        
        GreenfootImage name = new GreenfootImage(SelectLevel.name, 30, Color.WHITE, Color.BLACK);
        Name na = new Name();
        na.setImage(name);
        addObject(na, 400, 23);

        Home home = new Home();
        addObject(home, 81, 23);

        Restart restart = new Restart();
        addObject(restart, 175, 23);
        
         addObject(new Bomb(), getWidth()/2 , getHeight()/2 -100);


    }
    
    public void act(){
     if(Greenfoot.mouseClicked(null))
     {
        MouseInfo mouse=Greenfoot.getMouseInfo();
        Greenfoot.playSound("bom.mp3");
        Ammo ammo = new Ammo(mouse.getX(),mouse.getY());
        addObject(ammo, 127, 386);
        
    }
    music.playLoop();
        showText("Time : "+(a--/100) , 400, 50);
        
        if(a==0){
            music.stop();
            Greenfoot.playSound("bart_job-done1.mp3");
            Greenfoot.setWorld(new EndGame(score));
        }
       
         /*if(a==0){
            music.stop();
            addObject(new ScoreResult(),400,300);
            addObject(new Win(),414,260);
            addObject(new Home(),340,336);
            addObject(new Restart(),478,336);
            addObject(new CountMoney(),455,392);
            timeout = true;
            a=0;
            Greenfoot.playSound("good.mp3");
        }else a--;*/
        
    
  
        
    }
    
    public void randomMonster(){
    int m = Greenfoot.getRandomNumber(50);
    /*if(m==70){
        addObject(new MonFly(), 744, 196);
    }else */ if(m==25){
        addObject(new MonLand(), 797, 430);
    
    }
    
    }
    
     public void setScore(int n){
        score+=n;
    }
    
    public int getScore(){
        return score;
    }
    public boolean isTimeout(){
        return timeout;
    }
    
    }




  
