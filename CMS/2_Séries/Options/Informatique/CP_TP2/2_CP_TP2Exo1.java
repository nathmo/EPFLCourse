package cms_tp2;

import javax.swing.* ;

public class CP_TP2Exo1 
{
	public static void main(String[ ] args) 
	{ 
		JFrame myFrame = new JFrame("Mon Premier Swing");
		
		myFrame.setSize(200,150) ;

		final JLabel myLabel = new JLabel("        Bons résultats au QCM !") ;		
//		myFrame.getContentPane( ).add(myLabel) ;
		myFrame.add(myLabel) ;		

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
//		myFrame.pack() ;
		myFrame.setVisible(true) ;
	}
}
