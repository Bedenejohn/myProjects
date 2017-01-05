package earlyDays;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class InnerButton{

	JFrame frame;
	JButton b;
	
	public static void main(String [] args){
//		InnerButton gui = new InnerButton();
//		gui.go();
		count("ab3gh2f8");
	}
	public static int count(String str){
		int nums = 0;
		for(int i = 0; i < str.length(); i++){
			if(Character.isDigit(str.charAt(i))){
				nums++;
			}
		}
		return nums;
	}
	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b = new JButton("A");
		b.addActionListener(new BListener());
		frame.getContentPane().add(BorderLayout.SOUTH, b);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
	class BListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(b.getText().equals("A")){
				b.setText("B");
			}
			else{
				b.setText("A");
			}
		}
	}
}
	
	


