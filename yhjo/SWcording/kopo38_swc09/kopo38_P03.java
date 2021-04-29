package kopo38_swc09;

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class kopo38_P03 {

	public static JSONObject kopo38_oneRec(String kopo38_name, int kopo38_studentid, int kopo38_kor, int kopo38_eng, int kopo38_mat) {
		// json ���� �ۼ��� ���� method�� �����.
		JSONObject kopo38_dataObject = new JSONObject();
		// json ������ �ٷ�� ���� JSONObject�� �ҷ��´�.
		kopo38_dataObject.put("name", kopo38_name);
		kopo38_dataObject.put("studentid", kopo38_studentid);
		// name �Ӽ��� String kopo38_name�� ��Ī�Ѵ�.
		// studentid�׸� ���� kopo38_studentid�� ��Ī�Ѵ�.
		JSONArray kopo38_score = new JSONArray();
		// json�� ����� �迭 kopo38_score�� �����Ѵ�.
		kopo38_score.add(kopo38_kor);
		kopo38_score.add(kopo38_eng);
		kopo38_score.add(kopo38_mat);
		kopo38_dataObject.put("score", kopo38_score);
		// �迭�� ���� kopo38_kor, kopo38_eng, kopo38_mat�� �Է��ϰ� �ش� �迭�� json�� �ִ´�.
		return kopo38_dataObject;
		// �ۼ��� json ������ ������ return�Ѵ�.
	}

	public static void main(String[] args) {
		JSONArray kopo38_datasArray = new JSONArray();
		JSONObject kopo38_dataObject = new JSONObject();
		// json������ �ٷ�� ���� JSONObject, JSONArray�� �ҷ��´�.
		kopo38_dataObject.put("name", "����");
		kopo38_dataObject.put("studentid", "20991");
		// name �Ӽ��� "����"�� ��Ī�Ѵ�.
		// studentid�׸� String 20991�� ��Ī�Ѵ�.
		JSONArray score = new JSONArray();
		// json�� ����� �迭 kopo38_score�� �����Ѵ�.
		score.add(90);
		score.add(100);
		score.add(95);
		kopo38_dataObject.put("score", score);
		// �迭�� ���� kopo38_kor, kopo38_eng, kopo38_mat�� �Է��ϰ� �ش� �迭�� json�� �ִ´�.
		kopo38_datasArray.add(kopo38_dataObject);
		// ���� �׸��� �ֱ� ���� ������ kopo38_datasArray�� �ۼ��� ������ �ִ´�.
		kopo38_datasArray.add(kopo38_oneRec("����", 209902, 100, 85, 75));
		kopo38_datasArray.add(kopo38_oneRec("���", 209903, 90, 75, 85));
		kopo38_datasArray.add(kopo38_oneRec("�糪", 209904, 90, 85, 75));
		kopo38_datasArray.add(kopo38_oneRec("��ȿ", 209905, 80, 75, 85));
		kopo38_datasArray.add(kopo38_oneRec("�̳�", 209906, 90, 85, 55));
		kopo38_datasArray.add(kopo38_oneRec("�ٿ�", 209907, 70, 75, 65));
		kopo38_datasArray.add(kopo38_oneRec("ä��", 209908, 100, 75, 95));
		kopo38_datasArray.add(kopo38_oneRec("����", 209909, 80, 65, 95));
		// kopo38_oneRec �޼ҵ带 ����Ͽ� �� ������ �ݺ��Ѵ�.
		try {
			FileWriter file = new FileWriter("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc09_data\\kopo38_test.json");
			file.write(kopo38_datasArray.toJSONString());
			file.flush();
			file.close();
			// ���Ͽ� ������ kopo38_datasArray�� �Է��Ѵ�.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
