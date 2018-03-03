import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor

{
    GreenfootImage[] lifeImage = new GreenfootImage[5];
    
    public Life(){
        for(int i = 0; i < lifeImage.length; i++){
            lifeImage[i] = new GreenfootImage("Life"+(i+1)+".png");
        }
    }
   
    public void act(){
        if(Flamingo.lifeCount == 6){
            Flamingo.lifeCount = 5;
        }
        if(Flamingo.lifeCount == 5){
            this.setImage(lifeImage[4]);
        }
        if(Flamingo.lifeCount == 4){
            this.setImage(lifeImage[3]);
        }
        if(Flamingo.lifeCount == 3){
            this.setImage(lifeImage[2]);
        }
        if(Flamingo.lifeCount == 2){
            this.setImage(lifeImage[1]);
        }
        if(Flamingo.lifeCount == 1){
            this.setImage(lifeImage[0]);
        }
        if(Flamingo.lifeCount == 0){
            ((MyWorld)getWorld()).stopSound();
            Greenfoot.playSound("GameOver.wav");
            Greenfoot.setWorld(new GameOver());
            Flamingo.scoreCheck = false;
        }
    }
}
