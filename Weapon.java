import javax.swing.ImageIcon;

public class Weapon {
     
    private int x, y, w, h, dx, dy, health, damage;
    private ImageIcon pic;

    public Weapon(){
        x=0;
        y=0;
        w=50;
        h=50;
        dx=0;
        dy=0;
        health=100;
        damage=10;
        pic = new ImageIcon();
    }

    public Weapon(int xv, int yv, int width, int height, int health, int d, ImageIcon i){
        x=xv;
        y=yv;
        w=50;
        h=50;
        dx=0;
        dy=0;
        health=100;
        damage=d;
        pic = i;

    }

    //getters & setters
}
