/*
	Classe principale pour tester la hi�rarchie de classes cr��e
	(la classe de base PBD et la classe d�riv�e PTD)
*/
package cms_tp10;

public class CP_TP10Exo1 
{
	public static void main(String args[]) 
	{
		PBD refBi0 = new PBD();
		PBD refBi1 = new PBD(10.0,20.0);
		PBD refBi2 = new PBD(10.0,20.0);
		
		PTD tabTri[ ] = {new PTD(), new PTD(10.0,20.0,30.0), new PTD(10.0,20.0,30.0)};			
			
		System.out.println("Les points du plan r�f�renc�s par refBi0, refBi1 et refbi2 sont :");
		System.out.print("(");		refBi0.afficher();			System.out.print(")   (");
		refBi1.afficher( );		System.out.print(")   (");	refBi2.afficher();
		System.out.println(")\n");
		
		System.out.println("Les points de l'espace r�f�renc�s dans le tableau tabTri sont :");
		System.out.print("(");		tabTri[0].afficher();			System.out.print(")   (");
		tabTri[1].afficher();		System.out.print(")   (");	tabTri[2].afficher();
		System.out.println(")\n");		
		
		
		if(refBi0.verifierEgalite(refBi1))
			System.out.println( "Les points r�f�renc�s par refBi0 et refBi1 ont les m�mes coordonn�es !");
		else 
			System.out.println( "Les points r�f�renc�s par refBi0 et refBi1 sont diff�rents !");
			
		if(PBD.verifierEgalite(refBi1, refBi2))
			System.out.println( "Les points r�f�renc�s par refBi1 et refBi2 ont les m�mes coordonn�es !");
		else 
			System.out.println( "Les points r�f�renc�s par refBi1 et refBi2 sont diff�rents !");
		
			
		if(tabTri[0].verifierEgalite(tabTri[1]))
			System.out.println( "\nLes points r�f�renc�s par tabTri[0] et tabTri[1] ont les m�mes coordonn�es !");
		else 
			System.out.println( "\nLes points r�f�renc�s par tabTri[0] et tabTri[1] sont diff�rents !");
			
		if(PBD.verifierEgalite(tabTri[1], tabTri[2]))
			System.out.println( "Les points r�f�renc�s par tabTri[1] et tabTri[2] ont les m�mes coordonn�es !");
		else 
			System.out.println( "Les points r�f�renc�s par tabTri[1] et tabTri[2] sont diff�rents !");			
		
		
		if(refBi1.verifierEgalite(tabTri[1]))
		{
			System.out.println( "\nLes points r�f�renc�s par refBi1 et tabTri[1] ont les m�mes coordonn�es !");
			System.out.println( "(Ceci est FAUX !)");
		}
		else
		{ 
			System.out.println( "\nLes points r�f�renc�s par refBi1 et tabTri[1] sont diff�rents !");
			System.out.println( "(Ceci est VRAI !)");
		}		
		
		if(tabTri[1].verifierEgalite(refBi1))
		{
			System.out.println( "\nLes points r�f�renc�s par tabTri[1] et refBi1 ont les m�mes coordonn�es !");
			System.out.println( "(Ceci est FAUX !)");
		}
		else
		{ 
			System.out.println( "\nLes points r�f�renc�s par tabTri[1] et refBi1 sont diff�rents !");
			System.out.println( "(Ceci est VRAI !)");
		}


		if(PBD.verifierEgalite(refBi1,tabTri[1]))
		{
			System.out.println( "\nLes points r�f�renc�s par refBi1 et tabTri[1] ont les m�mes coordonn�es !");
			System.out.println( "(Ceci est FAUX !)");
		}
		else
		{ 
			System.out.println( "\nLes points r�f�renc�s par refBi1 et tabTri[1] sont diff�rents !");
			System.out.println( "(Ceci est VRAI !)");
		}
		
		
		if(PTD.verifierEgalite(refBi1,tabTri[1]))
		{
			System.out.println( "\nLes points r�f�renc�s par tabTri[1] et refBi1 ont les m�mes coordonn�es !");
			System.out.println( "(Ceci est FAUX !)");
		}
		else
		{ 
			System.out.println( "\nLes points r�f�renc�s par tabTri[1] et refBi1 sont diff�rents !");
			System.out.println( "(Ceci est VRAI !)");
		}		
		
		
		System.out.println("\nOn fait : refBi0 = tabTri[1];");			
		
		refBi0 = tabTri[1];
		if(refBi0.verifierEgalite(refBi1))
			System.out.println( "\nLes points r�f�renc�s par refBi0 et refBi1 ont maintenant les m�mes coordonn�es !");
		else 
			System.out.println( "\nLes points r�f�renc�s par refBi0 et refBi1 sont maintenant diff�rents !");
		
				
		System.out.println("\n"+PBD.getNbPoints()+" points dans le plan ont �t� cr��s durant l'ex�cution !");
		System.out.println(PTD.getNbPoints()+" points dans l'espace ont �t� cr��s durant l'ex�cution !");
	}//fin de la m�thode main
}//fin de la classe principale



