import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends Actor
{
    public static int highScore = 0;
    
    public void act() 
    {
        compare();
        setImage(new GreenfootImage("High Score : " + highScore, 24, Color.RED, Color.WHITE));
    }
    
    public void compare(){
        if(Score.score > highScore){
            highScore = Score.score;
        }
    }
}
