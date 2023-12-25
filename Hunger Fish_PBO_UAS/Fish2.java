import greenfoot.*; 

public class Fish2 extends Actor
{
    private int speed;
    public Fish2()
    {
        speed=Greenfoot.getRandomNumber(3)+1;
    }

    public void act()
    {
        setLocation(getX()-speed,getY());
        if (getX() == 0)
        {
            MyWorld.score.add(0);
            Level2.score.add(-2);
            Level3.score.add(-3);
            getWorld().removeObject(this);
        }
    }
}
