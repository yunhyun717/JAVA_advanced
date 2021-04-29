package kopo38_swc08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P11 {

	public static void main(String[] args) throws IOException {
		// try-catch ��� throws�� �̿�, IOException�� �����ϵ��� �����Ѵ�.
		File kopo38_f = new File(
				"C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\day_data\\kopo38_SamsungStockPrice.csv");
		// File�� �ҷ��� ���� ��θ� ���� ��� ������ �����Ѵ�.
		BufferedReader kopo38_br = new BufferedReader(new FileReader(kopo38_f));
		// BufferedReader�� �ҷ��� ���� �б⸦ �Ѵ�.
		String kopo38_readtxt;
		int kopo38_cnt = 0;
		String kopo38_samsung_max_date = "";
		String kopo38_samsung_min_date = "";
		int kopo38_samsung_max_value = 0;
		int kopo38_samsung_min_value = 0;
		// String kopo38_readtxt�� �����ϰ� ���� kopo38_cnt�� 0���� �����Ѵ�.
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			// String kopo38_readtxt�� ��� ������ �� �� �� �о���� ������ �����ϰ�
			// �� ���� null�� �� ������ �ݺ��Ѵ�.
			String[] kopo38_field = kopo38_readtxt.split(",");
			// String�� kopo38_field�� kopo38_readtxt�� ","�� ���������� ����.
			if (kopo38_field[1].substring(0, 4).equals("2015")) {
				// kopo38_field�� ù��° �׸��� 0���� 3��° ���ڰ� "2015"�� ������(��¥�� 2015�⵵�̸�)
				if (kopo38_cnt == 0) {
					kopo38_samsung_max_date = kopo38_field[1];
					kopo38_samsung_min_date = kopo38_field[1];
					kopo38_samsung_max_value = Integer.parseInt(kopo38_field[3]);
					kopo38_samsung_min_value = Integer.parseInt(kopo38_field[3]);
					// kopo38_samsung_max_date�� min_date�� kopo38_field[1]���� �����Ѵ�.
					// kopo38_cnt�� 0�� �� kopo38_samsung_max�� kopo38_samsung_min��
					// kopo38_field�� 5��° �׸�� 6��° �׸����� ���� �����Ѵ�.(�ʱⰪ ����)
				} else {
					kopo38_samsung_max_value = Math.max(kopo38_samsung_max_value, Integer.parseInt(kopo38_field[3]));
					kopo38_samsung_min_value = Math.min(kopo38_samsung_min_value, Integer.parseInt(kopo38_field[3]));
					// �̿��� ��� kopo38_samsung_max�� kopo38_samsung_min�� ���� �ڱ��ڽŰ�
					// �о�� �� �� ū �� �Ǵ� ���� ������ �����Ѵ�.
					if (kopo38_samsung_max_value == Integer.parseInt(kopo38_field[3])) {
						kopo38_samsung_max_date = kopo38_field[1];
					} else if (kopo38_samsung_min_value == Integer.parseInt(kopo38_field[3])) {
						kopo38_samsung_min_date = kopo38_field[1];
					}
				}
				kopo38_cnt++;
				// kopo38_cnt�� 1�� ���Ѵ�.(ī��Ʈ)
			}
		}
		System.out.printf("2015�� �Ｚ �ְ� : �� %d��\n", kopo38_cnt);
		System.out.printf("2015�� �ְ� : %d�� (%s)\n", kopo38_samsung_max_value, kopo38_samsung_max_date);
		System.out.printf("2015�� ������ : %d�� (%s)\n", kopo38_samsung_min_value, kopo38_samsung_min_date);
		// ����� ����Ѵ�.
		kopo38_br.close();
		// BufferedReader�� BufferedWriter�� �ݴ´�.
	}
}