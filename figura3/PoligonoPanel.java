package figura3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Iann Orlando Gallardo Herrera
 */
class PoligonoPanel extends JPanel {
  private int lado = 2;
  
  public PoligonoPanel(int lado){
      this.lado = lado;
  }
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
 
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

    
    Polygon polygon = new Polygon();

    g.setColor(Color.RED);
    polygon.addPoint(xCenter + radius, yCenter);
    polygon.addPoint((int)(xCenter + radius *
      Math.cos(2 * Math.PI / 8)), (int)(yCenter - radius *
      Math.sin(2 * Math.PI / 8)));
    for(int i = 3; i <= lado; i++){
        //aqui vamos agregar 2 puntos mas por lo tanto agregamos otros 2 metodos matematicos
        polygon.addPoint((int)(xCenter + radius *
          Math.cos(i * 2 * Math.PI / 8)), (int)(yCenter - radius *
          Math.sin(i * 2 * Math.PI / 8)));
        
    }
 
    g.drawPolygon(polygon);
  }
}
