package kopo38_swc03;

public class kopo38_P03 {

	public static void main(String[] args) {
		int kopo38_ii = 1000 / 3;
		// kopo38_ii를 integer로 설정하고 1000/3을 하면 333.333...이 아닌 1000을 
		// 3으로 나눈 몫이 나옴
		System.out.printf("#3-1 : %d\n", kopo38_ii);

		kopo38_ii = 1000 % 3; // kopo38_ii를 출력
		System.out.printf("#3-2 : %d\n", kopo38_ii); // kopo38_ii를 출력

		for (int kopo38_i = 0; kopo38_i < 20; kopo38_i++) {
			System.out.printf("#3-3 : %d	", kopo38_i);
			// 0부터 19까지의 i에 대해 i를 출력

			if (((kopo38_i + 1) % 5) == 0) {
				System.out.printf("\n");
				/* 이때 5줄 마다 새로운 줄에서 시작하도록 조건을 설정
				   i에 1을 더해주는 이유 : i부터 시작할 경우 
				   0부터 시작되고 첫항부터 5로 나누었을 때 나머지가 0이 되므로
				   5항 째에 나머지가 0이 되도록 하기 위해 +1
				   i%5=4로 대체 가능
				 */
			}
		}
	}

}
