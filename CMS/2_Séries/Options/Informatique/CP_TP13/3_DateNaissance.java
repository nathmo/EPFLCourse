package cms_tp13;

/*Classe dérivée de la classe de base UneDate 
 * Elle  réalise une spécialisation des dates par l'encapsulation supplémentaire 
 * de l'heure et de la minute, ainsi que d'un nom de personne.
 */

public class DateNaissance extends UneDate
{
	//champs propres (spécifiques) privés avec des valeurs initiales indiquées
	private int heure=0, minute=0;
	private String nom="Sans_nom";

//	*******************************************************************************************
	//Constructeur sans argument
	public DateNaissance( ) 
	{
	}
	
	//Constructeur avec 5 arguments
	public DateNaissance(int jour, int mois, int an, int heure, int minute, String nom) 
	{
		//A compléter
	}

//	*******************************************************************************************
	//Méthodes d'altération (Setters and Getters) pour les 3 champs propres (spécifiques)
	
	//L'heure est valide si sa valeur est comprise entre 0 et 23.
	public void setHeure(int heure) 
	{
		//A compléter
	}
	
	public int getHeure() 
	{
		//A compléter
	}
	
	//La minute est valide si sa valeur est comprise entre 0 et 59.
	public void setMinute(int minute) 
	{
		//A compléter
	}
	
	public int getMinute() 
	{
		//A compléter
	}
	
	public void setNom(String nom) 
	{
		//A compléter
	}
	
	public String getNom() 
	{
		//A compléter
	}

//	*******************************************************************************************
	//Redéfinition de la méthode equals héritée de la classe mère UneDate
	@Override
	public boolean equals(Object deuxiemeObjet) 
	{
		//A compléter
	}

	//Redéfinition de la méthode hashCode héritée de la classe racine Object
	@Override
	public int hashCode( ) 
	{
		//A compléter
	}

	//Redéfinition de la méthode toString héritée de la classe racine Object
	@Override
	public String toString( )
	{
		//A compléter
	}
}
