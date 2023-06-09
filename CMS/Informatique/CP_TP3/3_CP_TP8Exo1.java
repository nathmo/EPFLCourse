package cms_tp8;

public class CP_TP8Exo1_BV 
{
	//la méthode ci-dessous est déjà complétement écrite
	public static TripletInt agrandir(TripletInt original)
	{		
		TripletInt leGrand = new TripletInt();
		leGrand.premier = original.premier*2;
		leGrand.deuxieme = original.deuxieme*2;
		leGrand.troisieme = original.troisieme*2;
		return leGrand;
			
		//return new TripletInt(original.premier*2, original.deuxieme*2, original.troisieme*2);
	}

	//définissez une variante surchargée de la méthode agrandir
	//qui a comme seul argument un tableau d'entiers nommé original
	//et qui retourne comme résultat un tableau d'entiers

	
	public static void main(String[] args) 
	{
		TripletInt ti1 = new TripletInt();
		//créez un nouveau tableau de 3 entiers et stockez son adresse
		//dans une variable locale créée à cet effet et nommée tab1 

		
		ti1.premier = 11;
		//stockez la valeur entière 11 dans le premier élément du tableau tab1

		
		ti1.deuxieme = 22;
		//stockez la valeur entière 22 dans le deuxième élément du tableau tab1

		
		ti1.troisieme = 33;
		//stockez la valeur enitière 33 dans le troisième élément du tableau tab1

		
		System.out.println("Le triplet ti1 a les champs : " +
					ti1.premier + " " + ti1.deuxieme + " " + ti1.troisieme + ".");
		//en prenant comme exemple l'instruction ci-dessus,
		//affichez les 3 éléments du tableau tab1
		
		
		TripletInt ti2 = new TripletInt(111, 222, 333);
		//en utilisant la syntaxe complète, créez un nouveau tableau de 3 entiers
		//avec les valeurs initiales de ses éléments 111, 222 et 333, et stockez
		//son adresse dans une variable locale créée à cet effet et nommée tab2

		
		//en utilisant la syntaxe raccourcie, créez un nouveau tableau de 3 entiers
		//avec les valeurs initiales de ses éléments 111, 222 et 333, et stockez
		//son adresse dans une variable locale créée à cet effet et nommée tab3

		
		System.out.println("Le triplet ti2 a les champs : " +
				ti2.premier + " " + ti2.deuxieme + " " + ti2.troisieme + ".");
		//en prenant comme exemple l'instruction ci-dessus,
		//affichez les 3 éléments du tableau tab2

		
		TripletInt tiBig = agrandir(ti2);
		//appeler la méthode statique agrandir pour le tableau de référence tab2
		//et stockez le résultat retourné dans une nouvelle variable locale 
		//prévue à cet effet et nommée tabBig

		
		System.out.println("Le triplet tiBig a les champs : " +
				tiBig.premier + " " + tiBig.deuxieme + " " + tiBig.troisieme + ".");
		//en prenant comme exemple l'instruction ci-dessus,
		//affichez les 3 éléments du tableau tabBig		

		
	}//fin de la méthode main	
}//fin de la classe principale
