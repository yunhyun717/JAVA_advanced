package kopo38_swc06;

public class kopo38_P09_1 {
	private static int kopo38_Vol;
	private static int kopo38_MaxVol = 10;
	private static int kopo38_MinVol = 0;
	private static int kopo38_Channel;
	private static int kopo38_MaxChl = 100;
	private static int kopo38_MinChl = 1;
	static int kopo38_power = 20;
	static String kopo38_power_stat;

	public static void kopo38_VolUp() {
		// 메소드를 정의한다.
		if (kopo38_Vol == kopo38_MaxVol) {
			System.out.println("최대 볼륨입니다.");
			System.out.println("Vol : ■■■■■■■■■■");
			// 볼륨이 최대 볼륨이면 해당 내용이 출력된다.
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
		}
		// 그렇지 않으면 볼륨에 1을 더하고 볼륨만큼 "■"이 출력되도록 설정한다
		kopo38_power--;
		// kopo38_power에서 1을 뺀다.
	}

	public static void kopo38_VolDn() {
		// 메소드를 정의한다.
		if (kopo38_Vol == kopo38_MinVol) {
			System.out.println("최소 볼륨입니다.");
			System.out.println("Vol : □□□□□□□□□□");
			// 볼륨이 최소 볼륨이면 해당 내용이 출력된다.
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
		}
		// 그렇지 않으면 볼륨에 1을 더하고 볼륨만큼 "■"이 출력되도록 설정한다
		kopo38_power--;
		// kopo38_power에서 1을 뺀다.
	}

	public static void kopo38_ChannelUp() {
		kopo38_Channel++;
		// 채널에 1을 더한다.
		if (kopo38_Channel > kopo38_MaxChl) {
			kopo38_Channel = kopo38_MinChl;
		}
		// 채널이 최대 채널보다 크면 채널을 최소 채널로 설정한다.
		System.out.printf("Channel : %d\n", kopo38_Channel);
		kopo38_power--;
		// 내용을 출력하고 kopo38_power에서 1을 뺀다.
	}

	public static void kopo38_ChannelDn() {
		kopo38_Channel--;
		// 채널에 1을 뺀다.
		if (kopo38_Channel < kopo38_MinChl) {
			kopo38_Channel = kopo38_MaxChl;
		}
		// 채널이 최소 채널보다 작으면 채널을 최대 채널로 설정한다.
		System.out.printf("Channel : %d\n", kopo38_Channel);
		kopo38_power--;
		// 내용을 출력하고 kopo38_power에서 1을 뺀다.
	}
	
	public static void kopo38_VolUp(int kopo38_u) {
		for (int i = 0; i < kopo38_u; i++) {
			kopo38_VolUp();
		}
	}

	public static void kopo38_VolDn(int kopo38_u) {
		for (int i = 0; i < kopo38_u; i++) {
			kopo38_VolDn();
		}
	}

	public static void ChannelUp(int kopo38_u) {
		for (int i = 0; i < kopo38_u; i++) {
			kopo38_ChannelUp();
		}
	}

	public static void ChannelDn(int kopo38_u) {
		for (int i = 0; i < kopo38_u; i++) {
			kopo38_ChannelDn();
		}
	}
	// 메소드가 정수 인자를 받으면 해당 메소드를 정수 인자 번 실행하도록 설정한다.

}
