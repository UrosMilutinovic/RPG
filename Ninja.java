import javax.swing.ImageIcon;

public class Ninja extends Character{
    
    public Ninja(){
        super();
    }

    public Ninja(int x, int y){
        super(x,y,200,200,100, 50, 5, new ImageIcon("Ninja.png"));

    }

    public String toString(){
        return "Ninja";
    }
    
    }

