package cms_tp12;

public abstract class Quadrilatere implements IAireCalculable
{
	protected String nom;
	
	//Constructeur surchargé sans argument
	Quadrilatere( )
	{
		this("Sans_nom");
	}
	
	//Constructeur surchargé avec un argument
	Quadrilatere(String nom)
	{
		this.nom = new String(nom);
	}
	
	//Méthode abstraite
	abstract double calculerPerimetre();
}
