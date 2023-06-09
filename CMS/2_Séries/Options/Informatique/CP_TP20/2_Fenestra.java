// déclaration du package


// les imports




// l'en-tête de la classe publique Fenestra qui correspond à un container de premier
// niveau et qui écoute les 4 boutons placés dans son contentPane

{	
	// déclaration d'un champ privé de type tableau de boutons swing, nommé boutons et
	// initialisé avec l'adresse d'un nouveau tableau de quatre éléments créé pour l'occasion

	
	// déclaration d'un champ privé de type tableau de couleurs, nommé couleurs et initialisé 
	// avec l'adresse d'un nouveau tableau de quatre éléments créé pour l'occasion et qui a  
	// lui-même comme éléments initiaux les couleurs rose, jaune, cyan et verte

	
	// déclaration d'un champ privé de type texte, nommé textes et initialisé avec l'adresse 
	// d'un nouveau tableau de quatre éléments créé pour l'occasion et qui a lui-même comme  
	// éléments initiaux les textes ROSE, JAUNE, CYAN et VERTE		

		
	// l'en-tête du constructeur public sans argument

	{
		// instruction qui impose l'arrêt de la machine virtuelle suite à la fermeture du 
		// container de premier niveau (appelé par la suite tout simplement fenêtre)

		
		// instruction qui donne le titre Couleurs à la fenêtre

		
		// instruction qui fixe la taille de la fenêtre à 225 pixels x 400 pixels

		
		// instruction qui rend la fenêtre non redimensionnable

		
		// instruction qui associe à la fenêtre un nouveau gestionnaire de mise en forme
		// créé pour l'occasion et correspondant à une grille avec quatre lignes et 
		// une seule colonne

		
		// l'en-tête d'une boucle appropriée

		{	
			// création d'un bouton swing dont l'adresse est stockée dans le 
			// "bon" élément du tableau boutons

			
			// instruction qui associe à chaque bouton la couleur correspondant 
			// à l'élément de même indice du tableau couleurs

			
			// instruction qui associe  à chaque bouton le texte correspondant 
			// à l'élément de même indice du tableau textes

			
			// instruction qui met chaque bouton sous l'écoute de la fenêtre

			
			// instruction qui ajoute chaque bouton à la fenêtre 

		}//fin de la boucle
		
		//instruction qui rend la fenêtre visible

	}//fin du constructeur
	
	// la méthode getIndice doit permettre de savoir si l'adresse d'un certain 
	// bouton indiqué comme argument de la méthode se trouve parmi les éléments 
	// du tableau boutons et, si c'est le cas, quel est l'indice qui lui correspond
	
	// l'en-tête de la méthode privée getIndice qui a un seul argument de type 
	// bouton swing nommé jbt et retourne un résultat de type numérique entier 

	{	
		// l'en-tête d'une boucle appropriée

		{	
			//test si l'adresse jbt correspond à un des éléments du tableau boutons

			{	
				// instruction qui retourne l'indice de cet élément

			}//fin du test
		}
		
		// instruction qui retourne la valeur "spéciale" -1

	}//fin de la méthode getPosition
	
	
	@Override
	// l'en-tête du gestionnaire d'événements approprié qui doit rendre les quatre
	// boutons sensibles aux clics de la souris

	{		
		// test si la source de l'événement traité par le gestionnaire est un objet dont 
		// le type n'est pas celui d'un bouton swing (ou compatible par polymorphisme)

		{	
			//instruction pour quitter immédiatement le gestionnaire
			
		}//fin du test
		
		// instructions qui permettent de quitter immédiatement le gestionnaire 
		// si l'adresse de la source de l'événement traité par le gestionnaire 
		// ne se retrouve pas parmi les éléments du tableau boutons  


		



		
		// instructions qui permettent au bouton source de l'événement traité d'échanger la 
		// couleur et le texte associé avec le "bon" bouton parmi les trois autres boutons 

		




		




	}//fin du gestionnaire d'événements
}//fin de la classe graphique
