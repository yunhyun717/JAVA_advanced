package kopo38_swc08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P04 {

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
		double kopo38_lat = 37.3860521;
		double kopo38_lng = 127.1214038;
		// double kopo38_lat�� kopo38_lng�� ���� �����Ѵ�.
		int kopo38_LineCnt = 0;
		// ���� kopo38_LineCnt�� 0���� �����Ѵ�.
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			// String kopo38_readtxt�� ��� ������ �� �� �� �о���� ������ �����ϰ�
			// (ù ���� �տ��� �о�����Ƿ� �� �����ٺ���)
			// �� ���� null�� �� ������ �ݺ��Ѵ�.
			kopo38_LineCnt++;
			// kopo38_LineCnt�� 1�� ���Ѵ�.
			String[] kopo38_field = kopo38_readtxt.split(",");
			// ���ڿ� kopo38_field�� kopo38_readtxt(������ ù ��)�� ","�� �ڸ� ������ �����Ѵ�.
			System.out.printf("**[%d��° �׸�]**************\n", kopo38_LineCnt);
			System.out.printf(" %s : %s\n", kopo38_field_name[9], kopo38_field[9]);
			System.out.printf(" %s : %s\n", kopo38_field_name[13], kopo38_field[13]);
			System.out.printf(" %s : %s\n", kopo38_field_name[14], kopo38_field[14]);
			// kopo38_field_name�� kopo38_field�� 9��° 13��°, 14��° ������ ����Ѵ�.
			double kopo38_dist = Math.sqrt(Math.pow(Double.parseDouble(kopo38_field[13]) - kopo38_lat, 2)
					+ Math.pow(Double.parseDouble(kopo38_field[14]) - kopo38_lng, 2));
			System.out.printf(" ������������ �Ÿ� : %f\n", kopo38_dist);
			System.out.printf("*******************************\n");
			// ������ ������ kopo38_lat�� kopo38_lng�� �⺻ ��ġ�� ������ �浵�� ����Ͽ�
			// double kopo38_dist�� ��Ÿ��� ������ �̿��� �׸���� �Ÿ��� �����Ͽ� ����Ѵ�.

		}
		kopo38_br.close();
		// BufferedReader�� �ݴ´�.
	}
}
