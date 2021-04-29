package kopo38_swc06;

public class kopo38_P08_2 {
	static kopo38_P08_1 p08_1;
	static kopo38_P08_1 p08_2;
	static kopo38_P08_1 p08_3;

	public static void main(String[] args) {
		p08_1 = new kopo38_P08_1();
		p08_2 = new kopo38_P08_1(20, 1, 8);
		p08_3 = new kopo38_P08_1(50, -3, 5);
		// kopo38_P08_1 클래스를 불러온다.
		// 인자를 안넣고, 또는 정수 인자를 3개 넣은 경우로 불러온다.

		for (int i = 0; i < 20; i++) {
			//p08_1.kopo38_up();
			//p08_1.kopo38_msg("1번엘레 한층 오르기");
			//p08_2.kopo38_up();
			//p08_2.kopo38_msg("2번엘레 한층 오르기");
			p08_3.kopo38_up();
			p08_3.kopo38_msg("3번엘레 한층 오르기");
		}
		for (int i = 0; i < 20; i++) {
			//p08_1.kopo38_up(2);
			//p08_1.kopo38_msg("1번엘레 2층 오르기");
			//p08_2.kopo38_up(2);
			//p08_2.kopo38_msg("2번엘레 2층 오르기");
			p08_3.kopo38_up(2);
			p08_3.kopo38_msg("3번엘레 2층 오르기");
		}
		for (int i = 0; i < 20; i++) {
			//p08_1.kopo38_down(3);
			//p08_1.kopo38_msg("1번엘레 3층 내리기");
			//p08_2.kopo38_down(3);
			//p08_2.kopo38_msg("2번엘레 3층 내리기");
			p08_3.kopo38_down(3);
			p08_3.kopo38_msg("3번엘레 3층 내리기");
		}
		// 인자를 넣지 않은 경우와 인자를 3개 넣은 경우로 나눠 실행한다.
	}
}
