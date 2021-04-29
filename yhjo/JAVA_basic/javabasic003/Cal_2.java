package javabasic003;

import java.util.Calendar;
import java.util.Scanner;

public class Cal_2 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR)+1);
		System.out.println(calendar.get(Calendar.MONTH)-7); //January=0
		System.out.println(calendar.get(Calendar.DATE)+8);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)+45); //sat=0
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)-44);
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)+48);
		System.out.println(calendar.get(Calendar.HOUR)*8);
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)/3);
		System.out.println(calendar.get(Calendar.MINUTE)*4);
		System.out.println(calendar.get(Calendar.SECOND)-9);
		System.out.println(calendar.get(Calendar.MILLISECOND)+9);
		
	}
}
