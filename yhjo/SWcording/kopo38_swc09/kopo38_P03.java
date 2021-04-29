package kopo38_swc09;

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class kopo38_P03 {

	public static JSONObject kopo38_oneRec(String kopo38_name, int kopo38_studentid, int kopo38_kor, int kopo38_eng, int kopo38_mat) {
		// json 파일 작성을 위한 method를 만든다.
		JSONObject kopo38_dataObject = new JSONObject();
		// json 파일을 다루기 위해 JSONObject를 불러온다.
		kopo38_dataObject.put("name", kopo38_name);
		kopo38_dataObject.put("studentid", kopo38_studentid);
		// name 속성에 String kopo38_name을 매칭한다.
		// studentid항목에 정수 kopo38_studentid를 매칭한다.
		JSONArray kopo38_score = new JSONArray();
		// json에 사용할 배열 kopo38_score을 생성한다.
		kopo38_score.add(kopo38_kor);
		kopo38_score.add(kopo38_eng);
		kopo38_score.add(kopo38_mat);
		kopo38_dataObject.put("score", kopo38_score);
		// 배열에 정수 kopo38_kor, kopo38_eng, kopo38_mat을 입력하고 해당 배열을 json에 넣는다.
		return kopo38_dataObject;
		// 작성된 json 형식의 파일을 return한다.
	}

	public static void main(String[] args) {
		JSONArray kopo38_datasArray = new JSONArray();
		JSONObject kopo38_dataObject = new JSONObject();
		// json파일을 다루기 위해 JSONObject, JSONArray를 불러온다.
		kopo38_dataObject.put("name", "나연");
		kopo38_dataObject.put("studentid", "20991");
		// name 속성에 "나연"을 매칭한다.
		// studentid항목에 String 20991를 매칭한다.
		JSONArray score = new JSONArray();
		// json에 사용할 배열 kopo38_score을 생성한다.
		score.add(90);
		score.add(100);
		score.add(95);
		kopo38_dataObject.put("score", score);
		// 배열에 정수 kopo38_kor, kopo38_eng, kopo38_mat을 입력하고 해당 배열을 json에 넣는다.
		kopo38_datasArray.add(kopo38_dataObject);
		// 여러 항목을 넣기 위해 생성한 kopo38_datasArray에 작성한 내용을 넣는다.
		kopo38_datasArray.add(kopo38_oneRec("정연", 209902, 100, 85, 75));
		kopo38_datasArray.add(kopo38_oneRec("모모", 209903, 90, 75, 85));
		kopo38_datasArray.add(kopo38_oneRec("사나", 209904, 90, 85, 75));
		kopo38_datasArray.add(kopo38_oneRec("지효", 209905, 80, 75, 85));
		kopo38_datasArray.add(kopo38_oneRec("미나", 209906, 90, 85, 55));
		kopo38_datasArray.add(kopo38_oneRec("다연", 209907, 70, 75, 65));
		kopo38_datasArray.add(kopo38_oneRec("채영", 209908, 100, 75, 95));
		kopo38_datasArray.add(kopo38_oneRec("쯔위", 209909, 80, 65, 95));
		// kopo38_oneRec 메소드를 사용하여 위 과정을 반복한다.
		try {
			FileWriter file = new FileWriter("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc09_data\\kopo38_test.json");
			file.write(kopo38_datasArray.toJSONString());
			file.flush();
			file.close();
			// 파일에 생성한 kopo38_datasArray를 입력한다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
