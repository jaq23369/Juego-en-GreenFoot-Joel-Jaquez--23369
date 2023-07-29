import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aventurero2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aventurero2 extends players
{
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
    public void act()
    {
        slideAround();
        collectBoost();
        maxVelocidad();
        agresionEnemigo();
        youWin();
        loseLife();
        
        Actor Boost;
        Boost=getOneObjectAtOffset(0,0,Boost.class);
        if(Boost != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Boost);
            fondo mundo = (fondo)world;
            Contador cont = mundo.getContador();
            cont.addcontar();
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
}
