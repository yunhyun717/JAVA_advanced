package kopo38_swc08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class kopo38_P05 {

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
		String kopo38_max = "";
		String kopo38_min = "";
		String kopo38_max_lat = "";
		String kopo38_min_lat = "";
		String kopo38_max_lng = "";
		String kopo38_min_lng = "";
		double kopo38_maxdist = 0;
		double kopo38_mindist = 0;
		// ���� kopo38_LineCnt�� 0���� �����Ѵ�.
		// String kopo38_max�� kopo38_min�� ���� �����Ѵ�.
		// double kopo38_maxdist�� kopo38_minsdist�� 0���� �����Ѵ�.
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
			if (kopo38_LineCnt == 1) {
				kopo38_max = kopo38_field[9];
				kopo38_min = kopo38_field[9];
				kopo38_maxdist = kopo38_dist;
				kopo38_mindist = kopo38_dist;
				// kopo38_LineCnt�� 1�̸� kopo38_max�� kopo38_min�� ���������θ��ּҷ� ����
				// kopo38_dist�� kopo38_max�� kopo38_min���� ����(�ʱⰪ ����)
			} else {
				kopo38_maxdist = Math.max(kopo38_maxdist, kopo38_dist);
				kopo38_mindist = Math.min(kopo38_mindist, kopo38_dist);
				if (kopo38_maxdist == kopo38_dist) {
					kopo38_max = kopo38_field[9];
					kopo38_max_lat = kopo38_field[13];
					kopo38_max_lng = kopo38_field[14];
				} else if (kopo38_mindist == kopo38_dist) {
					kopo38_min = kopo38_field[9];
					kopo38_min_lat = kopo38_field[13];
					kopo38_min_lng = kopo38_field[14];
				}
			}
			// kopo38_LineCnt�� 0�� �ƴϸ� kopo38_maxdist�� ���������� �� �� ���� ū ����
			// �а� �ִ°� �� ū ������ �����Ѵ�. kopo38_min�� ��� �ݴ�� �ϰ�, ���������θ��ּҸ� �����Ѵ�.
			System.out.printf(" ������������ �Ÿ� : %f\n", kopo38_dist);
			System.out.printf("*******************************\n");
			// ������ ������ kopo38_lat�� kopo38_lng�� �⺻ ��ġ�� ������ �浵�� ����Ͽ�
			// double kopo38_dist�� ��Ÿ��� ������ �̿��� �׸���� �Ÿ��� �����Ͽ� ����Ѵ�.

		}
		System.out.printf(" ���� ����� �� : \n %s \n ���� : %s\n �浵 : %s\n �Ÿ� : %f)\n", kopo38_min, kopo38_min_lat, kopo38_min_lng,
				kopo38_mindist);
		System.out.printf("\n ���� �� �� : \n %s \n ���� : %s\n �浵 : %s\n �Ÿ� : %f)\n", kopo38_max, kopo38_max_lat, kopo38_max_lng,
				kopo38_maxdist);
		System.out.printf("*******************************\n");
		// ���� ����� ���� ���� �� ���� ���������θ��ּҿ� �Ÿ��� ����Ѵ�.
		kopo38_br.close();
		// BufferedReader�� �ݴ´�.
	}
}
