package kopo38_swc08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P07 {

	public static void main(String[] args) throws IOException {
		// try-catch ��� throws�� �̿�, IOException�� �����ϵ��� �����Ѵ�.
		File f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\day_data\\kopo38_THTSKS010H00.dat");
		// File�� �ҷ��� ���� ��θ� ���� ��� ������ �����Ѵ�.
		BufferedReader br = new BufferedReader(new FileReader(f));
		// BufferedReader�� �ҷ��� ���� �б⸦ �Ѵ�.
		String readtxt;
		int LineCnt = 0;
		int n = -1;
		// String kopo38_readtxt�� ����, ���� kopo38_LineCnt�� 0����, ���� kopo38_n�� -1�� �����Ѵ�.
		StringBuffer s = new StringBuffer();
		// StringBuffer�� �ҷ��´�.
		while (true) {
			// break���� ���� �ݺ�
			char[] ch = new char[1000];
			n = br.read(ch);
			// ũ�Ⱑ 1000�� ���ڿ� kopo38_ch�� �����Ѵ�.
			// kopo38_ch�� BufferReader�� ���� �� 
			if (n == -1)
				break;
			// kopo38_n�� -1�̸�(���̻� �ҷ��� ���� ������) break
			for (char c : ch) {
				// kopo38_ch�� ���ڸ� �ϳ��� �ҷ��� kopo38_c�� ����
				if (c == '\n') {
					System.out.printf("[%s]***\n", s.toString());
					s.delete(0, s.length());
					// kopo38_c�� '\n'�̸� kopo38_s�� String���� ��ȯ�Ͽ� ������ �������� ����Ѵ�.
					// ���� �ʱ�ȭ�� ���� ��ü ������ �����Ѵ�.
				} else {
					s.append(c);
					// �̿��� ��� kopo38_c�� kopo38_s�� ���Ѵ�.(�ѱ��ھ� ����)
				}
			}
			LineCnt++;
			// kopo38_LineCnt�� 1�� ���Ѵ�.(ī��Ʈ)
		}
		System.out.printf("[%s]***\n", s.toString());
		// ���������� ����Ѵ�.
		br.close();
		// BufferedReader�� �ݴ´�.
	}

}
