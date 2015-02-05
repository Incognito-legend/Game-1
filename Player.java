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
    
    
    String lastWayFacing = "down";
    //int Class = 4;
    int Class;
    boolean dirtyFlag = true;
    boolean dirtyFlag1 = true;
    boolean dirtyFlagMovement = false;
    int whichWalk = 0;
    public void act() 
    {
        background level = (background)this.getWorld();
        int hero_x_px = -level.pos_x + getX();
        int hero_y_px = -level.pos_y + getY();
        int hero_x = hero_x_px/96;
        int hero_y = hero_y_px/96;
        int music = level.track_num;
        if (Class == 1 || Class == 2 || Class == 3 || Class == 4 || Class == 5) {Class = 4;}
//start of movement        
  if (Greenfoot.isKeyDown ("left")){
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
    }
        else  if (Greenfoot.isKeyDown ("right"))
    {
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
    }
        else if (Greenfoot.isKeyDown("up"))
    {
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
    }    
        else if (Greenfoot.isKeyDown("down"))
    {   
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
    //end of Player movement
    //Beginning of Artificial movement
    } 
    else if (Greenfoot.isKeyDown("Space"))
    {
    if (dirtyFlag1 == false && (Greenfoot.isKeyDown("Space"))){
       if (Class == 1 && (Greenfoot.isKeyDown("Space") && (level.getTileAt(hero_x, hero_y) == 1005))){
        System.out.println("Player class: Hunter : is in Blacksmith");
       //level.addObject(new hunter(), 512, 389);
       }  
       if (Class == 2 && (Greenfoot.isKeyDown("Space") && (level.getTileAt(hero_x, hero_y) == 1005))){
       System.out.println("Player class: Druid : is in Blacksmith");
       //level.addObject(new Druid(), 512, 389);
       }
       if (Class == 3 && (Greenfoot.isKeyDown("Space") && (level.getTileAt(hero_x, hero_y) == 1005))){
       System.out.println("Player class: Mage : is in Blacksmith");
       //level.addObject(new Mage(), 512, 389);
       }
       if (Class == 4 && (Greenfoot.isKeyDown("Space") && (level.getTileAt(hero_x, hero_y) == 1005))){
       System.out.println("Player class: Paladin : is in Blacksmith");
       //level.addObject(new Palladin(), 512, 389);
       }
       if (Class == 5 && (Greenfoot.isKeyDown("Space") && (level.getTileAt(hero_x, hero_y) == 1005))){
       System.out.println("Player class: Warrior : is in Blacksmith");
       //level.addObject(new Warrior(), 512, 389);
       }
     }
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
    dirtyFlagMovement = true;
    if (dirtyFlagMovement){
        switch (level.getTileAt(hero_x, hero_y)) {
          case 1003:
            System.out.println("You're at your house!");
          break;
          case 1004: 
            System.out.println("You're at the Arena!");
          break;
          case 1005:
             if (dirtyFlag1 == true) {
               //level.removeObject(this);
               //level.addObject(new Blacksmith(), 100, 100);
               System.out.println("Welcome to the Blacksmith! (" + Class + ")");
               dirtyFlag1 = false;
               //hi
             }
          break;
          case 1006:
             System.out.println("Welcome to the Shop!");
          break;
          case 1007:        
             if (!(this instanceof hunter)){
               level.removeObject(this);
               level.addObject(new hunter(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("You have chosen the [ Hunter ] !");
               Class = 1;
             }
          break;
          case 1008:
             if (!(this instanceof Druid)){
               level.removeObject(this);
               level.addObject(new Druid(), 512, 389);
               level.addObject(new Smoke_Effect(), 512, 389);
               System.out.println("You have chosen the [ Druid ] !");
               Class = 2;
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
}
}

    //TB revisited later   
    //if (level.getTileAt(hero_x, hero_y) == 1012 && (Greenfoot.isKeyDown ("Space") && (dirtyFlag == true))){
           //System.out.println("In Memory of Pluto, the riddle master!");
           //System.out.println("You're Standing on a Portal!");
           //Date d = new Date();
           //System.out.println("Your Current Universal Time is...");
           //System.out.println(d);
           //dirtyFlag = false;
    //}
    //if (!(level.getTileAt(hero_x, hero_y) == 1012)){
           //dirtyFlag = true;
           
    //}   
