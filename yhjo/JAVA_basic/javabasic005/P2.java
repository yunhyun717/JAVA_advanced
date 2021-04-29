package javabasic005;

public class P2 {

	public static void main(String[] args) {
		P2_method a = new P2_method("A", 120, 12.3, 123.3) ;
		P2_method b = new P2_method("B", 120, 12.3, 123.3);
		P2_method c = new P2_method("C", 120, 12.3, 123.3);
		
		System.out.println(a.printCharacter());
		System.out.println(b.printCharacter());
		System.out.println(c.printCharacter());

	}

}