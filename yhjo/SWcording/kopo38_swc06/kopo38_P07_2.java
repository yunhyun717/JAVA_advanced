package kopo38_swc06;

public class kopo38_P07_2 {

	public static void main(String[] args) {
		kopo38_P07_1 kopo38_p07 = new kopo38_P07_1();
		// kopo38_P07_1 클래스를 불러온다.
		System.out.println("3월 성적표");
		System.out.println("================================================");
		System.out.printf("%-4s%4s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("================================================");
		System.out.printf("%-3s%5s %5s %5s %5s %5s\n", "폴리융", 100, 100, 100, kopo38_p07.kopo38_sum(100, 100, 100),
				kopo38_p07.kopo38_avg(100, 100, 100));
		System.out.println("\n\n4월 성적표");
		System.out.println("================================================");
		System.out.printf("%-4s%4s%4s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "과학", "총점", "평균");
		System.out.println("================================================");
		System.out.printf("%-3s%5s %5s %5s %5s %5s %5s\n", "폴리융", 100, 100, 100, 100,
				kopo38_p07.kopo38_sum(100, 100, 100, 100), kopo38_p07.kopo38_avg(100, 100, 100, 100));
		System.out.println("\n\n5월 성적표");
		System.out.println("================================================");
		System.out.printf("%-4s%4s%4s%4s%4s%4s%4s%4s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점", "평균");
		System.out.println("================================================");
		System.out.printf("%-3s%5s %5s %5s %5s %5s %5s %6s\n", "폴리융", 100, 100, 100, 100, 100,
				kopo38_p07.kopo38_sum(100, 100, 100, 100, 100), kopo38_p07.kopo38_avg(100, 100, 100, 100, 100));

		// 불러온 클래스의 메소드들이 같은 이름을 갖고 있지만 인자의 종류와 갯수에 따라
		// 다른 메소드가 실행된다. 이를 메소드 오버로딩이라고 한다.
	}

}
