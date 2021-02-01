import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class Solution {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Input side1: ");
  int s1 = in .nextInt();
  System.out.print("Input side2: ");
  int s2 = in .nextInt();
  System.out.print("Input side3: ");
  int s3 = in .nextInt();

  boolean res = false;

   res = isValidTriangle(s1, s2, s3);

  System.out.print("Is the said sides form a triangle: " + res);

  if( res == true)
  {
	int width = 500;
    int height = 500;
    int[] x = { (width / 2) - 50, (width / 2), (width / 2) + 50 };
    int[] y = { (height / 2) + 50, (height / 2) - 50, (height / 2) + 50 };
    Polygon p = new Polygon(x, y, 3);
	JFrame f = new JFrame("Thats what a triangle looks like");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel() {
      public void paintComponent(Graphics g) {
        g.fillPolygon(p);
      }

    };
    panel.setPreferredSize(new Dimension(width, height));

    f.getContentPane().add(panel);
    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);

  }
 }
  

 
 public static boolean isValidTriangle(int a, int b, int c) {
  return (a + b > c && b + c > a && c + a > b);
 }
	

}


