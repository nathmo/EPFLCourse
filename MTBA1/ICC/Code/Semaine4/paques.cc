#include <iostream>
using namespace std;

int demander_annee()
{
	int annee(0);
	do {
		cout << "Entrez une annee (1583-4000) : ";
		cin >> annee;
	  } while ((annee < 1583)|| (annee > 4000));
	return annee;
}
void affiche_date(int annes, int nb_jours)
{
	if((nb_jours > 21) && (nb_jours < 57))
	{
		if(nb_jours > 31)
		{
			nb_jours = nb_jours - 31;
			cout << "Date de Paques en "<< annes<< " : "<<nb_jours<<" avril";
		}
		else
		{
			nb_jours = nb_jours;
			cout << "Date de Paques en "<< annes<< " : "<<nb_jours<<" mars";
		}
	}
}
int date_Paques(int annee)
{
	if ((annee > 1582) && (annee < 4001))
	{
		int siecle(annee/100);
		int p(((13+8*siecle)/25));
		int q(siecle/4);
		int M((15-p+siecle-q)%30);
		int N((4+siecle-(q%7)));
		int d(((M+19*(annee%19))%30));
		int e(((2 * (annee % 4) + 4 * (annee % 7) + 6 * d + N) % 7));
		int jour(e+d+22);
		if(((e==6) and ((d==29) || ((d==28)&& (((11*(M+1))%30))<19))))
		{
			jour = jour -7;
		}
		if((jour > 21) && (jour < 57))
		{
			return jour;
		}
	}
	return 0;
}
int main()
{
	int annee = demander_annee();
	affiche_date(annee, date_Paques(annee));
	return 0;
}
