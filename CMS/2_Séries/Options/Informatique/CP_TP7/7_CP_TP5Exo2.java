package cms_tp5;

import java.util.Scanner;

public class CP_TP5Exo2
{
	public static void main(String[] args)
	{
		Personne p = new Personne();

		Personne p1 = new Personne("Bonnet Blanc", 1996);
		p1.afficher();
		System.out.println("La personne " + p1.nomComplet + " est née en " + p1.anNaissance);

		System.out.println("********************************************************");

		Personne p2 = new Personne("Napoléon Bonaparte", 1769);
		p2.afficher();
		System.out.println("La personne " + p1.nomComplet + " est née en " + p1.anNaissance);

		System.out.println("********************************************************");

		p2.nomComplet = "Justin Bieber";
		p2.anNaissance = 1994;
		p2.afficher();
	}//fin de la méthode main
}//fin de la classe principale


