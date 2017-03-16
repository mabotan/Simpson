import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky2 extends World
{
    public int BartPosX;
    public int BartPosY; 
    private int score=0;
    public static GreenfootSound music = new GreenfootSound("sound.sky2.mp3");
   
    
    /**
     * Constructor for objects of class Sky.
     * 
     */
    
    int a;
    private boolean timeout = false;
    public void stop(){
        music.stop();
    }
    public Sky2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
        randomMonster();
        setPaintOrder(CountMoney.class,CollectMoney.class);
       //this.score = score;
       this.score = 0;
       a = 12000;
    }
    
    private void prepare()
    {
        TopBG2 topbg = new TopBG2();
        addObject(topbg, 400, 85);
        
        MidBG2 midbg = new MidBG2();
        addObject(midbg, 400, 310);
        
        BotBG2 botbg = new BotBG2();
        addObject(botbg, 400, 530);
        
        Bart bart = new Bart();
        addObject(bart, 134, 417);
        
        CountMoney countmoney = new CountMoney();
        addObject(countmoney, 724, 22);
        
        CollectMoney collectmoney = new CollectMoney();
        addObject(collectmoney, 720, 20);

        Home home = new Home();
        addObject(home, 81, 23);

        Restart restart = new Restart();
        addObject(restart, 175, 23);
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
    if(m==40){
        addObject(new MonFly(), 744, 196);
    }else if(m==35){
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
