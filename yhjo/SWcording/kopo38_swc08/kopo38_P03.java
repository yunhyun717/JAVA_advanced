package kopo38_swc08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P03 {

	public static void main(String[] args) throws IOException {
		// try-catch ��� throws�� �̿�, IOException�� �����ϵ��� �����Ѵ�.
		File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\kopo38_���������������.csv");
		// File�� �ҷ��� ���� ��θ� ���� ��� ������ �����Ѵ�.
		BufferedReader kopo38_br = new BufferedReader(new FileReader(kopo38_f));
		// BufferedReader�� �ҷ��� ���� �б⸦ �Ѵ�.
		String kopo38_readtxt;
		if ((kopo38_readtxt = kopo38_br.readLine()) == null) {
			System.out.printf("�� �����Դϴ�\n");
		}
		// String kopo38_readtxt�� ��� ������ �� �� �� �о���� ������ �����ϰ� �� ���� null�̸�
		// ������ ����Ѵ�.
		String[] kopo38_field_name = kopo38_readtxt.split(",");
		// ���ڿ� kopo38_field_name�� kopo38_readtxt(������ ù ��)�� ","�� �ڸ� ������ �����Ѵ�.
		int kopo38_LineCnt = 0;
		// ���� kopo38_LineCnt�� 0���� �����Ѵ�.
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			kopo38_LineCnt++;
			// kopo38_LineCnt�� 1�� ���Ѵ�.
			// String kopo38_readtxt�� ��� ������ �� �� �� �о���� ������ �����ϰ�
			// (ù ���� �տ��� �о�����Ƿ� �� �����ٺ���)
			// �� ���� null�� �� ������ �ݺ��Ѵ�.
			String[] kopo38_field = kopo38_readtxt.split(",");
			// ���ڿ� field�� kopo38_readtxt�� ","�� �ڸ� ������ �����Ѵ�.
			System.out.printf("**[%d��° �׸�]**********\n", kopo38_LineCnt);
			// ������ ����Ѵ�.
			for (int kopo38_j = 0; kopo38_j < kopo38_field_name.length; kopo38_j++) {
				System.out.printf(" %s : %s\n", kopo38_field_name[kopo38_j], kopo38_field[kopo38_j]);
			}
			// 0���� kopo38_field_name�� ���̱��� ���ϴ� ���� kopo38_j�� ����
			// kopo38_field_name[j]�� kopo38_field[j]�� ����Ѵ�.
			System.out.printf("*********************\n");
			if (kopo38_LineCnt == 100)
				break;
			// kopo38_LineCnt�� 100�̸� break
		}
		kopo38_br.close();
		// BufferedReader�� �ݴ´�.
	}
}
