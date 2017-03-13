import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotBG3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BotBG3 extends ScrollBG
{
    /**
     * Act - do whatever the BotBG3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int baseX = 0;
    // 'bgi' stands for BackGroundImage
    GreenfootImage bgi;
    int bgiWidth;
    
    public void act() 
    {
        baseX = 792;//ค่าตรงนี้ถ้าลดลงจะเร็วขึ้น ห้ามถึง800 it will error (800 width od screen)
        update();
    }
    
    public BotBG3()
    { 
        bgi=getImage();
        bgiWidth = bgi.getWidth();
    }
    
    private void update()
    {
        if (baseX != 0) getImage().drawImage(bgi, baseX - bgiWidth, 0);
        if (baseX < bgi.getWidth()) getImage().drawImage(bgi, baseX, 0);     
    } 
}
