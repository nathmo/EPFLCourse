package cms_tp13;

/*Classe de base d�finie par le programmeur afin de travailler avec des objets encapsulant des dates
 * indiqu�es par le jour, le mois et l'ann�e
 */
public class UneDate 
{
	//Champs priv�s avec des valeurs initiales indiqu�es
	private int jour=1, mois=1, an=1970;
	
//*******************************************************************************************	
	//Constructeur sans argument
	public UneDate( )
	{
	}

	//Constructeur avec trois arguments de type entier
	//Il utilise les m�thodes Setters de cette m�me classe.
	public UneDate(int jour, int mois, int an) 
	{
		//A compl�ter
	}
	
	//Constructeur avec un argument de type cha�ne de caract�res
	//Il utilise la m�thode parseTabInt et les m�thodes Setters de cette m�me classe.
	public UneDate(String strDate)
	{
		//A compl�ter
	}
	
//	*******************************************************************************************	
	//6 m�thodes d'alt�ration (Setters et Getters) pour les 3 champs priv�s

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

	//Le jour est valide en fonction des valeurs du mois et, �ventuellement, de l'an.
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
	//M�thode statique qui v�rifie si son argument de type cha�ne de caract�es 
	//respecte rigoureusement le masque "jj.mm.aaaa".
	static boolean masqueValide(String strDate)
	{
		//A compl�ter
	}
	
	//M�thode statique qui retourne l'adresse d'un tableau de 3 entiers correspondant au jour, au mois et � l'an,
	//cr�� � partir de son argument de type cha�ne de caract�res.
	//Elle utilise la m�thode masqueValide de cette m�me classe.
	//Si la cha�ne argument n'est pas valide, le tableau de trois entiers cr�� doit correspondre aux valeurs initiales
	//indiqu�es explicitement pour les trois champs priv�s de la classe
	static int[ ] parseTabInt(String strDate)
	{
		//A compl�ter
	}
	
	//M�thode statique qui retourne l'adresse d'un objet de type UneDate obtenu 
	//� partir de la date indiqu�e par son argument de type cha�ne de caract�res.
	static UneDate valueOf(String strDate)
	{
		//A compl�ter
	}
	
//	*******************************************************************************************
	//Red�finition de la m�thode equals h�rit�e de la classe racine Object
	@Override
	public boolean equals(Object deuxiemeObjet) 
	{
		//A compl�ter
	}

	//Red�finition de la m�thode hashCode h�rit�e de la classe racine Object	
	@Override
	public int hashCode() 
	{
		//A compl�ter
	}

	//Red�finition de la m�thode toString h�rit�e de la classe racine Object
	@Override
	public String toString( )
	{
		//A compl�ter
	}
}
