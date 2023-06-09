/*
	Classe de base qui permet de cr�er des objets correspondant � des  
	points dans le plan (pr�cis�s par leurs coordonn�es cart�siennes)	 
*/
package cms_tp10;

public class PBD	//PointBiDim 
{
	//champs d'instance priv�s
	private double x, y ;
	//champ statique priv�
	private static int nbPoints=0;
	
	//constructeur sans arguments
	//(surcharg� dans la classe de base)
	PBD( )
	{
		this(0.0,0.0);
	}
	
	//constructeur avec deux arguments
	//(surcharg� dans la classe de base)
	PBD(double x, double y)
	{
		this.x=x;
		this.y=y;
		nbPoints++;
	}
	
	//m�thodes d'acc�s aux champs priv�s
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
	
	//m�thode d'instance pour v�rifier l'�galit� de deux points
	//(surcharg�e dans la classe de base)
	public boolean verifierEgalite(PBD deuxiemePoint)
	{
		if(x!=deuxiemePoint.x)
			return false;
		if(y!=deuxiemePoint.y)
			return false;
		return true;		
	}										  
	
	//m�thode statique pour v�rifier l'�galit� de deux points
	//(surcharg�e dans la classe de base) 
	public static boolean verifierEgalite(PBD premierPoint,
										  PBD deuxiemePoint)
	{
		if(premierPoint.x!=deuxiemePoint.x)
			return false;
		if(premierPoint.y!=deuxiemePoint.y)
			return false;
		return true;		
	}	

	//m�thode d'instance qui retourne le clone d'un point
	//(surcharg�e dans la classe de base)
	public PBD creerClone( )
	{
		return new PBD(x,y);
	}	
	
	//m�thode statique qui retourne le clone d'un point
	//(surcharg�e dans la classe de base)
	public static PBD creerClone(PBD pointSource)
	{
		return new PBD(pointSource.x,pointSource.y);
	}
	
	//m�thode d'instance pour afficher les coordonn�es d'un point
	public void afficher( )
	{
		System.out.print(x +", " + y);
	}
}
	
	
	
	
	
	