/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bullseyetest;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
/**
 *
 * @author rkaune
 */
public class Bullseye extends JPanel
{
   public void paintComponent(Graphics g)
   {
      
      super.paintComponent(g);

      // draw the face
      g.setColor(Color.WHITE);
      g.fillOval(10, 10, 200, 200);
      // draw the eyes
      g.setColor(Color.BLUE);
      g.fillOval(30, 30, 162, 162);
      //c1,c2,w,h
      g.setColor(Color.WHITE);
      g.fillOval(50, 50, 121, 121);
      
      g.setColor(Color.BLUE);
      g.fillOval(73, 73, 75, 75);
      
      g.setColor(getColor);
      g.fillOval(91, 91, 40, 40);
   } 
} // end class bullseye