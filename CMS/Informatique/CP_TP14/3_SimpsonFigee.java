package cms;

public class SimpsonFigee {
	//une bien précise fonction continue (donc intégrable) 
	static double f(double x){
		return Math.sin(x) + Math.cos(3*x) + 2.5;		
	}//fin de la méthode f	
	
	//méthode de calcul de l'intégrale définie d'une fonction continue
	static double simpson(double a, double b, double tolRel)
	{	int n = 1;	//le nombre initial de sous-intervalles
		double xg, xd, dx;
		double inOld = 0;
		//ci-dessous, la formule "composite" avec un seul "sous"-intervalle
		double inNew = ( f(a) + 4*f((a+b)/2) + f(b) ) * (b-a) / 6;
		//la boucle while ci-dessous permet de rendre les partitions de plus en plus fines
		while(Math.abs(inNew - inOld) >= tolRel * Math.abs(inNew))
		{	inOld = inNew;
			inNew = 0;
			n = 2*n;	//on double le nombre de sous-intervalles
			dx = (b-a)/n;
			xd = a;
			//la boucle for ci-dessous prend en compte la contribution de chaque sous-intervalle
			//dans la formule composite de Simpson
			for(int i=1; i<=n; i++)
			{	xg = xd;
				xd = xg + dx;
				inNew = inNew + ( f(xg) + 4*f((xg+xd)/2) + f(xd) ) * dx / 6;
			}//fin de la boucle for		
		}//fin de la boucle while
		//le résultat final retourné est obtenu en dopant la formule composite de Simpson
		return (16*inNew - inOld)/15;
	}//fin de la méthode simpson
}//fin de la classe SimpsonFigee
