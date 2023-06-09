/*
	Classe de base qui permet de créer des objets correspondant à des  
	points dans le plan (précisés par leurs coordonnées cartésiennes)	 
*/
package cms_tp10;

public class PBD	//PointBiDim 
{
	//champs d'instance privés
	private double x, y ;
	//champ statique privé
	private static int nbPoints=0;
	
	//constructeur sans arguments
	//(surchargé dans la classe de base)
	PBD( )
	{
		this(0.0,0.0);
	}
	
	//constructeur avec deux arguments
	//(surchargé dans la classe de base)
	PBD(double x, double y)
	{
		this.x=x;
		this.y=y;
		nbPoints++;
	}
	
	//méthodes d'accès aux champs privés
	public void setX(double x)
	{
		this.x=x;
	}
	
	public void setY(double y)
	{
		this.y=y;
	}
	
	public double getX( )
	{
		return x;
	}
	
	public double getY( )
	{
		return y;
	}
	
	public static int getNbPoints( )
	{
		return nbPoints;
	}
	
	//méthode d'instance pour vérifier l'égalité de deux points
	//(surchargée dans la classe de base)
	public boolean verifierEgalite(PBD deuxiemePoint)
	{
		if(x!=deuxiemePoint.x)
			return false;
		if(y!=deuxiemePoint.y)
			return false;
		return true;		
	}										  
	
	//méthode statique pour vérifier l'égalité de deux points
	//(surchargée dans la classe de base) 
	public static boolean verifierEgalite(PBD premierPoint,
										  PBD deuxiemePoint)
	{
		if(premierPoint.x!=deuxiemePoint.x)
			return false;
		if(premierPoint.y!=deuxiemePoint.y)
			return false;
		return true;		
	}	

	//méthode d'instance qui retourne le clone d'un point
	//(surchargée dans la classe de base)
	public PBD creerClone( )
	{
		return new PBD(x,y);
	}	
	
	//méthode statique qui retourne le clone d'un point
	//(surchargée dans la classe de base)
	public static PBD creerClone(PBD pointSource)
	{
		return new PBD(pointSource.x,pointSource.y);
	}
	
	//méthode d'instance pour afficher les coordonnées d'un point
	public void afficher( )
	{
		System.out.print(x +", " + y);
	}
}
	
	
	
	
	
	