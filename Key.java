import greenfoot.*;

public class Key extends KeyObject
{
    private String number;
    
    public Key(String number) {
        this.number = number;
        name = "Llave de la " + number;
        DEFAULT_DESCRIPTION = "Una llave para abrir la " + number;
        setImage(new GreenfootImage("./images/objects/key.png"));
    }
    
    public String getNumber() {
        return number;
    }
}
