import greenfoot.*;  
public class Level2 extends World
{
    static Counter score = new Counter("Score : ");
    static Counter hp = new Counter("Hp : ");
    public Level2()
    {
        super(950,550,1);
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(160)< 3){
            addObject(new Fish1(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(90)< 3){
            addObject(new Fish2(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(120)< 3){
            addObject(new Fish3(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(250)< 3){
            addObject(new Predator2(), 948, Greenfoot.getRandomNumber(360));
        }
        if(Level2.score.getValue()>=50)
        {
            Greenfoot.delay(4);
            Greenfoot.setWorld(new Level3());
        }
    }
    public void prepare()
    {    
        MainFish mainFish = new MainFish();
        addObject(mainFish,31,269);
        Fish1 fish1 = new Fish1();
        addObject(fish1,822,508);
        Fish1 fish12 = new Fish1();
        addObject(fish12,659,64);
        Fish1 fish13 = new Fish1();
        addObject(fish13,503,411);
        Fish2 fish2 = new Fish2();
        addObject(fish2,841,61);
        Fish2 fish22 = new Fish2();
        addObject(fish2,391,506);
        Fish2 fish23 = new Fish2();
        addObject(fish2,441,34);
        
        Predator1 predator1 = new Predator1();
        addObject(predator1,918,418);
        Predator1 predator12 = new Predator1();
        addObject(predator12,558,81);
        
        addObject(score, 80, 45);
        score.setValue(0);
        addObject(hp, 870, 45);
        hp.setValue(1);
        Greenfoot.playSound("waterAmb1.wav");
    }
}
