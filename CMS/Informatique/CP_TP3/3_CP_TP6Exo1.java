/*
	Classe principale qui continent la méthode main() et qui
	permet de tester la conception de la classe VTD
*/

package cms_tp6;

public class CP_TP6Exo1 
{
	//la méthode main()
	public static void main(String args[ ]) 
	{
		//déclarations de trois variables de type classe (ou variables objets) et 
		//création de trois nouveaux objets
		VTD u = new VTD();
		VTD v = new VTD(0.0,1.0,0.0);
		VTD w = new VTD(0.0,0.0,1.0);
	
		//modifications des valeurs des champs de l'objet référencé par u
		System.out.print("Tout au début, le vecteur u vaut : ");  
		u.afficher();
		System.out.println(".");
		u.setComposante1(-1.0);
		u.setComposante2(3.5);
		u.setComposante3(-25.48);
		System.out.print("Après modifications, le vecteur u devient : "); 
		u.afficher();
		System.out.println(".");
		
		//situation initiale		
		System.out.println("\nAvant les calculs, les vecteurs u, v et w valent, respectivement : ");
		u.afficher();
		System.out.print("; ");
		v.afficher();
		System.out.print("; ");
		w.afficher();
		System.out.println(".");
		
//		Décommenter progressivement le contenu de la méthode main 
//		afin de vérifier la conception de la classe VTD au fur et à mesure
		/*

//		------------------------------------------------------------------------------------
	
		//calcul du produit scalaire de u et v à l'aide de la méthode d'instance
		//compléter l'instruction ci-dessous
		double u_fois_v = 
		System.out.print( "\nLe produit scalaire des u et v (calculé avec la méthode d'instance) ");
		System.out.print("vaut : " + u_fois_v + "." );
		
		//calcul du produit scalaire de v et u à l'aide de la méthode statique
		//compléter l'instruction ci-dessous
		double v_fois_u =
		System.out.print( "\nLe produit scalaire des v et u (calculé avec la méthode statique) ");
		System.out.println("vaut : " + v_fois_u + "." );	

//		------------------------------------------------------------------------------------
		
		//calcul de la somme de u et v à l'aide de la méthode d'instance
		VTD somme;
		//compléter l'instruction ci-dessous
		somme = 
		System.out.print( "\nLa somme des u et v (calculée avec la méthode d'instance) vaut : \n");
		somme.afficher();
		System.out.println(".");
		
		//calcul de la somme de u et v à l'aide de la méthode statique
		//compléter l'instruction ci-dessous
		somme = 
		System.out.print( "La somme des u et v (calculée avec la méthode statique) vaut : \n");	
		somme.afficher();
		System.out.println(".");

//		------------------------------------------------------------------------------------
		
		//calcul du produit vectoriel de v et w à l'aide de la méthode d'instance
		//compléter l'instruction ci-dessous
		VTD v_cross_w = 
		System.out.print( "\nLe produit vectoriel des v et w (calculé avec la méthode d'instance) vaut : \n");
		System.out.print("(" + v_cross_w.getComposante1() + ", ");
		System.out.print(v_cross_w.getComposante2() + ", ");
		System.out.print(v_cross_w.getComposante3() + ")");
		System.out.println(".");
		
		//calcul du produit vectoriel de w et v à l'aide de la méthode statique
		//compléter l'instruction ci-dessous
		VTD w_cross_v = 
		System.out.print( "Le produit vectoriel des w et v (calculé avec la méthode statique) vaut : \n");	
		w_cross_v.afficher();
		System.out.println(".");

//		------------------------------------------------------------------------------------
	
		//calcul du produit mixte de u, v et w à l'aide de la méthode d'instance
		//compléter l'instruction ci-dessous
		double u_fois_v_fois_w =
		System.out.print( "\nLe produit mixte des u, v et w (calculé avec la méthode d'instance) ");
		System.out.print("vaut : " + u_fois_v_fois_w + "." );
		
		//calcul du produit mixte de u, v et w à l'aide de la méthode statique
		//compléter l'instruction ci-dessous
		u_fois_v_fois_w = 
		System.out.print( "\nLe produit mixte des u, v et w (calculé avec la méthode statique) ");
		System.out.println("vaut : " + u_fois_v_fois_w + "." );		

//		------------------------------------------------------------------------------------
		
		//affichage du nombre d'objets créés à l'exécution
		System.out.print("\nLe nombre d'objets créés dès le début de l'exécution est : ");
		//compléter l'instruction ci-dessous
		System.out.println( + ".");
		*/					
	}//fin de la méthode main
}//fin de la classe CP_TP6Exo1
