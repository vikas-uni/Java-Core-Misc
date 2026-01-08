package recursion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FractalTree extends JFrame {
public FractalTree() {
    setLocation(500, 50);
    setSize(800, 700);
    setTitle("Fractal Tree");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //TreePanel t = new TreePanel();
   // t.setVisible(true);
   // add(t);
    //add(new MyCanvas());
    setVisible(true);
  
}

public static void main(String[] args) {
    // TODO Auto-generated method stub

    // initialize screen elements
    FractalTree ft = new FractalTree();
    

}

public void paint(Graphics g){
	  super.paint(g);
	    g.setColor(Color.WHITE);
	    g.fillRect(0, 0, 800, 700);
	    drawFractalTree(g, 400, 500, -90, 9);
}






//class TreePanel extends JPanel {
private static int maxLength = 10;;

public void drawFractalTree(Graphics g, int x1, int y1, double angle, int level) {
    if (level <= 0)
        return;
    //

    int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * level * maxLength);
    int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * level * maxLength);

    // set color
    setLineColor(g, level);
    // draw between two points
    g.drawLine(x1, y1, x2, y2);


    try {
        TimeUnit.MICROSECONDS.sleep(100);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }


    // call rec.
    drawFractalTree(g, x2, y2, angle - 20, level - 1);
    drawFractalTree(g, x2, y2, angle, level - 1);
    drawFractalTree(g, x2, y2, angle + 20, level - 1);

}

/*@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, 800, 700);
    drawFractalTree(g, 400, 500, -90, 9);
}*/

public void setLineColor(Graphics g, int i) {
    switch (i) {

    case 1:
        g.setColor(Color.GREEN);
        break;
    case 2:
        g.setColor(Color.YELLOW);
        break;
    case 3:
        g.setColor(Color.ORANGE);
        break;
    case 4:
        g.setColor(Color.CYAN);
        break;
    case 5:
        g.setColor(Color.MAGENTA);
        break;
    case 6:
        g.setColor(Color.PINK);
        break;
    case 7:
        g.setColor(Color.RED);
        break;
    case 8:
        g.setColor(Color.BLUE);
        break;
    case 9:
        g.setColor(Color.GRAY);
        break;
    default:
        g.setColor(Color.BLACK);
        break;
    }
}
}


