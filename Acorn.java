import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Acorn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acorn extends Actor
{
    GreenfootImage image = new GreenfootImage("Acorn.png");
    int temp = 0;
    boolean check;

    public void act() 
    {
        move((-5));
        if(temp % 13 == 0){
            setImage(image);
        }
        temp++;
    }
    
    /*
    public void preDelete()
    {
        if(getWorld().getObjects(Obstacle01.class).size() != 0 )
        {
            Actor obs = (Actor)getWorld().getObjects(Obstacle01.class).get(0);
            if(Math.abs(getX() - obs.getX()) < 50){
                getWorld().removeObject(this);
            }
        }
    }
    */
}

