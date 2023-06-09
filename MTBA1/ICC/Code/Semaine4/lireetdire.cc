#include <iostream>
using namespace std;

int separer_chiffre_gauche(int& nombre)
{
  int dix(1);
  int temp(nombre);
  while (temp >= 10) {
    dix  *= 10;
    temp /= 10;
  }
  nombre %= dix;
  return temp;
}

/*****************************************************
 * Compléter le code à partir d'ici
 *****************************************************/

void ajouter_chiffre_droit(int& nombre, int chiffre)
{
	nombre = (nombre*10 + chiffre);
	return;
}

void dire_chiffre(int& nombre, int repetitions_chiffre, int chiffre)
{
	ajouter_chiffre_droit(nombre, repetitions_chiffre);
	ajouter_chiffre_droit(nombre, chiffre);
	return;
}

int lire_et_dire(int nombre)
{
	int nombreout(0);
	int leadingdigit(-1);
	int leadingdigit_old(separer_chiffre_gauche(nombre));
	int repetition_digit(1);
	bool breaking = false;
	do
	{
		leadingdigit = separer_chiffre_gauche(nombre);
		if (leadingdigit == leadingdigit_old)
		{
			repetition_digit++;
		}
		else
		{
			dire_chiffre(nombreout, repetition_digit, leadingdigit_old);
			repetition_digit = 1;
		}
		leadingdigit_old = leadingdigit;
		if(breaking)
		{
			break;
		}
		if(nombre == 0)
		{
			breaking = true;
		}
	}while(true);
	return nombreout;
}
//1
//11
//21
//1211
//111221
//312211

/*******************************************
 * Ne rien modifier après cette ligne.
 *******************************************/

void repeter_lire_et_dire(int& nombre, int fois)
{
  while (fois-- > 0)
  {
    nombre = lire_et_dire(nombre);
  }
}

int main()
{
  int nombre(1);
  int fois(1);
  cin >> nombre >> fois;
  repeter_lire_et_dire(nombre, fois);
  cout << nombre << endl;
  return 0;
}
