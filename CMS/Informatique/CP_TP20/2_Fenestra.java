// d�claration du package


// les imports




// l'en-t�te de la classe publique Fenestra qui correspond � un container de premier
// niveau et qui �coute les 4 boutons plac�s dans son contentPane

{	
	// d�claration d'un champ priv� de type tableau de boutons swing, nomm� boutons et
	// initialis� avec l'adresse d'un nouveau tableau de quatre �l�ments cr�� pour l'occasion

	
	// d�claration d'un champ priv� de type tableau de couleurs, nomm� couleurs et initialis� 
	// avec l'adresse d'un nouveau tableau de quatre �l�ments cr�� pour l'occasion et qui a  
	// lui-m�me comme �l�ments initiaux les couleurs rose, jaune, cyan et verte

	
	// d�claration d'un champ priv� de type texte, nomm� textes et initialis� avec l'adresse 
	// d'un nouveau tableau de quatre �l�ments cr�� pour l'occasion et qui a lui-m�me comme  
	// �l�ments initiaux les textes ROSE, JAUNE, CYAN et VERTE		

		
	// l'en-t�te du constructeur public sans argument

	{
		// instruction qui impose l'arr�t de la machine virtuelle suite � la fermeture du 
		// container de premier niveau (appel� par la suite tout simplement fen�tre)

		
		// instruction qui donne le titre Couleurs � la fen�tre

		
		// instruction qui fixe la taille de la fen�tre � 225 pixels x 400 pixels

		
		// instruction qui rend la fen�tre non redimensionnable

		
		// instruction qui associe � la fen�tre un nouveau gestionnaire de mise en forme
		// cr�� pour l'occasion et correspondant � une grille avec quatre lignes et 
		// une seule colonne

		
		// l'en-t�te d'une boucle appropri�e

		{	
			// cr�ation d'un bouton swing dont l'adresse est stock�e dans le 
			// "bon" �l�ment du tableau boutons

			
			// instruction qui associe � chaque bouton la couleur correspondant 
			// � l'�l�ment de m�me indice du tableau couleurs

			
			// instruction qui associe  � chaque bouton le texte correspondant 
			// � l'�l�ment de m�me indice du tableau textes

			
			// instruction qui met chaque bouton sous l'�coute de la fen�tre

			
			// instruction qui ajoute chaque bouton � la fen�tre 

		}//fin de la boucle
		
		//instruction qui rend la fen�tre visible

	}//fin du constructeur
	
	// la m�thode getIndice doit permettre de savoir si l'adresse d'un certain 
	// bouton indiqu� comme argument de la m�thode se trouve parmi les �l�ments 
	// du tableau boutons et, si c'est le cas, quel est l'indice qui lui correspond
	
	// l'en-t�te de la m�thode priv�e getIndice qui a un seul argument de type 
	// bouton swing nomm� jbt et retourne un r�sultat de type num�rique entier 

	{	
		// l'en-t�te d'une boucle appropri�e

		{	
			//test si l'adresse jbt correspond � un des �l�ments du tableau boutons

			{	
				// instruction qui retourne l'indice de cet �l�ment

			}//fin du test
		}
		
		// instruction qui retourne la valeur "sp�ciale" -1

	}//fin de la m�thode getPosition
	
	
	@Override
	// l'en-t�te du gestionnaire d'�v�nements appropri� qui doit rendre les quatre
	// boutons sensibles aux clics de la souris

	{		
		// test si la source de l'�v�nement trait� par le gestionnaire est un objet dont 
		// le type n'est pas celui d'un bouton swing (ou compatible par polymorphisme)

		{	
			//instruction pour quitter imm�diatement le gestionnaire
			
		}//fin du test
		
		// instructions qui permettent de quitter imm�diatement le gestionnaire 
		// si l'adresse de la source de l'�v�nement trait� par le gestionnaire 
		// ne se retrouve pas parmi les �l�ments du tableau boutons  


		



		
		// instructions qui permettent au bouton source de l'�v�nement trait� d'�changer la 
		// couleur et le texte associ� avec le "bon" bouton parmi les trois autres boutons 

		




		




	}//fin du gestionnaire d'�v�nements
}//fin de la classe graphique
