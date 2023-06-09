package cms_tp12;
/*
 La classe non abstraite Carre dérive de la classe de base Rectangle et permet 
 d'instancier et de travailler avec des objets Java qui correspondent à des carrés 
 décrits par un nom, l'abscisse et l'ordonnée du coin supérieur gauche et la longueur du côté.
*/

public class Carre extends Rectangle
{
	//il n'y a pas de champ spécifique
	
	//constructeur surchargé sans argument
	//l'instance créée avec ce constructeur correspond a un carré de nom "sans_nom",
	//ayant le coin supérieur gauche à l'origine et la longueur du côté nulle
	Carre( )
	{
		//corps à préciser
	}
	
	//constructeur surchargé avec 4 arguments
	Carre(String nom, double x, double y, double cote)
	{
		//corps à préciser
	}
	
	//redéfinitions de 3 méthodes
	//(la méthode afficher() doit indiquer le nom du carré correspondant et la longueur de son côté)
}
