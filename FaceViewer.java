import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FaceViewer
{
    public static void q3()
    {
        JFrame frame = new JFrame();
        frame.setSize(150, 250);
        frame.setTitle("An Alien Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        FaceComponent component = new FaceComponent();
        frame.add(component);
  
        frame.setVisible(true);
        
        JOptionPane.showMessageDialog(null,"Make your own modifications on this drawing");
        frame.setVisible(false);

        JFrame frame1 = new JFrame();
        frame1.setSize(150, 250);
        frame1.setTitle("A Happy Face");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int n=0;
        FaceComponent component2 = new FaceComponent(n);
        frame1.add(component2);

        frame1.setVisible(true);

    }
}