import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    int x;
    int h;
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(90);
        move(1);
        turn(-90);
<<<<<<< HEAD
        
        int y = getY();
        int wysokoscSwiata=getWorld().getHeight();
        if(y>=wysokoscSwiata-1)getWorld().removeObject(this);
        
=======
       // if(isAtEdge) isRemove(Pizza.class) ;
>>>>>>> 4a5b6e490605d95ffbd8295eecc42548cf3b6d01
    }    
}
