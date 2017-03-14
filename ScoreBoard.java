import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
//import java.awt.Font;
import java.util.Calendar;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    public ScoreBoard()
    {
        this("",100);
    }
    public ScoreBoard(String title, int score)
    {
        makeImage(title, "Score: ", score);
    }
    private void makeImage(String title, String prefix, int score)
    {
        if(title.equals("Victory!!")) 
            Greenfoot.playSound("good2.mp3");
        else 
            Greenfoot.playSound("fail.mp3");
        
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        image.setColor(new Color(255,255,255, 128));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 60, 100);
        image.drawString(prefix + score, 60, 200);
        setImage(image);
        
    }
}
