package cms_tp5;

//une classe pour instancier et manipuler des objets 
//de type PMD_Private qui ont des champs privés 
public class PMD_Private
{
	//les champs de la classe sont privés
	//ils peuvent être modifiés ou lus à l'aide des méthodes publiques 
	private char nomPoint = 'Z';
	private double posX = 0;
	
	//méthode publique qui permet la modification du champ privé "nomPoint"
	public void setNomPoint(char nouveauNom)
	{
		nomPoint = nouveauNom;
	}
	
	//méthode publique qui permet la lecture du champ privé "nomPoint"
	public char getNomPoint()
	{
		return nomPoint;
	}	
	
	//méthode publique qui permet la modification du champ privé "posX"
	public void setPosX(double nouvellePosition)
	{
		posX = nouvellePosition;
	}
	
	//méthode publique qui permet la lecture du champ privé "posX"
	public double getPosX()
	{
		return posX;
	}
	
	//méthode publique qui affiche les informations sur chaque point
	public void afficher()
	{
		System.out.println("Mon nom est : " + nomPoint + ".");
		System.out.println("Mon abscisse est : " + posX + ".");
	}
}





