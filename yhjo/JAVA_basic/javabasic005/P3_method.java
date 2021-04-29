package javabasic005;

public class P3_method {
	String name;
	int age;
	double offensepower;
	double defensepower;

	public P3_method(String name, int age) {
		this(name, age, 30.5, 45.5);
	}
	
	public P3_method(String name, int age, double offencepower) {
		this(name, age, offencepower, 15.62);
	}

	public P3_method(String name, int age, double offensepower, double defensepower) {
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