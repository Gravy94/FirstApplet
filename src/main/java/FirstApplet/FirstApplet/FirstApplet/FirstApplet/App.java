package FirstApplet.FirstApplet.FirstApplet.FirstApplet;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class App extends JApplet{

	public void init(){
		
		getContentPane().setLayout(new GridLayout(2,300));
		
		final JButton b2 = new JButton("click me2");
		final JButton b = new JButton("click me");
		
		b.setEnabled(true);
		
		final JToggleButton t = new JToggleButton("Ciao");
		
		t.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		b.setSize(20,20);
		b2.setSize(20,20);

		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b.setText("Clicked!!");
				
			}
		});
		
		getContentPane().add(b,0);
		getContentPane().add(b2,1);
		getContentPane().add(new JLabel("prova"),2);
		getContentPane().add(new JLabel("prova2"),3);
		

	}
}
