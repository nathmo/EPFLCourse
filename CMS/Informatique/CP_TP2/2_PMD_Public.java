package cms_tp5;

//une classe pour instancier et manipuler des objets 
//de type PMD_Public qui ont des champs publics
public class PMD_Public
{
	//les champs de la classe sont publics 
	//ils peuvent être lus ou modifiés à l'aide de l'opérateur "."
	public char nomPoint;
	public double posX;
	
	//méthode publique qui affiche les informations sur chaque point
	public void afficher()
	{
		System.out.println("Mon nom est : " + nomPoint + ".");
		System.out.println("Mon abscisse est : " + posX + ".");
	}	
}