package cms_tp5;

//une classe pour instancier et manipuler des objets 
//de type PMD_Public qui ont des champs publics
public class PMD_Public
{
	//les champs de la classe sont publics 
	//ils peuvent �tre lus ou modifi�s � l'aide de l'op�rateur "."
	public char nomPoint;
	public double posX;
	
	//m�thode publique qui affiche les informations sur chaque point
	public void afficher()
	{
		System.out.println("Mon nom est : " + nomPoint + ".");
		System.out.println("Mon abscisse est : " + posX + ".");
	}	
}