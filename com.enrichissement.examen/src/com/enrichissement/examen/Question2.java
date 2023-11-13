package com.enrichissement.examen;

public class Question2 {

	public static void main(String[] args) {
		String[] tab_ville = 
			{"Le Caire ","New York","Paris    ","Calcutta ",
				"Barcelone","Manille  ","Montreal ","Hong Kong"};
		double[] tab_superficie = 
			{210, 1214, 105.4, 185, 100.4, 38.55, 363.52, 1104};
		int[] tab_population = 
			{8452409, 8391881, 2211297, 4580544, 1621537, 1660714, 1667700, 7018636};
		double[] tab_densite = new double[8];
		
		calculerDensite(tab_superficie, tab_population, tab_densite);
		afficherTableau(tab_ville, tab_superficie, tab_population, tab_densite);
	}

	public static void calculerDensite(double[] tab_superficie, int[] tab_population, double[] tab_densite)
	{
		for(int i = 0; i < tab_superficie.length; i++) {
			tab_densite[i] = tab_population[i] / tab_superficie[i];
		}
	}
	
	public static void afficherTableau
	(String[] tab_ville, double[] tab_superficie, int[] tab_population, double[] tab_densite) 
	{
		afficherLigne("Ville            Superficie      Population       Densite");
		afficherLigne("===========================================================");
		for (int i = 0; i < tab_ville.length; i++) 
		{
			afficherLigne
			(tab_ville[i]+"          "+tab_superficie[i]+"          "+tab_population[i]+"          "+(Math.round(tab_densite[i]*100.0) / 100.0));
		}
	}
	
	public static void afficherLigne(String message) 
    {
        System.out.println(message);
    }
}

