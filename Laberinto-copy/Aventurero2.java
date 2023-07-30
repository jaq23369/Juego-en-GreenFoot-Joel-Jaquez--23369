import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aventurero2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aventurero2 extends players
{
    public static int Contador = 0;
    /**
     * Act - do whatever the Aventurero2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Aventurero2Lives;
    //Crear nuestro metodo constructor
    public Aventurero2(int lives)
    {
        Aventurero2Lives = lives;
    }
    fondo thisGame;
    public void act()
    {
        slideAround();
        collectBoost();
        maxVelocidad();
        loseLife();
        agresionEnemigo();
        youWin();
        youLose();
        
        
        Actor apple = getOneIntersectingObject (Boost.class);
        if(apple != null)
        {
            getWorld().removeObject(apple);
            thisGame.Contador++;
        }
    }
    public void agresionEnemigo()
    {
        if(golpeEnemigo() == true)
        {
            setLocation(40, 560);
        }
    }
    public void loseLife()
    {
        if(golpeEnemigo())
        {
            Aventurero2Lives--;
        }
    }
    public void youLose()
    {
        if(Aventurero2Lives == 0)
        {
            getWorld().addObject (new YouLose(), getWorld().getWidth ()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
