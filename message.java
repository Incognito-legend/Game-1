import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class message extends Actor
{
    private int playerClass;
    private boolean playerVarClass_dirtyFlag = false;
    private boolean dirtyFlag_Player_Input = true;
    private boolean dirtyFlag_PI_Msg1;
    public message(int savedPlayerClass, boolean savedPlayerVarClass_dirtyFlag, boolean savedDirtyFlag_Player_Input, boolean savedDirtyFlag_PI_Msg1) 
    { 
    playerClass = savedPlayerClass;
    playerVarClass_dirtyFlag = savedPlayerVarClass_dirtyFlag;
    dirtyFlag_Player_Input = savedDirtyFlag_Player_Input;
    dirtyFlag_PI_Msg1 = savedDirtyFlag_PI_Msg1;
}

    public int getPlayerClass(){
        return playerClass;
    }
    public void setPlayerClass(int inValue){
        inValue = 4;
        playerClass = inValue;
        
    }
    
    public boolean getPlayerVarClass_dirtyFlag(){
        return playerVarClass_dirtyFlag;
    }
    public void setPlayerClass_dirtyFlag(boolean inValue){
        playerVarClass_dirtyFlag = inValue;

    }
    
    public boolean getDirtyFlag_Player_Input(){
        return dirtyFlag_Player_Input;
    }
    public void setDirtyFlag_Player_Input(boolean inValue){
        dirtyFlag_Player_Input = inValue;

    }
    
    public boolean getDirtyFlag_PI_Msg1(){
        return dirtyFlag_PI_Msg1;
    }
    public void setDirtyFlag_PI_Msg1(boolean inValue){
        dirtyFlag_PI_Msg1 = inValue;

    }
    
//--------------------------------------------------------------

}    

