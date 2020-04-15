
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class hardPage extends JFrame{	/**
	 * @param args
	 */
	
	Connection connection;
	public static String name;
	
	public static int mark;
	
	
	PreparedStatement preparedStatement;
	
	private JTextField Q1=new JTextField(10);
	private JTextField Q2=new JTextField(10);
	private JTextField Q3=new JTextField(10);
	private JTextField Q4=new JTextField(10);
	private JTextField Q5=new JTextField(10);
	private JTextField Q6=new JTextField(10);
	private JTextField Q7=new JTextField(10);
	private JTextField Q8=new JTextField(10);
	private JTextField Q9=new JTextField(10);
	private JTextField Q10=new JTextField(10);
	private JTextField A1=new JTextField(10);
	private JTextField A2=new JTextField(10);
	private JTextField A3=new JTextField(10);
	private JTextField A4=new JTextField(10);
	private JTextField A5=new JTextField(10);
	private JTextField A6=new JTextField(10);
	private JTextField A7=new JTextField(10);
	private JTextField A8=new JTextField(10);
	private JTextField A9=new JTextField(10);
	private JTextField A10=new JTextField(10);
	private JRadioButton B1=new JRadioButton();
	private JRadioButton B2=new JRadioButton();
	private JRadioButton B3=new JRadioButton();
	private JRadioButton B4=new JRadioButton();
	private JRadioButton B5=new JRadioButton();
	private JRadioButton B6=new JRadioButton();
	private JRadioButton B7=new JRadioButton();
	private JRadioButton B8=new JRadioButton();
	private JRadioButton B9=new JRadioButton();
	private JRadioButton B10=new JRadioButton();
	private JRadioButton B11=new JRadioButton();
	private JRadioButton B12=new JRadioButton();
	private JRadioButton B13=new JRadioButton();
	private JRadioButton B14=new JRadioButton();
	private JRadioButton B15=new JRadioButton();
	
	private JButton button1=new JButton("Calculate");
	private JButton button2=new JButton("Calculate");
	private JButton button3=new JButton("Calculate");
	private JButton button4=new JButton("Calculate");
	private JButton button5=new JButton("Calculate");
	
	private String getFW1,getSW1,getCal1;
	private String getFW2,getSW2,getCal2;
	private String getFW3,getSW3,getCal3;
	private String getFW4,getSW4,getCal4;
	private String getFW5,getSW5,getCal5;
	
	private JTextField answer1=new JTextField();
	private JTextField answer2=new JTextField();
	private JTextField answer3=new JTextField();
	private JTextField answer4=new JTextField();
	private JTextField answer5=new JTextField();
	
	private JTextField no1=new JTextField("???");
	private JTextField no2=new JTextField("???");
	private JTextField no3=new JTextField("???");
	private JTextField no4=new JTextField("???");
	private JTextField no5=new JTextField("???");
	
	private String inputFirst1,inputSecond1,inputResult1,getFake1,getFake2;
	private String inputFirst2,inputSecond2,inputResult2,getFake3,getFake4;
	private String inputFirst3,inputSecond3,inputResult3,getFake5,getFake6;
	private String inputFirst4,inputSecond4,inputResult4,getFake7,getFake8;
	private String inputFirst5,inputSecond5,inputResult5,getFake9,getFake10;
	
	int i1,i2,i3,i4,i5;
	
	
	Calculation vaWC;
	//wrongAns wAns;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15;
	//private PreparedStatement preparedStatement;
	private Statement statement;
	
	ImageIcon timerIcon1;
	
	private JLabel labelTimer1=new JLabel(timerIcon1=new ImageIcon("hourclock1.jpg"));
	private JLabel txTimer1=new JLabel();
	
	
	
	Timer t1=new Timer(1000,new TimerListener());
	String s;
	int min=0;
	int sec=30;
	public hardPage(){
		JPanel p1a=new JPanel(new GridLayout(3,2,0,3));
		p1a.add(Q1);p1a.add(A1);
		p1a.add(Q2);p1a.add(A2);
		p1a.add(no1);p1a.add(answer1);
		Q1.setForeground(new Color(22,45,245));
		Q2.setForeground(new Color(22,45,245));
		A1.setForeground(new Color(22,45,245));
		A2.setForeground(new Color(22,45,245));
		no1.setForeground(new Color(22,45,245));
		answer1.setForeground(new Color(22,45,245));
		Q1.setHorizontalAlignment(SwingConstants.CENTER);
		Q2.setHorizontalAlignment(SwingConstants.CENTER);
		A1.setHorizontalAlignment(SwingConstants.CENTER);
		A2.setHorizontalAlignment(SwingConstants.CENTER);
		no1.setHorizontalAlignment(SwingConstants.CENTER);
		answer1.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel p1b=new JPanel(new GridLayout(3,1));
		p1b.add(B1);
		p1b.add(B2);
		p1b.add(B3);
		B1.setForeground(new Color(54,86,214));
		B2.setForeground(new Color(47,221,117));
		B3.setForeground(new Color(131,99,169));
		JPanel p1=new JPanel(new BorderLayout());
		p1.add(p1a,BorderLayout.NORTH);
		p1.add(p1b,BorderLayout.CENTER);
		
		p1.add(button1,BorderLayout.SOUTH);
		//p1.setBackground(Color.BLUE);
		
		
		JPanel p2a=new JPanel(new GridLayout(3,2));
		p2a.add(Q3);p2a.add(A3);
		p2a.add(Q4);p2a.add(A4);
		p2a.add(no2);p2a.add(answer2);
		Q3.setForeground(new Color(244,23,227));
		Q4.setForeground(new Color(244,23,227));
		A3.setForeground(new Color(244,23,227));
		A4.setForeground(new Color(244,23,227));
		no2.setForeground(new Color(244,23,227));
		answer2.setForeground(new Color(244,23,227));
		Q3.setHorizontalAlignment(SwingConstants.CENTER);
		Q4.setHorizontalAlignment(SwingConstants.CENTER);
		A3.setHorizontalAlignment(SwingConstants.CENTER);
		A4.setHorizontalAlignment(SwingConstants.CENTER);
		no2.setHorizontalAlignment(SwingConstants.CENTER);
		answer2.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel p2b=new JPanel(new GridLayout(3,1));
		p2b.add(B4);
		p2b.add(B5);
		p2b.add(B6);
		B4.setForeground(new Color(120,19,164));
		B5.setForeground(new Color(28,91,155));
		B6.setForeground(new Color(54,124,79));
		JPanel p2=new JPanel(new BorderLayout());
		p2.add(p2a,BorderLayout.NORTH);
		p2.add(p2b,BorderLayout.CENTER);
		//p2.add(p2c,BorderLayout.EAST);
		p2.add(button2,BorderLayout.SOUTH);
		
		
		JPanel p3a=new JPanel(new GridLayout(3,2));
		p3a.add(Q5);p3a.add(A5);
		p3a.add(Q6);p3a.add(A6);
		p3a.add(no3);p3a.add(answer3);
		Q5.setForeground(new Color(173,165,10));
		Q6.setForeground(new Color(173,165,10));
		A5.setForeground(new Color(173,165,10));
		A6.setForeground(new Color(173,165,10));
		no3.setForeground(new Color(173,165,10));
		answer3.setForeground(new Color(173,165,10));
		Q5.setHorizontalAlignment(SwingConstants.CENTER);
		Q6.setHorizontalAlignment(SwingConstants.CENTER);
		A5.setHorizontalAlignment(SwingConstants.CENTER);
		A6.setHorizontalAlignment(SwingConstants.CENTER);
		no3.setHorizontalAlignment(SwingConstants.CENTER);
		answer3.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel p3b=new JPanel(new GridLayout(3,1));
		p3b.add(B7);
		p3b.add(B8);
		p3b.add(B9);
		B7.setForeground(new Color(135,124,48));
		B8.setForeground(new Color(179,27,4));
		B9.setForeground(new Color(145,24,158));
		JPanel p3=new JPanel(new BorderLayout());
		p3.add(p3a,BorderLayout.NORTH);
		p3.add(p3b,BorderLayout.CENTER);
		p3.add(button3,BorderLayout.SOUTH);
		
		
		JPanel p4a=new JPanel(new GridLayout(3,2,0,3));
		p4a.add(Q7);p4a.add(A7);
		p4a.add(Q8);p4a.add(A8);
		p4a.add(no4);p4a.add(answer4);
		Q7.setForeground(new Color(139,171,31));
		Q8.setForeground(new Color(139,171,31));
		A7.setForeground(new Color(139,171,31));
		A8.setForeground(new Color(139,171,31));
		no4.setForeground(new Color(139,171,31));
		answer4.setForeground(new Color(139,171,31));
		Q7.setHorizontalAlignment(SwingConstants.CENTER);
		Q8.setHorizontalAlignment(SwingConstants.CENTER);
		A7.setHorizontalAlignment(SwingConstants.CENTER);
		A8.setHorizontalAlignment(SwingConstants.CENTER);
		no4.setHorizontalAlignment(SwingConstants.CENTER);
		answer4.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel p4b=new JPanel(new GridLayout(3,1));
		p4b.add(B10);
		p4b.add(B11);
		p4b.add(B12);
		B10.setForeground(new Color(130,13,200));
		B11.setForeground(new Color(37,194,194));
		B12.setForeground(new Color(207,185,24));
		JPanel p4=new JPanel(new BorderLayout());
		p4.add(p4a,BorderLayout.NORTH);
		p4.add(p4b,BorderLayout.CENTER);
		p4.add(button4,BorderLayout.SOUTH);
		
		JPanel p5a=new JPanel(new GridLayout(3,2,0,3));
		p5a.add(Q9);p5a.add(A9);
		p5a.add(Q10);p5a.add(A10);
		p5a.add(no5);p5a.add(answer5);
		Q9.setForeground(new Color(157,26,176));
		Q10.setForeground(new Color(157,26,176));
		A9.setForeground(new Color(157,26,176));
		A10.setForeground(new Color(157,26,176));
		no5.setForeground(new Color(157,26,176));
		answer5.setForeground(new Color(157,26,176));
		Q9.setHorizontalAlignment(SwingConstants.CENTER);
		Q10.setHorizontalAlignment(SwingConstants.CENTER);
		A9.setHorizontalAlignment(SwingConstants.CENTER);
		A10.setHorizontalAlignment(SwingConstants.CENTER);
		no5.setHorizontalAlignment(SwingConstants.CENTER);
		answer5.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel p5b=new JPanel(new GridLayout(3,1));
		p5b.add(B13);
		p5b.add(B14);
		p5b.add(B15);
		B13.setForeground(new Color(39,159,231));
		B14.setForeground(new Color(46,224,157));
		B15.setForeground(new Color(172,98,152));
		JPanel p5=new JPanel(new BorderLayout());
		p5.add(p5a,BorderLayout.NORTH);
		p5.add(p5b,BorderLayout.CENTER);
		p5.add(button5,BorderLayout.SOUTH);
		
		
	
	JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	jsp.setDividerLocation(230);
	jsp.add(p1,1);
	jsp.add(p2,2);
	
	JSplitPane jsp2=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	jsp2.setDividerLocation(460);
	jsp2.add(jsp,1);
	jsp2.add(p3,2);
	
	JSplitPane jsp3=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	jsp3.setDividerLocation(700);
	jsp3.add(jsp2,1);
	jsp3.add(p4,2);
	
	JSplitPane jsp4=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	jsp4.setDividerLocation(950);
	jsp4.add(jsp3,1);
	jsp4.add(p5,2);
	
	ButtonGroup bg1=new ButtonGroup();
	bg1.add(B1);
	bg1.add(B2);
	bg1.add(B3);
	
	ButtonGroup bg2=new ButtonGroup();
	bg1.add(B4);
	bg1.add(B5);
	bg1.add(B6);
	
	ButtonGroup bg3=new ButtonGroup();
	bg1.add(B7);
	bg1.add(B8);
	bg1.add(B9);
	
	ButtonGroup bg4=new ButtonGroup();
	bg1.add(B10);
	bg1.add(B11);
	bg1.add(B12);
	
	ButtonGroup bg5=new ButtonGroup();
	bg1.add(B13);
	bg1.add(B14);
	bg1.add(B15);
	
	JPanel timer=new JPanel(new BorderLayout());
	timer.add(labelTimer1,BorderLayout.WEST);
	timer.add(txTimer1,BorderLayout.CENTER);
	txTimer1.setHorizontalAlignment(SwingConstants.CENTER);
	timer.setBackground(Color.WHITE);
	add(timer,BorderLayout.NORTH);
	add(jsp4,BorderLayout.CENTER);
	

	 s=((min>9)?(min):("0"+min))+":"+((sec>9)?(sec):("0"+sec));
	txTimer1.setText(s);
	
	//t1.start();
	
	this.initializeDB();
	showInput();
	
	
	}
	public hardPage(String n,final int m){
		
		hardPage.name=n;
		hardPage.mark=m;
		try{
		initializeDB();
		String query="update User set mark="+mark+" where name = '"+name+"'";
		
		preparedStatement= connection.prepareStatement(query);
		preparedStatement.executeUpdate(query);
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	private void showInput()
	{

i1=(int) (Math.random()*10+21);


do{
i2=(int) (Math.random()*10+21);
} while(i2==i1);


do{
i3=(int) (Math.random()*10+21);
} while(i3==i1 || i3==i2);

do{
	i4=(int)(Math.random()*10+21);
}while(i4==i3 || i4==i2 || i4==i1);

do{
	i5=(int)(Math.random()*10+21);
}while(i5==i4 || i5==i3 || i5==i2 || i5==i1);

//System.out.println(i1);
//System.out.println(i2);
//System.out.println(i3);
		try{
			String query1="select * from AlphameticPuzzle where no="+i1;
			
			ResultSet rset= (ResultSet) statement.executeQuery(query1);
			
			if(rset.next()){
				rset.getInt(1);
				 getFW1=rset.getString(2);
				 getSW1=rset.getString(3);
				 getCal1=rset.getString(4);
				 getFake1=rset.getString(5);
				 getFake2=rset.getString(6);
				
				
				inputFirst1 = getFW1.toUpperCase();
				inputSecond1= getSW1.toUpperCase();
				inputResult1 = getCal1.toUpperCase();
				
				
				Q1.setText(inputFirst1);
				Q2.setText(inputSecond1);
				B1.setText(inputResult1);
				B2.setText(getFake2.toUpperCase());
				B3.setText(getFake1.toUpperCase());
				
				
				
				
				vaWC=new Calculation(inputFirst1,inputSecond1,inputResult1);
				s1=vaWC.getText1();
				s2=vaWC.getText2();
				s3=vaWC.getText3();
				
				A1.setText(s1);
				A2.setText(s2);
				answer1.setText(s3);
				
				Q1.setEditable(false);
				Q2.setEditable(false);
				A1.setEditable(false);
				A2.setEditable(false);
				answer1.setEditable(false);
				no1.setEditable(false);
				
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				
				button1.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e){
					//B1.equals(true);
						button1.setEnabled(false);
						
						t1.stop();
						
						
						if(B1.isSelected()){
							
							
							try{
								initializeDB();
								hardPage.mark=mark+5;
								
								String query="update User set mark="+mark+" where name = '"+name+"'";
								preparedStatement= connection.prepareStatement(query);
								preparedStatement.executeUpdate(query);
							}
							
							catch(Exception ex){
								ex.printStackTrace();
							}
							
								JOptionPane.showMessageDialog(null, "CORRECT");
							
								
								
							
						}
						else if(B2.isSelected()){
							/*vaWC=new Calculation(inputFirst1,inputSecond1,getFake2.toUpperCase());
							wAns=new wrongAns(inputFirst1,inputSecond1,getFake2.toUpperCase());
							
							wAns.setTitle("Wrong Page");
							wAns.setSize(200,100);
							wAns.setLocationRelativeTo(null);
							wAns.setVisible(true);*/
							
							JOptionPane.showMessageDialog(null, "WRONG");
							
						}
						else if(B3.isSelected()){
							/*vaWC=new Calculation(inputFirst1,inputSecond1,getFake1.toUpperCase());
						wAns=new wrongAns(inputFirst1,inputSecond1,getFake1.toUpperCase());
						
						wAns.setTitle("Wrong Page");
						wAns.setSize(200,100);
						wAns.setLocationRelativeTo(null);
						wAns.setVisible(true);*/
						JOptionPane.showMessageDialog(null, "WRONG");
						
						}
						min=0;
						sec=30;
						
							s=((min>9)?(min):("0"+min))+":"+((sec>9)?(sec):("0"+sec));
							txTimer1.setText(s);
							button2.setEnabled(true);
							t1.start();
						
					}
				});
				
			}
			
			//preparedStatement.setString(1,fWords);
			//preparedStatement.setString(2,sWords);
			//preparedStatement.setString(3, cal);
			String query2="select * from AlphameticPuzzle where no="+i2;
			
			rset= (ResultSet) statement.executeQuery(query2);
			if(rset.next()){
				int number=rset.getInt(1);
				getFW2=rset.getString(2);
				getSW2=rset.getString(3);
				getCal2=rset.getString(4);
				getFake3=rset.getString(5);
				getFake4=rset.getString(6);
				

				inputFirst2 = getFW2.toUpperCase();
				inputSecond2 = getSW2.toUpperCase();
				inputResult2 = getCal2.toUpperCase();
				
				
				Q3.setText(inputFirst2);
				Q4.setText(inputSecond2);
				B4.setText(getFake3.toUpperCase());
				B5.setText(getFake4.toUpperCase());
				B6.setText(inputResult2);
				
				vaWC=new Calculation(inputFirst2,inputSecond2,inputResult2);
				s4=vaWC.getText1();
				s5=vaWC.getText2();
				s6=vaWC.getText3();
				
				A3.setText(s4);
				A4.setText(s5);
				answer2.setText(s6);
				
				Q3.setEditable(false);
				Q4.setEditable(false);
				A3.setEditable(false);
				A4.setEditable(false);
				no2.setEditable(false);
				answer2.setEditable(false);
				
				button2.addActionListener(new java.awt.event.ActionListener(){
					public void actionPerformed(ActionEvent e){
						t1.stop();
						button2.setEnabled(false);
						
						if(B6.isSelected()){
							
							try{
								initializeDB();
								hardPage.mark=mark+5;
								
								String query="update User set mark="+mark+" where name = '"+name+"'";
								preparedStatement= connection.prepareStatement(query);
								preparedStatement.executeUpdate(query);
							}
							
							catch(Exception ex){
								ex.printStackTrace();
							}
							
							JOptionPane.showMessageDialog(null, "CORRECT");
							
							
							
							
						}
						else if(B4.isSelected()){
									JOptionPane.showMessageDialog(null, "WRONG");
									/*vaWC=new Calculation(inputFirst2,inputSecond2,getFake3.toUpperCase());
									wAns=new wrongAns(inputFirst2,inputSecond2,getFake3.toUpperCase());
									
									wAns.setTitle("Wrong Page");
									wAns.setSize(200,100);
									wAns.setLocationRelativeTo(null);
									wAns.setVisible(true);*/
						}
						else if(B5.isSelected()){
									JOptionPane.showMessageDialog(null, "WRONG");
									/*vaWC=new Calculation(inputFirst2,inputSecond2,getFake4.toUpperCase());
									wAns=new wrongAns(inputFirst2,inputSecond2,getFake4.toUpperCase());
									
									wAns.setTitle("Wrong Page");
									wAns.setSize(200,100);
									wAns.setLocationRelativeTo(null);
									wAns.setVisible(true);*/
						}
						min=0;
						sec=30;
						 s=((min>9)?(min):("0"+min))+":"+((sec>9)?(sec):("0"+sec));
							txTimer1.setText(s);
							button3.setEnabled(true);
							t1.start();
					}
				});
				
			}
			
				String query3="select * from AlphameticPuzzle where no="+i3;
				rset= (ResultSet) statement.executeQuery(query3);
				if(rset.next()){
					int number=rset.getInt(1);
					getFW3=rset.getString(2);
					getSW3=rset.getString(3);
					getCal3=rset.getString(4);
					getFake5=rset.getString(5);
					getFake6=rset.getString(6);
					
					
					inputFirst3 = getFW3.toUpperCase();
					inputSecond3 = getSW3.toUpperCase();
					inputResult3 = getCal3.toUpperCase();
					
					
					Q5.setText(inputFirst3);
					Q6.setText(inputSecond3);
					B7.setText(getFake6.toUpperCase());
					B8.setText(getFake5.toUpperCase());
					B9.setText(inputResult3);
					
					vaWC=new Calculation(inputFirst3,inputSecond3,inputResult3);
					s7=vaWC.getText1();
					s8=vaWC.getText2();
					s9=vaWC.getText3();
					
					A5.setText(s7);
					A6.setText(s8);
					answer3.setText(s9);
					
					Q5.setEditable(false);
					Q6.setEditable(false);
					A5.setEditable(false);
					A6.setEditable(false);
					no3.setEditable(false);
					answer3.setEditable(false);
					
					button3.addActionListener(new java.awt.event.ActionListener(){
						public void actionPerformed(ActionEvent e){
							t1.stop();
							button3.setEnabled(false);
							
							if(B9.isSelected()){
								
								try{
									initializeDB();
									hardPage.mark=mark+5;
									
									String query="update User set mark="+mark+" where name = '"+name+"'";
									preparedStatement= connection.prepareStatement(query);
									preparedStatement.executeUpdate(query);
								}
								
								catch(Exception ex){
									ex.printStackTrace();
								}
								
								JOptionPane.showMessageDialog(null, "CORRECT");
								
									}
									else if(B7.isSelected()){
										/*vaWC=new Calculation(inputFirst3,inputSecond3,getFake6.toUpperCase());
										wAns=new wrongAns(inputFirst3,inputSecond3,getFake6.toUpperCase());
										
										wAns.setTitle("Wrong Page");
										wAns.setSize(200,100);
										wAns.setLocationRelativeTo(null);
										wAns.setVisible(true);*/
										JOptionPane.showMessageDialog(null, "WRONG");
										
									}
									else if(B8.isSelected()){
										/*vaWC=new Calculation(inputFirst3,inputSecond3,getFake5.toUpperCase());
										wAns=new wrongAns(inputFirst3,inputSecond3,getFake5.toUpperCase());
										
										wAns.setTitle("Wrong Page");
										wAns.setSize(200,100);
										wAns.setLocationRelativeTo(null);
										wAns.setVisible(true);*/
										JOptionPane.showMessageDialog(null, "WRONG");
										
									}
							min=0;
							sec=30;
							
								s=((min>9)?(min):("0"+min))+":"+((sec>9)?(sec):("0"+sec));
								txTimer1.setText(s);
								button4.setEnabled(true);
								t1.start();
						}
					});
					
				
			}
				
				String query4="select * from AlphameticPuzzle where no="+i4;
				
				rset= (ResultSet) statement.executeQuery(query4);
				
				if(rset.next()){
					rset.getInt(1);
					 getFW4=rset.getString(2);
					 getSW4=rset.getString(3);
					 getCal4=rset.getString(4);
					 getFake7=rset.getString(5);
					 getFake8=rset.getString(6);
					
					
					inputFirst4 = getFW4.toUpperCase();
					inputSecond4= getSW4.toUpperCase();
					inputResult4 = getCal4.toUpperCase();
					
					
					Q7.setText(inputFirst4);
					Q8.setText(inputSecond4);
					B10.setText(inputResult4);
					B11.setText(getFake7.toUpperCase());
					B12.setText(getFake8.toUpperCase());
					
					
					
					
					vaWC=new Calculation(inputFirst4,inputSecond4,inputResult4);
					s10=vaWC.getText1();
					s11=vaWC.getText2();
					s12=vaWC.getText3();
					
					A7.setText(s10);
					A8.setText(s11);
					answer4.setText(s12);
					
					Q7.setEditable(false);
					Q8.setEditable(false);
					A7.setEditable(false);
					A8.setEditable(false);
					answer4.setEditable(false);
					no4.setEditable(false);
					
					button5.setEnabled(false);
					
					
					button4.addActionListener(new java.awt.event.ActionListener(){
						public void actionPerformed(ActionEvent e){
						//B1.equals(true);
							button4.setEnabled(false);
							
							t1.stop();
							//System.out.println("timer stop");
							
							
							if(B10.isSelected()){
								
								
								try{
									initializeDB();
									hardPage.mark=mark+5;
									
									String query="update User set mark="+mark+" where name = '"+name+"'";
									preparedStatement= connection.prepareStatement(query);
									preparedStatement.executeUpdate(query);
								}
								
								catch(Exception ex){
									ex.printStackTrace();
								}
								
									JOptionPane.showMessageDialog(null, "CORRECT");
								
									
									
								
							}
							else if(B11.isSelected()){
								/*vaWC=new Calculation(inputFirst1,inputSecond1,getFake2.toUpperCase());
								wAns=new wrongAns(inputFirst1,inputSecond1,getFake2.toUpperCase());
								
								wAns.setTitle("Wrong Page");
								wAns.setSize(200,100);
								wAns.setLocationRelativeTo(null);
								wAns.setVisible(true);*/
								
								JOptionPane.showMessageDialog(null, "WRONG");
								
							}
							else if(B12.isSelected()){
								/*vaWC=new Calculation(inputFirst1,inputSecond1,getFake1.toUpperCase());
							wAns=new wrongAns(inputFirst1,inputSecond1,getFake1.toUpperCase());
							
							wAns.setTitle("Wrong Page");
							wAns.setSize(200,100);
							wAns.setLocationRelativeTo(null);
							wAns.setVisible(true);*/
							JOptionPane.showMessageDialog(null, "WRONG");
							
							}
							min=0;
							sec=30;
							
								s=((min>9)?(min):("0"+min))+":"+((sec>9)?(sec):("0"+sec));
								txTimer1.setText(s);
								button5.setEnabled(true);
								t1.start();
							
						}
					});
					
				}
				String query5="select * from AlphameticPuzzle where no="+i5;
				
				rset= (ResultSet) statement.executeQuery(query5);
				
				if(rset.next()){
					rset.getInt(1);
					 getFW5=rset.getString(2);
					 getSW5=rset.getString(3);
					 getCal5=rset.getString(4);
					 getFake9=rset.getString(5);
					 getFake10=rset.getString(6);
					
					
					inputFirst5 = getFW5.toUpperCase();
					inputSecond5= getSW5.toUpperCase();
					inputResult5 = getCal5.toUpperCase();
					
					
					Q9.setText(inputFirst5);
					Q10.setText(inputSecond5);
					B13.setText(getFake10.toUpperCase());
					B14.setText(getFake9.toUpperCase());
					B15.setText(inputResult5);
					
					
					
					
					vaWC=new Calculation(inputFirst5,inputSecond5,inputResult5);
					s13=vaWC.getText1();
					s14=vaWC.getText2();
					s15=vaWC.getText3();
					
					A9.setText(s13);
					A10.setText(s14);
					answer5.setText(s15);
					
					Q9.setEditable(false);
					Q10.setEditable(false);
					A9.setEditable(false);
					A10.setEditable(false);
					answer5.setEditable(false);
					no5.setEditable(false);
					
					
					
					
					button5.addActionListener(new java.awt.event.ActionListener(){
						public void actionPerformed(ActionEvent e){
						//B1.equals(true);
							button5.setEnabled(false);
							
							t1.stop();
							//System.out.println("timer stop");
							
							
							if(B15.isSelected()){
								
								
								try{
									initializeDB();
									hardPage.mark=mark+5;
									
									String query="update User set mark="+mark+" where name = '"+name+"'";
									preparedStatement= connection.prepareStatement(query);
									preparedStatement.executeUpdate(query);
								}
								
								catch(Exception ex){
									ex.printStackTrace();
								}
								
									

									JOptionPane.showMessageDialog(null, "EXCELLENT"+"\n You have completed ALL Level!!!");
									JOptionPane.showMessageDialog(null, name+" , your marks: "+mark);
									setVisible(false);
									
									
								
							}
							else if(B13.isSelected()){
								
								
								JOptionPane.showMessageDialog(null, "WRONG");
								
								
							}
							else if(B14.isSelected()){
								
							JOptionPane.showMessageDialog(null, "WRONG");
							
							
							}
							
							
						}
					});
					
				}
				
		
		}
				
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	private void initializeDB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		
		//System.out.println("Driver loaded");
		connection=DriverManager.getConnection("jdbc:mysql://localhost/AlphameticPuzzle","root","root");
		
		//System.out.println("Database connected");
		
		//preparedStatement=connection.prepareStatement(query);
		statement=connection.createStatement();
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			s="";
			if(sec==0){
				if(min!=0){
					min--;
					sec=59;
				}
					
			}
			else
			{
				sec--;
			}
			
			
			
			
			
			 s=((min>9)?(min):("0"+min))+":"+((sec>9)?(sec):("0"+sec));
			txTimer1.setText(s);
			
			if(sec==0 && min==0){
				t1.stop();
				try{
				String query="select * from User  where name = '"+name+"'";
				ResultSet rSet=statement.executeQuery(query);
				while(rSet.next()){
					name=rSet.getString(1);
					mark=rSet.getInt(2);
				}
				}
				catch(Exception ex){
					ex.printStackTrace();
					}
				JOptionPane.showMessageDialog(null, name+" , your marks: "+mark);
				
				
				
				setVisible(false);
				InfoPage infoPage=new InfoPage();
				infoPage.setTitle("Information Page");
				infoPage.pack();
				infoPage.setLocationRelativeTo(null);
				infoPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
				infoPage.setVisible(true);
				
			}
			
			
		}
	}
	public Timer TimerMethod(){
		t1.start();
		return t1;
	}
}
	
