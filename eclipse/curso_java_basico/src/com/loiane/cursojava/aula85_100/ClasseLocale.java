package com.loiane.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class ClasseLocale {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		Locale[] locales = locale.getAvailableLocales();
		
		for(Locale loc:locales)
		{
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Código da língua: " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Cod País: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());
			System.out.println("***********************************************");
		}
		
		Locale br = new Locale("pt", "Brazil");
		
		System.out.println(br);
		
		//Settar locale padrão
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(500000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(500000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(500000000d));
	}

}
