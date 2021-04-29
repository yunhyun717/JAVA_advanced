package kopo38_swc02;

public class kopo38_P02 {

	public static void main(String[] args) {
		int kopo38_x = 10;
		int kopo38_y = 20;
		int kopo38_tmp = 0;
		// 정수 kopo38_x, kopo38_y, kopo38_tmp를 설정한다.

		System.out.println("x:" + kopo38_x + "y:" + kopo38_y);
		// kopo38_x와 kopo38_y를 지정한 형식으로 출력한다.
		
		kopo38_tmp = kopo38_x;
		kopo38_x = kopo38_y;
		kopo38_y = kopo38_tmp;
		// 각각의 변수를 변수를 활용해 재설정한다.	
		
		System.out.println("x:" + kopo38_x + "y:" + kopo38_y);
		// kopo38_x와 kopo38_y를 지정한 형식으로 출력한다.
		
	}

}
