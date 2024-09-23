import javax.swing.ImageIcon;

public class Knight extends Character{
    
    public Knight(){
        super();
    }

    public Knight(int x, int y){
        super(x,y,200,200, 150, 75, 4, new ImageIcon("Knight.png"));

    }
    
    public String toString(){
        return "Knight";
    }

    }

