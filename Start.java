import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    public void act() 
    {
        Score.score = 0;
    }
    
    public Start(){
        GreenfootImage image = getImage();  
        setImage(image);
    }
}
