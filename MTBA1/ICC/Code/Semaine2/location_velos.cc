#include <iostream>
using namespace std;

int main()
{
  cout << "Donnez l'heure de début de la location (un entier) : ";
  int debut;
  cin >> debut;

  cout << "Donnez l'heure de fin de la location (un entier) : ";
  int fin;
  cin >> fin;

  /*****************************************************
   * Compléter le code à partir d'ici
   *****************************************************/
	// 1CHF / heure entre 17h-07h
	// 2CHF / heure entre 07-17h
	//vérifier que les heures soient les deux entre 0 et 24
	if ((not((debut >= 0) and (debut <=24))) or (not((fin >= 0) and (fin <=24))))
	{
		cout << "Les heures doivent être comprises entre 0 et 24 !" << endl;
		return 0;
	}
	// vérifier que le velo ne soit pas rendu avant d'etre loué
	if(debut>fin)
	{
		cout << "Bizarre, le début de la location est après la fin ..." << endl;
		return 0;
	}
	// vérifier que le velo n'ai pas été rendu au meme moment qu'il a été loué
	if(debut == fin)
	{
		cout << "Bizarre, vous n'avez pas loué votre vélo bien longtemps !" << endl;
		return 0;
	}
	// coupé les heures sur les horaire jour / nuit
	// N1 N1 OK
	// N1 J  OK
	// N1 N2 OK
	
	// J  J  OK
	// J  N2 OK
	// J  N1 Illegal
	
	// N2 N2 OK
	// N2 N1 Illegal
	// N2 J  Illegal
	int DeltaN(0);
	int DeltaJ(0);
	cout << "Vous avez loué votre vélo pendant" << endl;
	// N1 N1
	if((debut<7)and(fin <=7))
	{
		DeltaN = fin-debut;
		cout << DeltaN<<" heure(s) au tarif horaire de 1 franc(s)" << endl;
		cout << "Le montant total à payer est de "<< (DeltaN) << " franc(s)." << endl;
	
	}
	// J J
	if((debut>=7 and debut<17)and(fin>7 and fin<=17))
	{
		DeltaJ = fin-debut;
		cout << DeltaJ<<" heure(s) au tarif horaire de 2 franc(s)" << endl;
		cout << "Le montant total à payer est de "<< (2*DeltaJ) << " franc(s)." << endl;
	
	}
	// N2 N2
	if((debut>=17)and(fin>17))
	{
		DeltaN = fin-debut;
		cout << DeltaN<<" heure(s) au tarif horaire de 1 franc(s)" << endl;
        cout << "Le montant total à payer est de "<< (DeltaN) << " franc(s)." << endl;
	
	}
	// N1 J
	if((debut<7)and(fin>7 and fin<=17))
	{
		DeltaN=7-debut;
		DeltaJ=fin-7;
		cout << DeltaN<<" heure(s) au tarif horaire de 1 franc(s)" << endl;
		cout << DeltaJ<<" heure(s) au tarif horaire de 2 franc(s)" << endl;
		cout << "Le montant total à payer est de "<< (DeltaN+2*DeltaJ) << " franc(s)." << endl;
	
	}
	// J  N2
	if((debut>=7 and debut<17)and(fin>17))
	{
		DeltaJ=17-debut;
		DeltaN=fin-17;
		cout << DeltaN<<" heure(s) au tarif horaire de 1 franc(s)" << endl;
		cout << DeltaJ<<" heure(s) au tarif horaire de 2 franc(s)" << endl;
		cout << "Le montant total à payer est de "<< (DeltaN+2*DeltaJ) << " franc(s)." << endl;
	}
	// N1 N2
	if((debut<7)and(fin>17))
	{
		DeltaJ=10;
		DeltaN=(7-debut)+(fin-17);
		cout << DeltaN<<" heure(s) au tarif horaire de 1 franc(s)" << endl;
		cout << DeltaJ<<" heure(s) au tarif horaire de 2 franc(s)" << endl;
		cout << "Le montant total à payer est de "<< (DeltaN+2*DeltaJ) << " franc(s)." << endl;
	}


  /*******************************************
   * Ne rien modifier après cette ligne.
   *******************************************/

  return 0;
}
