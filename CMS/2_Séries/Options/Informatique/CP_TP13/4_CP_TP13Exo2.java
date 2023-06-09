package cms_tp13;

/* Classe principale qui permet de vérifier la conception des classe UneDate et DateNaissance.
 * Exécutez successivement et séparément les trois blocs d'instructions ci-dessous
 * (en les commentant et décommentant convenablement).
 */

public class CP_TP13Exo2
{
	public static void main(String[] args) 
	{
//		*******************************************************************************************

		//Début du premier bloc
		UneDate refDate1 = new UneDate("12.03.1959");
		System.out.println(refDate1);

		UneDate refDate2 = new UneDate(12,3,1959);
		System.out.println(refDate2);
		
		UneDate refDate3 = new UneDate(42,3,1959);
		System.out.println(refDate3);		
		
		UneDate refDate4 = new UneDate("29.02.1956");
		System.out.println(refDate4);		
		
		UneDate refDate5 = new UneDate("29.02.1900");
		System.out.println(refDate5);	
		
		UneDate refDate6 = new UneDate("29.02.2000");
		System.out.println(refDate6);	
		
		UneDate refDate7 = new UneDate(31,6,2005);
		System.out.println(refDate7);	
		
		UneDate refDate8 = new UneDate(31,7,1700);
		System.out.println(refDate8);	
		
		UneDate refDate9 = new UneDate(30,15,2002);
		System.out.println(refDate9);	
		
		UneDate refDate10 = new UneDate(35,9,2004);
		System.out.println(refDate10);	
		
		System.out.println("----------------------------------------------------------------------------------------");		
		
		DateNaissance refDateNaissance1 = new DateNaissance(12,3,1959,20,12,"Claudia");
		System.out.println(refDateNaissance1);
		
		DateNaissance refDateNaissance2 = new DateNaissance(12,3,1959,25,12,"Marie");
		System.out.println(refDateNaissance2);
		
		DateNaissance refDateNaissance3 = new DateNaissance(12,3,1959,20,72,"Louis");
		System.out.println(refDateNaissance3);
	
		//Fin du premier bloc

//		*******************************************************************************************
/*
		//Début du deuxième bloc
		UneDate refDate11 = new UneDate("23.08.1944");
		UneDate refDate12 = new UneDate("23.08.1944");
		UneDate refDate13 = new UneDate("25.09.1938");
		
		System.out.println(refDate11.equals(refDate12));
		System.out.println(refDate11.equals(refDate13));	
	
		System.out.println("---------------------------------------------");	
		
		System.out.println(refDate11.hashCode());
		System.out.println(refDate12.hashCode());
		System.out.println(refDate13.hashCode());
		
		System.out.println("---------------------------------------------");			
		
		DateNaissance refDateNaissance11=new DateNaissance(23,8,1944,6,30,"Titi");
		DateNaissance refDateNaissance12=new DateNaissance(23,8,1944,6,30,"Tata");	
		DateNaissance refDateNaissance13=new DateNaissance(23,8,1944,3,45,"Didi");
		
		System.out.println(refDateNaissance11.equals(refDateNaissance12));
		System.out.println(refDateNaissance11.equals(refDateNaissance13));		
		
		System.out.println("---------------------------------------------");	
		
		System.out.println(refDateNaissance11.hashCode());
		System.out.println(refDateNaissance12.hashCode());
		System.out.println(refDateNaissance13.hashCode());
		
		System.out.println("---------------------------------------------");	
	
		System.out.println(refDate11.equals(refDateNaissance11));
		System.out.println(refDateNaissance11.equals(refDate11));	
		//Fin du deuxième bloc
*/

//		*******************************************************************************************
/*
		//Début du troisième bloc
		UneDate tabMixte[] = new UneDate[10];
		
		tabMixte[0]=new UneDate(7,10,2000);

		tabMixte[1]=new UneDate("7.10.2000");

		tabMixte[2]=new UneDate("07.10.2000");

		tabMixte[3]=new DateNaissance(7,10,2000,15,23,"Toto");

		tabMixte[4]=new DateNaissance(7,10,2000,15,23,"Tutu");
		
		tabMixte[5]=new DateNaissance(7,10,2000,9,41,"Toto");
		
		tabMixte[6]=new UneDate(7,10,2000);
		
		tabMixte[7]=new DateNaissance(7,10,2000,3,33,"Dupont");
	
		tabMixte[8]=new UneDate(7,10,2000);
		
		tabMixte[9]=new DateNaissance(7,10,2000,3,33,"Dupont");
		

		System.out.println("-----------------------------------------------------------------------");
		for(int i=0; i<tabMixte.length; i++)
		{
			System.out.println(tabMixte[i]+"   "+tabMixte[i].hashCode());
		}
		//Fin du troisième bloc
*/
	}	//fin de la méthode main()
}		//fin de la classe principale CP_TP13Exo2
