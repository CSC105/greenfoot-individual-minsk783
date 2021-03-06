import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle01 extends Actor
{
    GreenfootImage image = new GreenfootImage("Obstacle_01.png");
    int temp = 0;
    int x = 0;
    
    public Obstacle01(int pic){
        GreenfootImage img[] = new GreenfootImage[4];
        img[0]= new GreenfootImage("Obstacle_01.png");
        img[1]= new GreenfootImage("Obstacle_03.png");
        img[2]= new GreenfootImage("Obstacle_05.png");
        img[3]= new GreenfootImage("Obstacle_06.png");
        img[0].scale(45,63);
        img[1].scale(45,63);
        img[2].scale(60,60);
        img[3].scale(60,60);
        if(pic == 0)setImage(img[0]);
        if(pic == 1)setImage(img[1]);
        if(pic == 2)setImage(img[2]);
        if(pic == 3)setImage(img[3]);
    }

    public void act() {
        move((-5));
        touchObstacle();
    }

    public void touchObstacle(){
        Actor obstacle = getOneObjectAtOffset(0, 0, Flamingo.class);
        if(obstacle != null){
            Flamingo.lifeCount--;
            getWorld().removeObject(this);
        }
    }
    
    /*
    private void checkObstacle(){
		x = 0;
		x = Greenfoot.getRandomNumber(2000);
		while(x < 1000){
			x = Greenfoot.getRandomNumber(2000);
		}
		getWorld().addObject(new Obstacle01(), x, 276);
		getWorld().removeObject(this);
	}
	*/
}
