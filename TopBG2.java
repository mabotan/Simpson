import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TopBG2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopBG2 extends ScrollBG
{
    /**
     * Act - do whatever the TopBG2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int baseX = 0;
    // 'bgi' stands for BackGroundImage
    GreenfootImage bgi;
    int bgiWidth;
    
    public void act() 
    {
        baseX = 799;
        update();
    }    
    public TopBG2()
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