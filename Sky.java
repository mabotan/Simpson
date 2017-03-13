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
    public static GreenfootSound music = new GreenfootSound("Candy.wav");
   
    
    /**
     * Constructor for objects of class Sky.
     * 
     */
    
    int a;
    public Sky()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
        randomMonster();
        setPaintOrder(CountMoney.class,CollectMoney.class);
        

        a = 3000;
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
    }
    
    public void act(){
     if(Greenfoot.mouseClicked(null))
     {
        MouseInfo mouse=Greenfoot.getMouseInfo();
        Greenfoot.playSound("bom.mp3");
        Ammo ammo = new Ammo(mouse.getX(),mouse.getY());
        addObject(ammo, 127, 386);
        music.playLoop();
    }
    
        showText("Time : "+(a--/100) , 400, 50);
        if(a==0){
            Greenfoot.setWorld(new Sky2());
        }
    
    }
    
    public void randomMonster(){
    int m = Greenfoot.getRandomNumber(200);
    if(m==20){
        addObject(new MonFly(), 744, 196);
    }else if(m==10){
        addObject(new MonLand(), 797, 430);
    }
    }
    
     public void setScore(int n){
        score+=n;
    }
    
    public int getScore(){
        return score;
        
    }
}


  
