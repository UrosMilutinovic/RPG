import java.awt.Graphics;

import javax.swing.ImageIcon;
import java.awt.Rectangle;
public class Character {
    
    private int x, y, w, h, dx, dy, health, damage, speed;
    private ImageIcon pic;
    private Weapon weap;

    
    public Character(){
        x=0;
        y=0;
        w=50;
        h=50;
        dx=0;
        dy=0;
        health=100;
        damage=10;
        speed=5;
        pic = new ImageIcon();
        weap = new Weapon();
    }

    public Character(int xv, int yv, int width, int height, int he, int d, int s, ImageIcon i, Weapon wea){
        weap = new Weapon();
        x=xv;
        y=yv;
        w=width;
        h=height;
        dx=0;
        dy=0;
        health=he;
        damage=d;
        speed = s;
        pic = i;
        weap = wea;
        weap.setX(x+w);
        weap.setY(y+h/2);

    }

    public Character(int xv, int yv, int width, int height, int he, int d, int s, ImageIcon i){
        weap = new Weapon();
        x=xv;
        y=yv;
        w=width;
        h=height;
        dx=0;
        dy=0;
        health=he;
        damage=d;
        speed = s;
        pic = i;

    }

    public boolean mouseCollision(int xV, int yV){
        Rectangle mouse = new Rectangle( xV,yV, 1, 1);
        Rectangle cha = new Rectangle (x, y, w, h);

        if(mouse.intersects(cha)){
            System.out.println("worked");
             return true;
        }
       

        return false;
    }

    public void drawChar(Graphics g2d){
        
        g2d.drawImage(pic.getImage(), x,y,w,h, null);
        g2d.drawImage(weap.getImage(),weap.getX(),weap.getY(), weap.getW(), weap.getH(), this);
    
    }


    //getters & setters

    public ImageIcon getPic(){
        return pic;
    }

    public void setPic(ImageIcon i){
        pic = i;
    }

    public void setDx(int dxv){
        dx = dxv;
    }

    public void setDy(int dyv){
        dy = dyv;
    }
    
    public int getHeight(){
        return h;
    }

    public int getWidth(){
        return w;
    }
   
    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return damage;
    }

    public int getSpeed(){
        return speed;
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public void setWeap(Weapon weapon){
        weap = weapon;
    }
}
