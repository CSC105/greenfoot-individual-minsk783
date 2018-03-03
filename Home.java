import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new HomePage());
        }
    }
    
    public Home(){
        GreenfootImage image = getImage();  
        setImage(image);
    }
}
