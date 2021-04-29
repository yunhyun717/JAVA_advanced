package kopo38_swc05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P04 {

	public static void main(String[] args) {
		int kopo38_iPrice = 33000;
		// �� ������ kopo38_iPrice�� ����
		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		// ����� method�� �ҷ��´�. kopo38_df�� ���� ��ǥ, kopo38_calendar�� �ð��ҷ�����
		// kopo38_sdf�� �ð� ���� ����
		int kopo38_Price = (int) (Math.round(kopo38_iPrice /1.1));
		int kopo38_tax = kopo38_iPrice - kopo38_Price;
		// ���������� ���� kopo38_Price�� �����Ѵ�. �� ���� �� ������ 1.1�� ���� ���� �ݿø��� ���� ��ȯ�� ���̴�.
		// ������ kopo38_tax�� �����Ѵ�. ������ �Ѱ��ݿ��� ���������� �� ���̴�.
		System.out.printf("�ſ����\n");
		kopo38_twostring("�ܸ��� : 2N68665898", "��ǥ��ȣ : 041218");
		System.out.printf("������ : �Ѿ��ġ�\n");
		System.out.printf("��  �� : ��� ������ �д籸 Ȳ�����351���� 10 1��\n");
		System.out.printf("��ǥ�� : ��â��\n");
		kopo38_twostring("����� : 752-53-00558", "TEL : 7055695");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		kopo38_twostring("��  ��", kopo38_df.format(kopo38_Price) + " ��");
		kopo38_twostring("�ΰ���", kopo38_df.format(kopo38_tax) + " ��");
		kopo38_twostring("��  ��", kopo38_df.format(kopo38_iPrice) + " ��");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("�츮ī��\n");
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S)  �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : %s\n", kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("%s  %s\n", "���� : ��ī���", "���� : 720068568");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");
		kopo38_center("	* �����մϴ� *");
		System.out.printf("%40.40s", "ǥ��V2.08_20200212\n");
		// kopo38_center�� kopo38_twostring�� Ȱ���� ������ ����Ѵ�.
		// �ð��� kopo38_calendar�� �ҷ��� kopo38_sdf���� ������ �������� ����Ѵ�.
	}

	public static void kopo38_twostring(String kopo38_a, String koppo38_b) {
		int kopo38_a_kornum = 0;
		int kopo38_b_kornumm = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < koppo38_b.length(); kopo38_i++) {
			int kopo38_charint = (int) (koppo38_b.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_b_kornumm++;
			}
		}
		// kopo38_a_kornum�� String kopo38_a�� ���Ե� �ѱ��� ��,
		// kopo38_b_kornum�� String kopo38_b�� ���Ե� �ѱ��� ���̴�.
		// ���� �ݺ����� ASCII�ڵ带 Ȱ���Ͽ� ���ڿ��� ���Ե� �ѱ� ���� �����ش�.
		int kopo38_spacenum = 41 - (kopo38_a.length() + koppo38_b.length() + kopo38_a_kornum + kopo38_b_kornumm);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum�� �� ���� 41���� kopo38_a�� kopo38_b�� ���� ��, �׸��� �ѱ۷� ���� �þ ���̸�ŭ�� �������� �����̴�.
		// ��, kopo38_a�� kopo38_b�� �����ϰ� �ִ� ������ ������ �� ������ �����̴�.
		// kopo38_spacenum��ŭ ��ĭ�� kopo38_space�� �����Ѵ�.
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, koppo38_b);
		// ������ kopo38_a, ����� ���� ������ ��ŭ�� ����, ������ kopo38_b�� ��ġ�Ͽ� �� String�� ���� ���� �Ѵ�.
	}

	public static void kopo38_center(String kopo38_a) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		// kopo38_a_num�� �̿��� String kopo38_a�� ���Ե� �ѱ��� �����ش�.
		int kopo38_spacenum = (41 - (kopo38_a.length() + kopo38_a_kornum)) / 2;
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum�� �� ���� 41���� kopo38_a�� ���ڼ��� �ѱ۷� ���� �þ ���̸�ŭ�� �������� ���ڸ� 2�� ���� ���̴�.
		// ��, kopo38_a�� �����ϰ� �ִ� ������ ������ ������� ������ ���� ���� �ȴ�.
		// �ش� ���̸�ŭ ��ĭ�� kopo38_space�� �����Ѵ�.
		System.out.printf("%s%s\n", kopo38_space, kopo38_a);
		// kopo38_space��ŭ�� ������� ����ϰ� �̾ kopo38_a�� ����ϸ� ��� ������ �ȴ�.
	}

}
