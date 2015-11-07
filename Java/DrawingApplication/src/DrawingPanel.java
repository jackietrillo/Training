import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;

public class DrawingPanel extends JPanel  implements MouseListener, MouseMotionListener {
   
	private enum PaintType {
		LINE, 
		OVAL, 
		SQUARE,
		PATH 
	}
	
	private static final long serialVersionUID = 1L;
	private Boolean penActivated = true; 
	private JLabel penActiveLabel;
	private JLabel instructionLabel;
	private Color penColor;
	private Boolean clear = false;
	private DrawingPath path = new DrawingPath(Color.BLACK);
    private ArrayList<DrawingPath> paths = new ArrayList<DrawingPath>();
    private PaintType paintType = PaintType.PATH;
    
    public DrawingPanel() {
        this.setBackground(Color.WHITE);
        this.setSize(300, 300);
        this.setLocation(0, 100);
        this.setLayout(new BorderLayout());
       
        this.penActiveLabel = new JLabel("Pen Active", SwingConstants.RIGHT);             
        this.add(penActiveLabel, BorderLayout.SOUTH);
        
        this.instructionLabel = new JLabel("Draw something by dragging the mouse!", SwingConstants.CENTER);
        this.add(instructionLabel, BorderLayout.NORTH);  
                                            
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
   
    public void setPenColor(Color color) {
	   this.penColor = color;	  
    }
        
    public void erase() {
	   this.setPenColor(Color.WHITE); 
    }
    
    public void clear() {
    	 this.clear = true;
    	 repaint();
    }
           
    @Override
    public void paintComponent(Graphics gfx) {     
    	if (this.penActivated) {    		
	        super.paintComponent(gfx);	     
	        
	        switch (paintType) {
	        case LINE:
	        	//gfx.drawLine(drawX, drawY, drawWidth, drawHeight);
	           break;
	        case OVAL:
	        	//gfx.drawOval(drawX, drawY, drawWidth, drawHeight);
	           break;
	        case SQUARE:
	        	//gfx.drawRect(drawX, drawY, drawWidth, drawHeight);
	        	break;
	        case PATH:
	        	drawPath((Graphics2D)gfx);
	        	break;
	        default: //path
	        	drawPath((Graphics2D)gfx);
	           break;
	        }
    	}
    }

    private void drawPath(Graphics2D graphic2D) {
    	    	   	        
        graphic2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);		     	     
      
        graphic2D.setStroke(new BasicStroke(10));        	        
        for (DrawingPath path : paths ) {
        	if (!this.clear) {
        		System.out.println("no clear");
        		graphic2D.setColor(path.getColor());
        		graphic2D.draw(path.getPath());
        	}
        	else {
        		System.out.println("clear");
        		graphic2D.setColor(Color.WHITE);
        		graphic2D.draw(path.getPath());
        	}
        }        
    }
    
    // Implementation of MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
    	this.penActivated = !penActivated;    	  
    	this.penActiveLabel.setText((this.penActivated ? "Pen Active" : "Pen Inactive"));    	       	
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {            	
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    	if (this.penActivated) {    	
    		path = new DrawingPath(this.penColor);
    		paths.add(path);	     
	        path.getPath().moveTo(e.getX(), e.getY());
	        repaint();
    	}
    }
    
    // Implementation of MouseMotionListener
    @Override
    public void mouseDragged(MouseEvent e) {
    	if (this.penActivated) {
    		path.getPath().lineTo(e.getX(), e.getY());
    		repaint();
    	}
    }  
}