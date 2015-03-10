import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Date; // (This plugin is for telling your Current Universal Time)
public class Player extends Actor
{
    String baseString = "";
    String left1;
    String left2;
    String left3;
    String right1;
    String right2;
    String right3;
    String down1;
    String down2;
    String down3;
    String up1;
    String up2;
    String up3;
// {[( start )]} of String group: "int Confirmation_Msg Group".
    String Blacksmith_Confirmation_Msg;
//--------------------------------------
    String Shop_Confirmation_Msg;
//--------------------------------------
    String Arena_Confirmation_Msg;
//--------------------------------------
    String Home_Confirmation_Msg;
// {[( end )]} of String group: "int Confirmation_Msg Group".

    String lastWayFacing = "down";
    

    
    boolean dirtyFlag_PI_Class_Confirmation_Msg = false;
    
    boolean dirtyFlagMovement = false;
    
    boolean dirtyFlagBlacksmith = false;
    
    boolean dirtyFlag_Player_Input = true;
    
    boolean playerClass_dirtyFlag = false;
    
    int Class = 4;
    
    int whichWalk = 0;
    
    int Confirmation_Msg_Type;
    
    public void act()
{
  
    if (dirtyFlag_Player_Input){
       background level = (background)this.getWorld();
        if ((Greenfoot.isKeyDown ("1")) && !(dirtyFlag_PI_Class_Confirmation_Msg) && !(Class == 1) && !(playerClass_dirtyFlag)){
            
               if (!(this instanceof hunter)){
               level.removeObject(this);
               level.addObject(new hunter(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               Class = 1;
               System.out.println("You have chosen the [ Hunter ] ! (" + Class + ")");
               playerClass_dirtyFlag = true;
               dirtyFlag_Player_Input = false;
        }              
      
    
        
    }
    if ((Greenfoot.isKeyDown ("2")) && !(dirtyFlag_PI_Class_Confirmation_Msg) && !(Class == 2) && !(playerClass_dirtyFlag)){ 
        
               if (!(this instanceof Druid)){
               level.removeObject(this);
               level.addObject(new Druid(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               Class = 2;
               System.out.println("You have chosen the [ Druid ] ! (" + Class + ")");
               playerClass_dirtyFlag = true;
               dirtyFlag_Player_Input = false;
        }
      
           
        
    }
    if ((Greenfoot.isKeyDown ("3")) && !(dirtyFlag_PI_Class_Confirmation_Msg) && !(Class == 1) && !(playerClass_dirtyFlag)){ 
             
               if (!(this instanceof Mage)){
               level.removeObject(this);
               level.addObject(new Mage(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               Class = 3;
               System.out.println("You have chosen the [ Mage ] ! (" + Class + ")");
               playerClass_dirtyFlag = true;
               dirtyFlag_Player_Input = false;
        }       
            
            
        
    }
    if ((Greenfoot.isKeyDown ("4")) && !(dirtyFlag_PI_Class_Confirmation_Msg) && !(Class == 1) && !(playerClass_dirtyFlag)){          
        
               if (!(this instanceof Palladin)){
               level.removeObject(this);
               level.addObject(new Palladin(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               Class = 4;
               System.out.println("You have chosen the [ Palladin ] ! (" + Class + ")");
               playerClass_dirtyFlag = true;
               dirtyFlag_Player_Input = false;
        }      
    
    
        
    }
    if ((Greenfoot.isKeyDown ("5")) && !(dirtyFlag_PI_Class_Confirmation_Msg) && !(Class == 1) && !(playerClass_dirtyFlag)){         
     
               if (!(this instanceof Warrior)){
               level.removeObject(this);
               level.addObject(new Warrior(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               Class = 5;
               System.out.println("You have chosen the [ Warrior ] ! (" + Class + ")");
               playerClass_dirtyFlag = true;
               dirtyFlag_Player_Input = false;
        }             
            
    }
    
     
}
//    if (!(this instanceof hunter))
//-----------------------------------------------------
//    if (this instanceof hunter){ 
//Class = 1;
//System.out.println("Class:[ Hunter ] ! (" + Class + ")");

//}    else if (this instanceof Druid){
//Class = 2;
//System.out.println("Class:[ Druid ] ! (" + Class + ")");
//}    else if (this instanceof Mage){
//Class = 3;
//System.out.println("Class:[ Mage ] ! (" + Class + ")");
//}    else if (this instanceof Palladin){
//Class = 4;
//System.out.println("Class:[ Palladin ] ! (" + Class + ")");
//}    else if (this instanceof Warrior){
//Class = 5;
//System.out.println("Class:[ Warrior ] ! (" + Class + ")");
//}    else{
//    level.addObject(new hunter(), 512, 389);
//
//               Class = 1;
//               System.out.println("Assigning Default Class:[ Hunter ] ! (" + Class + ")");
//            }        
    

        else if (!(dirtyFlag_Player_Input)){
        background level = (background)this.getWorld();
        dirtyFlagMovement = false;

        int hero_x_px = -level.pos_x + getX();
        int hero_y_px = -level.pos_y + getY();
        int hero_x = hero_x_px/96;
        int hero_y = hero_y_px/96;
        int music = level.track_num;

        
//start of movement        
  if (Greenfoot.isKeyDown ("left")){
       dirtyFlagMovement = true;
       
       level.scroll(10, 0);
       
       hero_x_px = -level.pos_x + getX()-50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
      if (level.getTileAt (hero_x, hero_y) == 1001){
          level.scroll(-10, 0);
      }
      
        if (whichWalk == 0) {
            setImage(left1);
        } else if (whichWalk == 1) {
            setImage(left2);
        } else if (whichWalk == 2) {
            setImage(left3);
        } else if (whichWalk == 3) {
            setImage(left2);
        }
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "left";
        System.out.println("hero moved left, Tile: " + hero_x + ", " + hero_y);
        System.out.println(level.pos_x + ", " + level.pos_y);
    }
        else  if (Greenfoot.isKeyDown ("right"))
    {
       dirtyFlagMovement = true;
       
       background x = (background)this.getWorld();
       x.scroll(-10, 0);
       hero_x_px = -level.pos_x + getX()+50;
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
      if (level.getTileAt (hero_x, hero_y) == 1001){
          level.scroll(10, 0);
        }
        
        if (whichWalk == 0) {
            setImage(right1);
        } else if (whichWalk == 1) {
            setImage(right2);
        } else if (whichWalk == 2) {
            setImage(right3);
        } else if (whichWalk == 3) {
            setImage(right2);
        }
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "right";
        System.out.println("hero moved right, Tile: " + hero_x + ", " + hero_y);
        System.out.println(level.pos_x + ", " + level.pos_y);
    }
        else if (Greenfoot.isKeyDown("up"))
    {
       dirtyFlagMovement = true;
       background x = (background)this.getWorld();
       x.scroll(0, 10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY();
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
      if (level.getTileAt (hero_x, hero_y) == 1001){
          level.scroll(0, -10);
        }
        
        if (whichWalk == 0) {
            setImage(up1);
        } else if (whichWalk == 1) {
            setImage(up2);
        } else if (whichWalk == 2) {
            setImage(up3);
        } else if (whichWalk == 3) {
            setImage(up2);
        }    
        whichWalk = (whichWalk + 1) % 4;  
        lastWayFacing = "up";
        System.out.println("hero moved up, Tile: " + hero_x + ", " + hero_y);
        System.out.println(level.pos_x + ", " + level.pos_y);
    }    
        else if (Greenfoot.isKeyDown("down"))
    {   
       dirtyFlagMovement = true;
       background x = (background)this.getWorld();
       x.scroll(0, -10);
       hero_x_px = -level.pos_x + getX();
       hero_y_px = -level.pos_y + getY()+40;
       hero_x = hero_x_px/96;
       hero_y = hero_y_px/96;
      if (level.getTileAt (hero_x, hero_y) == 1001){
          level.scroll(0, 10);
        }
        
        if (whichWalk == 0) {
            setImage(down1);
        } else if (whichWalk == 1) {
            setImage(down2);
        } else if (whichWalk == 2) {
            setImage(down3);
        } else if (whichWalk == 3) {
            setImage(down2);
        }   
        whichWalk = (whichWalk + 1) % 4;
        lastWayFacing = "down";
        System.out.println("hero moved down, Tile: " + hero_x + ", " + hero_y);
        System.out.println(level.pos_x + ", " + level.pos_y);
    //end of Player movement
    //Beginning of Artificial movement
    } 
       //end of Artificial movement
    else 
    {
        if (lastWayFacing.equals("up")){
            setImage(up2);
        } else if (lastWayFacing.equals("down")){
            setImage(down2);
        } else if (lastWayFacing.equals("left")) {
            setImage(left2);
        } else if (lastWayFacing.equals("right")) {
            setImage(right2);
        }
        
    }

//end of Movement
//Beginning of Special Tiles Check
    if (dirtyFlagMovement){
        
        switch (level.getTileAt(hero_x, hero_y)) {
            
          case 1003:
            System.out.println("You're at your house!");
          break;          
          case 1004: 
            System.out.println("You're at the Arena!");
          break;
          case 1005:
             System.out.println("Hit Blacksmith_Tile (" + Class + ")");
             dirtyFlagBlacksmith = true;
          break;          
          case 1006:
             System.out.println("Welcome to the Shop!");
          break;          
          case 1007:        
             if (!(this instanceof hunter)){
               level.removeObject(this);
               level.addObject(new hunter(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("Changing From Class # (" + Class + ")");
               Class = 1;
               System.out.println("You have chosen the [ Hunter ] ! (" + Class + ")");
             }
          break;          
          case 1008:
             if (!(this instanceof Druid)){
               System.out.println("Changing From Class # (" + Class + ")");
               level.removeObject(this);
               level.addObject(new Druid(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               Class = 2;
               System.out.println("You have chosen the [ Druid ] ! (" + Class + ")");
             }
          break;          
          case 1009:
             if (!(this instanceof Mage)){
               level.removeObject(this);
               level.addObject(new Mage(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("You have chosen the [ Mage ] !");
               Class = 3;
             }
          break;
          case 1010:
             if (!(this instanceof Palladin)){
               level.removeObject(this);
               level.addObject(new Palladin(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("You have chosen the [ Palladin ] !");
               Class = 4;
             }
          break;
          case 1011:
             if (!(this instanceof Warrior)){
               level.removeObject(this);
               level.addObject(new Warrior(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("You have chosen the [ Warrior ] !");
               Class = 5;
             }
          break;
          
        }
        
    }
    
    if ((!(dirtyFlagMovement))) {
        
        switch (level.getTileAt(hero_x, hero_y)) {
          
          case 1005:
             if (dirtyFlagBlacksmith) {
                 System.out.println("Hit Blacksmith_Tile (" + Class + ")");
                 dirtyFlagBlacksmith = false;
             }
             
             if (Greenfoot.isKeyDown ("Space")){
               System.out.println("Spacebar Pressed in Blacksmith");
               level.addObject(new blacksmith_Message(), 512, 389);
             }
          break;
      
          }
          
        }
        

    
    if (!level.music.isPlaying()) {
        level.track_num++;
        
        if(level.track_num > 100) {
            level.track_num = 1;
        }
        
        if( level.track_num == 1) {
            
           level.music = new GreenfootSound("079 - Shattered Life.wav");
        } else if( level.track_num == 2)  {
            
           level.music = new GreenfootSound("043 - Silent Ground.wav");
        }
            level.music.play();
    }

//if ((( - NOT - ))) dirtyFlag_Player_Input statement "End"
}
}
}
    //block#1001 = wall
    //block#1002 = floor
    //TB revisited later   
    //}
    //if (!(level.getTileAt(hero_x, hero_y) == 1012)){
           //dirtyFlag = true;
           
    //}   
