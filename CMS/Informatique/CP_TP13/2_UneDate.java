package cms_tp13;

/*Classe de base définie par le programmeur afin de travailler avec des objets encapsulant des dates
 * indiquées par le jour, le mois et l'année
 */
public class UneDate 
{
	//Champs privés avec des valeurs initiales indiquées
	private int jour=1, mois=1, an=1970;
	
//*******************************************************************************************	
	//Constructeur sans argument
	public UneDate( )
	{
	}

	//Constructeur avec trois arguments de type entier
	//Il utilise les méthodes Setters de cette même classe.
	public UneDate(int jour, int mois, int an) 
	{
		//A compléter
	}
	
	//Constructeur avec un argument de type chaîne de caractères
	//Il utilise la méthode parseTabInt et les méthodes Setters de cette même classe.
	public UneDate(String strDate)
	{
		//A compléter
	}
	
//	*******************************************************************************************	
	//6 méthodes d'altération (Setters et Getters) pour les 3 champs privés

	//L'an est valide si sa valeur est comprise entre 1800 et 2500.
	public void setAn(int an) 
	{
		if(an>=1800 && an<=2500)
		{
			this.an = an;
		}else
		{
			System.out.println("An non valide !");
		}
	}

	public int getAn( ) 
	{
		return an;
	}

	//Le mois est valide si sas valeur est comprise entre 1 et 12.
	public void setMois(int mois) 
	{
		if(mois>0 && mois<13)
		{
			this.mois = mois;
		}else
		{
			System.out.println("Mois non valide !");
		}
	}
	
	public int getMois() 
	{
		return mois;
	}

	//Le jour est valide en fonction des valeurs du mois et, éventuellement, de l'an.
	public void setJour(int jour) 
	{
		if(jour<1 || jour>31)
		{
			System.out.println("Jour non valide !");
		}
		else if(mois==2 && jour <29)
		{
			this.jour=jour;
		}else if(mois ==2 && jour==29 && (an%400==0 || (an%4==0 && an%100!=0)))
		{
			this.jour=jour;
		}else if(mois==2 && (jour==29 || jour==30 || jour == 31))
		{
			System.out.println("Jour non valide !");			
		}else if(jour<=30) 
		{
			this.jour=jour;
		}else if(jour ==31 && (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois ==10 || mois==12))
		{
			this.jour = jour;
		}else
		{
			System.out.println("Jour non valide !");
		}
	}
	
	public int getJour() 
	{
		return jour;
	}

//	*******************************************************************************************
	//Méthode statique qui vérifie si son argument de type chaîne de caractèes 
	//respecte rigoureusement le masque "jj.mm.aaaa".
	static boolean masqueValide(String strDate)
	{
		//A compléter
	}
	
	//Méthode statique qui retourne l'adresse d'un tableau de 3 entiers correspondant au jour, au mois et à l'an,
	//créé à partir de son argument de type chaîne de caractères.
	//Elle utilise la méthode masqueValide de cette même classe.
	//Si la chaîne argument n'est pas valide, le tableau de trois entiers créé doit correspondre aux valeurs initiales
	//indiquées explicitement pour les trois champs privés de la classe
	static int[ ] parseTabInt(String strDate)
	{
		//A compléter
	}
	
	//Méthode statique qui retourne l'adresse d'un objet de type UneDate obtenu 
	//à partir de la date indiquée par son argument de type chaîne de caractères.
	static UneDate valueOf(String strDate)
	{
		//A compléter
	}
	
//	*******************************************************************************************
	//Redéfinition de la méthode equals héritée de la classe racine Object
	@Override
	public boolean equals(Object deuxiemeObjet) 
	{
		//A compléter
	}

	//Redéfinition de la méthode hashCode héritée de la classe racine Object	
	@Override
	public int hashCode() 
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
