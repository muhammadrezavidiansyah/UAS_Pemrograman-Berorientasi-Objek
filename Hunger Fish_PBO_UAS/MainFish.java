import greenfoot.*; 
public class MainFish extends Actor
{
    public void act()
    {
        checkKeyPress();
        checkCollision();
    }
    private void checkKeyPress(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-6);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+6);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4,getY());
        }
    }
    private void checkCollision()
    {
        if(isTouching(Fish1.class)){
            removeTouching(Fish1.class);
            MyWorld.score.add(2);
            Level2.score.add(3);
            Level3.score.add(4);
            Greenfoot.playSound("bite1.wav");
        }
        if(isTouching(Fish2.class)){
            removeTouching(Fish2.class);
            MyWorld.score.add(4);
            Level2.score.add(5);
            Level3.score.add(6);
            Greenfoot.playSound("bite2.wav");
        }
        if(isTouching(Fish3.class)){
            removeTouching(Fish3.class);
            Level2.score.add(6);
            Level3.score.add(7);
            Greenfoot.playSound("bite3.wav");
        }
    }
}
