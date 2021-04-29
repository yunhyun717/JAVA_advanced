package kopo38_swc06;

public class kopo38_P05_TvRemocon {
	private static int kopo38_Vol;
	private static int kopo38_MaxVol = 10;
	private static int kopo38_MinVol = 0;
	private static int kopo38_Channel;
	private static int kopo38_MaxChl = 100;
	private static int kopo38_MinChl = 1;
	// private ������������ �����Ѵ�.

	public static void kopo38_VolUp() {
		// �޼ҵ带 �����Ѵ�.
		if (kopo38_Vol == kopo38_MaxVol) {
			System.out.println("�ִ� �����Դϴ�.");
			System.out.println("Vol : �����������");
			//���� ������ �ִ� �����̸� ������ ����ϵ��� �����Ѵ�.
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
			// �� ���� ��� ������ 1�� ���ϰ� ���� ���ڸ�ŭ "��"�� ����ϰ�
			// �ִ� �������� ������ ����ŭ "��"�� ����ϵ��� �����Ѵ�.
		}
	}

	public static void kopo38_VolDn() {
		// �޼ҵ带 �����Ѵ�.
		if (kopo38_Vol == kopo38_MinVol) {
			System.out.println("�ּ� �����Դϴ�.");
			System.out.println("Vol : �����������");
			// ���� ������ �ּ� �����̸� ������ ����ϵ��� �����Ѵ�.
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
			// �� ���� ��� ������ 1�� ���� ���� ���ڸ�ŭ "��"�� ����ϰ�
			// �ִ� �������� ������ ����ŭ "��"�� ����ϵ��� �����Ѵ�.
		}
	}

	public static void kopo38_ChannelUp() {
		// �޼ҵ带 �����Ѵ�.
		kopo38_Channel++;
		// ä�ο� 1�� ���Ѵ�.
		if (kopo38_Channel > kopo38_MaxChl) {
			kopo38_Channel = kopo38_MinChl;
		}
		// ���� ä���� �ִ� ä�κ��� Ŀ���� ä���� �ּ� ä�η� �����Ѵ�.
		System.out.printf("Channel : %d\n", kopo38_Channel);
		// ������ ����Ѵ�.
	}

	public static void kopo38_ChannelDn() {
		// �޼ҵ带 �����Ѵ�.
		kopo38_Channel--;
		if (kopo38_Channel < kopo38_MinChl) {
			kopo38_Channel = kopo38_MaxChl;
		}
		// ���� ä���� �ּ� ä�κ��� �۾����� ä���� �ִ� ä�η� �����Ѵ�.
		System.out.printf("Channel : %d\n", kopo38_Channel);
		// ������ ����Ѵ�.
	}

	public static void main(String[] args) {
		// �����Լ�(Ŭ���� Run�� ����Ǵ� �Լ�)�� �����Ѵ�.
		kopo38_Vol = 5;
		kopo38_Channel = 1;
		// ������ ä���� �ʱⰪ�� �����Ѵ�.
		for (int i = 0; i < 10; i++) {
			kopo38_ChannelUp();
		}
		for (int i = 0; i < 10; i++) {
			kopo38_ChannelDn();
		}
		// ������ �޼ҵ带 10ȸ �ݺ��Ѵ�.
		for (int i = 0; i < 5; i++) {
			kopo38_VolUp();
		}
		for (int i = 0; i < 5; i++) {
			kopo38_VolDn();
		}
		// ������ �޼ҵ带 5ȸ �ݺ��Ѵ�.
	}
}
