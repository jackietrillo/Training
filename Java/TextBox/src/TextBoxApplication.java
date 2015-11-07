import javax.swing.*;

public class TextBoxApplication {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("TextBox Application");      
        frame.setSize(640, 480);                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
                                               
        JTextField input1TextBox  = new JTextField();     
        input1TextBox.setBounds(50,20,100,20);
        frame.getContentPane().add(input1TextBox);
        
        JTextField input2TextBox = new JTextField();    
        input2TextBox.setBounds(50, 50, 100, 20);
        frame.getContentPane().add(input2TextBox);
        
        JTextField resultTextBox = new JTextField();    
        resultTextBox.setBounds(50, 80, 100, 20);
        frame.getContentPane().add(resultTextBox);
        
	    JButton plusButton = new JButton("+");	    
	    plusButton.addActionListener(new ButtonListener(frame, input1TextBox, input2TextBox, resultTextBox));	    		    	    	   
	    plusButton.setBounds(50, 110, 100, 20);
	    frame.getContentPane().add(plusButton);
	    
	    JButton minusButton = new JButton("-");	    
	    minusButton.addActionListener(new ButtonListener(frame, input1TextBox, input2TextBox, resultTextBox));	    		    	    	   
	    minusButton.setBounds(50, 140, 100, 20);	   	    	   
	    frame.getContentPane().add(minusButton);
	    	    
	    frame.setVisible(true);  	    	    	 	    
    }
}
