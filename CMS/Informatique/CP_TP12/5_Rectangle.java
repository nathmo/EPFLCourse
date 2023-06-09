package cms_tp12;

/*
La classe non abstraite Rectangle est la descendante directe de la classe de base Quadrilatere;
elle impl�mente l'interface IAffichable et permet d'instancier et de travailler avec des objets Java 
qui correspondent � des rectangles d�crits par un nom, l'abscisse et l'ordonn�e du coin sup�rieur gauche 
ainsi que la longueur et la hauteur.
*/

public class Rectangle extends Quadrilatere implements IAffichable
{
	//champs priv�s sp�cifiques
	private double x, y, longueur, hauteur;
	
	//constructeur surcharg� sans argument
	//l'instance cr��e avec ce constructeur correspond a un rectangle de nom "sans_nom",
	//ayant le coin sup�rieur gauche � l'origine et la longueur et la hauteur nulles
	Rectangle( )
	{
		//corps � pr�ciser
	}
	
	//constructeur surcharg� avec 5 arguments
	Rectangle(String nom, double x, double y, double longueur, double hauteur)
	{
		//corps � pr�ciser
	}

	//8 d�finitions des m�thodes "d'alt�ration" (Getters and Setters) pour les champs priv�s
	//(conform�ment au m�canisme d'encapsulation)
	
	
	//(re)d�finitions de toutes les m�thodes abstraites
	//(la m�thode afficher() doit indiquer le nom du rectangle correspondant, 
	//sa longueur et sa hauteur)
	

}
