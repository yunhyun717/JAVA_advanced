package kopo38_swc06;

public class kopo38_P08_1 {
	int kopo38_limit_up_floor;
	int kopo38_limit_down_floor;
	int kopo38_floor;
	String kopo38_help;
	// 전역변수들을 설정한다.

	kopo38_P08_1() {
		kopo38_limit_up_floor = 10;
		kopo38_limit_down_floor = 1;
		kopo38_floor = 1;
		kopo38_help = "엘리베이터 기본 준공완료";
	}
	// 해당 클래스를 불러올 때 전역변수를 해당 값으로 설정하도록 한다.
	// 클래스와 같은 이름의 메소드를 생성하면 해당 클래스를 불러올 때 실행할 내용을 설정할 수 있다.

	kopo38_P08_1(int up_floor, int d_floor, int in_floor) {
		kopo38_limit_up_floor = up_floor;
		kopo38_limit_down_floor = d_floor;
		kopo38_floor = in_floor;
		kopo38_help = "엘리베이터 맞춤 준공완료";
	}
	// 해당 클래스를 세개의 정수 인자를 넣어서 불러올 때 전역변수를 해당 값으로 설정하도록 한다.

	void kopo38_up() {
		if (kopo38_floor == kopo38_limit_up_floor) {
			kopo38_help = "마지막층입니다";
		} else {
			kopo38_floor++;
			kopo38_help = String.format("%d층입니다", kopo38_floor);
		}
	}
	// 현재 층이 최대 층이면 kopo38_help를 "마지막층입니다"로 설정하고,
	// 아니면 현재 층에 1을 더하고 kopo38_help를 지정한 값으로 설정하도록 메소드를 정의한다.

	void kopo38_down() {
		if (kopo38_floor == kopo38_limit_down_floor) {
			kopo38_help = "처음층입니다";
		} else {
			kopo38_floor--;
			kopo38_help = String.format("%d층입니다", kopo38_floor);
		}
	}
	// 현재 층이 최저 층이면 kopo38_help를 "처음층입니다"로 설정하고,
	// 아니면 현재 층에 1을 빼고 kopo38_help를 지정한 값으로 설정하도록 메소드를 정의한다.

	void kopo38_up(int kopo38_u) {
		for (int kopo38_i = 0; kopo38_i < kopo38_u; kopo38_i++)
			this.kopo38_up();
	}
	// kopo38_up메소드가 정수 인자를 받으면 kopo38_up이 kopo38_u번 실행되도록 설정한다.

	void kopo38_down(int kopo38_u) {
		for (int kopo38_i = 0; kopo38_i < kopo38_u; kopo38_i++)
			kopo38_down();
	}
	// kopo38_down메소드가 정수 인자를 받으면 kopo38_down이 kopo38_u번 실행되도록 설정한다.

	void kopo38_msg(String id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", id, kopo38_help, kopo38_limit_up_floor,
				kopo38_limit_down_floor, kopo38_floor);
	}
	// String을 인자로 하는 메소드를 설정하고 내용을 작성한다.
}
