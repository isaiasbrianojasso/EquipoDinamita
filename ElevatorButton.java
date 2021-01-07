import greenfoot.*;

public class ElevatorButton extends KeyObject
{
    private String number;
    
    public ElevatorButton(String number)
    {
        this.number = number;
        name = "Botón del" + number;
        DEFAULT_DESCRIPTION = "botón para poder ir al " + number + " en el elevador";
        setImage(new GreenfootImage("./images/objects/button.png"));
    } 
    
    public String getNumber() {
        return number;
    }
}
