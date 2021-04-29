package kopo38_swc06;

public class kopo38_P05_TvRemocon {
	private static int kopo38_Vol;
	private static int kopo38_MaxVol = 10;
	private static int kopo38_MinVol = 0;
	private static int kopo38_Channel;
	private static int kopo38_MaxChl = 100;
	private static int kopo38_MinChl = 1;
	// private 전역변수들을 설정한다.

	public static void kopo38_VolUp() {
		// 메소드를 설정한다.
		if (kopo38_Vol == kopo38_MaxVol) {
			System.out.println("최대 볼륨입니다.");
			System.out.println("Vol : ■■■■■■■■■■");
			//만약 볼륨이 최대 볼륨이면 내용을 출력하도록 설정한다.
		} else {
			kopo38_Vol++;
			System.out.printf("Vol : ");
			for (int i = 0; i < kopo38_Vol; i++) {
				System.out.printf("■");
			}
			for (int i = 0; i < kopo38_MaxVol - kopo38_Vol; i++) {
				System.out.printf("□");
			}
			System.out.printf("\n");
			// 그 외의 경우 볼륨에 1을 더하고 볼륨 숫자만큼 "■"를 출력하고
			// 최대 볼륨에서 볼륨을 뺀만큼 "□"를 출력하도록 설정한다.
		}
	}

	public static void kopo38_VolDn() {
		// 메소드를 설정한다.
		if (kopo38_Vol == kopo38_MinVol) {
			System.out.println("최소 볼륨입니다.");
			System.out.println("Vol : □□□□□□□□□□");
			// 만약 볼륨이 최소 볼륨이면 내용을 출력하도록 설정한다.
		} else {
			kopo38_Vol--;
			System.out.printf("Vol : ");
			for (int i = 0; i < kopo38_Vol; i++) {
				System.out.printf("■");
			}
			for (int i = 0; i < kopo38_MaxVol - kopo38_Vol; i++) {
				System.out.printf("□");
			}
			System.out.printf("\n");
			// 그 외의 경우 볼륨에 1을 빼고 볼륨 숫자만큼 "■"를 출력하고
			// 최대 볼륨에서 볼륨을 뺀만큼 "□"를 출력하도록 설정한다.
		}
	}

	public static void kopo38_ChannelUp() {
		// 메소드를 설정한다.
		kopo38_Channel++;
		// 채널에 1을 더한다.
		if (kopo38_Channel > kopo38_MaxChl) {
			kopo38_Channel = kopo38_MinChl;
		}
		// 만약 채널이 최대 채널보다 커지면 채널을 최소 채널로 설정한다.
		System.out.printf("Channel : %d\n", kopo38_Channel);
		// 내용을 출력한다.
	}

	public static void kopo38_ChannelDn() {
		// 메소드를 설정한다.
		kopo38_Channel--;
		if (kopo38_Channel < kopo38_MinChl) {
			kopo38_Channel = kopo38_MaxChl;
		}
		// 만약 채널이 최소 채널보다 작아지면 채널을 최대 채널로 설정한다.
		System.out.printf("Channel : %d\n", kopo38_Channel);
		// 내용을 출력한다.
	}

	public static void main(String[] args) {
		// 메인함수(클래스 Run시 실행되는 함수)를 설정한다.
		kopo38_Vol = 5;
		kopo38_Channel = 1;
		// 볼륨과 채널의 초기값을 설정한다.
		for (int i = 0; i < 10; i++) {
			kopo38_ChannelUp();
		}
		for (int i = 0; i < 10; i++) {
			kopo38_ChannelDn();
		}
		// 각각의 메소드를 10회 반복한다.
		for (int i = 0; i < 5; i++) {
			kopo38_VolUp();
		}
		for (int i = 0; i < 5; i++) {
			kopo38_VolDn();
		}
		// 각각의 메소드를 5회 반복한다.
	}
}
