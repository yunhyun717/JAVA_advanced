package kopo38_swc08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class kopo38_P08 {

	public static void main(String[] args) throws IOException {
		// try-catch ��� throws�� �̿�, IOException�� �����ϵ��� �����Ѵ�.
		File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\day_data\\kopo38_THTSKS010H00.dat");
		// File�� �ҷ��� ���� ��θ� ���� ��� ������ �����Ѵ�.
		BufferedReader kopo38_br = new BufferedReader(new FileReader(kopo38_f));
		// BufferedReader�� �ҷ��� ���� �б⸦ �Ѵ�.
		File kopo38_f1 = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\day_data\\kopo38_StockDailyPrice.csv");
		// File�� �ҷ��� ���� ��θ� ���� ��� ������ �����Ѵ�.
		BufferedWriter kopo38_bw1 = new BufferedWriter(new FileWriter(kopo38_f1));
		// BufferedWriter�� �ҷ��� ���� ���⸦ �Ѵ�.
		String kopo38_readtxt;
		int kopo38_cnt = 0;
		int kopo38_wcnt = 0;
		// String kopo38_readtxt�� �����ϰ� ���� kopo38_cnt�� kopo38_wcnt�� 0���� �����Ѵ�.
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			// String kopo38_readtxt�� ��� ������ �� �� �� �о���� ������ �����ϰ�
			// �� ���� null�� �� ������ �ݺ��Ѵ�.
			StringBuffer kopo38_s = new StringBuffer();
			// StringBuffer�� �ҷ��´�.
			String[] kopo38_field = kopo38_readtxt.split("%_%");
			// String�� kopo38_field�� kopo38_readtxt�� %_%�� ���� ������ ����.
			if (kopo38_field.length > 2 && kopo38_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				// kopo38_field�� ���̰� 2���� ũ��, kopo38_field�� �ι�° ���� "^"�� ""�� ��ü�ϸ鼭
				// trim���� kopo38_field �翷�� ������ �����Ѵ�. ���� 1��° ���ڰ� "A"�� ������...
				kopo38_s.append(kopo38_field[0].replace("^", "").trim());
				// 0��° �׸��� "^"�� ""�� ��ü�ϰ� �翷�� ������ �����Ѵ�.
				// �ش� �׸��� ���忡 �߰��Ѵ�.
				for (int kopo38_j = 1; kopo38_j < kopo38_field.length; kopo38_j++) {
					kopo38_s.append("," + kopo38_field[kopo38_j].replace("^", "").trim());
				}
				// 1���� ������ kopo38_field�� ���̱��� ���ϴ� ���� kopo38_j�� ���� ���忡 "^"�� ""�� ��ü�ϰ�
				// ���� ������ ������ kopo38_field�� �׸��� ���� �������� �߰��Ѵ�.
				kopo38_bw1.write(kopo38_s.toString());
				// ������ csv���Ͽ� ����.
				kopo38_bw1.newLine();
				// �� ������ �Է��Ѵ�.
				kopo38_wcnt++;
				// kopo38_wcnt�� 1�� ���Ѵ�.(ī��Ʈ)
			}
			kopo38_cnt++;
			// kopo38_cnt�� 1�� ���Ѵ�.(ī��Ʈ)
		}
		kopo38_br.close();
		kopo38_bw1.close();
		// BufferedReader�� BufferedWriter�� �ݴ´�.
		System.out.printf("Program End[%d][%d]records\n", kopo38_cnt, kopo38_wcnt);
		// ������ �������� ī��Ʈ�� ����Ѵ�.
	}

}
