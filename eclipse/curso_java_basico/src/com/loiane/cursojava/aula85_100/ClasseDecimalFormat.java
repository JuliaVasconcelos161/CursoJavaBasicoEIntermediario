package com.loiane.cursojava.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ClasseDecimalFormat {

	public static void main(String[] args) {
		//DecimalFormat é filha da NumberFormat
		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		
//		df.applyPattern(padrao);
		System.out.println(df.format(123456.123));

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator('.');
		dfs.setGroupingSeparator(',');
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(123456.123));
		
		String padrao3 = "###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);
		System.out.println(df.format(123456.123));
		
		String padrao4 = "-###,000.00%";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(0.1));
	}

}
