import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Score.score = 0;
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    public Restart(){
        GreenfootImage image = getImage();  
        setImage(image);
    }
}
