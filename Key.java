import greenfoot.*;

public class Key extends KeyObject
{
    private String number;
    
    public Key(String number) {
        this.number = number;
        name = "LLAVE DE LA " + number;
        DEFAULT_DESCRIPTION = "Una llave para abrir la " + number;
        setImage(new GreenfootImage("./images/objects/key.png"));
        description = DEFAULT_DESCRIPTION;
    }
    
    public String getNumber() {
        return number;
    }
}
