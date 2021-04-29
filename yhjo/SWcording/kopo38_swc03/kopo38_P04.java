package kopo38_swc03;

public class kopo38_P04 {

	public static void main(String[] args) {
		int kopo38_ii = 12345;
		// kopo38_ii를 integer 12345로 설정
		int kopo38_j = (kopo38_ii / 10) * 10;
		/*
		 * j를 integer로 설정하고 kop38_ii를 10으로 나눈 몫에 10을 곱한 값으로 설정 결과적으로 kopo38_ii의 일의 자리수를
		 * 버리는 결과값을 얻게 됨
		 */
		System.out.printf("#4-1 : %d\n", kopo38_j); // kopo38_j를 출력

		kopo38_ii = 12345; // kopo38_ii를 12345로 설정(integer)
		kopo38_j = ((kopo38_ii + 5) / 10) * 10;
		/*
		 * kopo38_ii에 5를 더한값은 kopo38_ii의 일의 자리값이 0~4일 때는 십의 자리의 변화가 없고, 5~9일 때는 십의 자리수에
		 * 1이 더해짐. 앞서 일의 자리수의 버림을 계산해보았으르모 5를 더하여 처리한 결과가 일의 자리에 대한 반올림이 된다는 것을 알 수 있음
		 */
		System.out.printf("#4-2 : %d\n", kopo38_j); // kopo38_j를 출력

		kopo38_ii = 12344; // kopo38_ii를 12344로 설정
		kopo38_j = ((kopo38_j + 5) / 10) * 10;
		// 앞서와 같은 식이지만 kopo38_ii의 일의 자리수가 4이므로 반올림하면 버려짐
		System.out.printf("#4-3 : %d\n", kopo38_j); // kopo38_j를 출력

	}

}
