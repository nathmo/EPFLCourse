#include <iostream>
#include <iomanip> // pour setprecision()
using namespace std;

int main()
{
  // Réduire le format d'affichage
  cout << setprecision(4);

  // Paramètres
  double taux_croissance_lapins(0.3);
  double taux_attaque(0.01);
  double taux_croissance_renards(0.008);
  double taux_mortalite(0.1);
  int duree(50);

  double renards_i(0.0);
  double lapins_i(0.0);
  
  /*****************************************************
   * Compléter le code à partir d'ici
   *****************************************************/

  // ===== PARTIE 1 =====
  // Saisie des populations initiales
  bool simulate(true);
  double lamda(0.01);
  do {
    cout << "Combien de renards au départ (>= 2) ? ";
    cin >> renards_i;
  } while (renards_i < 2);

  do {
  cout << "Combien de lapins au départ  (>= 5) ? ";
    cin >> lapins_i;
  } while (lapins_i < 5);
  double renards_i_backup(renards_i);
  double lapins_i_backup(lapins_i);
  // ===== PARTIE 2 =====
  // Première simulation
  cout <<  endl << "***** Le taux d'attaque vaut "<< taux_attaque * 100 << "%" <<  endl;
  int mois(duree);
  while (simulate)
  {
	--mois;
	if((mois <= 0))  
	{
		simulate = false;
	}
	double lapinOld(lapins_i);
	double renardOld(renards_i);
	lapins_i = lapinOld*(1.0 + taux_croissance_lapins - taux_attaque * renardOld );
	renards_i = renardOld*(1.0 + taux_attaque * lapinOld * taux_croissance_renards - taux_mortalite);
	if(lapins_i < 0)
	{
		lapins_i = 0.01;
		lapins_i = 0;
	}
	if(renards_i < 0)
	{
		renards_i = 0.01;
		renards_i = 0;
	}
	cout << "Après "<< duree - mois <<" mois, il y a "<<lapins_i << " lapins et "<<renards_i <<" renards"<<endl;
  }

  // ===== PARTIE 3 =====
  // Variation du taux d'attaque
  cout << endl;
  float taux_attaque_depart(0);
    do {
    cout << "taux d'attaque au départ en % (entre 0.5 et 6) ? ";
    cin >> taux_attaque_depart;
  } while ((taux_attaque_depart < 0.5)|| (taux_attaque_depart >= 6));
  float taux_attaque_fin(0);
  do {
  cout << "taux d'attaque à la fin  en % (entre "<< taux_attaque_depart << " et 6) ? ";
    cin >> taux_attaque_fin;
  } while ((taux_attaque_fin <= taux_attaque_depart)|| (taux_attaque_fin > 6));

	  
  for(int i(taux_attaque_depart);i<taux_attaque_fin;i++)
  {
	  taux_attaque = i/100.0;
	  cout <<  endl << "***** Le taux d'attaque vaut "<< taux_attaque * 100 << "%" <<  endl;
	  mois = duree;
	  lapins_i = lapins_i_backup;
	  renards_i = renards_i_backup;
	  bool renard_near_extinct(false);
	  bool lapin_near_extinct(false);
	  bool renard_extinct(false);
	  bool lapin_extinct(false);
	  simulate = true;
	  while (simulate)
	  {
		--mois;
		if((mois <= 0) ||((renards_i < lamda) && (lapins_i < lamda)))
		{
			simulate = false;
		}
		double lapinOld(lapins_i);
		double renardOld(renards_i);
		lapins_i = lapinOld*(1.0 + taux_croissance_lapins - taux_attaque * renardOld );
		renards_i = renardOld*(1.0 + taux_attaque * lapinOld * taux_croissance_renards - taux_mortalite);
		if(lapins_i < 2)
		{
			lapins_i = 0;
			lapin_extinct = true;
			lapin_near_extinct = true;
		}
		else if(lapins_i < 5)
		{
			lapin_near_extinct = true;
		}
		if(renards_i < 2)
		{
			renards_i = 0;
			renard_extinct = true;
			renard_near_extinct = true;
		}
		else if(renards_i < 5)
		{
			renard_near_extinct = true;
		}
	  }
	  if (mois == 0)
	  {
	    cout << "Après "<< duree - mois<<" mois, il y a "<<lapins_i << " lapins et "<<renards_i <<" renards"<<endl;
	  }
	  else
	  {
		  cout << "Après "<< duree - (mois+1)<<" mois, il y a "<<lapins_i << " lapins et "<<renards_i <<" renards"<<endl;
	  }
	  if ((not renard_near_extinct) && (not lapin_near_extinct))
	  {
		cout << "Les lapins et les renards ont des populations stables." << endl;
	  }
	  if (renard_near_extinct)
	  {
		  cout << "Les renards ont été en voie d'extinction" << endl;
		  if (renard_extinct)
		  {
			  cout << "et les renards ont disparu :-(" << endl;
		  }
		  else
		  {
			  cout << "mais la population est remontée ! Ouf !" << endl;
		  }
	  }
	  if (lapin_near_extinct)
	  {
		  cout << "Les lapins ont été en voie d'extinction" << endl;
		  if (lapin_extinct)
		  {
			  cout << "et les lapins ont disparu :-(" << endl;
		  }
		  else
		  {
			  cout << "mais la population est remontée ! Ouf !" << endl;
		  }
	  }
	}
	f();
	f(0.3);
  /*******************************************
   * Ne rien modifier après cette ligne.
   *******************************************/

  return 0;
}
