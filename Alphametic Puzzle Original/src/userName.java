import javax.swing.*;

import com.mysql.jdbc.PreparedStatement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class userName extends JFrame{
	Connection c;
	Statement statement;
	private levelPage levelPage=new levelPage();

	private JLabel label=new JLabel("Name:");
	private JTextField textField=new JTextField(10);
	private JButton button=new JButton("ENTER");
	private PreparedStatement preparedStatement;
	static String userN,name,n="";
	static int mark,m = 0;
	
	//easyPage easy;
	
	
	private easyPage ePage=new easyPage();
	
	
	private mediumPage mPage=new mediumPage();
	
	
	private hardPage hPage=new hardPage();
    userName(){
    	
    	
    ImageIcon userIcon=new ImageIcon("userIcon.png");
	JPanel p=new JPanel(new FlowLayout());
	p.add(label);
	p.add(textField);
	
	JLabel jLabel=new JLabel(userIcon);
	setLayout(new BorderLayout());
	
	add(p,BorderLayout.CENTER);
	add(button,BorderLayout.SOUTH);
	add(jLabel,BorderLayout.WEST);
	
	button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			userN=textField.getText().toString();
			
			setVisible(false);
			try{
				Class.forName("com.mysql.jdbc.Driver");
				c=DriverManager.getConnection("jdbc:mysql://localhost/AlphameticPuzzle","root","root");
				//System.out.println("Driver connected");
				statement=c.createStatement();
				//System.out.println("statement");
				
				String query1="select * from User where name='"+userN+"'";
			
				ResultSet rset= (ResultSet) statement.executeQuery(query1);
				
				if(rset.next()){
					n=rset.getString(1);
					m=rset.getInt(2);
				 
					//System.out.println(n);
					//System.out.println(m);
				}
				
				if(n.equals(userN)){
				int value=JOptionPane.showConfirmDialog( null,"Do you want to play from your last played?","Decision",JOptionPane.YES_OPTION);
				if(value==0){
					//System.out.println(m+" mark");
					if(m>=0 && m<10){
						/*System.out.println("n"+n);
						System.out.println("m"+m);*/
						new easyPage(n,m);
						ePage.TimerMethod();
						
						ePage.setTitle("Easy Level");
						ePage.setSize(1200,230);
						ePage.setLocationRelativeTo(null);
						ePage.setDefaultCloseOperation(EXIT_ON_CLOSE);
						ePage.setVisible(true);
					}
					else if(m>=11 && m<25){
						new mediumPage(n,m);
						/*System.out.println("n"+n);
						System.out.println("m"+m);*/
						mPage.TimerMethod();
						
						mPage.setTitle("Medium Level");
						mPage.setSize(1200,230);
						mPage.setLocationRelativeTo(null);
						mPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
						mPage.setVisible(true);
					}
					else {
						new hardPage(n,m);
						/*System.out.println("n"+n);
						System.out.println("m"+m);*/
						hPage.TimerMethod();
						
						hPage.setTitle("Hard Level");
						hPage.setSize(1200,230);
						hPage.setLocationRelativeTo(null);
						hPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
						hPage.setVisible(true);
					}
				}
			else{

					
					new easyPage(userN,mark);
					levelPage.setTitle("Level Page");
					levelPage.setSize(500,500);
					levelPage.setLocationRelativeTo(null);
					levelPage.setVisible(true);
				}
				}
			    
				else {
					System.out.println("else ");
					
					String query="insert into User(name,mark) values ('"+userN+"',"+mark+")";
					System.out.println("name"+ userN+ "mark"+mark);
					
					preparedStatement= (PreparedStatement) c.prepareStatement(query);
					preparedStatement.executeUpdate(query);
					new easyPage(userN,mark);

				
					
					levelPage.setTitle("Level Page");
					levelPage.setSize(500,500);
					levelPage.setLocationRelativeTo(null);
					levelPage.setVisible(true);	
					
				}
			}
			
			catch(Exception ex){
				ex.printStackTrace();
			}
			
			
			
			
		}
	});
	
}
   
   /* private boolean notEquals(String s){
    	String str=s;
    	for(int i=0;i<20;i++){
    		n
    	}
    	return true;
    }*/
}
