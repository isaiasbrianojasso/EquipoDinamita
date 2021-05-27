import greenfoot.*;

public class Records extends World
{
    private Record recordsList = new Record();
    
    public Records()
    {   
        super(1024, 480, 1);
        prepare();
    }
    
    public void prepare() {
        GreenfootImage background = new GreenfootImage("./images/RecordsBackground.jpg");
        background.scale(getWidth(),getHeight());
        setBackground(new GreenfootImage(background));
    }
    
    public void act() 
    {
        escribeRecords();
        if(Greenfoot.isKeyDown(Keys.PAUSE)) {
            Greenfoot.setWorld (new Menu());
        }
    }
    
    public void escribeRecords(){
        int y1 = 230;
        int i = 1;
        for(String aux : recordsList.getList())
        {
            showText(Integer.toString(i) + ".-  " + aux,getWidth()/2,y1);
            y1 = y1 + 30;
            i++;
        }
    }
}
