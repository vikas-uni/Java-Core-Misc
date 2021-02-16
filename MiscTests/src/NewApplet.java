/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author ADMIN
 */
public class NewApplet extends Applet  {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    //Button b1,b2;
    //int type=0;
    public void init() {
        repaint();
    }

    
    // TODO overwrite start(), stop() and destroy() methods

  public void paint(Graphics graphic){

   graphic.drawString("hello",20,20);
  }

}
