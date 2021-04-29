package javabasic008;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;

public class Type_of_Exceptions {

	public static void main(String[] args) {
	
	try {
		String temp = null;
		System.out.println(temp.length());
	} catch (NullPointerException e) {
		System.out.println("1");
		e.printStackTrace();
	} catch (Exception e) {
		System.out.println("2");
		e.printStackTrace();
	} finally {
		System.out.println("finally");
	}
	}
}
