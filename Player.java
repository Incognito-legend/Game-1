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
    int whichWalk = 0;
    
    public void act() 
    {
        background level = (background)this.getWorld();
        int hero_x_px = -level.pos_x + getX();
        int hero_y_px = -level.pos_y + getY();
        int hero_x = hero_x_px/96;
        int hero_y = hero_y_px/96;
        
        if (Greenfoot.isKeyDown ("left"))
    {
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
    } 
    
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
    if (level.getTileAt(hero_x, hero_y) == 1003){
        System.out.println("You're at your house!");
        
        
    }
       if (level.getTileAt(hero_x, hero_y) == 1004){
        System.out.println("You're at the Arena!");
        
        
    }
       if (level.getTileAt(hero_x, hero_y) == 1006){
        System.out.println("Welcome to the Shop!");
        
        
    }
       if (level.getTileAt(hero_x, hero_y) == 1005){
        System.out.println("Welcome to the Blacksmith!");
        
        
    }
       if (level.getTileAt(hero_x, hero_y) == 1007 && !(this instanceof hunter)){
        level.removeObject(this);
        level.addObject(new hunter(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Hunter ] !");
    }
       if (level.getTileAt(hero_x, hero_y) == 1008 && !(this instanceof Druid)){
        level.removeObject(this);
        level.addObject(new Druid(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Druid ] !");
    }
       if (level.getTileAt(hero_x, hero_y) == 1009 && !(this instanceof Mage)){
        level.removeObject(this);
        level.addObject(new Mage(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Mage ] !");
    }
        if (level.getTileAt(hero_x, hero_y) == 1010 && !(this instanceof Palladin)){
        level.removeObject(this);
        level.addObject(new Palladin(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Palladin ] !");
    }
       if (level.getTileAt(hero_x, hero_y) == 1011 && !(this instanceof Warrior)){
        level.removeObject(this);
        level.addObject(new Warrior(), 512, 389);
        level.addObject(new Smoke_Effect(), 512, 389);
        System.out.println("You have chosen the [ Warrior ] !");
    }
       if (level.getTileAt(hero_x, hero_y) == 1012 && (Greenfoot.isKeyDown ("Space"))){
           System.out.println("In Memory of Pluto, the riddle master!");
           System.out.println("You're Standing on a Portal!");
           Date d = new Date();
           System.out.println("Your Current Universal Time is...");
           System.out.println(d);
    }
    if(!level.music.isPlaying()) {
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
