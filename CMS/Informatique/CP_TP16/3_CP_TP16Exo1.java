package cms_tp16;

public class CP_TP16Exo1 
{
	public static void main(String args[])
	{
		String [] tabNoms = {"Dupont", "blanc", "_martin"};
		int [] tabAges = {15,19,28};
		CMSStudent [] tabEtudiants = new CMSStudent[3];
		
		for(int i=0;i<3;i++)
		{
			tabEtudiants[i] = new CMSStudent(tabNoms[i],tabAges[i]);
			tabEtudiants[i].afficher();
		}		
	}//fin de la méthode main
}//fin de la classe principale
