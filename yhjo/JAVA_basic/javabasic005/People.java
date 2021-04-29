package javabasic005;

public class People {

	public static void main(String[] args) {
		Man man = new Man();
		man.PrintContent();
		Woman woman = new Woman();
		woman.PrintContent();

		People people1 = new Man();
		((Man) people1).PrintContent();

		People people2 = new Woman();
		((Woman) people2).PrintContent();
	}

}
