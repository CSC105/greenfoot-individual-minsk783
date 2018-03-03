import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{
    private GreenfootSound sound;
    private boolean clicked;
    
    public void act(){
        if( !sound.isPlaying() && !clicked){
          sound.play();
        }
        if(Greenfoot.isKeyDown("space")){
            sound.stop();
            clicked = true;
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    public HomePage()
    {    
        super(600, 400, 1);
        addObject(new Start(), 400, 182);
        addObject(new HowToJump(), 498, 228);
        sound = new GreenfootSound( "Home.wav" );
        sound.setVolume(100);
        clicked = false;
    }
}
