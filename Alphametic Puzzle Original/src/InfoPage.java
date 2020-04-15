import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InfoPage extends JFrame{
	
	private userName user=new userName();
	
	

	private JLabel jlblImage=new JLabel();
	private JTextArea jtaDescription=new JTextArea();
	private JButton jButton=new JButton();
	
	
	
	public InfoPage(){
		
		String information="             Replace letters with digits to make a correct sum. \n"+
				"           Note that distinct digits correspond to distinct letters.";
				
				
				
				setDescription(information);
				setImageIcon(new ImageIcon("sendmoremoney.jpg"));
				setImage(new ImageIcon("arrow.png"));
				
				
				
				
		jtaDescription.setFont(new Font("Batang",Font.PLAIN,20));
		jtaDescription.setForeground(new Color(26,114,142));
		jtaDescription.setLineWrap(true);
		jtaDescription.setWrapStyleWord(true);
		jtaDescription.setEditable(false);
		
		JScrollPane scrollPane=new JScrollPane(jtaDescription);
		
		setLayout(new BorderLayout(5,5));
		add(jlblImage,BorderLayout.NORTH);
		add(jButton,BorderLayout.CENTER);
		add(scrollPane,BorderLayout.SOUTH);
		
		
		
		jButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				setVisible(false);
				
				user.setTitle("User");
				user.setSize(300,180);
				user.setLocationRelativeTo(null);
				user.setVisible(true);
			}
		});
		
		
		
	}
	
	
	public void setImageIcon(ImageIcon icon){
		jlblImage.setIcon(icon);
	}
	
	public void setImage(ImageIcon i){
		jButton.setIcon(i);
	}
	public void setDescription(String text){
		jtaDescription.setText(text);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoPage frame=new InfoPage();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Information Page");
		frame.setVisible(true);
	}
}
