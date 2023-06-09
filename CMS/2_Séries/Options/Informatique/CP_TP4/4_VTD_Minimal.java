//Cette classe contient une variante minimale suffisante à la 
//résolution de l'exercice 1 des TP8

public class VTD 
{
	//champs d'instance privés
	private double composante1, composante2, composante3;
	
	//constructeur (surchargé) avec trois arguments
	VTD(double compo1, double compo2, double compo3)
	{
		composante1=compo1;
		composante2=compo2;
		composante3=compo3;	
	}
	
	//constructeur (surchargé) sans arguments
	VTD()
	{
		this(0.0,0.0,0.0);
	}	
	
	//méthodes d'accès aux champs privés
	public void setComposante1(double composante1)
	{
		this.composante1=composante1;
	}
	
	public void setComposante2(double composante2)
	{
		this.composante2=composante2;
	}
	
	public void setComposante3(double composante3)
	{
		this.composante3=composante3;
	}

	public double getComposante1()
	{
		return composante1;
	}
	
	public double getComposante2()
	{
		return composante2;
	}
	
	public double getComposante3()
	{
		return composante3;
	}
		
	//méthode d'instance (surchargée) pour le calcul de la somme
	public VTD calculerSomme(VTD deuxiemeVecteur)
	{
		VTD somme = new VTD();
		somme.composante1 = composante1 + deuxiemeVecteur.composante1 ;
		somme.composante2 = composante2 + deuxiemeVecteur.composante2 ;
		somme.composante3 = composante3 + deuxiemeVecteur.composante3 ;
		return somme;																	
	}	
	
	//méthode statique (surchargée) pour le calcul de la somme
	public static VTD calculerSomme(VTD premierVecteur, 
										  VTD deuxiemeVecteur)
	{
		VTD somme = new VTD();
		somme.composante1 = premierVecteur.composante1 + deuxiemeVecteur.composante1;
		somme.composante2 = premierVecteur.composante2 + deuxiemeVecteur.composante2;
		somme.composante3 = premierVecteur.composante3 + deuxiemeVecteur.composante3;
		return somme;																	
	}
		
	//méthode d'instance ayant un effet similaire à l'opérateur +=
	public void calculerPlusEgal(VTD deuxiemeVecteur)
	{
		composante1=composante1+deuxiemeVecteur.composante1;
		composante2=composante2+deuxiemeVecteur.composante2;
		composante3=composante3+deuxiemeVecteur.composante3;
	}	
	
	//méthode pour afficher les composantes d'un vecteur
	public void afficher()
	{
		System.out.print("("+ composante1 +", " + composante2 +", " + composante3 + ")");
	}	
}
















