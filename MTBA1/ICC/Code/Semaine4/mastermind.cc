#include <iostream>
#include <ctime>

// pour les nombres aléatoires
#include <random>
#include <cstring> // strlen

using namespace std;

// ======================================================================
// Couleur au hasard
std::uniform_int_distribution<int> distribution;
std::default_random_engine generateur(time(NULL)); /* NOT using std::random_device since not
                                                    * all compilers seems to support it :-( */

char tirer_couleur()
{
  static const char* const couleurs = ".RGBCYM";
  static const int nb = strlen(couleurs) - 1;

  return couleurs[distribution(generateur,
                               std::uniform_int_distribution<int>::param_type {0, nb})];
}

// ======================================================================
char poser_question()
{
  char lu(' ');
  cout << "Entrez une couleur : ";
  cin >> lu;
  return lu;
}

// ---- prototype -------------------------------------------------------
bool couleur_valide(char c);

// ======================================================================
char lire_couleur()
{
  char lu(poser_question());
  while (not couleur_valide(lu)) {
    cout << "'" << lu << "' n'est pas une couleur valide." << endl;
    cout << "Les couleurs possibles sont : ., R, G, B, C, Y ou M." << endl;
    lu = poser_question();
  }
  return lu;
}

// ======================================================================
void afficher_couleurs(char c1, char c2, char c3, char c4)
{
  cout << ' ' << c1 << ' ' << c2 << ' ' << c3 << ' ' << c4;
}

// ======================================================================
void afficher(int nb, char c)
{
  while (nb-- > 0) {
    cout << c;
  }
}

// ---- prototype -------------------------------------------------------
void afficher_reponses(char c1, char c2, char c3, char c4,
                       char r1, char r2, char r3, char r4);

// ======================================================================
void afficher_coup(char c1, char c2, char c3, char c4,
                   char r1, char r2, char r3, char r4)
{
  afficher_couleurs(c1, c2, c3, c4);
  cout << " : ";
  afficher_reponses(c1, c2, c3, c4,
                    r1, r2, r3, r4);
  cout << endl;
}

// ======================================================================
void message_gagne(int nb_coups)
{
  cout << "Bravo ! Vous avez trouvé en " << nb_coups << " coups." << endl;
}

// ======================================================================
void message_perdu(char c1, char c2, char c3, char c4)
{
  cout << "Perdu :-(" << endl;
  cout << "La bonne combinaison était : ";
  afficher_couleurs(c1, c2, c3, c4);
  cout << endl;
}

/*****************************************************
 * Compléter le code à partir d'ici
 *****************************************************/

// ======================================================================
bool couleur_valide(char c)
{
	if(c=='.' || c=='R' || c=='G' || c=='B' || c=='C' || c=='Y' || c=='M')
	{
		return true;
	}
	else
	{
		return false;
	}
}

// ======================================================================
bool verifier(char c1,char& c2,int& score)
{
	if(c1==c2)
	{
		c2 = '-';
		++score;
		return true;
	}
	else
	{
		return false;
	}
}

// ======================================================================
void apparier(char colorcheck, char& c1, char& c2, char& c3, int& score)
{
	if(verifier(colorcheck, c1, score))
	{
		
	}
	else if(verifier(colorcheck, c2, score))
	{

	}
	else if(verifier(colorcheck, c3, score))
	{

	}
}

// ======================================================================
void afficher_reponses(char c1, char c2, char c3, char c4,char r1, char r2, char r3, char r4)
{
	int hit(0);
	int bullseye(0);
	if(verifier(c1, r1, hit))
	{
		afficher(1, '#');
	}
	if(verifier(c2, r2, hit))
	{
		afficher(1, '#');
	}
	if(verifier(c3, r3, hit))
	{
		afficher(1, '#');
	}
	if(verifier(c4, r4, hit))
	{
		afficher(1, '#');
	}
	bullseye = hit;
	apparier(c1, r2, r3, r4, hit);
	apparier(c2, r1, r3, r4, hit);
	apparier(c3, r1, r2, r4, hit);
	apparier(c4, r1, r2, r3, hit);
	afficher(hit-bullseye, '+');


	if(hit > 4)
	{
		hit = 4;
	}
	afficher(4-hit, '-');
}

// ======================================================================
bool gagne(char c1, char c2, char c3, char c4, char r1, char r2, char r3, char r4)
{
	int useless(0);
	if(verifier(c1, r1, useless) && verifier(c2, r2, useless) && verifier(c3, r3, useless) && verifier(c4, r4, useless))
	{
		return true;
	}
	else
	{
		return false;
	}
}

// ======================================================================
void jouer(int coups = 8)
{
	int score(coups);
	
	char r1 = tirer_couleur();
	char r2 = tirer_couleur();
	char r3 = tirer_couleur();
	char r4 = tirer_couleur();

	do
	{
		--coups;
		
		char c1 = lire_couleur();
		char c2 = lire_couleur();
		char c3 = lire_couleur();
		char c4 = lire_couleur();
		afficher_coup(c1, c2, c3, c4, r1, r2, r3, r4);
		if(gagne(c1, c2, c3, c4, r1, r2, r3, r4)) // si plus de coup on arrete
		{
			message_gagne(score-coups);
			return;
		}
	}while(coups>0);
	message_perdu(r1, r2, r3, r4);
}

/*******************************************
 * Ne rien modifier après cette ligne.
 *******************************************/

int main()
{
  jouer();
  return 0;
}
