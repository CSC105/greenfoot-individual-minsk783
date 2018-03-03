import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    private GreenfootImage[] images = new GreenfootImage[36];
    private GreenfootImage[] lifeImage = new GreenfootImage[5];
    private int frame = 1;
    private int num = 1;
    private int scoreCounter = 0;
    private int count = 5;
    boolean isJump =  false;
    boolean isFlying = false;
    public static int lifeCount = 5;
    public static boolean scoreCheck;
    
    public Flamingo(){
        lifeCount = 5;
        for(int i = 1; i <= images.length; i++){
            images[i-1] = new GreenfootImage("Flamingo"+i+".png");
            images[i-1].scale(75, 125);
        }
        setImage(images[0]);
    }

    public void act(){
        fall();
        checkKeys();
        jump(isJump);
        animation();
        getAcorn();
    }

    public void animation(){
        if(frame == 0) frame = 1;
        if(frame == 1){
            setImage(images[num]);
            num++;
            if(num>=images.length) num = 0;
        }
        if(frame > 0) frame--;
        scoreCounter++;
        if(scoreCounter == 10 && !scoreCheck){
            Score.score++;
            scoreCounter = 0;
        }
    }

    private void checkKeys(){
        if(Greenfoot.isKeyDown("space") && isFlying == false){
            isJump = true;
            isFlying = true;
        }
    }

    public void fall(){
        if(getY() < 276){
            setLocation(getX(), getY()+7);
        }
        if(getY() >= 276){
            isFlying = false;
        }
    }

    public void jump(boolean a){
        if(getY() > 150 && a == true){
            setLocation(getX(), getY()-15);
        }else{
            isJump = false;
        }
    }

    public void getAcorn(){
        Actor acorns = getOneObjectAtOffset(0, 0, Acorn.class);
        if(acorns != null){
            World myWorld = getWorld();
            myWorld.removeObject(acorns);
            Score.score += 10;
        }
    }
}
