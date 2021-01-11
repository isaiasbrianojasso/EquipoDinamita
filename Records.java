import greenfoot.*;

public class Records extends World
{
    Record Act=new Record();
        

        public Records()
        {   
            super(1024, 480, 1);
            //salir=new Salir();
            //showText("Salir", getWidth()/2,(getHeight()/2)+150);
            prepare();


        }

        public void prepare() {
            GreenfootImage background = new GreenfootImage("./images/RecordsBackground.jpg");
            background.scale(getWidth(),getHeight());
            setBackground(new GreenfootImage(background));
        }

        public void act() 
        {
            this.escribeRecords();

            if(Greenfoot.isKeyDown(Keys.PAUSE)) {
                Greenfoot.setWorld (new Menu());
            }
        }

        public void escribeRecords(){
            int y1 = 170;
            for(Temporal aux : Act.escribeTabla())
            {
                showText(aux.getTiempo()+"",400,y1);
                y1 = y1 + 30;
            }
        }
    }
