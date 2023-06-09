/*
	Classe dérivée de la classe de base PBD et qui permet  
	de créer des objets correspondant à des points dans l'espace
	(précisés par leurs coordonnées cartésiennes)	 
*/

package cms_tp10;

public class PTD extends PBD 
{
	//champ d'instance privé propre (supplémentaire ou spécifique)
	//à préciser ci-dessous
	
	//champ statique privé redéfini
	//à préciser ci-dessous
	
		
	//constructeur sans arguments 
	//(préciser s'il est surchargé ou non)
	//et qui n'appelle pas explicitement un constructeur "mère"
	PTD()
	{
		//préciser le corps
	}
	
	//constructeur  avec trois arguments
	//(préciser s'il est surchargé ou non)
	//et qui appelle explicitement un constructeur "mère"
	PTD(double x, double y, double z)
	{
		//préciser le corps
	}
	
	//méthodes d'accès aux champs privés propres	
	public void setZ(double z)
	{
		//préciser le corps
	}
		
	public double getZ()
	{
		//préciser le corps
	}
	
	public static int getNbPoints()
	{
		//préciser le corps
	}
	
	//méthode d'instance pour vérifier l'égalité de deux points
	//(préciser si elle est surchargée ou redéfinie)
	public boolean verifierEgalite(PTD deuxiemePoint)
	{
		//préciser le corps		
	}										  
	
	//méthode statique  pour vérifier l'égalité de deux points
	//(préciser si elle est surchargée ou "hidden")
	public static boolean verifierEgalite(PTD premierPoint,
										  PTD deuxiemePoint)
	{
		//préciser le corps		
	}	

	//méthode d'instance qui retourne le clone d'un point
	//Attention : à partir du JDK 5.0, elle peut s'appeler creerClone !
	public PTD creerClone( )

	{
		//préciser le corps
	}	
	
	//méthode statique qui retourne le clone d'un point
	//(préciser si elle est surchargée ou "hidden")
	public static PTD creerClone(PTD pointSource)
	{
		//préciser le corps	
	}
	
	//méthode d'instance pour afficher les coordonnées d'un point  
	//(préciser si elle est surchargée ou redéfinie) 
	//et qui appelle la méthode d'origine
	public void afficher()
	{
		//préciser le corps
	}
}
	
	
	
	
	
	
