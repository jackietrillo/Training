/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.*;

/**
 * Simple drawing program.
 * 
 * @author pat
 */
public class DrawingApplication implements WindowListener, ActionListener  {
    
  
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("Simple Interaction Demo");      
        frame.setSize(640, 480);                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               
        frame.add(new DrawingPanel());      
        frame.setVisible(true);
        
        JButton b = new JButton("Click me");
        b.addActionListener(this);
    }
}
