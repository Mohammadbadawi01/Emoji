import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Code {
	public static void main(String[] args)
	{
		DrawPanel panel = new DrawPanel();
		JFrame application = new JFrame();
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
}




class DrawPanel extends JPanel {

public void paintComponent(Graphics g) {

super.paintComponent(g);

	g.setColor(Color.YELLOW);
	g.fillOval(10, 10, 200, 200); 	


	g.setColor(Color.RED);

	int width = 50;
	int height = 50;
	int x,y;
	x=y=50;


    int[] triangleX = { x - 2*width/18, x + width + 2*width/18,(x - 2*width/18 + x + width + 2*width/18)/2};
    int[] triangleY = {   y + height - 2*height/3, y + height - 2*height/3,   y + height };
    g.fillOval(x - width/12, y, width/2 + width/6, height/2); 
    g.fillOval(x + width/2 - width/12, y, width/2 + width/6,height/2);
    g.fillPolygon(triangleX, triangleY, triangleX.length);

    x=130;
    y=57;
    int[] triangleX2 = { x - 2*width/18, x + width + 2*width/18,(x - 2*width/18 + x + width + 2*width/18)/2};
    int[] triangleY2 = {   y + height - 2*height/3, y + height - 2*height/3,   y + height };
    g.fillOval(x - width/12, y, width/2 + width/6, height/2); 
    g.fillOval(x + width/2 - width/12, y, width/2 + width/6,height/2);
    g.fillPolygon(triangleX2, triangleY2, triangleX2.length);
    
    g.setColor(Color.BLACK);
 	g.fillArc( 60, 95, 105, 100,180, 180);
	g.fillOval(60,130,30,30);
  	g.fillOval(135,130,30,30);
  	
	g.setColor(Color.YELLOW);
	g.fillArc( 60, 65, 105, 100,180, 180);
    
    
    
    
}




}

