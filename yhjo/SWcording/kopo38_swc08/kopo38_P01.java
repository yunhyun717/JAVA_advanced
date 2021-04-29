package kopo38_swc08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class kopo38_P01 {

	public static void main(String[] args) {
		try {
			// Exception ������ �߻��ص� ó���ϰ� ������ �� �ִ� try-catch�� ���
			File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\k38_Mytest.txt");
			// File�� �ҷ��� ���� ��θ� ���� ��� ������ �����Ѵ�.
			FileWriter kopo38_fw = new FileWriter(kopo38_f);
			// FilwWriter�� �ҷ��� ��� ���Ͽ� ������ �ۼ��� �� �ְ��Ѵ�.
			kopo38_fw.write("�ȳ� ����\n");
			kopo38_fw.write("hello ���\n");
			// write�� ������ �ۼ��Ѵ�.
			kopo38_fw.close();
			// FileWriter�� �ҷ��� �� �ݾ���� ���Ŀ� �� �� �ִ�.
			FileReader kopo38_fr = new FileReader(kopo38_f);
			// FileReader�� �ҷ��� ��� ������ ���� �� �ְ� �Ѵ�.
			int kopo38_n = -1;
			char[] kopo38_ch;
			// ���� kopo38_n�� -1�� �����ϰ�, ���� �迭 kopo38_ch�� �����Ѵ�.
			while (true) {
				// break���� ���� �ݺ�
				kopo38_ch = new char[100];
				// ���� �迭 kopo38_ch�� 100�������� ���ڰ� �� �� �ְ� �����Ѵ�.
				kopo38_n = kopo38_fr.read(kopo38_ch);
				// FileReader���� read�� kopo38_ch���� �ҷ��� ������ ���� return�Ѵ�.
				// ���ڰ� ������ -1�� return�ϸ�, ���� kopo38_n�� �� ������ �Ѵ�.
				if (kopo38_n == -1)
					break;
				// ���� kopo38_n�� -1�̸� break
				for (int i = 0; i < kopo38_n; i++) {
					System.out.printf("%c", kopo38_ch[i]);
				}
				// 0���� ������ kopo38_n���� ���� ���� kopo38_i�� ���� kopo38_ch[kopo38_i]�� ���
			}
			kopo38_fr.close();
			// FileReader�� �ݴ´�.
			System.out.printf("\n FILE READ END ");
		} catch (Exception e) {
			System.out.printf("�� ����[%s]\n", e);
			// Exception�� �߻��ϸ� ������ ����Ѵ�.
		}
	}
}
