package figura3;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JOptionPane;

/**
 *
 * @author Iann Orlando Gallardo Herrera
 */

public class Figura3 extends JFrame {
  public Figura3() {
    
    setTitle("figura3");
    
    int lado;
    String l;
    l = JOptionPane.showInputDialog("Introduce un lado","2");
    lado = Integer.parseInt(l);
    add(new PoligonoPanel(lado));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setVisible(true);
    setLocationRelativeTo(null);
        
    
  }
  public static void main(String[] args) {
    
    Figura3 frame = new Figura3();
  }
}

