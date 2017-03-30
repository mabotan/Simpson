import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class SelectLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevel extends World
{

    /**
     * Constructor for objects of class SelectLevel.
     * 
     */
    public static String name;
    public SelectLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
        Level1 level1 = new Level1();
        addObject(level1, 202, 403);
        
        Level2 level2 = new Level2();
        addObject(level2, 407, 403);
        
        Level3 level3 = new Level3();
        addObject(level3, 608, 403);
        name = JOptionPane.showInputDialog("Please input your name");
        
       
    }
}
