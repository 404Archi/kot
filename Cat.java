import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cat extends Actor
{
    int SIEDZACY=0;
    int W_PRAWO_1=1;
    int W_PRAWO_2=2;
    int W_LEWO_1=3;
    int W_LEWO_2=4;
    int KOT_JE_1=5;
    int KOT_JE_2=6;
    int stanKota=SIEDZACY;

    int punkty=0;
    boolean tanczyc=false;
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
        {
            removeTouching(Pizza.class);
            punkty++;
            if(punkty%5==0)tanczyc=true;
        }
    }

    public void pokazPunkty()
    {
        getWorld().showText("Punkty:" + punkty, 100, 30);
    }

    public void taniec()
    {
        if(tanczyc)
        {
            tanczyc=false;
            setImage("cat-dance.png");
            Greenfoot.delay(100);
            setImage("cat-dance-2.png");
            Greenfoot.delay(100);
            setImage("cat-sit.png");
            Greenfoot.delay(100);
        }
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
        pokazPunkty();
        taniec();
    }    
}
