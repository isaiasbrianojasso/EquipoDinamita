import greenfoot.*;

public class KeyObject extends Actor
{
    protected String DEFAULT_DESCRIPTION;
    public String description;
    public String name;
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setDefaultDescription() {
        description = DEFAULT_DESCRIPTION;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getName() {
        return name;
    }
}
