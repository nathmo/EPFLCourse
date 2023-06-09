package cms;

public class DichotomieFigee {
	//une bien pr�cise fonction continue dont on cherche les z�ros 
	static double f(double x){
		return x-Math.cos(x);		
	}//fin de la m�thode f	
	
	//m�thode de calcul d'un z�ro d'une fonction non lin�aire continue
	static double bissection(double a0, double b0, double tol){
		if(f(a0)*f(b0) >= 0)		//intervalle de d�part non valide
			return Double.NaN;
		
		double a = a0, b = b0, x = (a0+b0)/2;	
		
		//while(a<x && x<b)		//on calcule jusqu'� la pr�cision de la machine
		while(Math.abs(b-a)/2 > tol){		
			if(f(x) == 0)
				return x; //on retourne la valeur "exacte" du z�ro

			if(f(a)*f(x) < 0)
				b = x;
			else
				a = x;
			x = (a+b)/2;
		}
		return x; //on retourne la valeur approch�e du z�ro
	}//fin de la m�thode bissection
}//fin de la classe DichotomieFigee
