import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {
        super(600, 400, 1);
        
        addObject(new Restart(), 409, 317);
        addObject(new Home(), 191, 317);
        addObject(new Score(), 300, 189);
        addObject(new HighScore(), 301, 228);
    }
}
