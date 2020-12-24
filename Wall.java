import greenfoot.*;

public class Wall extends Actor
{
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
                setImage(new GreenfootImage("./images/extras/cherry_wall0.jpg"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/extras/cherry_wall1.jpg"));
            break;
            case 2:
                setImage(new GreenfootImage("./images/extras/cherry_wall2.jpg"));
            break;
        } 
    }
    
    public void bloodWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(new GreenfootImage("./images/extras/blood_wall0.jpg"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/extras/blood_wall1.jpg"));
            break;
            case 2:
                setImage(new GreenfootImage("./images/extras/blood_wall2.jpg"));
            break;
        } 
    }
    
    public void brownieWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(new GreenfootImage("./images/extras/brownie_wall0.jpg"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/extras/brownie_wall1.jpg"));
            break;
            case 2:
                setImage(new GreenfootImage("./images/extras/brownie_wall2.jpg"));
            break;
        } 
    }
    
    public void fancyWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(new GreenfootImage("./images/extras/fancy_wall0.jpg"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/extras/fancy_wall1.jpg"));
            break;
            case 2:
                setImage(new GreenfootImage("./images/extras/fancy_wall2.jpg"));
            break;
        } 
    }
    
    public void rockWall(int subtype){
        switch(subtype) {
            case 0:
                setImage(new GreenfootImage("./images/extras/rock_wall0.jpg"));
            break;
            case 1:
                setImage(new GreenfootImage("./images/extras/rock_wall1.jpg"));
            break;
            case 2:
                setImage(new GreenfootImage("./images/extras/rock_wall2.jpg"));
            break;
        } 
    }
}
