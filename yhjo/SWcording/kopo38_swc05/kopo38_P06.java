package kopo38_swc05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P06 {
	static int kopo38_receiptwidth = 41;
	// ������ ���� ĭ�� ����, �ּ� 34ĭ�� �����ؾ��Ѵ�.

	public static void main(String[] args) {
		String[][] kopo38_items = { { "tf", "��ź������ ��� 4~7��/�� (1.3kg����)", "9900", "2" },
				{ "tf", "[������] �������� 3~6��/�� (1.2kg����)", "10900", "1" }, { "tf", "������ 200g", "1480", "2" },
				{ "tf", "��ȣ�� 200g", "1280", "2" }, { "tf", "���Ƕ� 30���� (Ư��, 1800g)", "6980", "1" },
				{ "tf", "[������] �������� 3~6��/�� (1.2kg����)", "10900", "2" }, { "tf", "[20���] �̸��� 20kg", "58900", "1" },
				{ "tf", "[������] ������� 4~11��/�� (1.8kg)", "12800", "2" }, { "tf", "[������] ���߹���丶�� 1kg/��", "7900", "2" },
				{ "tf", "[Ǯ����] ������ �ᳪ�� 340g", "2500", "2" }, { "tf", "[������] ����丶�� 600g/��", "5400", "3" },
				{ "tf", "[�������] �ķ��� ��ũ ��ȹ(900ml*2) 1800ml", "3870", "3" }, { "0", "��귣�� ������ ��Ƽ�� 100��", "980", "3" },
				{ "0", "��귣�� �����尩125��", "1680", "4" }, { "0", "���� �Ŀ��� ���� ������2.7L", "6900", "1" },
				{ "0", "����ǻ�� �������� KF94 �Ǿ��ǰ ���� ���� �� ȭ��Ʈ ��ȸ�븶��ũ 100��", "15900", "1" },
				{ "0", "���� ����ŷ�Ҵ� ǻ��� 750ML ���", "6500", "1" }, { "0", "��귣�� �ݵ��� �Ƹ޸�ī�� 500m", "1880", "5" },
				{ "0", "[��귣��] ���ҵ����߳��߲�ġ 800g", "12980", "1" }, { "0", "����ũ �ݷҺ�� ��Ƽ��Ű�� �������� 1kg (Ȧ��)", "14980", "1" },
				{ "0", "������ ĩ�� ����Ƽ�� 5���� 3����+ũ�ν��׼� Ź���� ������ 2����", "9900", "2" }, { "0", "��� ��ȫ������� 4��", "2980", "2" },
				{ "0", "[Ǯ����]������ ���� �κ� 600g", "4980", "2" }, { "0", "2080 �������� ���� ��� 140g*3��", "7900", "1" },
				{ "0", "[����] ���� ī��� 220ml*6�� ��ȹ (��ȹ��������)", "5980", "6" },
				{ "0", "��귣�� �ݷҺ�� �Ƹ޸�ī�� �� 2.1L", "2980", "4" }, { "0", "[�������] �����Ƽ ī��� ��ī 250ml", "1000", "5" },
				{ "0", "[�ƽ�] TOP ���� ���������� �� 300ml", "1000", "10" },
				{ "0", "[�������] �����Ƽ ī��� �������� 250ml", "1000", "10" },
				{ "0", "(�����)[�ƽ�] ��ī��� ���ϵ� Ŀ�ǹͽ� 250��(12g*250��)", "27200", "1" } };
		// String ���� �迭 kopo38_items�� �����Ѵ�. { ��������, ��ǰ��, �ܰ�, ���� } ���̴�.(���� ���ο� �鼼�� ���
		// "tf", �ƴҰ�� "0"�� �Է��Ѵ�.)

		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		SimpleDateFormat kopop38_sdf2 = new SimpleDateFormat("YYYYMMdd");
		// ����� method���� �ҷ��´�. kopo38_df�� ���ڿ� ���ڸ����� ','�� ��´�. kopo38_calendar�� �ð��� �ҷ��´�.
		// kopo38_sdf�� kopo38_sdf2�� �ð��� ����ϴ� ������ �����Ѵ�.

		System.out.printf("  *******   �̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("  *      *  206-85-50913 ����\n");
		System.out.printf("  *******   ���� ������ ������� 552\n");
		System.out.printf("\n������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż�7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n\n");
		// ������ ����Ѵ�.
		kopo38_twostring("[�� ��]" + kopo38_sdf.format(kopo38_calendar.getTime()), "POS:0011-9861");
		// �ۼ��� method�� Ȱ���� ���� ������ �Ѵ�. �������� kopo39_sdf�� kopo38_calendar�� Ȱ���Ͽ� ���� �ð��� ������
		// �������� �ҷ��´�.
		kopo38_drawline();
		// kopo38_receiptwidth��ŭ ���� �ߴ� method�� kopo38_line�� �����Ѵ�.
		int kopo38_tax_name = kopo38_receiptwidth - 25;
		int kopo38_tnsf = (int) Math.ceil((kopo38_tax_name - 8) / 2.0);
		int kopo38_tnsb = (int) Math.floor((kopo38_tax_name - 8) / 2.0);

		System.out.printf(
				"%" + (kopo38_tnsf + 5) + "." + 5 + "s%" + kopo38_tnsb + "." + kopo38_tnsf + "s%8.5s%3.2s%8.5s\n",
				"�� ǰ ��", "", "��   ��", "����", "��   ��");
		// ������ ���̸� kopo38_receiptwidth�� �������� ��, ������ �׸��� �����ϴ� ���̴� '�ܰ�' : 10ĭ, '����' : 4ĭ,
		// '�ݾ�' : 11ĭ , '��ǰ��' : kopo38_receiptwidth -10 -4 -11�� �����Ѵ�.
		// (�ܰ�, ����, �ݾ� �κ��� ���� �� �����Ƿ� ��ǰ���� ���δ�. '��ǰ��'�� ������ ���� ���ο� ��ǰ�� �κ��� �����Ѵ�.)
		// �̶�, ���α׷��� �ѱ��� 1ĭ�� �����ϴ� ������ �ν��ϰ� ����������, �����δ� 2ĭ�� �����ϹǷ� �ѱ� �� ���ڴ� ���̸� ��ĭ�� �ٿ����Ѵ�.
		// '��ǰ��' �׸��� ��� ������ ���� kopo38_tax_nameĭ���� '��ǰ��' ������ ������ 8���ڸ�ŭ�� �� ���¿��� 2�� ������
		// �ø��� ĭ��ŭ�� �տ�, ������ ĭ��ŭ�� �ڿ� ��ġ�Ͽ� ó���Ѵ�.
		// '�ܰ�' �׸��� 10ĭ���� �ѱ� 2���ڸ�ŭ�� ���̸� �� 8ĭ���� ó���ߴ�.
		// '����' �׸��� 4ĭ���� �ѱ� 2���ڸ�ŭ�� ���̸� �� 2ĭ���� ó���ؾ� ������ ��ġ ������ ���� 3ĭ���� ó���Ͽ���.
		// '�ݾ�' �׸��� 11ĭ���� �ѱ� 2���ڸ�ŭ�� ���̸� �� 9ĭ���� ó���ؾ� ������ '����'�� ��ġ �������� 8ĭ���� ó���Ͽ���.
		int kopo38_nums = kopo38_items.length;
		// �� ��ǰ ������ kopo38_nums�� kopo38_items ���� �迭�� ���̷� �����ߴ�.
		int kopo38_taxfreeprice = 0;
		int kopo38_taxitemprice = 0;
		// �鼼 ��ǰ ���� ���� kopo38_taxfreeprice�� ���� ��ǰ ���� ���� kopo38_taxitemprice�� ���� 0���� �����ϰ�
		// �����Ѵ�.
		for (int kopo38_i = 0; kopo38_i < kopo38_items.length; kopo38_i++) {
			// 0���� ������ kopo38_items.length�� ���̺��� ���� ���� kopo38_i�� ����(��� ��ǰ�� ��� �� ó���ϱ� ���� �ݺ���
			// ���)
			if (kopo38_i % 5 == 0) {
				kopo38_drawline();
			}
			// kopo38_i�� 0�� �ƴϰ�(������������ �Ǽ��� ���� �ʴ´�.) kopo38_i�� 5�� ������ �������� �Ǽ��� �ߴ´�.(�׸� 5������
			// �Ǽ��� �ߴ´�.)
			int kopo38_iprice = Integer.parseInt(kopo38_items[kopo38_i][2])
					* Integer.parseInt(kopo38_items[kopo38_i][3]);
			// ���� kopo38_iprice�� ���� ó����(String������ �Էµ����Ƿ�) ��ǰ ���ݰ� ��ǰ ������ ���� ������ �����Ѵ�.(���� ��ǰ
			// �ݾ�)
			if (kopo38_items[kopo38_i][0].equals("tf")) {
				System.out.printf("* ");
				kopo38_taxfreeprice += kopo38_iprice;
				// kopo38_items[kopo38_i][0]�� "tf"�̸�(���� ó���ǰ��ִ� ��ǰ�� �鼼 ����̸�) �� �տ� "* "�� �ִ´�.
				// ���� kopo38_taxfreeprice(�鼼 ��ǰ ������ ��)�� kopo38_iprice(���� ��ǰ �ݾ�)�� ���Ѵ�.
			} else {
				System.out.printf("  ");
				kopo38_taxitemprice += kopo38_iprice;
			}
			// kopo38_items[kopo38_i][0]�� "tf"�� �ƴϸ�(���� ó���ǰ��ִ� ��ǰ�� ���� ����̸�) �� �տ� " "�� �ִ´�.("*
			// "�� ���� ���̸� �����ֱ� ����)
			// ���� kopo38_taxitemprice(�鼼 ��ǰ ������ ��)�� kopo38_iprice(���� ��ǰ �ݾ�)�� ���Ѵ�.
			int kopo38_namewidth = kopo38_tax_name - 2;
			// ��ǰ�������� ���� ���θ� ������ ���̸� ���� namewidth�� �����Ѵ�. namewidth�� �ܰ�, ����, �ݾ��� �켱 ��µǰ�
			// ���� �κп� ��µǾ���ϹǷ� kopo38_tax_name���� �������α��� 2�� ������ �κ����� �����Ѵ�.
			int kopo38_charnum = 0;
			int kopo38_kornum = 0;

			for (int kopo38_j = 0; kopo38_j < kopo38_items[kopo38_i][1].length(); kopo38_j++) {
				int kopo38_charint = (int) (kopo38_items[kopo38_i][1].charAt(kopo38_j));
				kopo38_charnum = kopo38_j + 1;
				if (44031 < kopo38_charint && 55204 > kopo38_charint) {
					kopo38_kornum++;
				}
				if (kopo38_kornum + kopo38_charnum == kopo38_namewidth) {
					break;
				} else if (kopo38_kornum + kopo38_charnum == kopo38_namewidth + 1) {
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
			// ���̰� 1�Ǵ� 2�� �����ϹǷ� ��ǰ���� kopo38_namewidth���� ��ٸ� �ϳ��� ������� ��
			// ������ ��ǰ���� ���̴� kopo38_namewidth�� ��Ȯ�� �����ϰų� kopo38_namewidth+1�� �����ϰ� �ȴ�.(������)
			// ��ǰ���� ���̰� kopo38_namewidth�� �Ǿ��� �� break�Ͽ� �ش� �κб��� ����ϰų�
			// ��ǰ���� ���̰� kopo38_namewidth+1�� �Ǿ��� �� kopo38_namewidth�� �ǳʶٰ� ���������Ƿ� ������ ���ڴ� �ѱ�����
			// �� �� �ִ�.
			// ���� �ѱ� �������� �ϳ��� ����(���������ڴ� ����� �Ұ����ϹǷ�) ǥ���� ���� �������� �ϳ��� ���ְ� break�Ѵ�.
			System.out.printf(
					"%-" + (kopo38_namewidth - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n",
					kopo38_items[kopo38_i][1], kopo38_df.format(Integer.parseInt(kopo38_items[kopo38_i][2])),
					kopo38_items[kopo38_i][3], kopo38_df.format(kopo38_iprice));
			// ������ ���� ��ǰ�� ������ ������ namewidth���� ����� ���뿡�� �ѱ��� ���ڸ� ���� ������ ��ǰ�� �������� �����ϰ�,
			// �ش� ������ŭ�� ���̸� �������� �� ���ڼ���ŭ�� ����Ѵ�.
			// �ܰ��� 10ĭ�� �������� ������ ���� 9ĭ���� ����Ѵ�.
			// ������ 4ĭ�� �������� ������ ���� 3ĭ���� ����Ѵ�.
			// �ݾ��� 11ĭ�� �������� ������ ���� 10ĭ���� ����Ѵ�.
		}
		kopo38_drawline();
		System.out.println();
		kopo38_calc("�� ǰ�� ����", kopo38_df.format(kopo38_nums));
		kopo38_calc("(*)�� ��  �� ǰ", kopo38_df.format(kopo38_taxfreeprice));
		kopo38_calc("�� ��  �� ǰ", kopo38_df.format(Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("��   ��   ��", kopo38_df.format(kopo38_taxitemprice - Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("��        ��", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		// ��� �κ� ������ ���߱� ���� method kopo38_calc�� �̿��Ѵ�.
		// ���� ������ kopo38_df�� Ȱ���Ͽ� ������ �������� ����Ѵ�.
		// �� ǰ������� kopo38_nums�� ����Ѵ�.
		// �鼼��ǰ�� kopo38_taxfreeprice�� ����Ѵ�.
		// ������ǰ�� kopo38_taxitemprice�� 1.1�� ���� ���� �Ҽ��� ù°�ڸ����� �ݿø����� �����Ѵ�.
		// �ΰ����� kopo38_taxitemprice���� ������ǰ ������ �� ������ �����Ѵ�.
		// �հ�� �鼼��ǰ�� ������ǰ������ ���̴�.
		kopo38_twostring("�������ݾ�", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		// ���� ���ݾ��� kopo38_twostring�� Ȱ���� �������� �鼼��ǰ�� ������ǰ ������ ���� ����Ѵ�.
		kopo38_drawline();
		kopo38_twostring("0012 KEB �ϳ�", "541707**0484/35860658");
		kopo38_twostring("ī�����(IC)", "�Ͻú� /" + kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_drawline();
		// kopo38_twostring�� kopo38_drawline�� Ȱ���Ͽ� ����Ѵ�.
		kopo38_center("[�ż�������Ʈ ����]");
		System.out.printf("%s\n", "��*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		kopo38_threestring("��ȸ�߻�����Ʈ", "9350**9995",
				kopo38_df.format((int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)));
		kopo38_twostring("����(����)����Ʈ ",
				kopo38_df.format(1000000 + (int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)) + "("
						+ kopo38_df.format(1000000) + ")");
		// kopo38_threestring�� Ȱ���Ͽ� String�� 3�� ���� �� ������ �����ϰ� �����Ͽ� ����Ѵ�.
		// �߻� ����Ʈ�� �� ���� �ݾ��� 1%��, ���� ����Ʈ�� ���� ����Ʈ�� �߻�����Ʈ�� ���� ������ ����Ѵ�.
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		kopo38_drawline();
		kopo38_center("���űݾױ��� ���������ð� �ڵ��ο�");
		kopo38_twostring("������ȣ :", "34��****");
		kopo38_twostring("�����ð� :", "2021-04-14 15:00:15");
		kopo38_drawline();
		kopo38_twostring("ĳ��:084599 ��OO", "1150");
		kopo38_center("|||||||||||||||||||||||||||||||||");
		kopo38_center("|||||||||||||||||||||||||||||||||");
		kopo38_center(kopop38_sdf2.format(kopo38_calendar.getTime()) + "/00119861/00164980/31");
		// method�� �̿��� ������ ����Ѵ�.

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
		int kopo38_spacenum = kopo38_receiptwidth
				- (kopo38_a.length() + kopo38_b.length() + kopo38_a_kornum + kopo38_b_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum�� �� ���� 41���� kopo38_a�� kopo38_b�� ���� ��, �׸��� �ѱ۷� ���� �þ ���̸�ŭ��
		// �������� �����̴�.
		// ��, kopo38_a�� kopo38_b�� �����ϰ� �ִ� ������ ������ �� ������ �����̴�.
		// kopo38_spacenum��ŭ ��ĭ�� kopo38_space�� �����Ѵ�.
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, kopo38_b);
		// ������ kopo38_a, ����� ���� ������ ��ŭ�� ����, ������ kopo38_b�� ��ġ�Ͽ� �� String�� ���� ���� �Ѵ�.
	}

	public static void kopo38_threestring(String kopo38_a, String kopo38_b, String kopo38_c) {
		int kopo38_a_kornum = 0;
		int kopo38_b_kornum = 0;
		int kopo38_c_kornum = 0;
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
		for (int kopo38_i = 0; kopo38_i < kopo38_c.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_c.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_c_kornum++;
			}
		}
		// kopo38_a_kornum�� String kopo38_a�� ���Ե� �ѱ��� ��,
		// kopo38_b_kornum�� String kopo38_b�� ���Ե� �ѱ��� ��,.
		// kopo38_C_kornum�� String kopo38_c�� ���Ե� �ѱ��� ���̴�.
		// ���� �ݺ����� ASCII�ڵ带 Ȱ���Ͽ� ���ڿ��� ���Ե� �ѱ� ���� �����ش�.
		int kopo38_spacenum = kopo38_receiptwidth - (kopo38_a.length() + kopo38_b.length() + kopo38_c.length()
				+ kopo38_a_kornum + kopo38_b_kornum + kopo38_c_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum / 2; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum�� �� ���̿��� kopo38_a�� kopo38_b, kopo38_c�� ���� ��,
		// �׸��� �ѱ۷� ���� �þ ���̸�ŭ�� �������� �����̴�.
		// ��, kopo38_a�� kopo38_b, kopo38_c�� �����ϰ� �ִ� ������ ������ �� ������ �����̴�.
		// kopo38_spacenum�� �ݸ�ŭ�� ��ĭ�� kopo38_space�� �����Ѵ�.
		System.out.printf("%s%s%s%s%s\n", kopo38_a, kopo38_space, kopo38_b, kopo38_space, kopo38_c);
	}

	public static void kopo38_center(String kopo38_a) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charnum = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charnum && 55204 > kopo38_charnum) {
				kopo38_a_kornum++;
			}
		}
		// kopo38_a_num�� �̿��� String kopo38_a�� ���Ե� �ѱ��� �����ش�.
		int kopo38_spacenum = (kopo38_receiptwidth - (kopo38_a.length() + kopo38_a_kornum)) / 2;
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum�� �� ���̿��� kopo38_a�� ���ڼ��� �ѱ۷� ���� �þ ���̸�ŭ�� �������� ���ڸ� 2�� ���� ���̴�.
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

		int kopo38_spacenum = kopo38_receiptwidth - 19 - (kopo38_a.length() + kopo38_a_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenum�� �� ���̿��� kopo38_b�� ������ �κ� 19��
		// kopo38_a�� �����ϰ� �ִ� �κ�(kopo38_a�� ���� + �ѱ� ���ڼ�)�� ������ �������� kopo38_a�� �տ� �� �� ������
		// �����̴�.

		System.out.printf("%s%s%19.19s\n", kopo38_space, kopo38_a, kopo38_b);
		// kopo38_space��ŭ�� ������� ������ְ� �̾ kopo38_a�� ����Ѵ�. ������ kopo38_b�� �����ϴ� ���̴� 19��
		// �����Ѵ�.
	}

	public static void kopo38_drawline() {
		for (int i = 0; i < kopo38_receiptwidth; i++) {
			System.out.printf("-");
		}
		System.out.printf("\n");
		// ������ ���̸�ŭ ���� �ߴ� method�̴�.
	}
}