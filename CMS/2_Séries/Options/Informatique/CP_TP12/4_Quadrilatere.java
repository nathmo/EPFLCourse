package cms_tp12;

public abstract class Quadrilatere implements IAireCalculable
{
	protected String nom;
	
	//Constructeur surcharg� sans argument
	Quadrilatere( )
	{
		this("Sans_nom");
	}
	
	//Constructeur surcharg� avec un argument
	Quadrilatere(String nom)
	{
		this.nom = new String(nom);
	}
	
	//M�thode abstraite
	abstract double calculerPerimetre();
}
