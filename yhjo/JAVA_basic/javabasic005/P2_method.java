package javabasic005;

public class P2_method {
	String name;
	int age;
	double offensepower;
	double defensepower;

	public P2_method(String name, int age, double offensepower, double defensepower) {
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