import greenfoot.*;  

public class HelpPage extends World
{
    public HelpPage()
    {    
        super(978, 550, 1); 
        prepare();
    }
    
    private void prepare()
    {
        BackButton backButton = new BackButton();
        addObject(backButton,75,476);
    }
}
