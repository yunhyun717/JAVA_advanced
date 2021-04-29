package kopo38_swc05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P05 {

	public static void main(String[] args) {
		String kopo38_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		String kopo38_itemcode1 = "1031615";
		int kopo38_price1 = 3000;
		int kopo38_amount1 = 1;

		String kopo38_itemname2 = "�����̵�ĸ���(������)(100ȣ)";
		String kopo38_itemcode2 = "11008152";
		int kopo38_price2 = 1000;
		int kopo38_amount2 = 1;

		String kopo38_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String kopo38_itemcode3 = "1020800";
		int kopo38_price3 = 1000;
		int kopo38_amount3 = 1;
		// ������ ��ǰ�� ���� ������ �Է��Ѵ�.(��ǰ��, ��ǰ�ڵ�, ����, ����)

		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat kopo38_sdf2 = new SimpleDateFormat("(MM��dd��)");
		// ����� method�� �ҷ��´�. kopo38_df�� ���� ��ǥ, kopo38_calendar�� �ð��ҷ�����
		// kopo38_sdf�� �ð� ���� ����

		kopo38_center("\"���ΰ���, ���̼�\"");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (������)\n");
		System.out.printf("=========================================\n");
		kopo38_center("�Һ����߽ɰ濵(CCM) �������");
		kopo38_center("ISO 9001 ǰ���濵�ý��� �������");
		System.out.printf("=========================================\n");
		kopo38_calendar.add(Calendar.DAY_OF_MONTH,14);
		kopo38_center("��ȯ/ȯ�� 14��"+kopo38_sdf2.format(kopo38_calendar.getTime())+"�̳�,");
		kopo38_calendar.add(Calendar.DAY_OF_MONTH,-14);
		// kopo38_calendar�� �̿��� 14���� �����ְ� kopo38_sdf2���� ������ �������� ����Ѵ�.
		// ���� 14���� �ٽ� ���ش�.
		kopo38_center("(����)������, ����ī�� ���� �� ");
		kopo38_center("���Ը��忡�� ����");
		kopo38_center("����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		kopo38_center("üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.printf("=========================================\n");
		kopo38_twostring("[POS 1058231]", kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("=========================================\n");
		// kopo38_center�� kopo38_twostring�� Ȱ���� ������ ����Ѵ�.
		// �ð��� kopo38_calendar�� �ҷ��� kopo38_sdf���� ������ �������� ����Ѵ�.
		int kopo38_price = 0;
		// �� ���� �հ��� ���� kopo38_price�� 0���� �����Ѵ�.
		int kopo38_charnum = 0;
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname1.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname1.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
				kopo38_kornum--;
				kopo38_charnum--;
				break;
			}
		}
		// ��ǰ���� ó���ϱ����� �ݺ����� ����Ѵ�.
		// ��ǰ���� ������ �ѱ��� ���ٴ� ���̴�. �ѱ��� �� String�� ���ϴ� ���̷� ����ϱ� ���ؼ��� ���ϴ� ���̿��� String��
		// ���Ե� �ѱ��� ������ ���ָ� �ȴ�.(�ѱ��� 2ĭ�� �����ϹǷ�)
		// �ѱ��� ASCII�ڵ�� '��'�� 44032�̰�, ������ ������ '�R'�� 55203�� ���� ������.
		// �ݺ����� �̿��� ��ǰ���� ù���ں��� �ѱ����� �ƴ��� Ȯ���Ѵ�. ���� ���° ���ڱ��� Ȯ���ߴ����� ���� kopo38_charnum����
		// Ȯ���Ѵ�.
		// (kopo38_i�� 0���� �����ϹǷ�) ���� ���� kopo38_charint�� ���� Ȯ���ϰ� �ִ� ������ ���� ��ȯ���� �����ϰ�
		// kopo38_charint�� ũ��� �ѱ� ���θ� Ȯ���Ѵ�. ���� �ѱ��̸� �ѱ� ���ڼ��� kopo38_kornum�� 1�� ���Ѵ�.
		// ������� �� ���� ������ ���� �� (�ѱ��� ���ڼ�)*2 + (�ѱ��� �ƴ� ����)*1 =
		// kopo38_kornum*2 + (kopo38_charnum-kopo38_kornum)*1 =
		// kopo38_kornum+kopo38_charnum�̴�.
		// ���̰� 1�Ǵ� 2�� �����ϹǷ� ��ǰ���� 16���� ��ٸ� �ϳ��� ������� ��
		// ������ ��ǰ���� ���̴� 16�� ��Ȯ�� �����ϰų� 17�� �����ϰ� �ȴ�.(������)
		// ��ǰ���� ���̰� 16�� �Ǿ��� �� break�Ͽ� �ش� �κб��� ����ϰų�
		// ��ǰ���� ���̰� 17�� �Ǿ��� �� 16�� �ǳʶٰ� ���������Ƿ� ������ ���ڴ� �ѱ����� �� �� �ִ�.
		// ���� �ѱ� �������� �ϳ��� ����(���������ڴ� ����� �Ұ����ϹǷ�) ǥ���� ���� �������� �ϳ��� ���ְ� break�Ѵ�.

		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname1, kopo38_df.format(kopo38_price1), kopo38_df.format(kopo38_amount1),
				kopo38_df.format(kopo38_price1 * kopo38_amount1), kopo38_itemcode1);
		
		// ��ǰ�� ������ ������ 16ĭ���� ����� ���뿡�� �ѱ��� ���ڸ� ���� ������ ��ǰ�� �������� �����ϰ�,
		// �ش� ������ŭ�� ���̸� �������� �� ���ڼ���ŭ�� ����Ѵ�.
		// �ܰ��� 10ĭ�� �������� ������ ���� 9ĭ���� ����Ѵ�,
		// ������ 4ĭ�� �������� ������ ���� 3ĭ���� ����Ѵ�.
		// �ݾ��� 11ĭ�� �������� ������ ���� 10ĭ���� ����Ѵ�.
		kopo38_price += kopo38_price1 * kopo38_amount1;
		// �Ѱ��ݿ� ���� ��ǰ�� ���ݰ� ������ ���Ͽ� ���Ѵ�.
		kopo38_charnum = 0;
		kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname2.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname2.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
				kopo38_kornum--;
				kopo38_charnum--;
				break;
			}
		}

		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname2, kopo38_df.format(kopo38_price2), kopo38_df.format(kopo38_amount2),
				kopo38_df.format(kopo38_price2 * kopo38_amount2), kopo38_itemcode2);
		kopo38_price += kopo38_price2 * kopo38_amount2;
		kopo38_charnum = 0;
		kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname3.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname3.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
				kopo38_kornum--;
				kopo38_charnum--;
				break;
			}
		}
		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname3, kopo38_df.format(kopo38_price3), kopo38_df.format(kopo38_amount3),
				kopo38_df.format(kopo38_price3 * kopo38_amount3), kopo38_itemcode3);
		kopo38_price += kopo38_price3 * kopo38_amount3;
		// �ٸ� ��ǰ�� �����ϰ� �����Ѵ�.
		
		kopo38_calc("�����հ�", kopo38_df.format(Math.round(kopo38_price / 1.1)));
		kopo38_calc("�ΰ���", kopo38_df.format(kopo38_price - Math.round(kopo38_price / 1.1)));
		// kopo38_method �Լ��� �̿��� �����հ�� �ΰ����� ����Ѵ�.
		// �����հ�� �Ѱ����� 1.1�� ���� ���� �ݿø��� kopo38_df���� ���� �������� ����ϸ�
		// �ΰ����� �� ���ݿ��� �����հ踦 ������ ���� kopo38_df���� ���� �������� ����Ѵ�.

		System.out.printf("-----------------------------------------\n");
		kopo38_twostring("�Ǹ��հ�", kopo38_df.format(kopo38_price));
		System.out.printf("=========================================\n");
		kopo38_twostring("�ſ�ī��", kopo38_df.format(kopo38_price));
		System.out.printf("-----------------------------------------\n");
		kopo38_twostring("�츮ī��", "538720**********");
		kopo38_twostring("���ι�ȣ 77982843(0)", "���αݾ� " + kopo38_df.format(kopo38_price));
		System.out.printf("=========================================\n");
		kopo38_center(kopo38_sdf.format(kopo38_calendar.getTime()) + " �д缭����");
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		kopo38_center("||||||||||||||||||||");
		kopo38_center("||||||||||||||||||||");
		kopo38_center("2112820610158231");
		System.out.printf("-----------------------------------------\n");
		kopo38_center("�� ���̼� ����� �� �Ǵ� Ȩ�������� ����");
		kopo38_center(" �ϼż� ȸ������ �� �پ��� ������ ");
		kopo38_center("����������! ��");
		// kopo38_center�� kopo38_twostring�� Ȱ���� ������ ����Ѵ�.
		// �ð��� kopo38_calendar�� �ҷ��� kopo38_sdf���� ������ �������� ����Ѵ�.
	}

	public static void kopo38_twostring(String kopo38_a, String kopo38_b) {
		int kopo38_a_kornum = 0;
		int kopo38_b_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < kopo38_b.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_b.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_b_kornum++;
			}
		}
		// kopo38_a_kornum�� String kopo38_a�� ���Ե� �ѱ��� ��,
		// kopo38_b_kornum�� String kopo38_b�� ���Ե� �ѱ��� ���̴�.
		// ���� �ݺ����� ASCII�ڵ带 Ȱ���Ͽ� ���ڿ��� ���Ե� �ѱ� ���� �����ش�.
		int kopo38_spacenum = 41 - (kopo38_a.length() + kopo38_b.length() + kopo38_a_kornum + kopo38_b_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum�� �� ���� 41���� kopo38_a�� kopo38_b�� ���� ��, �׸��� �ѱ۷� ���� �þ ���̸�ŭ�� �������� �����̴�.
		// ��, kopo38_a�� kopo38_b�� �����ϰ� �ִ� ������ ������ �� ������ �����̴�.
		// kopo38_spacenum��ŭ ��ĭ�� kopo38_space�� �����Ѵ�.
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, kopo38_b);
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

	public static void kopo38_calc(String kopo38_a, String kopo38_b) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		// ���κ� ������ ����ϱ����� kopo38_a�� ���Ե� �ѱ��� �����ش�.

		int kopo38_spacenum = 41 - 19 - (kopo38_a.length() + kopo38_a_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum�� �� ���� 41���� kopo38_b�� ������ �κ� 19��
		// kopo38_a�� �����ϰ� �ִ� �κ�(kopo38_a�� ���� + �ѱ� ���ڼ�)�� ������ �������� kopo38_a�� �տ� �� �� ������ �����̴�. 

		System.out.printf("%s%s%19.19s\n", kopo38_space, kopo38_a, kopo38_b);
		// kopo38_space��ŭ�� ������� ������ְ� �̾ kopo38_a�� ����Ѵ�. ������ kopo38_b�� �����ϴ� ���̴� 19�� �����Ѵ�.
	}

}