import greenfoot.*;

public class KeyObject extends Actor
{
    protected String DEFAULT_DESCRIPTION;
    protected String description;
    protected String name;
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void detDesfaultDescription() {
        description = DEFAULT_DESCRIPTION;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getName() {
        return name;
    }
}
