package javabasic005;

public class P6 {

	public static void main(String[] args) {
		P6_method a = new P6_method("A", 120, 12.3, 123.3);
		P6_method b = new P6_method("B", 641, 13.5, 871.4);
		P6_method c = new P6_method("C", 256, 456.4, 564.8);
		P6_method d = new P6_method("D", 465, 889);
		P6_method e = new P6_method("E", 345);

		System.out.println(a.printCharacter());
		System.out.println(b.printCharacter());
		System.out.println(c.printCharacter());
		System.out.println(d.printCharacter());
		System.out.println(e.printCharacter());

	}

}

class P6_method {
	String name;
	int age;
	double offensepower;
	double defensepower;

	public P6_method(String name, int age) {
		this(name, age, 30.5, 45.5);
	}

	public P6_method(String name, int age, double offencepower) {
		this(name, age, offencepower, 15.62);
	}

	public P6_method(String name, int age, double offensepower, double defensepower) {
		this.name = name;
		this.age = age;
		this.offensepower = offensepower;
		this.defensepower = defensepower;
	}

	public String printCharacter() {
		String ret = "";
		ret = name + "/" + age + "/" + offensepower + "/" + defensepower;
		return ret;

	}
}