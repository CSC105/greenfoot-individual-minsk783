import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private BgComponent[] group1;
    private BgComponent[] group2;
    private int counterObstacle = 0;
    private int counterAcorn = 0;
    private int counterHeart = 0;
    private int counterSpeed = 0;
    private int counterScore = 0;
    private int increaseObs = 0;
    private boolean over;

    private final int MIN_SPEED = 48;
    private final int MAX_SPEED = 55;
    private final int INC_SPEED = 1;
    
    private int currentSpeed;
    private int totalFrame;
    
    private GreenfootSound bgSound;
    
    public MyWorld()
    {    
        super(600, 400, 1, false);
        group1 = new BgComponent[4];
        group1[0] = new Ground(); 
        addObject( group1[0] , 300, 370);        
        group1[1] = new Field();
        addObject(group1[1], 300, 300);        
        group1[2] = new Tree(); 
        addObject( group1[2] , 200, 199);        
        group1[3] = new Forest();
        addObject(group1[3], 400, 200);
        
        group2 = new BgComponent[4];
        group2[0] = new Ground(); 
        addObject( group2[0] , 900, 370);        
        group2[1] = new Field();
        addObject(group2[1], 900, 300);        
        group2[2] = new Tree(); 
        addObject( group2[2] , 998, 199);        
        group2[3] = new Forest();
        addObject(group2[3], 1199, 200);
        addObject(new Sky(), 300, 200);
        addObject(new Flamingo(), 100, 276);
        
        Life life = new Life();
        Score score = new Score();
        
        addObject(life,300,31);
        addObject(new Score(), 300, 74);
        
        setPaintOrder(Life.class, Score.class, Flamingo.class, Ground.class, Heart.class, Obstacle01.class, Acorn.class, Field.class, Tree.class, Forest.class);
        
        currentSpeed = MIN_SPEED;
        Greenfoot.setSpeed(currentSpeed);
        
        bgSound = new GreenfootSound("Gameplay.wav");
        bgSound.playLoop();
    }
    
    public void act(){
        totalFrame++;
        if( totalFrame % 500 == 0 ){
            if( currentSpeed + INC_SPEED <= MAX_SPEED){
                currentSpeed += INC_SPEED;
                Greenfoot.setSpeed(currentSpeed);
            }
        }
        moveBg( group1, 1 );
        moveBg( group2, 1 );
        counterObstacle++;
        counterAcorn++;
        counterHeart++;
        counterScore++;
        if(counterObstacle == 150){
            int ranObs = Greenfoot.getRandomNumber(4);
            addObject(new Obstacle01(ranObs), 650, 304);
            counterObstacle = Greenfoot.getRandomNumber(70);
        }
        if(counterAcorn == 12){
            addObject(new Acorn(), 650, 272);
            counterAcorn = 0;
        }
        if(counterHeart == 3000){
            addObject(new Heart(), 650, 160);
            counterHeart = Greenfoot.getRandomNumber(100);
        }
    }
    
    public void moveBg(BgComponent[] group, double scale){
        group[0].setLocation(group[0].getX()- (int)(5 * scale), group[0].getY());
        group[1].setLocation(group[1].getX()- (int)(4 * scale), group[1].getY());
        group[2].setLocation(group[2].getX()- (int)(3 * scale), group[2].getY());
        group[3].setLocation(group[3].getX()- (int)(2 * scale), group[3].getY());
        if(group[0].getX() <= -300) group[0].setLocation(900, group[0].getY());
        if(group[1].getX() <= -300) group[1].setLocation(900, group[1].getY());
        if(group[2].getX() <= -400) group[2].setLocation(995, group[2].getY());
        if(group[3].getX() <= -400) group[3].setLocation(1195, group[3].getY());
    }
    
    public void stopSound(){
        bgSound.stop();
    }
}
    

