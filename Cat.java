import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cat extends Actor
{
    int SIEDZACY=0;
    int W_PRAWO_1=1;
    int W_PRAWO_2=2;
    int W_LEWO_1=3;
    int W_LEWO_2=4;

    int stanKota=SIEDZACY;
    public void klawisze()
    {
        if(!Greenfoot.isKeyDown ("left") && !Greenfoot.isKeyDown ("right"))
            stanKota=SIEDZACY;
        if(Greenfoot.isKeyDown ("left"))
        {           
            if(stanKota==W_LEWO_1) stanKota=W_LEWO_2;
            else stanKota=W_LEWO_1;
            move(-3);
            
        }
        if(Greenfoot.isKeyDown ("right"))
        {
            if(stanKota==W_PRAWO_1) stanKota=W_PRAWO_2;
            else stanKota=W_PRAWO_1;
            move(3);
            
            
        }
    }

    public void jedzenie()
    {
        if(isTouching(Pizza.class))
            removeTouching(Pizza.class);

    }

    public void wyglad()
    {
        if(stanKota==W_PRAWO_1)    setImage   ("cat-walk-right.png");
        if(stanKota==W_PRAWO_2)    setImage   ("cat-walk-right2.png");
        if(stanKota==W_LEWO_1)     setImage   ("cat-walk-left.png");
        if(stanKota==W_LEWO_2)     setImage   ("cat-walk-left2.png");
        if(stanKota==SIEDZACY)     setImage   ("cat-sit.png");
    }

    public void act() 
    {   
        wyglad();
        klawisze();
        jedzenie();

    }    
}
