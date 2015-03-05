import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class message extends World
{
    private int Class = 4;
    private boolean playerClass_dirtyFlag = true;
    private boolean dirtyFlag_Player_Input = false;
    private boolean dirtyFlag_PI_Msg1 = true;
    public message(int savedClass, boolean savedPlayerClass_dirtyFlag, boolean savedDirtyFlag_Player_Input, boolean savedDirtyFlag_PI_Msg1) 
    { 
    Class = savedClass;
    playerClass_dirtyFlag = savedPlayerClass_dirtyFlag;
    dirtyFlag_Player_Input = savedDirtyFlag_Player_Input;
    dirtyFlag_PI_Msg1 = savedDirtyFlag_PI_Msg1;
}

    public int getClass(){
        return Class;
    }
    public void setClass(int inValue){
        Class = inValue;
        savedClass = inValue;
    }
    
    public boolean getPlayerClass_dirtyFlag(){
        return playerClass_dirtyFlag;
    }
    public void setPlayerClass_dirtyFlag(boolean inValue){
        playerClass_dirtyFlag = inValue;
        savedPlayerClass_dirtyFlag = inValue;
    }
    
    public boolean getDirtyFlag_Player_Input(){
        return dirtyFlag_Player_Input;
    }
    public void setDirtyFlag_Player_Input(boolean inValue){
        dirtyFlag_Player_Input = inValue;
        savedDirtyFlag_Player_Input = inValue;
    }
    
    public boolean getDirtyFlag_PI_Msg1(){
        return dirtyFlag_PI_Msg1;
    }
    public void setDirtyFlag_PI_Msg1(boolean inValue){
        dirtyFlag_PI_Msg1 = inValue;
        savedDirtyFlag_PI_Msg1 = inValue;
    }
    
//--------------------------------------------------------------

}    

