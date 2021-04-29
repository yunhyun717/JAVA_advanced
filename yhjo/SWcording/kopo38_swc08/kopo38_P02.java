package kopo38_swc08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class kopo38_P02 {

	public static void kopo38_FileWrite() throws IOException {
		// try-catch ��� throws�� �̿�, IOException�� �����ϵ��� �����Ѵ�.
		File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\k38_Mytest.txt");
		// File�� �ҷ��� ���� ��θ� ���� ��� ������ �����Ѵ�.
		BufferedWriter kopo38_bw = new BufferedWriter(new FileWriter(kopo38_f));
		// BufferedWriter�� �ҷ��� ���� ���⸦ �Ѵ�.
		// ���� �̻��� ������ ����� ���� BufferedWriter�� FileWriter�� ���� ���� ���� ������.
		kopo38_bw.write("�ȳ� ����");
		kopo38_bw.newLine();
		kopo38_bw.write("hello ���");
		kopo38_bw.newLine();
		// BufferedWriter�� �̿��� ������ �ۼ��Ѵ�. newLine���� �� ���� �߰��Ѵ�.
		kopo38_bw.close();
		// BufferedWriter�� �ݴ´�.
	}

	public static void kopo38_FileRead() throws IOException {
		File kopo38_f = new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc08_data\\k38_Mytest.txt");
		// File�� �ҷ��� ���� ��θ� ���� ��� ������ �����Ѵ�.
		BufferedReader kopo38_br = new BufferedReader(new FileReader(kopo38_f));
		// BufferedReader�� �ҷ��� ���� �б⸦ �Ѵ�.
		// ���� �̻��� ������ ���� ���� BufferedReader�� FileReader�� ���� ���� ���� ������.
		String kopo38_readtxt;
		while ((kopo38_readtxt = kopo38_br.readLine()) != null) {
			System.out.printf("%s\n", kopo38_readtxt);
		}
		// String kopo38_readtxt�� ��� ������ �� �� �� �о���� ������ �����ϰ� �� ���� null�� �� ������
		// kopo38_readtxt�� ����Ѵ�.
		kopo38_br.close();
		// BufferedReader�� �ݴ´�.
	}

	public static void main(String[] args) throws IOException {
		kopo38_FileWrite();
		kopo38_FileRead();
	}
	// main���� kopo38_FileWrite�� kopo38_FileRead�� �����Ѵ�.
}
