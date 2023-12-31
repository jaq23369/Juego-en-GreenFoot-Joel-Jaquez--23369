import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movers extends Actor
{
    int velocidad = 4;
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        // Add your action code here.
    }

    public void moveAndTurn()
    {
        if(Greenfoot.isKeyDown("right"))
        {

            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {

            setRotation(180);
            move(4);
        }
        if(Greenfoot.isKeyDown("up"))
        {

            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down"))
        {

            setRotation(90);
            move(4);
        }
    }

    public void slideAround() 
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right"))
        {    
            setLocation(x + velocidad, y);
            if(hitwalls())
            {
                setLocation(x - velocidad, y);  
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {   
            setLocation(x - velocidad, y);
            if(hitwalls())
            {
                setLocation(x + velocidad, y);  
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {   
            setLocation(x, y - velocidad);
            if(hitwalls())
            {
                setLocation(x, y + velocidad);  
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {   
            setLocation(x, y + velocidad);
            if(hitwalls())
            {
                setLocation(x, y - velocidad);  
            }
        }
    }

    public boolean hitwalls()
    {
        if (isTouching(bloque.class))
        {
            return true;
        }
        else
        {
            return false; 
        }
    }

    public void collectBoost()
    {
        if(isTouching(Boost.class))
        {
            velocidad++;
            removeTouching(Boost.class);
        }
    }

    public void maxVelocidad()
    {
        if(velocidad >= 7)
        {
            velocidad = 7;
        }
    }

    public boolean golpeEnemigo()
    {
        if(isTouching(Enemigos.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

