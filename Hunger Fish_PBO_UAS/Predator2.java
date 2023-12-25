import greenfoot.*;  

public class Predator2 extends Actor
{
    public void act()
    {
        setLocation(getX()-1, getY());
        if(isTouching(MainFish.class)){
            removeTouching(MainFish.class);
            Greenfoot.setWorld(new OverPage());
        }
        if(getX()<2)
        getWorld().removeObject(this);
    }
}
