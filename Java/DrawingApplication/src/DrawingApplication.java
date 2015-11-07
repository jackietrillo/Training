import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 * Simple drawing program.
 * 
 * @author pat
 */
public class DrawingApplication implements DrawingButtonClickEvent {
      
	private static DrawingPanel drawingPanel = new DrawingPanel();
	
    public static void main(String[] args) {
      
        JFrame window = new JFrame("Drawing Application");      
        window.setSize(600, 500);                
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               
                   
        DrawingApplication app = new DrawingApplication(); 
        
        DrawingButtonPanel colorPanel = new DrawingButtonPanel(window);
        colorPanel.drawingButtonClickEvent = app;
        window.add(colorPanel, BorderLayout.PAGE_START);
        window.add(drawingPanel, BorderLayout.CENTER);      
        window.setVisible(true);                           
    }

	@Override
	public void onColorChanged(Color color) {		
		drawingPanel.setPenColor(color);			
	}

	@Override
	public void onErase() {
		drawingPanel.erase();			
	}

	@Override
	public void onClear() {
		drawingPanel.clear();		
	}
}
