import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo1 extends Enemigos
{
    /**
     * Act - do whatever the Enemigo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemigo1()
    {
         getImage().scale (getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
        move(5);
        wrapAtEdge();
    }
}
