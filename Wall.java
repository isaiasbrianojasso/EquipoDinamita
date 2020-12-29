import greenfoot.*;

public class Wall extends Actor
{
    private GreenfootImage CHERRY0 = new GreenfootImage("./images/extras/cherry_wall0.jpg");
    private GreenfootImage CHERRY1 = new GreenfootImage("./images/extras/cherry_wall1.jpg");
    private GreenfootImage CHERRY2 = new GreenfootImage("./images/extras/cherry_wall2.jpg");
    private GreenfootImage BLOOD0 = new GreenfootImage("./images/extras/blood_wall0.jpg");
    private GreenfootImage BLOOD1 = new GreenfootImage("./images/extras/blood_wall1.jpg");
    private GreenfootImage BLOOD2 = new GreenfootImage("./images/extras/blood_wall2.jpg");
    private GreenfootImage BROWNIE0 = new GreenfootImage("./images/extras/brownie_wall0.jpg");
    private GreenfootImage BROWNIE1 = new GreenfootImage("./images/extras/brownie_wall1.jpg");
    private GreenfootImage BROWNIE2 = new GreenfootImage("./images/extras/brownie_wall2.jpg");
    private GreenfootImage FANCY0 = new GreenfootImage("./images/extras/fancy_wall0.jpg");
    private GreenfootImage FANCY1 = new GreenfootImage("./images/extras/fancy_wall1.jpg");
    private GreenfootImage FANCY2 = new GreenfootImage("./images/extras/fancy_wall2.jpg");
    private GreenfootImage ROCK0 = new GreenfootImage("./images/extras/rock_wall0.jpg");
    private GreenfootImage ROCK1 = new GreenfootImage("./images/extras/rock_wall1.jpg");
    private GreenfootImage ROCK2 = new GreenfootImage("./images/extras/rock_wall2.jpg");
    
    public Wall(int wallType, int wallSubtype)
    {
        switch(wallType) {
            case 0:
                cherryWall(wallSubtype);
            break;
            case 1:
                bloodWall(wallSubtype);
            break;
            case 2:
                brownieWall(wallSubtype);
            break;
            case 3:
                fancyWall(wallSubtype);
            break;
            case 4:
                rockWall(wallSubtype);
            break;
        }
        
        
    }
    
    public void cherryWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(CHERRY0);
            break;
            case 1:
                setImage(CHERRY1);
            break;
            case 2:
                setImage(CHERRY2);
            break;
        } 
    }
    
    public void bloodWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(BLOOD0);
            break;
            case 1:
                setImage(BLOOD1);
            break;
            case 2:
                setImage(BLOOD2);
            break;
        } 
    }
    
    public void brownieWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(BROWNIE0);
            break;
            case 1:
                setImage(BROWNIE1);
            break;
            case 2:
                setImage(BROWNIE2);
            break;
        } 
    }
    
    public void fancyWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(FANCY0);
            break;
            case 1:
                setImage(FANCY1);
            break;
            case 2:
                setImage(FANCY2);
            break;
        } 
    }
    
    public void rockWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(ROCK0);
            break;
            case 1:
                setImage(ROCK1);
            break;
            case 2:
                setImage(ROCK2);
            break;
        } 
    }
}
