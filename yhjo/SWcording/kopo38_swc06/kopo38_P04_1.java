package kopo38_swc06;

public class kopo38_P04_1 {
	int kopo38_limit_up_floor = 10;
	int kopo38_limit_down_floor = 0;
	int kopo38_floor = 1;
	String kopo38_help;
	// 정수와 String을 전역변수로 설정한다.
	
	void kopo38_up() {
		if (kopo38_floor == kopo38_limit_up_floor) {
			kopo38_help = "마지막층입니다";
		} else {
			kopo38_floor++;
			kopo38_help = String.format("%d층입니다", kopo38_floor);
		}
	}
	// 현재 층이 최대 높이이면 kopo38_help를 "마지막층입니다"로 변경하고
	// 그렇지 않으면 kopo38_floor에서 1을 더하고 kopo38_help를 "kopo38_floor층입니다"로 변경한다.

	void kopo38_down() {
		if (kopo38_floor == kopo38_limit_down_floor) {
			kopo38_help = "처음층입니다";
		} else {
			kopo38_floor--;
			kopo38_help = String.format("%d층입니다", kopo38_floor);
		}
		
	}
	// 현재 층이 최저 높이이면 kopo38_help를 "처음층입니다"로 변경하고
	// 그렇지 않으면 kopo38_floor에서 1을 빼고 kopo38_help를 "kopo38_floor층입니다"로 변경한다.
}
