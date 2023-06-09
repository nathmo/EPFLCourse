package cms;

public class DichotomieFigee {
	//une bien précise fonction continue dont on cherche les zéros 
	static double f(double x){
		return x-Math.cos(x);		
	}//fin de la méthode f	
	
	//méthode de calcul d'un zéro d'une fonction non linéaire continue
	static double bissection(double a0, double b0, double tol){
		if(f(a0)*f(b0) >= 0)		//intervalle de départ non valide
			return Double.NaN;
		
		double a = a0, b = b0, x = (a0+b0)/2;	
		
		//while(a<x && x<b)		//on calcule jusqu'à la précision de la machine
		while(Math.abs(b-a)/2 > tol){		
			if(f(x) == 0)
				return x; //on retourne la valeur "exacte" du zéro

			if(f(a)*f(x) < 0)
				b = x;
			else
				a = x;
			x = (a+b)/2;
		}
		return x; //on retourne la valeur approchée du zéro
	}//fin de la méthode bissection
}//fin de la classe DichotomieFigee
