import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cat cat = new Cat();
        addObject(cat,658,716);
    }

    public void act()
    {
        int los=Greenfoot.getRandomNumber(100);
        if (los<=1)
        {
            int x= Greenfoot.getRandomNumber(getWidth());
            Pizza pizza = new Pizza();
            addObject(pizza,x,0);
        }
    }
}
