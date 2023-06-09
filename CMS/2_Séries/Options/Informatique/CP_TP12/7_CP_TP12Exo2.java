package cms_tp12;

public class CP_TP12Exo2 
{
	public static void main(String args[]) 
	{
		Quadrilatere tabMixte[ ] = new Quadrilatere[4];
		
		tabMixte[0] = new Rectangle( );
		tabMixte[2] = new Rectangle("rectangle_2", 1.0, 2.0, 2.5,4.0);
		
		tabMixte[0].nom = "rectangle_1";
		//L'instruction ci-dessous produit une erreur de compilation 
		//tabMixte[0].setLongueur(1.5);		
		//"The method setLongueur(double) is undefined for the type Quadrilatere"
		((Rectangle)tabMixte[0]).setLongueur(1.5);
		//L'instruction ci-dessous produit une erreur de compilation
		//tabMixte[0].setHauteur(10);		
		//"The method setHauteur(int) is undefined for the type Quadrilatere"		
		((Rectangle)tabMixte[0]).setHauteur(10);
		
		tabMixte[1] = new Carre();		
		tabMixte[3] = new Carre("carre_2",10.0, 10.0, 2.5);	
		
		//L'instruction commentée ci-dessous produit une erreur de compilation 
		//tabMixte[1].setLongueur(1.5);
		//"The method setLongueur(double) is undefined for the type Quadrilatere"		
		((Carre)tabMixte[1]).setLongueur(1.5);
		//L'instruction ci-dessous produit une erreur de compilation
		//tabMixte[1].setHauteur(10);		
		//"The method setHauteur(int) is undefined for the type Quadrilatere"		
		((Carre)tabMixte[1]).setHauteur(10);		

		for(int i=0; i<tabMixte.length; i++)
		{
			System.out.println("Je suis " + tabMixte[i] +" (appel implicite à toString()) !");
			System.out.println("Je suis une instance de la classe "+tabMixte[i].getClass().getName()+" (appel à getClass().getName()) !");
			System.out.println();
			
			//L'instruction ci-dessous produit une erreur de compilation	:
			//"The method afficher() is undefined for the type Quadrilatere"
			//tabMixte[i].afficher();		
			((IAffichable)tabMixte[i]).afficher();
			((Rectangle)tabMixte[i]).afficher();
			System.out.println();
			
			System.out.println("Mon aire vaut : " + tabMixte[i].calculerAire() + ".");
			System.out.println("Mon perimetre vaut : " + tabMixte[i].calculerPerimetre() + ".");	
			System.out.println();
			
			if(tabMixte[i] instanceof Quadrilatere)
			{
				System.out.print("Je suis une instance de la classe Quadrilatere ! ");
			}
			System.out.println();
			if(tabMixte[i] instanceof Rectangle)
			{
				System.out.print("Je suis une instance de la classe Rectangle ! ");
			}
			if(tabMixte[i] instanceof Carre)
			{
				System.out.print("Je suis une instance de la classe Carre ! ");
			}else
			{
				System.out.print("Je ne suis pas une instance de la classe Carre ! ");
			}
			System.out.println();
			if(tabMixte[i] instanceof IAffichable)
			{
				System.out.print("Je suis une instance d'une classe qui implémente l'interface IAffichable ! ");
			}
			System.out.println();
			if(tabMixte[i] instanceof IAireCalculable)
			{
				System.out.print("Je suis une instance d'une classe qui implémente l'interface IAireCalculable ! ");
			}			
			
			System.out.println("\n--------------------------------------------------------------------------------------");
		}//fin de la boucle for	
	}//fin de la méthode main
}//fin de la classe principale


