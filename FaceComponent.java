import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/*
   A component that draws an alien face
*/
public class FaceComponent extends JComponent
{
    private int a=1;
    public FaceComponent()
    {
    }
    public FaceComponent(int a)
    {
    this.a=a;
    }
    public void paintComponent(Graphics g){
        // Recover Graphics2D 
        Graphics2D g2=(Graphics2D) g;
        // Draw the face of the alien face
        Ellipse2D.Double face = new Ellipse2D.Double(5, 10, 100, 150);
        g2.draw(face);
        // Draw the eyes of the alien face
        g2.setColor(Color.BLUE);
        Rectangle eye = new Rectangle(25, 70, 15, 15);
        g2.fill(eye);
        eye.translate(50, 0);
        g2.fill(eye);
        // Draw the mouth of the alien face
        Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
        g2.setColor(Color.RED);
        g2.draw(mouth);  
        // Draw the greeting of the alien face
        g2.setColor(Color.BLUE);
        g2.drawString("Hello pinokyoo!", 5, 175);
        
        if (a==0){        
        
        Line2D.Double nose = new Line2D.Double(50, 90, 15, 15);
        Ellipse2D.Double kulak = new Ellipse2D.Double(0,90,15,15);
        Ellipse2D.Double kulak2 = new Ellipse2D.Double(110,90,15,15);
        g2.setColor(Color.BLUE);
    
        g2.draw(nose);
        g2.setColor(Color.RED);
        g2.draw(kulak);
        g2.draw(kulak2);
        }
    }
}