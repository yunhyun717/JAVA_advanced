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
		// �޼ҵ带 �����Ѵ�.
		if (kopo38_Vol == kopo38_MaxVol) {
			System.out.println("�ִ� �����Դϴ�.");
			System.out.println("Vol : �����������");
			// ������ �ִ� �����̸� �ش� ������ ��µȴ�.
		} else {
			kopo38_Vol++;
			System.out.printf("Vol : ");
			for (int i = 0; i < kopo38_Vol; i++) {
				System.out.printf("��");
			}
			for (int i = 0; i < kopo38_MaxVol - kopo38_Vol; i++) {
				System.out.printf("��");
			}
			System.out.printf("\n");
		}
		// �׷��� ������ ������ 1�� ���ϰ� ������ŭ "��"�� ��µǵ��� �����Ѵ�
		kopo38_power--;
		// kopo38_power���� 1�� ����.
	}

	public static void kopo38_VolDn() {
		// �޼ҵ带 �����Ѵ�.
		if (kopo38_Vol == kopo38_MinVol) {
			System.out.println("�ּ� �����Դϴ�.");
			System.out.println("Vol : �����������");
			// ������ �ּ� �����̸� �ش� ������ ��µȴ�.
		} else {
			kopo38_Vol--;
			System.out.printf("Vol : ");
			for (int i = 0; i < kopo38_Vol; i++) {
				System.out.printf("��");
			}
			for (int i = 0; i < kopo38_MaxVol - kopo38_Vol; i++) {
				System.out.printf("��");
			}
			System.out.printf("\n");
		}
		// �׷��� ������ ������ 1�� ���ϰ� ������ŭ "��"�� ��µǵ��� �����Ѵ�
		kopo38_power--;
		// kopo38_power���� 1�� ����.
	}

	public static void kopo38_ChannelUp() {
		kopo38_Channel++;
		// ä�ο� 1�� ���Ѵ�.
		if (kopo38_Channel > kopo38_MaxChl) {
			kopo38_Channel = kopo38_MinChl;
		}
		// ä���� �ִ� ä�κ��� ũ�� ä���� �ּ� ä�η� �����Ѵ�.
		System.out.printf("Channel : %d\n", kopo38_Channel);
		kopo38_power--;
		// ������ ����ϰ� kopo38_power���� 1�� ����.
	}

	public static void kopo38_ChannelDn() {
		kopo38_Channel--;
		// ä�ο� 1�� ����.
		if (kopo38_Channel < kopo38_MinChl) {
			kopo38_Channel = kopo38_MaxChl;
		}
		// ä���� �ּ� ä�κ��� ������ ä���� �ִ� ä�η� �����Ѵ�.
		System.out.printf("Channel : %d\n", kopo38_Channel);
		kopo38_power--;
		// ������ ����ϰ� kopo38_power���� 1�� ����.
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
	// �޼ҵ尡 ���� ���ڸ� ������ �ش� �޼ҵ带 ���� ���� �� �����ϵ��� �����Ѵ�.

}
