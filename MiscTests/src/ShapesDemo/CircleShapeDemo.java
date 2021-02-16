/*
 * This is a simple program of java awt. In this section, you will learn how to create Circle Diagram. The 
java circle is the most fundamental abstractions in a Java 2D in the supported  java.awt.shape 
package. It describes a shape. But the Java 2D definition of a shape does not require the shape to 
enclose an area. The Java2D API  also provides several classes that defines common Geometric 
Objects. 
Program Description:
In this program, you will also show that how to create square drawing. Inside the program define a class 
name CircleShapeDemo for the circle component.  There is created two types of diagrams "Circle" and 
"square" for this program. Here, this program uses Ellpise2D that is implemented to specify ellipse 
float and double. double and float components are represented for creating the square and circle in this 
program. 
setPaint(): This class is used for filling the color. 
Here is the code of this program: 
 */
package ShapesDemo;


import java.awt.*; 
import java.awt.event.*; 
import java.awt.geom.*; 
 
public class CircleShapeDemo extends Frame { 
    
  Ellipse2D circle = new Ellipse2D.Float(100.0f, 100.0f, 300.0f, 300.0f);     
/*x - the X coordinate of the upper-left corner of the framing rectangle 
  y - the Y coordinate of the upper-left corner of the framing rectangle 
` w - the width of the framing rectangle 
  h - the height of the framing rectangle 
   */
  //Shape square = new Rectangle2D.Double(100, 100,100, 100); 

    public CircleShapeDemo() {
        //super.setLayout(new FlowLayout());
    }
  
  
 
  
  
    //@Override
  public void paint(Graphics g,int x,int y) { 
  Graphics2D ga = (Graphics2D)g; 
        ga.drawLine(x, y, x , y);
        
    } 
  
  //public void paintCircle(Graphics g,int)
 
  public static void main(String args[]) { 
    
      CircleShapeDemo frame = new CircleShapeDemo(); 
      
    frame.addWindowListener(new WindowAdapter(){ 
     public void windowClosing(WindowEvent we){ 
         
         System.out.println("closing window");
     System.exit(0); 
     } 
    }); 
  frame.setSize(500, 500); 
  frame.setVisible(true); 

  
  //code below is to test whether points lie inside the circle or not
  int x = frame.circle.getBounds().x;
  int y = frame.circle.getBounds().y;
  Graphics gr = frame.getGraphics();
  gr.setColor(Color.PINK);
  for (int i = x ; i <= frame.circle.getBounds().width+x ; i++) {
          for(int j = y ; j <= frame.circle.getBounds().height+y ; j++){
              if (frame.circle.contains(i,j)){
                   frame.paint(gr, i, j);
                  
                  //frame.getGraphics().
                  System.out.println(i+" "+j +"  "+frame.circle.contains(i,j));
              }
              else continue;
          }
  }
  } 
  
  
}
