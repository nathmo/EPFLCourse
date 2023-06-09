package cms_tp12;

/*
La classe non abstraite Rectangle est la descendante directe de la classe de base Quadrilatere;
elle implémente l'interface IAffichable et permet d'instancier et de travailler avec des objets Java 
qui correspondent à des rectangles décrits par un nom, l'abscisse et l'ordonnée du coin supérieur gauche 
ainsi que la longueur et la hauteur.
*/

public class Rectangle extends Quadrilatere implements IAffichable
{
	//champs privés spécifiques
	private double x, y, longueur, hauteur;
	
	//constructeur surchargé sans argument
	//l'instance créée avec ce constructeur correspond a un rectangle de nom "sans_nom",
	//ayant le coin supérieur gauche à l'origine et la longueur et la hauteur nulles
	Rectangle( )
	{
		//corps à préciser
	}
	
	//constructeur surchargé avec 5 arguments
	Rectangle(String nom, double x, double y, double longueur, double hauteur)
	{
		//corps à préciser
	}

	//8 définitions des méthodes "d'altération" (Getters and Setters) pour les champs privés
	//(conformément au mécanisme d'encapsulation)
	
	
	//(re)définitions de toutes les méthodes abstraites
	//(la méthode afficher() doit indiquer le nom du rectangle correspondant, 
	//sa longueur et sa hauteur)
	

}
