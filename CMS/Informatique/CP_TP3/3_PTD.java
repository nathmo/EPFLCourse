/*
	Classe d�riv�e de la classe de base PBD et qui permet  
	de cr�er des objets correspondant � des points dans l'espace
	(pr�cis�s par leurs coordonn�es cart�siennes)	 
*/

package cms_tp10;

public class PTD extends PBD 
{
	//champ d'instance priv� propre (suppl�mentaire ou sp�cifique)
	//� pr�ciser ci-dessous
	
	//champ statique priv� red�fini
	//� pr�ciser ci-dessous
	
		
	//constructeur sans arguments 
	//(pr�ciser s'il est surcharg� ou non)
	//et qui n'appelle pas explicitement un constructeur "m�re"
	PTD()
	{
		//pr�ciser le corps
	}
	
	//constructeur  avec trois arguments
	//(pr�ciser s'il est surcharg� ou non)
	//et qui appelle explicitement un constructeur "m�re"
	PTD(double x, double y, double z)
	{
		//pr�ciser le corps
	}
	
	//m�thodes d'acc�s aux champs priv�s propres	
	public void setZ(double z)
	{
		//pr�ciser le corps
	}
		
	public double getZ()
	{
		//pr�ciser le corps
	}
	
	public static int getNbPoints()
	{
		//pr�ciser le corps
	}
	
	//m�thode d'instance pour v�rifier l'�galit� de deux points
	//(pr�ciser si elle est surcharg�e ou red�finie)
	public boolean verifierEgalite(PTD deuxiemePoint)
	{
		//pr�ciser le corps		
	}										  
	
	//m�thode statique  pour v�rifier l'�galit� de deux points
	//(pr�ciser si elle est surcharg�e ou "hidden")
	public static boolean verifierEgalite(PTD premierPoint,
										  PTD deuxiemePoint)
	{
		//pr�ciser le corps		
	}	

	//m�thode d'instance qui retourne le clone d'un point
	//Attention : � partir du JDK 5.0, elle peut s'appeler creerClone !
	public PTD creerClone( )

	{
		//pr�ciser le corps
	}	
	
	//m�thode statique qui retourne le clone d'un point
	//(pr�ciser si elle est surcharg�e ou "hidden")
	public static PTD creerClone(PTD pointSource)
	{
		//pr�ciser le corps	
	}
	
	//m�thode d'instance pour afficher les coordonn�es d'un point  
	//(pr�ciser si elle est surcharg�e ou red�finie) 
	//et qui appelle la m�thode d'origine
	public void afficher()
	{
		//pr�ciser le corps
	}
}
	
	
	
	
	
	
