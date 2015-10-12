import java.util.Scanner;

import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		
		int cmpInt;
		String cmpChc;
		String usrChc;
		String r = "r";
		String p = "p";
		String s = "s";
		
		cmpInt = (0 + (int)(Math.random() * 2));
		
		if (cmpInt == 0)
			cmpChc = r;
		
		else if (cmpInt == 1)
			cmpChc = p;
		
		else
			cmpChc = s;
		
		do
			{
			usrChc = JOptionPane.showInputDialog("Rock, Paper, Scissors.\\n"
					+ "Press r, p, or s");
				
			if (usrChc == cmpChc)
			{
				JOptionPane.showMessageDialog(null, "Draw.");
			}
			else if ((usrChc == p) && (cmpChc == r) ||
				(usrChc == r) && (cmpChc == s) ||
				(usrChc == s) && (cmpChc == p))
			{
				JOptionPane.showMessageDialog(null, "Winner!");
				}
			else
			{
				JOptionPane.showMessageDialog(null, "Loser.");
				}
			
			}
				
		while ((usrChc == p) && (cmpChc == s) ||
				(usrChc == r) && (cmpChc == p) ||
				(usrChc == s) && (cmpChc == r) ||
				(usrChc == cmpChc));
			
	inp.close();
	}

}