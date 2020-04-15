import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.*;
public class levelPage extends JFrame{
 
	private JButton jbtEasy=new JButton();
	private JButton jbtMedium=new JButton();
	private JButton jbtHard=new JButton();
	
	private easyPage ePage=new easyPage();
	
	
	private mediumPage mPage=new mediumPage();
	
	
	private hardPage hPage=new hardPage();

	
	private JMenuItem jmiInfo;

	
	public levelPage(){
		
		JMenuBar jmb=new JMenuBar();
		setJMenuBar(jmb);
		
		JMenu infoMenu=new JMenu("How to play?");
		jmb.add(infoMenu);
		
		infoMenu.add(jmiInfo=new JMenuItem("How to play?"));
		
		jmiInfo.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
			
		setVisible(false);
		Display display=new Display();
		display.setTitle("Display Page");
		display.setSize(700,700);
		display.setLocationRelativeTo(null);;
		display.setVisible(true);
				}
		});
		ImageIcon easyIcon=new ImageIcon("easy2.png");
		ImageIcon mediumIcon=new ImageIcon("medium.png");
		ImageIcon hardIcon=new ImageIcon("hard1.png");
		
		jbtEasy.setIcon(easyIcon);
		jbtMedium.setIcon(mediumIcon);
		jbtHard.setIcon(hardIcon);
		
		JPanel panel=new JPanel();
		panel.add(jbtEasy);
		panel.add(jbtMedium);
		panel.add(jbtHard);
		
		setLayout(new GridLayout(3,1));
		add(jbtEasy);
		add(jbtMedium);
		add(jbtHard);
		
		repaint();
		
	
		jbtEasy.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			
			setVisible(false);
			ePage.TimerMethod();
			ePage.setTitle("Easy Level");
			ePage.setSize(1200,230);
			ePage.setLocationRelativeTo(null);
			ePage.setDefaultCloseOperation(EXIT_ON_CLOSE);
			ePage.setVisible(true);
			
		}
	});
	
	
		
		jbtMedium.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			//mPage.showPage();
			setVisible(false);
			
			mPage.TimerMethod();
			mPage.setTitle("Medium Level");
			mPage.setSize(1200,230);
			mPage.setLocationRelativeTo(null);
			mPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
			mPage.setVisible(true);
		}
	});
	
		jbtHard.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				//hPage.showPage();
				setVisible(false);
				
				hPage.TimerMethod();
				hPage.setTitle("Hard Level");
				hPage.setSize(1200,230);
				hPage.setLocationRelativeTo(null);
				hPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
				hPage.setVisible(true);
			}
		});
	
}
	

}
