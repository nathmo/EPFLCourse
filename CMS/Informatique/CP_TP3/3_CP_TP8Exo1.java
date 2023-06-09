package cms_tp8;

public class CP_TP8Exo1_BV 
{
	//la m�thode ci-dessous est d�j� compl�tement �crite
	public static TripletInt agrandir(TripletInt original)
	{		
		TripletInt leGrand = new TripletInt();
		leGrand.premier = original.premier*2;
		leGrand.deuxieme = original.deuxieme*2;
		leGrand.troisieme = original.troisieme*2;
		return leGrand;
			
		//return new TripletInt(original.premier*2, original.deuxieme*2, original.troisieme*2);
	}

	//d�finissez une variante surcharg�e de la m�thode agrandir
	//qui a comme seul argument un tableau d'entiers nomm� original
	//et qui retourne comme r�sultat un tableau d'entiers

	
	public static void main(String[] args) 
	{
		TripletInt ti1 = new TripletInt();
		//cr�ez un nouveau tableau de 3 entiers et stockez son adresse
		//dans une variable locale cr��e � cet effet et nomm�e tab1 

		
		ti1.premier = 11;
		//stockez la valeur enti�re 11 dans le premier �l�ment du tableau tab1

		
		ti1.deuxieme = 22;
		//stockez la valeur enti�re 22 dans le deuxi�me �l�ment du tableau tab1

		
		ti1.troisieme = 33;
		//stockez la valeur eniti�re 33 dans le troisi�me �l�ment du tableau tab1

		
		System.out.println("Le triplet ti1 a les champs : " +
					ti1.premier + " " + ti1.deuxieme + " " + ti1.troisieme + ".");
		//en prenant comme exemple l'instruction ci-dessus,
		//affichez les 3 �l�ments du tableau tab1
		
		
		TripletInt ti2 = new TripletInt(111, 222, 333);
		//en utilisant la syntaxe compl�te, cr�ez un nouveau tableau de 3 entiers
		//avec les valeurs initiales de ses �l�ments 111, 222 et 333, et stockez
		//son adresse dans une variable locale cr��e � cet effet et nomm�e tab2

		
		//en utilisant la syntaxe raccourcie, cr�ez un nouveau tableau de 3 entiers
		//avec les valeurs initiales de ses �l�ments 111, 222 et 333, et stockez
		//son adresse dans une variable locale cr��e � cet effet et nomm�e tab3

		
		System.out.println("Le triplet ti2 a les champs : " +
				ti2.premier + " " + ti2.deuxieme + " " + ti2.troisieme + ".");
		//en prenant comme exemple l'instruction ci-dessus,
		//affichez les 3 �l�ments du tableau tab2

		
		TripletInt tiBig = agrandir(ti2);
		//appeler la m�thode statique agrandir pour le tableau de r�f�rence tab2
		//et stockez le r�sultat retourn� dans une nouvelle variable locale 
		//pr�vue � cet effet et nomm�e tabBig

		
		System.out.println("Le triplet tiBig a les champs : " +
				tiBig.premier + " " + tiBig.deuxieme + " " + tiBig.troisieme + ".");
		//en prenant comme exemple l'instruction ci-dessus,
		//affichez les 3 �l�ments du tableau tabBig		

		
	}//fin de la m�thode main	
}//fin de la classe principale
