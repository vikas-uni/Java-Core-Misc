// prog to demo. applets

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MyApplet extends Applet implements ActionListener{
Button b1,b2;
int type;
public void init(){                      //invoked by the browser when the oblect of applet is created
b1=new Button("Rect");
b2=new Button("Circle");
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void paint(Graphics g){
if(type==1)
  g.drawRect(50,100,200,200);
if(type==2)
  g.drawArc(50,100,150,100,0,360);
  }
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1)
  type=1;
if(e.getSource()==b2)
  type=2;
repaint();                                  //used to call paint
}
}
  
