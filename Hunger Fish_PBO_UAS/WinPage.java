import greenfoot.*;  

public class WinPage extends World
{
    public WinPage()
    {    
        super(978, 550, 1);  
        prepare();
    }
    
    private void prepare()
    {
        Quit quit = new Quit();
        addObject(quit,489,341);
        Greenfoot.playSound("stageClear.wav");
    }
}
