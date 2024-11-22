package FileHandling;

import java.awt.Frame;
import java.awt.event.*;

public class awt {
  public static void main(String []args) {
	  Frame f=new Frame("My Frame");
	  f.setSize(35,450);
	  f.setVisible(true);
	  
	  f.addWindowListener(new Myclass());
  }
}
 class Myclass implements WindowListener{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
       
 }
