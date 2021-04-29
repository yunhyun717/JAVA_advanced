package kopo38_swc06;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P03 {
	static int kopo38_receiptwidth = 41;
	static String[][] kopo38_items = { { "tf", "��ź������ ��� 4~7��/�� (1.3kg����)", "9900", "2" },
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
			{ "0", "[����] ���� ī��� 220ml*6�� ��ȹ (��ȹ��������)", "5980", "6" }, { "0", "��귣�� �ݷҺ�� �Ƹ޸�ī�� �� 2.1L", "2980", "4" },
			{ "0", "[�������] �����Ƽ ī��� ��ī 250ml", "1000", "5" }, { "0", "[�ƽ�] TOP ���� ���������� �� 300ml", "1000", "10" },
			{ "0", "[�������] �����Ƽ ī��� �������� 250ml", "1000", "10" },
			{ "0", "(�����)[�ƽ�] ��ī��� ���ϵ� Ŀ�ǹͽ� 250��(12g*250��)", "27200", "1" } };
	
	// ������ ���̿� ��ǰ ������ ���������� �����Ѵ�.

	public static void main(String[] args) {
		int itemCount = kopo38_items.length;
		TitlePrint();
		TimeStemp();
		HeaderPrint();
		for (int kopo38_i = 0; kopo38_i < itemCount; kopo38_i++) {
			ItemPrint(kopo38_i);
		}
		TotalPrint();
	}
	// main�Լ��� �޼ҵ� ���� �������� ���ܳ��� ������ �޼ҵ�� �����Ѵ�.

	public static void TitlePrint() {
		System.out.printf("  *******   �̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("  *      *  206-85-50913 ����\n");
		System.out.printf("  *******   ���� ������ ������� 552\n");
		System.out.printf("\n������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż�7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n\n");
	}

	public static void TimeStemp() {
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		kopo38_twostring("[�� ��]" + kopo38_sdf.format(kopo38_calendar.getTime()), "POS:0011-9861");
		kopo38_drawline();
	}

	public static void HeaderPrint() {
		int kopo38_tax_name = kopo38_receiptwidth - 25;
		int kopo38_tnsf = (int) Math.ceil((kopo38_tax_name - 8) / 2.0);
		int kopo38_tnsb = (int) Math.floor((kopo38_tax_name - 8) / 2.0);

		System.out.printf(
				"%" + (kopo38_tnsf + 5) + "." + 5 + "s%" + kopo38_tnsb + "." + kopo38_tnsf + "s%8.5s%3.2s%8.5s\n",
				"�� ǰ ��", "", "��   ��", "����", "��   ��");
		kopo38_drawline();
	}

	public static void ItemPrint(int kopo38_i) {
		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		int kopo38_iprice = Integer.parseInt(kopo38_items[kopo38_i][2]) * Integer.parseInt(kopo38_items[kopo38_i][3]);
		if (kopo38_items[kopo38_i][0].equals("tf")) {
			System.out.printf("* ");
		} else {
			System.out.printf("  ");
		}
		int kopo38_namewidth = kopo38_receiptwidth - 27;
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
		System.out.printf("%-" + (kopo38_namewidth - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n",
				kopo38_items[kopo38_i][1], kopo38_df.format(Integer.parseInt(kopo38_items[kopo38_i][2])),
				kopo38_items[kopo38_i][3], kopo38_df.format(kopo38_iprice));
		if ((kopo38_i + 1) % 5 == 0) {
			kopo38_drawline();
		}
	}

	public static void TotalPrint() {
		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopop38_sdf2 = new SimpleDateFormat("YYYYMMdd");

		int kopo38_taxfreeprice = 0;
		int kopo38_taxitemprice = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_items.length; kopo38_i++) {
			int kopo38_iprice = Integer.parseInt(kopo38_items[kopo38_i][2])
					* Integer.parseInt(kopo38_items[kopo38_i][3]);
			if (kopo38_items[kopo38_i][0].equals("tf")) {
				kopo38_taxfreeprice += kopo38_iprice;
			} else {
				kopo38_taxitemprice += kopo38_iprice;
			}
		}

		System.out.println();
		kopo38_calc("�� ǰ�� ����", kopo38_df.format(kopo38_items.length));
		kopo38_calc("(*)�� ��  �� ǰ", kopo38_df.format(kopo38_taxfreeprice));
		kopo38_calc("�� ��  �� ǰ", kopo38_df.format(Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("��   ��   ��", kopo38_df.format(kopo38_taxitemprice - Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("��        ��", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_twostring("�������ݾ�", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_drawline();
		kopo38_twostring("0012 KEB �ϳ�", "541707**0484/35860658");
		kopo38_twostring("ī�����(IC)", "�Ͻú� /" + kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_drawline();
		kopo38_center("[�ż�������Ʈ ����]");
		System.out.printf("%s\n", "��*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		kopo38_threestring("��ȸ�߻�����Ʈ", "9350**9995",
				kopo38_df.format((int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)));
		kopo38_twostring("����(����)����Ʈ ",
				kopo38_df.format(1000000 + (int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)) + "("
						+ kopo38_df.format(1000000) + ")");
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
		int kopo38_spacenum = kopo38_receiptwidth
				- (kopo38_a.length() + kopo38_b.length() + kopo38_a_kornum + kopo38_b_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, kopo38_b);
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
		int kopo38_spacenum = kopo38_receiptwidth - (kopo38_a.length() + kopo38_b.length() + kopo38_c.length()
				+ kopo38_a_kornum + kopo38_b_kornum + kopo38_c_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum / 2; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
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
		int kopo38_spacenum = (kopo38_receiptwidth - (kopo38_a.length() + kopo38_a_kornum)) / 2;
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		System.out.printf("%s%s\n", kopo38_space, kopo38_a);
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

		int kopo38_spacenum = kopo38_receiptwidth - 19 - (kopo38_a.length() + kopo38_a_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		System.out.printf("%s%s%19.19s\n", kopo38_space, kopo38_a, kopo38_b);
	}

	public static void kopo38_drawline() {
		for (int i = 0; i < kopo38_receiptwidth; i++) {
			System.out.printf("-");
		}
		System.out.printf("\n");
	}
}