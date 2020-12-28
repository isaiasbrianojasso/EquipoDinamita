import greenfoot.*;

public class ElevatorButton extends KeyObject
{
    private String number;
    
    public ElevatorButton(String number) {
        this.number = number;
        name = "BOTON DEL " + number;
        DEFAULT_DESCRIPTION = "botón para poder ir al " + number + " en el elevador";
        setImage(new GreenfootImage("./images/objects/button.png"));
        description = DEFAULT_DESCRIPTION;
    } 
    
    public String getNumber() {
        return number;
    }
}
