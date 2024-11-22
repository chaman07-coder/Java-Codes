package MenuGSV;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuGSV extends JFrame implements ActionListener,FocusListener
{
	public static void main(String []args) {
		JMenuGSV jmg=new JMenuGSV();
		jmg.setTitle("Note");
		jmg.setSize(500,500);
		jmg.setVisible(true);
		jmg.pack();
	}
	JMenuBar menu;
	JMenu file,edit,view,font;
	JMenuItem open,save,saveas,print,cut,copy,paste,tm,arial;
	JCheckBoxMenuItem password;
	public void JMenuGSV1(){
		menu=new JMenuBar();
		file=new JMenu("FILE");
		edit=new JMenu("EDIT");
		view=new JMenu("VIEW");
		font=new JMenu("FONT");
		menu.add(file);
		menu.add(edit);
		menu.add(view);
		
		open=new JMenuItem("OPEN");
		save=new JMenuItem("SAVE");
		saveas=new JMenuItem("SAVEAS");
		print=new JMenuItem("PRINT");
		cut=new JMenuItem("CUT");
		copy=new JMenuItem("COPY");
		paste=new JMenuItem("PASTE");
		tm=new JMenuItem("TimesNewRoman");
		arial=new JMenuItem("Arial");
		
		password=new JCheckBoxMenuItem("Password");
		font.add(tm);
		font.add(arial);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.add(font);
		file.add(print);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(password);
		
		add(menu,BorderLayout.NORTH);
		open.addActionListener(this);
		save.addActionListener(this);
	}
public void actionlistener(ActionEvent e){
		if(e.getSource()==open) {
			JFileChooser jfc=new JFileChooser();
			int openStatus = jfc.showOpenDialog(this);
			if(openStatus==jfc.APPROVE_OPTION) {
				File f1=jfc.getSelectedFile();
				System.out.println(f1.getAbsolutePath());
				OpenFrameDemo ofd=new OpenFrameDemo(f1);
				ofd.setVisible(true);
				ofd.setSize(500,500);	
			}
		}
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
