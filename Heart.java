import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    GreenfootImage image = new GreenfootImage("Heart.png");
    int temp = 0;

    public void act()
    {
        move((-5));
        if(temp % 13 == 0){
            setImage(image);
            image.scale(30, 30);
        }
        temp++;
        touchHeart();
    }

    public void touchHeart(){
        Actor heart = getOneObjectAtOffset(0, 0, Flamingo.class);
        if(heart != null){
            Flamingo.lifeCount++;
            getWorld().removeObject(this);
            Greenfoot.playSound("get_heart.wav");
            Score.score += 500;
        }
    }
}
