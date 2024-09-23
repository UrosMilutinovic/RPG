
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.*; 
import java.io.File;
import java.io.IOException;
import java.awt.*;

public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private int key, typeIndex, counter; 
	private String screen;
	private ArrayList <Character> mainChars;
	private Character mainChar;
	private String s;
	private Font customFont;

	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		key =-1; 
	
		s = "Select Your Character";
		
		screen = "selection";
		mainChars = setMainChars();

		for(Character e : mainChars){
			System.out.println(e);
		}
		
		try{
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\S2104163\\Desktop\\JuniorYearCompSci\\RPGgame\\BADABB__.TTF")).deriveFont(70f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(customFont);
		} catch(IOException | FontFormatException e){
			e.printStackTrace();
		}
		
		typeIndex  = 0;
		counter = 0;

}
	

	
	
	private ArrayList<Character> setMainChars() {
		// TODO Auto-generated method stub
		ArrayList <Character> temp = new ArrayList<>();
		temp.add(new Knight(365, 250));
		temp.add(new Wizard(725, 250));
		temp.add(new Ninja( 1050, 240));



		return temp;

	}



	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
	
		g2d.setFont( new Font("Broadway", Font.BOLD, 50));
		
		
		drawScreens(g2d);
	
		twoDgraph.drawImage(back, null, 0, 0);

	}

	



	private void drawScreens(Graphics g2d) {
		// TODO Auto-generated method stub

		switch(screen){
			case "selection":
				drawSelectionScreen(g2d);
				break;
			case "stats":
				drawStats(g2d);
			

		}
	}



	private void drawStats(Graphics g2d) {
		// TODO Auto-generated method stub
		
		g2d.setFont(customFont);
		g2d.setColor(Color.white);
		g2d.drawString("You've selected " + mainChar, 100, 200);
		mainChar.drawChar(g2d);
		
		g2d.drawString("Health -  " + mainChar.getHealth(), 100, 550);
		g2d.drawString("Attack Power -  " + mainChar.getDamage(), 100, 700);
		g2d.drawString("Speed -  " + mainChar.getSpeed(), 100, 850);
		g2d.drawString("Press SPACE to continue", 500, 1000);
	}



	private void drawSelectionScreen(Graphics g2d) {
		// TODO Auto-generated method stub
		int x =375;
		counter++;

		if(counter%50 ==0 && typeIndex  < 21)
		typeIndex++;
		
		g2d.setFont(customFont);
		g2d.setColor(Color.WHITE);
		g2d.drawString(s.substring(0, typeIndex ), 500, 750);
		//g2d.drawString("Select you character", 500, 750);
		for(Character c: mainChars){
			c.drawChar(g2d);
			g2d.drawString("" + c, x, 200);

			x+= 350;
		}
	}



	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		
		if (key ==32){
			mainChar=mainChars.get(0);
		}
		
	
	}


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		
	}



	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for (Character c: mainChars){
			if (c.mouseCollision(e.getX(), e.getY())){
				mainChar=c;
				screen = "stats";
			}

		}
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("entered");
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("exited");
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("you clicked at"+ arg0.getY());
		
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}
