package javabasic005;

public class P3 {

	public static void main(String[] args) {
		P3_method a = new P3_method("A", 120, 12.3, 123.3);
		P3_method b = new P3_method("B", 641, 13.5, 871.4);
		P3_method c = new P3_method("C", 256, 456.4, 564.8);
		P3_method d = new P3_method("D", 465, 889);
		P3_method e = new P3_method("E", 345);

		System.out.println(a.printCharacter());
		System.out.println(b.printCharacter());
		System.out.println(c.printCharacter());
		System.out.println(d.printCharacter());
		System.out.println(e.printCharacter());

	}

}