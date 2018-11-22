import greenfoot.*;

/**
 * Write a description of class Takashi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Takashi extends Actor
{
    /**
     * Act - do whatever the Takashi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
           setRotation(0); 
           move(4);
        }// Add your action code here.
    }    
}
