import javax.swing.ImageIcon;

public class Wizard extends Character{
    
    public Wizard(){
        super();
    }

    public Wizard(int x, int y){
        super(x,y,200,200,100, 100, 2, new ImageIcon("Wizard.png"));

    }

    public String toString(){
        return "Wizard";
    }

    }

