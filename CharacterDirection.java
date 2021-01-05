import greenfoot.*;

public enum CharacterDirection 
{
    UP,
    DOWN,
    LEFT,
    RIGHT;
    
    public static CharacterDirection getRandomDirection(){
        switch(Greenfoot.getRandomNumber(4)){
            case 0:
                return UP;
            case 1:
                return DOWN;
            case 2:
                return LEFT;
        }
        return RIGHT;
    }
    
    public static CharacterDirection getRandomSidesDirection(){
        if(Greenfoot.getRandomNumber(2) == 0)
                return LEFT;
        return RIGHT;
    }
}
