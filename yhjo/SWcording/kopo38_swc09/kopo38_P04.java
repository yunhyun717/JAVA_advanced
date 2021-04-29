package kopo38_swc09;

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class kopo38_P04 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser kopo38_parser = new JSONParser();
		// json ������ �Ľ��ϱ� ���� JSONParser�� �ҷ��´�.
		Object kopo38_obj = kopo38_parser
				.parse(new FileReader("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc09_data\\kopo38_test.json"));
		// json ������ �Ľ��� ��θ� �����Ѵ�.
		JSONArray kopo38_array = (JSONArray) kopo38_obj;
		// json ���Ͽ� �� �о�� JSONArray�� �����Ѵ�.(datas)
		System.out.println("*************************");
		for (int kopo38_i = 0; kopo38_i < kopo38_array.size(); kopo38_i++) {
			// 0���� ������ kopo38_array�� ũ�⺸�� ���� ���� kopo38_i�� ����
			JSONObject kopo38_result = (JSONObject) kopo38_array.get(kopo38_i);
			// JSONObject�� �ҷ����� �� ���� ������ kopo38_array�� kopo38_i��° �׸��� �ǵ��� �Ѵ�.
			System.out.println("�̸� : " + kopo38_result.get("name"));
			System.out.println("�й� : " + kopo38_result.get("studentid"));
			// kopo38_array�� kopo38_i��° �׸� ���� �� �׸� �����ϴ� ���� ������ ������� ����Ѵ�.
			JSONArray kopo38_score = (JSONArray) kopo38_result.get("score");
			// JSONArray�� �ҷ��� �� ���� score�� �����ϴ� JSONArray�� �����Ѵ�.
			long kopo38_kor = (long) kopo38_score.get(0);
			long kopo38_eng = (long) kopo38_score.get(1);
			long kopo38_mat = (long) kopo38_score.get(2);
			// �� �׸��� kopo38_score�� 0, 1, 2��° �׸��� long��ȯ�� ������ �����Ѵ�.
			System.out.println("���� : " + kopo38_kor);
			System.out.println("���� : " + kopo38_eng);
			System.out.println("���� : " + kopo38_mat);
			System.out.println("���� : " + (kopo38_kor + kopo38_eng + kopo38_mat));
			System.out.println("��� : " + ((kopo38_kor + kopo38_eng + kopo38_mat) / 3.0));
			// ������ ������ ������ ������� ���, ����Ѵ�.
			System.out.println("*************************");
		}
	}
}
