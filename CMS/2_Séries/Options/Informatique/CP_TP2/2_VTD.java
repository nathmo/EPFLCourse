/*
	Classe qui permet à la fois de créer des objets correspondant à des vecteurs 
	tridimensionnels et de faire des calculs usuels avec les vecteurs (par exemple
	la somme, le produit scalaire, le produit vectoriel et le produit mixte)
	 
*/

package cms_tp6;

public class VTD 
{
	//champs d'instance privés (les composantes du vecteur tridimensionnel)
	private double composante1, composante2, composante3;
	//champ statique privé (pour stocker le nombre d'objets créés à l'exécution)
	private static int nbVecteurs=0;	

//---------------------------------------------------------------------------------------
			
	//constructeur sans arguments
	VTD()
	{
		composante1 = 0.0;
		composante2 = 0.0;
		composante3 = 0.0;
		//ajouter une instruction afin de compter le nombre d'objets créés

	}
	
	//constructeur (surchargé) avec trois arguments
	VTD(double compo1, double compo2, double compo3)
	{
		//écrire le corps de ce constructeur	
		
	}

//---------------------------------------------------------------------------------------
			
	//méthodes d'accès aux champs privés
	public void setComposante1(double composante1)
	{
		//écrire le corps de cette méthode
		
	}
	
	public void setComposante2(double composante2)
	{
		//écrire le corps de cette méthode
		
	}
	
	public void setComposante3(double composante3)
	{
		//écrire le corps de cette méthode
		
	}
	
	public double getComposante1()
	{
		//écrire le corps de cette méthode
		
	}
	
	public double getComposante2()
	{
		//écrire le corps de cette méthode
		
	}
	
	public double getComposante3()
	{
		//écrire le corps de cette méthode
		
	}
	
	public static int getNbVecteurs()
	{
		//écrire le corps de cette méthode
		
	}

//---------------------------------------------------------------------------------------

	//méthode publique d'instance pour le calcul du produit scalaire de 2 vecteurs
	public double calculerProduitScalaire(VTD deuxiemeVecteur)
	{
		//écrire le corps de cette méthode
		
	}
	
	//méthode publique et statique (surchargée) pour le calcul du produit scalaire de 2 vecteurs
	public static double calculerProduitScalaire(VTD premierVecteur, VTD deuxiemeVecteur)
	{
		//écrire le corps de cette méthode		
	}

//---------------------------------------------------------------------------------------
	
	//méthode publique d'instance pour le calcul de la somme de 2 vecteurs
	//écrire l'en-tête de cette méthode
	
	{
		//écrire le corps de cette méthode
		
	}	
	
	//méthode publique et statique (surchargée) pour le calcul de la somme de 2 vecteurs
	//écrire l'en-tête de cette méthode
	
	{
		//écrire le corps de cette méthode
		
	}

//---------------------------------------------------------------------------------------
	
	//méthode publique d'instance pour le calcul du produit vectoriel de 2 vecteurs
	//écrire l'en-tête de cette méthode
	
	{
		//écrire le corps de cette méthode
		
	}
	
	//méthode publique et statique (surchargée) pour le calcul du produit vectoriel de 2 vecteurs
	//écrire l'en-tête de cette méthode
	
	{
		//écrire le corps de cette méthode
		
	}	

//---------------------------------------------------------------------------------------
	
	//méthode publique d'instance pour le calcul du produit mixte de 3 vecteurs 
	//(on utilise l'expression explicite algébrique du produit mixte)
	//écrire l'en-tête de cette méthode
	
	{
		//écrire le corps de cette méthode
		
	}
		
	//méthode publique et statique (surchargée) pour le calcul du produit mixte de 3 vecteurs
	//(on calcule le produit mixte à l'aide des produits scalaire et vectoriel)
	//écrire l'en-tête de cette méthode
	
	{
		//écrire le corps de cette méthode
		
	}

//---------------------------------------------------------------------------------------
		
	//méthode pour afficher les composantes d'un vecteur
	public void afficher()
	{
		System.out.print("("+ composante1 +", " + composante2 +", " + composante3 + ")");
	}	
}//fin de la classe VTD

