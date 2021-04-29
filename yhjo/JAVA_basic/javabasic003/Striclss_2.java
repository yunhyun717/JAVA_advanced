package javabasic003;

public class Striclss_2 {
	public static void main(String[] args) {
		String text = "Hello How are you? I'm fine thank you and you";
		String[] t = text.split(" ");
		for (int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
	}
}
