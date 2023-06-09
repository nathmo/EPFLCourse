/*
	Classe qui permet � la fois de cr�er des objets correspondant � des vecteurs 
	tridimensionnels et de faire des calculs usuels avec les vecteurs (par exemple
	la somme, le produit scalaire, le produit vectoriel et le produit mixte)
	 
*/

package cms_tp6;

public class VTD 
{
	//champs d'instance priv�s (les composantes du vecteur tridimensionnel)
	private double composante1, composante2, composante3;
	//champ statique priv� (pour stocker le nombre d'objets cr��s � l'ex�cution)
	private static int nbVecteurs=0;	

//---------------------------------------------------------------------------------------
			
	//constructeur sans arguments
	VTD()
	{
		composante1 = 0.0;
		composante2 = 0.0;
		composante3 = 0.0;
		//ajouter une instruction afin de compter le nombre d'objets cr��s

	}
	
	//constructeur (surcharg�) avec trois arguments
	VTD(double compo1, double compo2, double compo3)
	{
		//�crire le corps de ce constructeur	
		
	}

//---------------------------------------------------------------------------------------
			
	//m�thodes d'acc�s aux champs priv�s
	public void setComposante1(double composante1)
	{
		//�crire le corps de cette m�thode
		
	}
	
	public void setComposante2(double composante2)
	{
		//�crire le corps de cette m�thode
		
	}
	
	public void setComposante3(double composante3)
	{
		//�crire le corps de cette m�thode
		
	}
	
	public double getComposante1()
	{
		//�crire le corps de cette m�thode
		
	}
	
	public double getComposante2()
	{
		//�crire le corps de cette m�thode
		
	}
	
	public double getComposante3()
	{
		//�crire le corps de cette m�thode
		
	}
	
	public static int getNbVecteurs()
	{
		//�crire le corps de cette m�thode
		
	}

//---------------------------------------------------------------------------------------

	//m�thode publique d'instance pour le calcul du produit scalaire de 2 vecteurs
	public double calculerProduitScalaire(VTD deuxiemeVecteur)
	{
		//�crire le corps de cette m�thode
		
	}
	
	//m�thode publique et statique (surcharg�e) pour le calcul du produit scalaire de 2 vecteurs
	public static double calculerProduitScalaire(VTD premierVecteur, VTD deuxiemeVecteur)
	{
		//�crire le corps de cette m�thode		
	}

//---------------------------------------------------------------------------------------
	
	//m�thode publique d'instance pour le calcul de la somme de 2 vecteurs
	//�crire l'en-t�te de cette m�thode
	
	{
		//�crire le corps de cette m�thode
		
	}	
	
	//m�thode publique et statique (surcharg�e) pour le calcul de la somme de 2 vecteurs
	//�crire l'en-t�te de cette m�thode
	
	{
		//�crire le corps de cette m�thode
		
	}

//---------------------------------------------------------------------------------------
	
	//m�thode publique d'instance pour le calcul du produit vectoriel de 2 vecteurs
	//�crire l'en-t�te de cette m�thode
	
	{
		//�crire le corps de cette m�thode
		
	}
	
	//m�thode publique et statique (surcharg�e) pour le calcul du produit vectoriel de 2 vecteurs
	//�crire l'en-t�te de cette m�thode
	
	{
		//�crire le corps de cette m�thode
		
	}	

//---------------------------------------------------------------------------------------
	
	//m�thode publique d'instance pour le calcul du produit mixte de 3 vecteurs 
	//(on utilise l'expression explicite alg�brique du produit mixte)
	//�crire l'en-t�te de cette m�thode
	
	{
		//�crire le corps de cette m�thode
		
	}
		
	//m�thode publique et statique (surcharg�e) pour le calcul du produit mixte de 3 vecteurs
	//(on calcule le produit mixte � l'aide des produits scalaire et vectoriel)
	//�crire l'en-t�te de cette m�thode
	
	{
		//�crire le corps de cette m�thode
		
	}

//---------------------------------------------------------------------------------------
		
	//m�thode pour afficher les composantes d'un vecteur
	public void afficher()
	{
		System.out.print("("+ composante1 +", " + composante2 +", " + composante3 + ")");
	}	
}//fin de la classe VTD

