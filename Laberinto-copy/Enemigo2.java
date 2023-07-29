import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * boolean upAndDown
 * upDown =  upAndDown;
 */
public class Enemigo2 extends Enemigos
{
    /**
     * Act - do whatever the Enemigo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    int velocidad = 2;
    public Enemigo2(boolean upAndDown)
    {
        getImage().scale (getImage().getWidth()/2, getImage().getHeight()/2);
        upDown =  upAndDown;
    }
    public void act()
    {
        moveAround();
        enemyHitWalls();
        
    }
    public void enemyHitWalls()
    {
        if(hitwalls() || isAtEdge())
        {
            velocidad = -velocidad;
        } 
    }
    private void moveAround()
    {
        int x = getX();
        int y = getY();
        if(upDown)
        {
          setLocation(x,y + velocidad);  
        }
        else if (!upDown)
        {
            setLocation(x + velocidad, y);
        }
    }
}
