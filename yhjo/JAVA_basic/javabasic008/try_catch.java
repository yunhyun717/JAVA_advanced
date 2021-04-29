package javabasic008;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class try_catch {

	public static void main(String[] args) {
	int [] numbers = {5, 10 ,12};
	
	try {
		System.out.println(numbers[3]);
	} catch (Exception e) {
		System.out.println("exception");
		e.printStackTrace();
	} finally {
		System.out.println("finally");
	}
	}
}
