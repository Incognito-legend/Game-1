/**
 * Write a description of class message_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class message_1 extends Player 
{
    // instance variables - replace the example below with your own
    private int Class;
    private boolean playerClass_dirtyFlag;
    private boolean dirtyFlag_Player_Input;
    
    public message_1(int broadcast_Class, boolean broadcast_playerClass_dirtyFlag, boolean broadcast_dirtyFlag_Player_Input){
        Class = broadcast_Class;
        playerClass_dirtyFlag = broadcast_playerClass_dirtyFlag;
        dirtyFlag_Player_Input = broadcast_dirtyFlag_Player_Input;
    }
    
    public int getClass() {
        return Class;
    }
    
    public void setClass(int newValue_1) {
        Class = newValue_1;
    }
    
    public boolean getPlayerClass_dirtyFlag() {
        return playerClass_dirtyFlag;
    }
    
    public void setPlayerClass_dirtyFlag(boolean newValue_2) {
        playerClass_dirtyFlag = newValue_2;
     
    }
    
    public boolean getDirtyFlag_Player_Input() {
        return dirtyFlag_Player_Input;
    }
    
    public void setDirtyFlag_Player_Input(boolean newValue_3) {
        dirtyFlag_Player_Input = newValue_3;
}
}