package com.loiane.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class ClasseTimeZone {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz);
		
//		String[] fusos = TimeZone.getAvailableIDs();
//		for(String fuso:fusos)
//		{
//			System.out.println(fuso);
//		}
		
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
		
		System.out.println(tzNY.getDisplayName());
		System.out.println(tzNY.getID());
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraNY = Calendar.getInstance(tzNY);
		System.out.println(agoraNY.getTimeZone());
		System.out.println(sdf.format(agoraNY.getTime()));
		
		int diferencaNYSP = (tzNY.getOffset(System.currentTimeMillis()) - tz.getOffset(System.currentTimeMillis())) / 1000 / 60 / 60;
		
		agoraNY.add(Calendar.HOUR_OF_DAY, diferencaNYSP);

		System.out.println(sdf.format(agoraNY.getTime()));
	}

}
