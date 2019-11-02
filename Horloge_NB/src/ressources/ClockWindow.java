package ressources;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockWindow extends JFrame {
	private JLabel displayClock;
	
	public ClockWindow() {
		
		//parameters of the window
		this.setTitle("Clock's display");
		this.setSize(400,200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		//clock's display
		displayClock = new JLabel(LocalTime.now().format(DateTimeFormatter.ofPattern("hh a mm ss"))); //CECI EST UN EXEMPLE
		displayClock.setFont(displayClock.getFont().deriveFont(40f));
		displayClock.setBounds(50, 25, 300, 100);
		this.add(displayClock);
		
		this.setVisible(true);
	}
	
	
	

}
