package com.enrichissement.examen;
import java.util.Random;

public class Question1 {
    public static void main(String[] args) 
    {
        creationTabSource();
    }
    
    public static void creationTabSource() {
    	Random random = new Random();
        
        int[] tabSource = new int[10];
        int[] tabDestination = new int[10];

        for (int i = 0; i < tabSource.length; i++) 
        {
        	tabSource[i] = random.nextInt(101);
        }
        calculerTableDestination(tabSource, tabDestination);
    }
    
    public static void calculerTableDestination(int[] tabSource, int[] tabDestination)
    {
    	for(int i = 0; i < tabSource.length; i++)
    	{
    		if(tabSource[i] <= 50) 
    		{
    			tabDestination[i] = tabSource[i] * tabSource[i] % 3;
    		} else 
    			{
    			tabDestination[i] = tabSource[i] * tabSource[i] % 5;
    			}
    	}
    	afficherTableaux(tabSource, tabDestination);
    }
    
    public static void afficherTableaux(int[] tabSource, int[] tabDestination)
    {
    	afficherLigne("Tableau Source          Tableau destination");
    	afficherLigne("-------------------------------------------");
    	for(int i = 0; i < tabSource.length; i++)
    	{
    		afficherLigne("tabSource["+i+"] = " + tabSource[i] + "       " + "tabDestination["+i+"] = " + tabDestination[i]);
    	}
    }
    
    public static void afficherLigne(String message) 
    {
        System.out.println(message);
    }
}

