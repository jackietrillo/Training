import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener {
	
	private JTextField textBox1;
	private JTextField textBox2;
	private JTextField resultTextBox;
	private JFrame frame;
	
	public ButtonListener(JFrame frame, JTextField textBox1, JTextField textBox2, JTextField resultTextBox) {
		this.frame = frame;
		this.textBox1 = textBox1;
		this.textBox2 = textBox2;
		this.resultTextBox = resultTextBox;
	}
	
	 public void actionPerformed(ActionEvent e)
	 {	    	    
		String buttonText = ((JButton) e.getSource()).getText();
		
		int result = 0;
		if (buttonText == "+") 
		{
			result = Integer.parseInt(textBox1.getText()) + Integer.parseInt(textBox2.getText()); 
		}
		
		if (buttonText == "-") 
		{
			result = Integer.parseInt(textBox1.getText()) - Integer.parseInt(textBox2.getText()); 
		}
			
		resultTextBox.setText(String.format("%d", result));
	  //  JDialog dialog = new JDialog(frame, String.format("%d", result), true);
	    //dialog.setSize(500, 500);
	    //dialog.setLocationRelativeTo(frame);
	    //dialog.setVisible(true);		
	 }	    
}
