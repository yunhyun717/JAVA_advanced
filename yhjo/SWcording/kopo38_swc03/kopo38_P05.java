package kopo38_swc03;

public class kopo38_P05 {

	public static void main(String[] args) {
		int kopo38_MyVal = 14 / 5;
		// 정수 값이므로 14를 5로 나눈 몫이 설정
		System.out.printf("#5-1 : %d\n", kopo38_MyVal); // kopo38_MyVal을 출력

		double kopo38_MyValF;
		// double 변수를 생성
		kopo38_MyValF = 14 / 5; // double이지만 14와 5가 정수이므로 몫인 2가 설정됨
		System.out.printf("#5-2 : %f\n", kopo38_MyValF);
		// kopo38_MyValF를 출력, double이므로 %f를 사용하지만 값이 2이므로 2.000000으로 표시

		kopo38_MyValF = 14.0 / 5; // type이 double이고 double형식인 14.0을 5로 나누었으므로 2.8이 설정됨
		System.out.printf("#5-3 : %f\n", kopo38_MyValF);
		// kopo38_MyValF를 출력, double이므로 %f를 사용

		kopo38_MyValF = (14.0) / 5 + 0.5; // 2.8에 0.5를 더함
		System.out.printf("#5-4 : %f\n", kopo38_MyValF);
		// kopo38_MyValF를 출력, double이므로 %f를 사용

		kopo38_MyVal = (int) ((14.0) / 5 + 0.5); // type이 double이고 double형식인 14.0을 5로 나누었으므로 2.8이 설정됨
		System.out.printf("#5-5 : %d\n", kopo38_MyVal);
		// kopo38_MyVal를 출력, integer로 변환했으므로 소숫점 아래는 버림

	}

}
