package kopo38_swc07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P04 {
	static File kopo38_file;
	static BufferedReader kopo38_br;
	// ������ �޼ҵ带 �������ش�.(File = ���� ����, BufferedReader = ���� �б�)
	static String kopo38_temp;
	// String ����
	
	public static void main(String[] args) throws IOException {
		kopo38_file = new File("C:\\Users\\yunhyun jo\\Desktop\\data.csv");
		// ���� ��θ� �����Ѵ�.
		kopo38_br = new BufferedReader(new FileReader(kopo38_file));
		// �ش� ���� ����� ������ �е��� �Ѵ�.
		String [] field_name = kopo38_br.readLine().split(",");
		// ������ ù ��(���)�� �а� ","�� split�� �迭�� �����Ѵ�.
		while ((kopo38_temp = kopo38_br.readLine()) != null) {
			// ������ �� �� �� �����鼭 �о���� ���� null�� �� �� ���� �о���鼭 ������ �ݺ��Ѵ�.
			String[] field = kopo38_temp.split(",");
			// �о�� ������ ","�� split�Ͽ� �迭�� �����Ѵ�.
			System.out.printf("***********************\n");
			for (int j = 0; j < field_name.length; j++) {
				System.out.printf("%s : %s\n", field_name[j], field[j]);
			}
			// ��ϰ��� �о�� ������ ���� �̷� ��µǵ��� �����Ѵ�.
			System.out.printf("***********************\n");
		}

	}
}
	