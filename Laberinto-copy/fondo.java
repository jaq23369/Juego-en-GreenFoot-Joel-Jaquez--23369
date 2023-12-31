import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondo extends World
{
    public static GreenfootSound musicaFondo;
    public static int Contador = 0;
    /**
     * Constructor for objects of class fondo.
     * 
     */
    public fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
        musicaFondo = new GreenfootSound("Aventura.mp3");
        musicaFondo.playLoop();
        musicaFondo.setVolume(10);
    }
    public void act()
    {
        showText("Contador: " + Contador, 200, 560);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Contador = 0;
        showText("Contador: " + Contador, 200, 560);
        bloque bloque = new bloque();
        addObject(bloque,0,10*50);
        bloque bloque2 = new bloque();
        addObject(bloque2,0,9*50);
        bloque.setLocation(0,8*50);
        bloque bloque3 = new bloque();
        addObject(bloque3,0,7*50);
        bloque bloque4 = new bloque();
        addObject(bloque4,1*50,7*50);
        bloque bloque5 = new bloque();
        addObject(bloque5,2*50,7*50);
        bloque bloque6 = new bloque();
        addObject(bloque6,3*50,7*50);
        bloque bloque7 = new bloque();
        addObject(bloque7,4*50,7*50);
        bloque bloque8 = new bloque();
        addObject(bloque8,2*50,10*50);
        bloque bloque9 = new bloque();
        addObject(bloque9,2*50,9*50);
        bloque bloque10 = new bloque();
        addObject(bloque10,4*50,9*50);
        bloque bloque11 = new bloque();
        addObject(bloque11,6*50,10*50);
        bloque bloque12 = new bloque();
        addObject(bloque12,6*50,9*50);
        bloque bloque13 = new bloque();
        addObject(bloque13,6*50,8*50);
        bloque bloque14 = new bloque();
        addObject(bloque14,6*50,7*50);
        bloque bloque15 = new bloque();
        addObject(bloque15,6*50,6*50);
        bloque bloque16 = new bloque();
        addObject(bloque16,6*50,5*50);
        bloque bloque17 = new bloque();
        addObject(bloque17,7*50,5*50);
        bloque bloque18 = new bloque();
        addObject(bloque18,5*50,5*50);
        bloque bloque19 = new bloque();
        addObject(bloque19,5*50,4*50);
        bloque bloque20 = new bloque();
        addObject(bloque20,5*50,3*50);
        bloque bloque21 = new bloque();
        addObject(bloque21,5*50,2*50);
        bloque bloque22 = new bloque();
        addObject(bloque22,3*50,5*50);
        bloque bloque23 = new bloque();
        addObject(bloque23,3*50,4*50);
        bloque bloque24 = new bloque();
        addObject(bloque24,1*50,5*50);
        bloque bloque25 = new bloque();
        addObject(bloque25,1*50,4*50);
        bloque bloque26 = new bloque();
        addObject(bloque26,1*50,3*50);
        bloque bloque27 = new bloque();
        addObject(bloque27,1*50,2*50);
        bloque bloque28 = new bloque();
        addObject(bloque28,1*50,1*50);
        bloque24.setLocation(2*50,5*50);
        bloque24.setLocation(1*50,5*50);
        bloque bloque29 = new bloque();
        addObject(bloque29,10*50,0*50);
        bloque bloque30 = new bloque();
        addObject(bloque30,2*50,2*50);
        bloque bloque31 = new bloque();
        addObject(bloque31,3*50,2*50);
        bloque bloque32 = new bloque();
        addObject(bloque32,6*50,1*50);
        bloque bloque33 = new bloque();
        addObject(bloque33,7*50,1*50);
        bloque bloque34 = new bloque();
        addObject(bloque34,3*50,1*50);
        bloque bloque35 = new bloque();
        addObject(bloque35,9*50,10*50);
        bloque bloque36 = new bloque();
        addObject(bloque36,9*50,9*50);
        bloque bloque37 = new bloque();
        addObject(bloque37,8*50,8*50);
        bloque37.setLocation(7,8);
        bloque37.setLocation(7,8);
        bloque37.setLocation(8,8);
        removeObject(bloque37);
        addObject(bloque37,9*50,5*50);
        bloque bloque38 = new bloque();
        addObject(bloque38,9*50,6*50);
        bloque bloque39 = new bloque();
        addObject(bloque39,9*50,4*50);
        bloque bloque40 = new bloque();
        addObject(bloque40,9*50,3*50);
        bloque bloque41 = new bloque();
        addObject(bloque41,8*50,3*50);
        bloque bloque42 = new bloque();
        addObject(bloque42,8*50,1*50);
        bloque bloque43 = new bloque();
        addObject(bloque43,8*50,7*50);
        bloque bloque44 = new bloque();
        addObject(bloque44,8*50,8*50);
        bloque bloque45 = new bloque();
        addObject(bloque45,0*50,0*50);
        bloque bloque46 = new bloque();
        addObject(bloque46,299,548);
        bloque bloque47 = new bloque();
        addObject(bloque47,497,545);
        bloque bloque48 = new bloque();
        addObject(bloque48,574,597);
        bloque bloque49 = new bloque();
        addObject(bloque49,547,545);
        bloque bloque50 = new bloque();
        addObject(bloque50,298,591);
        bloque29.setLocation(590,39);
        bloque bloque51 = new bloque();
        addObject(bloque51,98,549);
        bloque bloque52 = new bloque();
        addObject(bloque52,199,498);
        bloque bloque53 = new bloque();
        addObject(bloque53,576,73);
        bloque bloque54 = new bloque();
        addObject(bloque54,575,119);
        bloque bloque55 = new bloque();
        addObject(bloque55,574,168);
        bloque bloque56 = new bloque();
        addObject(bloque56,573,216);
        Aventurero2 aventurero2 = new Aventurero2(3);
        addObject(aventurero2,38,548);
        Boost boost = new Boost();
        addObject(boost,448,349);
        removeObject(boost);
        addObject(boost,148,396);
        Boost boost2 = new Boost();
        addObject(boost2,92,144);
        Boost boost3 = new Boost();
        addObject(boost3,98,44);
        Boost boost4 = new Boost();
        addObject(boost4,445,370);
        Boost boost5 = new Boost();
        addObject(boost5,291,200);
        Boost boost6 = new Boost();
        addObject(boost6,450,545);
        Boost boost7 = new Boost();
        addObject(boost7,536,27);
        Boost boost8 = new Boost();
        addObject(boost8,246,48);
        Enemigo1 enemigo1 = new Enemigo1();
        addObject(enemigo1,45,299);
        Enemigo1 enemigo12 = new Enemigo1();
        addObject(enemigo12,307,109);
        Enemigo1 enemigo13 = new Enemigo1();
        addObject(enemigo13,196,560);
        Enemigo2 enemigo2 = new Enemigo2(true);
        addObject(enemigo2,242,300);
        enemigo2.setLocation(352,293);
        Enemigo2 enemigo22 = new Enemigo2(true);
        addObject(enemigo22,11,40);
        Enemigo2 enemigo23 = new Enemigo2(false);
        addObject(enemigo23,54,8);
        enemigo13.setLocation(250,475);
        Enemigo2 enemigo24 = new Enemigo2(true);
        addObject(enemigo24,567,260);
        removeObject(enemigo22);
        Boost boost9 = new Boost();
        addObject(boost9,45,399);
        Boost boost10 = new Boost();
        addObject(boost10,252,389);
        removeObject(boost10);
        removeObject(boost9);
        Boost boost11 = new Boost();
        addObject(boost11,198,290);
        Boost boost12 = new Boost();
        addObject(boost12,509,179);
        Boost boost13 = new Boost();
        addObject(boost13,524,495);
        Boost boost14 = new Boost();
        addObject(boost14,403,99);
        Boost boost15 = new Boost();
        addObject(boost15,340,578);
        YouWinPlataform youWinPlataform = new YouWinPlataform();
        addObject(youWinPlataform,568,382);
    }
}
