//d�claration du package cms_tp5


//import de la classe correspondant au calendrier gr�gorien


//en-t�te de la classe publique Personne qui permet de cr�er et de manipuler des 
//objets (instances) correspondant � des personnes caract�ris�es par leur nom complet
//(nom de famille et pr�nom(s)) et leur ann�e de naissance 

{
	//champ (sans modificateur d'acc�s) de type cha�ne de caract�res nomm� nomComplet 
	//et qui stocke le nom et le pr�nom complet de la personne correspondante � un
	//objet de type Personne
	
	//champ priv� de type num�rique entier nomm� anNaissance et qui stocke l'ann�e 
	//de naissance de la personne correspondante � un objet de type Personne
	
	//champ priv� de type num�rique entier nomm� anCourant et qui stocke le nombre 
	//correspondant � l'ann�e en cours (au moment de l'ex�cution du programme)
	
	
	//m�thode "setter" publique permettant de modifier la valeur du champ anNaissance
	//Attention : seulement une valeur qui donne un �ge entre 0 et 120 ans est consid�r�e
	//comme un argument valide pour la m�thode

	
	//m�thode "getter" publique permettant de "lire" la valeur du champ anNaissance
	//Attention : aucune v�rification sp�ciale n'est exig�e par cette m�thode

	
	//constructeur public avec 2 arguments

	
	//m�thode publique sans argument nomm�e calculerAge et qui calcule et retourne  
	//l'�ge de la personne correspondante � l'objet appelant

	
	//m�thode publique sans argument nomm� afficher et qui ne retourne pas de r�sultat
	//mais affiche dans la fen�tre console le type de l'objet appelant ainsi que le nom
	//complet et l'�ge de la personne correspondante � l'objet appelant

}//fin de la classe Personne

