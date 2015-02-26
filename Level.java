import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
   public Level()
   {
    GreenfootImage image = getImage();
            image.scale(image.getWidth()*6,image.getHeight()*6);
            setImage(image);
        }
}
