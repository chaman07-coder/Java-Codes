package radiobutton.com;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RadioButton extends Frame implements ItemListener {
   String msg="";
   CheckboxGroup cbg;
   Checkbox c1,c2;
   RadioButton(){
	   setLayout(new FlowLayout());
	   CheckboxGroup cbg= new CheckboxGroup();
	   Checkbox c11=new Checkbox("Passed",cbg,true);
	   Checkbox c22=new Checkbox("Failed", cbg,false);
	   
	   add(c11);
	   add(c22);
	   
	   c11.addItemListener(this);
	   c22.addItemListener(this);
	   
	   addWindowListener(new WindowAdapter() {
		   public void windowClosing(WindowEvent we) {
			   System.exit(0);
		   }
	   });
   }
   public void ItemChangedState(ItemEvent ie) {
	   repaint();
   }
   public void paint(Graphics g) {
	   msg="current selection: ";
	   msg+=cbg.getSelectedCheckbox().getLabel();
	   g.drawString(msg, 10,100);
   }
   
   public static void main(String []args) {
	   RadioButton r=new RadioButton();
	   r.setTitle("Radio Button");
	   r.setSize(400,400);
	   r.setVisible(true);
   }
}
