import greenfoot.*;  

public class Fish1 extends Actor
{
    private int speed;
    public Fish1()
    {
        speed=Greenfoot.getRandomNumber(4)+1;
    }
    
    public void act()
    {
        setLocation(getX()-speed,getY());
        if(getX() == 0)
        {
            MyWorld.score.add(0);
            Level2.score.add(-1);
            Level3.score.add(-2);
            getWorld().removeObject(this);
        }
    }
}
