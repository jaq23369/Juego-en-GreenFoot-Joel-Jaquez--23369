import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;
/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    int contar = 0;
    /**
     * Act - do whatever the Contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Manzanas : " + contar, 24, Color.GREEN, Color.BLACK));
    }
    
    public void addcontar()
    {
        contar++;
    }
}
