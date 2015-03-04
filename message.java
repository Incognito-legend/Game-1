import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class message extends Player
{
public int Class = 4;
public boolean playerClass_dirtyFlag = false; 
public boolean dirtyFlag_Player_Input = true;
//--------------------------------------------------------------
boolean dirtyFlag_PI_Msg1 = true;
    
    public message() 
    {
        if (dirtyFlag_PI_Msg1){
            
            System.out.println("--- CLASS SELECTION ---");
            
            System.out.println("Choose your desired class!");
            
            System.out.println("key 1:" + " Hunter");
            
            System.out.println("key 2:" + " Druid");
            
            System.out.println("key 3:" + " Mage");
            
            System.out.println("key 4:" + " Palladin");
            
            System.out.println("key 5:" + " Warrior");
            
}
dirtyFlag_PI_Msg1 = false;
}    
}
