import greenfoot.*;  
public class OverPage extends World
{
    public OverPage()
    {    
        super(950,550,1);
        prepare();
    }
    
    private void prepare()
    {
        Quit quit = new Quit();
        addObject(quit,368,376);
        Replay replay = new Replay();
        addObject(replay,622,373);
        showText("Predator memakanmu, kamu kalah!!!",475,280);
        showText("SCORE : "+MyWorld.score.getValue()+" points", 475,305);
        Greenfoot.playSound("gameOver.wav");
    }
}
