import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=JOptionPane.showConfirmDialog( null,"Do you want to play from your last played?","Decision",JOptionPane.YES_OPTION);
		System.out.println(value);
		if(value==1){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
	}

}
