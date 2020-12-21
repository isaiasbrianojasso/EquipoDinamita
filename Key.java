import greenfoot.*;

public class Key extends KeyObject
{
    private int number;
    
    public Key(int number) {
        this.number = number;
        name = "Llave de puerta";
        DEFAULT_DESCRIPTION = "Una llave con el numero " + Integer.toString(number);
        setImage(new GreenfootImage("./images/objects/key.png"));
    }
    
    public int getNumber() {
        return number;
    }
}
