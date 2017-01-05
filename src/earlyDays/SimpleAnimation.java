package earlyDays;
import javax.swing.*;
import java.awt.*;
public class SimpleAnimation {
	//make two instance variables in the main GUI class,
	//for the x and y coordinates of the circle
	int x = 70;
	int y = 70;
	
	public static void main(String [] args){
		SimpleAnimation gui = new SimpleAnimation ();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Make the widgets and put them in the frame
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		//This is where the action is..
		//repeat 130 times
		for(int i = 0; i < 130; i++){
			x++;
			y++;
			
			drawPanel.repaint(); //tell the panel to repaint itself (so we can see the circle in the new location
			
			try{
				Thread.sleep(50);//Slow it down a little(otherwise it will move so quickly you won't SEE it move).
			}
			catch(Exception ex) {}
		}
	}
		@SuppressWarnings("serial")
		class MyDrawPanel extends JPanel{
			public void paintComponent(Graphics g){
				g.setColor(Color.blue); //use the continually updated x and y coordinates of the outer class.
				g.fillOval(x, y, 40, 40);
			}
		}
	}
