#include <iostream>
using namespace std;
/*
Les 6 champignons possibles sont :
— l’agaric jaunissant ;
— l’amanite tue-mouches ;
— le cèpe de Bordeaux ;
— le coprin chevelu ;
— la girolle ;
— et le pied bleu.

|champis | tubulaire=0 | Foret=1 Pré=0 | Chapo convex = 1 | anneaux = 1|
|--------|-------------|---------------|------------------|------------|
|AJ      |1            |0              |1                 |1           |
|ATM     |1            |1              |1                 |1           |
|CB      |0            |1              |0                 |0           |
|CC      |1            |0              |0                 |1           |
|G       |1            |1              |0                 |0           |
|PB      |1            |1              |1                 |0           |

Seul le cèpe de Bordeaux possède des tubes, les autres champignons ayant des
lamelles.

Le coprin chevelu et l’agaric jaunissant poussent dans les prés, les autres dans la
forêt.
* 
Les seuls à avoir un chapeau convexe sont l’agaric jaunissant, l’amanite tue-
mouches et le pied bleu.
* 
Enfin, les seuls à avoir un anneau sont l’agaric jaunissant, l’amanite tue-mouches
et le coprin chevel
* Foret -> Convex
* 0 0 -> CC
* 0 1 -> AJ
* 1 0 -> CB/G -> Tubulaire
* 1 1 -> PB/ATM -> Anneaux
* 
* 
*/
int main()
{ 
  int lamelle(0);
  int anneau(0);
  cout << "Pensez à  un champignon : amanite tue-mouches, pied bleu, girolle," << endl
       << "cèpe de Bordeaux, coprin chevelu ou agaric jaunissant." << endl << endl;

  cout << "Est-ce que votre champignon vit en forêt (1 : oui, 0 : non) ? ";
  int foret;
  cin >> foret;
  cout << "Est-ce que votre champignon a un chapeau convexe (1 : oui, 0 : non) ? ";
  int convex;
  cin >> convex;
  if (not foret and not convex)
  {
	  cout << "==> Le champignon auquel vous pensez est ";
	  cout << "le coprin chevelu" << "." <<endl;
  }
  if (not foret and convex)
  {
	  cout << "==> Le champignon auquel vous pensez est ";
	  cout << "l'agaric jaunissant"<< "." <<endl;
  }
  if (foret and not convex)
  {
	cout << "Est-ce que votre champignon a des lamelles (1 : oui, 0 : non) ? ";
	cin >> lamelle;
  }
  if (foret and convex)
  {
	cout << "Est-ce que votre champignon a un anneau (1 : oui, 0 : non) ? ";
	cin >> anneau;
  }
  if ((foret and not convex) and lamelle)
  {
	  cout << "==> Le champignon auquel vous pensez est ";
	  cout << "la girolle" << "." <<endl;
  }
  if ((foret and not convex) and not lamelle)
  {
	  cout << "==> Le champignon auquel vous pensez est ";
	    cout << "le cèpe de Bordeaux" << "." <<endl;
  }
  if ((foret and convex) and anneau)
  {
	  cout << "==> Le champignon auquel vous pensez est ";
	    cout << "l'amanite tue-mouches" << "." <<endl;
  }
  if ((foret and convex) and not anneau)
  {
	  cout << "==> Le champignon auquel vous pensez est ";
	      cout << "le pied bleu" << "." <<endl;
  }
  return 0;
}
