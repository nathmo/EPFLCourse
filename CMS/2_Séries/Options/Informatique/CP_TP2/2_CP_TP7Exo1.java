/*
	Classe principale qui contient la méthode main() et qui
	permet de tester la conception de la classe VTD
*/

package cms_tp7;

public class CP_TP7Exo1 
{
	//la methode main()
	public static void main(String args[]) 
	{
		//déclarations de trois variables de type objet
		VTD u = new VTD();
		VTD v = new VTD(2.0,2.0,2.0);
		VTD w = new VTD(3.0,3.0,3.0);

//		------------------------------------------------------------------------------------
	
		//modifications des valeurs des champs de l'objet u
		u.setComposante1(1.0);
		u.setComposante2(1.0);
		u.setComposante3(1.0);
		
		//situation initiale		
		System.out.println("Au début, les vecteurs u, v et w valent, respectivement : ");
		u.afficher();
		System.out.print(", ");
		v.afficher();
		System.out.print(", ");
		w.afficher();
		System.out.println(".");
		
//Décommenter progressivement le contenu de la méthode main 
//afin de vérifier la conception de la classe VTD au fur et à mesure
/*		
//--------------------------------------------------------------------------------------------------------
		//utilisation de l'opérateur d'affectation
		u=v;
		v=w;
		w=u;
		System.out.println("\nAprès les affectations, les vecteurs u, v et w valent, respectivement : ");
		u.afficher();
		System.out.print(", ");
		v.afficher();
		System.out.print(", ");
		w.afficher();
		System.out.println(".");				
		
//--------------------------------------------------------------------------------------------------------
		
		//calcul avec la méthode d'instance calculerPlusEgal
		u.calculerPlusEgal(v);		
		System.out.print( "\nAprès le calcul de u += v,  u devient : ");
		u.afficher();
		System.out.print(", \ntandis que v vaut toujours : ");
		v.afficher(); 
		System.out.println(".");	
		
//--------------------------------------------------------------------------------------------------------
			
		//vérification de l'égalité (en profondeur) de deux vecteurs à l'aide d'une méthode d'instance
		if(u.verifierEgalite(v))
		{
			System.out.print("\nLes vecteurs u et v sont égaux (en profondeur), à savoir ");
			u.afficher();
			System.out.println(" !");	
		}
		else
			System.out.println("\nLes vecteurs u et v ne sont pas égaux (en profondeur) !");

//--------------------------------------------------------------------------------------------------------
			
		//clonage d'un vecteur avec la méthode statique creerClone
		System.out.println("\nOn clone le vecteur u et on stocke la référence du clone en v !");
		v=VTD.creerClone(u);					

//--------------------------------------------------------------------------------------------------------
		
		//vérification de l'égalité (en profondeur) de deux vecteurs à l'aide d'une méthode statique
		if(VTD.verifierEgalite(u,v))
		{
			System.out.print("\nLes vecteurs u et v sont égaux (en profondeur), à savoir ");
			u.afficher();
			System.out.println(" !");	
		}
		else
			System.out.println("\nLes vecteurs u et v ne sont pas égaux (en profondeur) !");		

//--------------------------------------------------------------------------------------------------------
		
		//vérification de "l'égalité" de deux vecteurs à l'aide de l'opérateur de comparaison ==
		if(u==v)
			System.out.println("\nu et v référencent le même objet !");
		else
			System.out.println("\nu et v ne référencent pas le même objet !");

//--------------------------------------------------------------------------------------------------------
		
		//calcul  de la norme du vecteur w avec la méthode d'instance calculerNorme
		double norme=w.calculerNorme();
		System.out.print("\nLe vecteur w vaut : ");
		w.afficher();
		System.out.println(" et sa norme est : "+ norme +".");	

//--------------------------------------------------------------------------------------------------------
		
		//création d'un nouvel objet
		VTD uu = new VTD(7.0,8.0,9.0);

//--------------------------------------------------------------------------------------------------------
		
		//copie du contenu du vecteur uu dans le vecteur v avec la methode statique  faireCopie
		VTD.faireCopie(uu,v);
		System.out.print("\nLe vecteur v vaut : ");
		v.afficher();
		System.out.println(" et sa norme est : "+ v.calculerNorme() +".");		

//--------------------------------------------------------------------------------------------------------
		
		//comparaison des vecteur v et w avec la methode statique comparerPlusGrand
		if(VTD.comparerPlusGrand(v,w))
			System.out.println("\nLe vecteur v  est (strictement) plus grand que le vecteur w !");
		else
			System.out.println("\nLe vecteur v n'est pas (strictement) plus grand que le vecteur w !");

//--------------------------------------------------------------------------------------------------------
		
		//affichage du nombre d'objets créés à l'exécution
		System.out.print("\nLe nombre d'objets créés dès le début de l'exécution est : ");
		System.out.println(VTD.getNbVecteurs() + ".");
*/					
	}//fin de la méthode main
}//fin de la classe principale


















