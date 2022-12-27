package sample;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

public class MenuDemo  extends JFrame{

	
		 public static int WIDTH = 300;
		 public static int HEIGHT = 300;
		 public static String TITLE = "MenuDemo";
		 Container frameContainer;
	
		 // Swing components
		 JLabel label=new JLabel("Welcome to MenuDemo");
		 JMenuBar menuBar = new JMenuBar();
		 JMenu fileMenu = new JMenu("File");
		 JMenuItem fileNew = new JMenuItem("New");
		 JMenuItem fileOpen = new JMenuItem("Open");
		 JMenuItem fileSave = new JMenuItem("Save");
		 JMenuItem fileExit = new JMenuItem("Exit");
		 JMenu specialMenu = new JMenu("Properties");
		 JCheckBoxMenuItem specialCheck1 = new 
		 JCheckBoxMenuItem("Bold");
		 JCheckBoxMenuItem specialCheck2 = new 
		 JCheckBoxMenuItem("Italic");
		 JSeparator separator = new JSeparator();
		 JRadioButtonMenuItem specialRadio1 = new
		 JRadioButtonMenuItem("Red");
		 JRadioButtonMenuItem specialRadio2 = new 
		 JRadioButtonMenuItem("Blue");
		 JRadioButtonMenuItem specialRadio3 = new 
		 JRadioButtonMenuItem("Green");
		 ButtonGroup buttonGroup = new ButtonGroup();
		 public MenuDemo() 
	 {
	 super(TITLE);
	 buildGUI();
	 label.setFont(new Font("TimesRoman",Font.PLAIN,20));
	 setupEventHandlers();
	 setSize(WIDTH,HEIGHT);
	 show();
	 }
	
	void buildGUI() 
	 {
	 setupMenuBar();
	 layoutComponents();
	 }
	 void setupMenuBar() 
	 {
	 fileMenu.add(fileNew); 
	 fileMenu.add(fileOpen); 
	 fileMenu.add(fileSave); 
	 fileMenu.add(fileExit); 
	 specialMenu.add(specialCheck1);
	 specialMenu.add(specialCheck2);
	 specialMenu.add(separator);
	 buttonGroup.add(specialRadio1);
	 buttonGroup.add(specialRadio2);
	 buttonGroup.add(specialRadio3);
	 specialMenu.add(specialRadio1);
	 specialMenu.add(specialRadio2);
	 specialMenu.add(specialRadio3); 
	 menuBar.add(fileMenu);
	 menuBar.add(specialMenu);
	 setJMenuBar(menuBar);
	 }

	 public void layoutComponents() 
	 {
	 frameContainer = getContentPane();
	 frameContainer.setLayout(null);
	 label.setBounds(25,75,300,40);
	 frameContainer.add(label);
	 }
	 void setupEventHandlers() 
	 {
	 addWindowListener(new WindowHandler());
	 fileNew.addActionListener(new MenuItemHandler());
	 fileOpen.addActionListener(new MenuItemHandler());
	 fileSave.addActionListener(new MenuItemHandler());
	 fileExit.addActionListener(new MenuItemHandler());
	 specialCheck1.addItemListener(new ItemHandler());
	 specialCheck2.addItemListener(new ItemHandler());
	 specialRadio1.addItemListener(new ItemHandler());
	 specialRadio2.addItemListener(new ItemHandler());
	 specialRadio3.addItemListener(new ItemHandler());
	 }
	 public static void main(String[] args) 
	 {
	 MenuDemo app = new MenuDemo();
	 }
	 public class WindowHandler extends WindowAdapter 
	 {
	 public void windowClosing(WindowEvent e) {
	 System.exit(0);
	 }
	}
	public class MenuItemHandler implements ActionListener{
public void actionPerformed(ActionEvent e) 
	 {
	 String cmd = e.getActionCommand();
	 if(cmd.equals("Exit")) System.exit(0);
	 else label.setText("You Have Selected: "+cmd);
	 }
	}
	public class ItemHandler implements ItemListener 
	{
	 public void itemStateChanged(ItemEvent e) 
	 {
	 AbstractButton button = (AbstractButton) e.getItem();
	 String text = button.getText();
	 String display="Welcome to American Education Systems";
	 label.setText(display);
	 if(text.equals("Red") && button.isSelected())
	 label.setForeground(Color.red);
	 else if(text.equals("Green") && button.isSelected())
	 label.setForeground(Color.green); 
	 else if(text.equals("Blue") && button.isSelected())
	 label.setForeground(Color.blue); 
	 if(text.equals("Italic") && button.isSelected())
	 label.setFont(new
	 Font("TimesRoman",Font.ITALIC,20));
	 else if(text.equals("Bold") && button.isSelected())
	 label.setFont(new Font("TimesRoman",Font.BOLD,20));
	 else label.setFont(new 
	 Font("TimesRoman",Font.PLAIN,20));
	 }
	}
	}