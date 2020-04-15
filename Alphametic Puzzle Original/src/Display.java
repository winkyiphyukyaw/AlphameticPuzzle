import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Display extends JFrame{
	InfoPage infoPage=new InfoPage();
	private JTextArea area1=new JTextArea();
	private JTextArea area2=new JTextArea();
	private JTextArea area3=new JTextArea();
	private JTextArea area4=new JTextArea();
	private JTextArea area5=new JTextArea();
	private JLabel button1=new JLabel();
	private JLabel button2=new JLabel();
	private JLabel button3=new JLabel();
	private JLabel button4=new JLabel();
	private JLabel button5=new JLabel();
	private JButton b=new JButton("RETURN");
	public Display(){
		String s1="STEP 1:"+
				" \n When adding just two numbers together, the most you will ever carry is 1,  so we can reason that M must be a 1.";
		String s2="STEP 2:"+
				"\n The O is the next letter to consider. It can not be 1,because we have already used that number.If it were 2, S would be either 10 "
				+ "\n or 11 (since in the thousands column we have either S+1 = O+10, or S+1+1 = O+10 - in  the case  where a 1 is carried from  the "
				+ "\n hundreds column), which is not allowed since these are two digit numbers. If O were greater than 2, S would be even larger. "
				+ "\nTherefore, the O is 0.";
		String s3="STEP 3:"+
				"\n In order for the 1 to be carried from the thousands column,the S now needs to be 8 or 9. If it is an 8, we would have to  carry 1 from "
				+"\n the hundreds column, so let's look at the hundreds column.We know that E cannot equal N,so we know there is 1 carried from the tens column."
				+"\n So for the hundreds column we have 1 + E + 0 = N(+10?).We know the N has to be at least 2 (because 0 and 1 are taken), so in order for "
				+ "\n something to be carried 1 + E + 0 would need to be 12 or more.  This would mean E would need to be 11 or more, which of course is not allowed, "
				+"\n so nothing can be carried from the hundreds column, and thus S must be 9 rather than 8.";
		String s4="STEP 4:"+
				"\n Next we solve for the letter R. We already know that E+1=N and that 1 is carried from the tens column to the hundreds column."
				+"\n So we can substitute E+1 for N in the tens column to form two possible equations: E+1 + R = E+10 OR E+1 +1 + R = E+10(the second equation"
				+"\n includes carrying 1 from the ones column).  The first equation give R=9, which is not possible because 9 is already accounted for."
				+"\n The second equation gives R=8, so R is 8.";
		String s5="STEP 5:"+
				"\nConsider the D and E. We know they must total 12 or more  (a 1 is carried from the tens column and Y must be 2 or more since the 0 and 1 are taken)."
				+"\n What digits are left that total 12 or more? We can not use 3 because 9 is taken, and we cannot use 4 because 8 is taken. We are left with"
				+"\n 5,6, and 7. Since D and E need to be different numbers they must be 5 and 7, or 6 and 7.  Now recall that E+1=N. If E were 7, N would be"
				+"\n 8 which is already taken.  If E were 6, N would be 7 and there is only 5 left for D, which is not enough (E + D would be less 	than 12). "
				+"\n Therefore E is 5 and D is 7.";
				

		ImageIcon step1=new ImageIcon("step.png");
		ImageIcon step2=new ImageIcon("step2.png");
		ImageIcon step3=new ImageIcon("step3.png");
		ImageIcon step4=new ImageIcon("step4.png");
		ImageIcon step5=new ImageIcon("step5.png");
		
		button1.setIcon(step1);
		button2.setIcon(step2);
		button3.setIcon(step3);
		button4.setIcon(step4);
		button5.setIcon(step5);
		
		setDescription1(s1);
		setDescription2(s2);
		setDescription3(s3);
		setDescription4(s4);
		setDescription5(s5);
		
		
		/*JPanel panel=new JPanel(new GridLayout(10,1));
		panel.add(area1);
		panel.add(button1);
		panel.add(area2);
		panel.add(button2);
		panel.add(area3);
		panel.add(button3);
		panel.add(area4);
		panel.add(button4);
		panel.add(area5);
		panel.add(button5);*/
		
		JPanel p1=new JPanel(new BorderLayout());
		p1.add(area1,BorderLayout.NORTH);
		p1.add(button1,BorderLayout.CENTER);
		p1.add(area2,BorderLayout.SOUTH);
		
		JPanel p2=new JPanel(new BorderLayout());
		p2.add(p1,BorderLayout.NORTH);
		p2.add(button2,BorderLayout.CENTER);
		p2.add(area3,BorderLayout.SOUTH);
		
		JPanel p3=new JPanel(new BorderLayout());
		p3.add(p2,BorderLayout.NORTH);
		p3.add(button3,BorderLayout.CENTER);
		p3.add(area4,BorderLayout.SOUTH);
		
		JPanel p4=new JPanel(new BorderLayout());
		p4.add(p3,BorderLayout.NORTH);
		p4.add(button4,BorderLayout.CENTER);
		p4.add(area5,BorderLayout.SOUTH);
		
		JPanel p5=new JPanel(new BorderLayout());
		p5.add(p4,BorderLayout.CENTER);
		p5.add(button5,BorderLayout.SOUTH);
		
		
		
		JScrollPane scrollPane=new JScrollPane(p5);
		setLayout(new BorderLayout());
		add(scrollPane,BorderLayout.CENTER);
		add(b,BorderLayout.SOUTH);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
				levelPage levelPage=new levelPage();
				levelPage.setTitle("Level Page");
				levelPage.setSize(500,500);
				levelPage.setLocationRelativeTo(null);
				levelPage.setVisible(true);
			}
		});
}
	public void setDescription1(String text){
		area1.setText(text);
	}
	public void setDescription2(String text){
		area2.setText(text);
	}
	public void setDescription3(String text){
		area3.setText(text);
	}
	public void setDescription4(String text){
		area4.setText(text);
	}
	public void setDescription5(String text){
		area5.setText(text);
	}
}