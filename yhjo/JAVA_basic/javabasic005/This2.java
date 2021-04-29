package javabasic005;

public class This2 {

	String name;
	int age;
	int power;

	public This2() {
		this("hello", 10, 20);
	}

	public This2(String name, int age, int power) {
		this.name = name;
		this.age = age;
		this.power = power;
		System.out.println(this.name+this.age+this.power);
	}

		
	}
