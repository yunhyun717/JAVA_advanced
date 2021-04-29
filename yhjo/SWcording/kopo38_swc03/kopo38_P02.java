package kopo38_swc03;

public class kopo38_P02 {

	public static void main(String[] args) {
		int kopo38_sum; // kopo38_sum를 integer로 설정
		kopo38_sum = 0; // kopo38_sum을 0으로 설정
		for (int i = 1; i < 101; i++) {
			kopo38_sum = kopo38_sum + i;
		}
		/*for method, 1부터 시작해서 1씩 증가하여 101미만까지(100까지) 항이 존재하는 수열 i를 활용
		kopo38_sum은 i의 첫항에서 끝항까지 누적*/ 
		System.out.printf("#2 : %d\n", kopo38_sum); //kopo38_sum을 출력

		System.out.printf("#2-2 : %d\n", kopo38_sum / 100);
		//kopo38_sum/100을 출력, kopo38_sum이 integer값이기 때문에 나머지를 제외한 몫이 출력됨

		int[] kopo38_v = { 1, 2, 3, 4, 5 }; //정수열 kopo38_v를 생성
		int kopo38_vSum; //kopo38_vSum을 integer로 설정
		kopo38_vSum = 0; //kopo38_vSum을 0으로 설정

		for (int i = 0; i < 5; i++) {
			kopo38_vSum = kopo38_vSum + kopo38_v[i];
		}
		//0부터 5미만까지의 i 값에 대해 kopo38_vSum을 kopo38_v의 i항만큼 누적되도록 설정
		System.out.printf("#2-3 : %d\n", kopo38_vSum);
		//kopo38_vSum을 출력
	}

}
