public class fondo extends World 
{

    /**
     * Constructor for objects of class fondo.
     * 
     */
    public fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

private void prepare()
    {
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
        Aventurero2 aventurero2 = new Aventurero2();
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
        PuertaGanar puertaGanar = new PuertaGanar();
        addObject(puertaGanar,573,366);
        enemigo2.setLocation(352,293);
        Enemigo2 enemigo22 = new Enemigo2(true);
        addObject(enemigo22,11,40);
        Enemigo2 enemigo23 = new Enemigo2(false);
        addObject(enemigo23,54,8);
        enemigo13.setLocation(250,475);
        Enemigo2 enemigo24 = new Enemigo2(true);
        addObject(enemigo24,567,260);
        removeObject(puertaGanar);
        removeObject(enemigo22);
    }
    "Codigo solamente del fondo, con los objetos agregados"

"Segunda parte, correspondiente a la superclase llamada movers donde se asignan varias funciones del personaje y enemigos"
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
    "Tercera parte, pertenece en si al personaje pero solo son sus acts y otra asignacion de restablecimiento "
    public class Aventurero2 extends Movers
{
    /**
     * Act - do whatever the Aventurero2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Crear nuestro metodo constructor
    public Aventurero2()
    {
        
    }
    public void act()
    {
        slideAround();
        collectBoost();
        maxVelocidad();
        agresionEnemigo();
    }
    public void agresionEnemigo()
    {
        if(golpeEnemigo() == true)
        {
            setLocation(40, 560);
        }
"Cuarta parte, superclase Enemigos"
public class Enemigos extends Movers
{
    /**
     * Act - do whatever the Enemigos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void wrapAtEdge()
    {
        int x = getX();
        int y = getY();
        int worldWidth = getWorld().getWidth() - 1;
        int worldHeight = getWorld().getHeight() - 1;
        if(x >= worldWidth)
        {
            setLocation(1 , y);
        }
        if(x <= 0)
        {
            setLocation(worldWidth - 1 , y);
        }
        if(y >= worldHeight)
        {
            setLocation(x , 1);
        }
        if(y <= 0)
        {
            setLocation(x , worldHeight - 1);
        }
    }

}

"Quinta parte, asignacions de funciones para Enemigo1 y Enemigo2"
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

"Sexta parte, corresponde al elemento Boost que es una manzana que otorga velocidad extra al jugador"
public class Boost extends Actor
{
    /**
     * Act - do whatever the Boost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boost()
    {
        getImage().scale (getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
        // Add your action code here.
    }
}

"Funcion de la pantalla ganar"
public void youWin()
    {
       if (isTouching (YouWinPlataform.class))
        {
            getWorld().addObject(new YouWinScreen(), getWorld().getWidth()/2, getWorld ().getHeight()/2);
            Greenfoot.stop();
        } 
    }