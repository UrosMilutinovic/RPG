import javax.swing.ImageIcon;

public class Sword extends Weapon  {
    public Sword(){
        super();
    }

    public Sword(int x, int y){
        super(x,y,50,50,100, 50, new ImageIcon("Knight.png"));

    }

    public String toString(){
        return "Sword";
    }

}
