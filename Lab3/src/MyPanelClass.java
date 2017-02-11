import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                          //Paint the background
                          g.setColor(Color.WHITE);
                          g.fillRect(x1, y1, width + 1, height + 1);
//                        
                        //Draw a border
                        g.setColor(Color.BLUE);
                        g.fillRect(x1+10, y1+10, 250, 150);
                        
                        g.setColor(Color.BLACK);
                        g.drawRect(x1+10, y1+10, 250, 150);
                     
                        Polygon p = new Polygon();                     
                        p.addPoint(x1 + 10, y1 + 10);
                        p.addPoint(x1 + 260, y1 + 10);
                        p.addPoint(x1 + 260, y1 + 40);
                        p.addPoint(x1 + 56, y1 + 40);
                        g.setColor(Color.RED);
                        g.fillPolygon(p);
                        
                        Polygon p1 = new Polygon();                     
                        p1.addPoint(x1 + 56, y1 + 40);
                        p1.addPoint(x1 + 260, y1 + 40);
                        p1.addPoint(x1 + 260, y1 + 70);                    
                        p1.addPoint(x1 + 102, y1 + 70);                        
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p1);
                        
                        Polygon p2 = new Polygon();                     
                        p2.addPoint(x1 + 102, y1 + 70);
                        p2.addPoint(x1 + 260, y1 + 70);                       
                        p2.addPoint(x1 + 260, y1 + 100);
                        p2.addPoint(x1 + 102, y1 + 100);                                             
                        p2.addPoint(x1 + 125, y1 + 85);
                        g.setColor(Color.RED);
                        g.fillPolygon(p2);
                   
                        Polygon p3 = new Polygon();                     
                        p3.addPoint(x1 + 102, y1 + 100);
                        p3.addPoint(x1 + 260, y1 + 100); 
                        p3.addPoint(x1 + 260, y1 + 130);
                        p3.addPoint(x1 + 56, y1 + 130);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p3);
                        
                        Polygon p4 = new Polygon();                     
                        p4.addPoint(x1 + 56, y1 + 130);
                        p4.addPoint(x1 + 260, y1 + 130);
                        p4.addPoint(x1 + 260, y1 + 160);
                        p4.addPoint(x1 + 10, y1 + 160);                       
                        g.setColor(Color.RED);
                        g.fillPolygon(p4);
                        
                        
                        g.setColor(Color.BLACK);
                        g.drawLine(10, 10, 125 ,85);
                        
                        g.setColor(Color.BLACK);
                        g.drawLine(125, 85, 10, 160);

		                          
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1 + 25, y1 + 73);
                        p5.addPoint(x1 + 41, y1 + 73);
                        p5.addPoint(x1 + 47, y1 + 58);
                        p5.addPoint(x1 + 53, y1 + 73);
                        p5.addPoint(x1 + 69, y1 + 73);
                        p5.addPoint(x1 + 56, y1 + 83);
                        p5.addPoint(x1 + 61, y1 + 98);
                        p5.addPoint(x1 + 47, y1 + 88);
                        p5.addPoint(x1 + 34, y1 + 98);
                        p5.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p5);
			}		
}
