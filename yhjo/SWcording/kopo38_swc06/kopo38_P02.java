package kopo38_swc06;

public class kopo38_P02 {

	static int kopo38_iStatic;
	// 전역변수로 kopo38_iStatic을 정수로 설정한다.

	public static void kopo38_add(int kopo38_i) {
		kopo38_iStatic++;
		kopo38_i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n", kopo38_i);

	} 

	public static int kopo38_add2(int kopo38_i) {
		kopo38_iStatic++;
		kopo38_i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n", kopo38_i);
		return kopo38_i;
	}
	// 전역변수와 인자에 1을 더하고 내용을 출력.
	// 두 개의 메소드를 생성하고 같은 내용을 갖지만, kopo38_add2는 return으로 정수값을 갖도록 한다.


	public static void main(String[] args) {
		int kopo38_iMain;
		kopo38_iMain = 1;
		kopo38_iStatic = 1;
		// 각각의 변수의 값을 1로 설정한다.

		System.out.printf("*********************************\n");
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("메소드호출전 메인에서->iMain=[%d]\n", kopo38_iMain);
		System.out.printf("*********************************\n");
		// 변수를 출력한다.
		
		kopo38_add(kopo38_iMain);
		// 메소드를 실행한다. 해당 메소드는 return값을 갖지 않고 출력만 하는 메소드이다.
		
		System.out.printf("*********************************\n");
		System.out.printf("메소드호출후 메인에서->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("메소드호출후 메인에서->iMain=[%d]\n", kopo38_iMain);
		System.out.printf("*********************************\n");
		// 메소드를 통해 변한 값을 출력한다.
		
		kopo38_iMain=kopo38_add2(kopo38_iMain);
		// 메소드를 실행한다. 해당 메소드는 return값을 정수로 가지면서 실행 중 출력도 하는 메소드이다.
		// return값을 kopo38_iMain으로 설정한다.
		
		System.out.printf("*********************************\n");
		System.out.printf("메소드 add2호출후 메인에서->iStatic=[%d]\n", kopo38_iStatic);
		System.out.printf("메소드 add2호출후 메인에서->iMain=[%d]\n", kopo38_iMain);
		System.out.printf("*********************************\n");
		// 메소드 실행 후 변한 값을 출력한다.

	}
}
