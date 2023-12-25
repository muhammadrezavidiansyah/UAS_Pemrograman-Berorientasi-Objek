import greenfoot.*;  

public class Fish3 extends Actor
{
    private int speed;
    public Fish3()
    {
     speed=Greenfoot.getRandomNumber(3)+1;
    }

    public void act()
    {
        setLocation(getX()-speed,getY());
        if(getX() == 0)
        {
            Level2.score.add(0);
            Level3.score.add(-2);
            getWorld().removeObject(this);
    }
    }
}
