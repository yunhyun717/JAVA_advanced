package kopo38_swc09;

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class kopo38_P04 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser kopo38_parser = new JSONParser();
		// json 파일을 파싱하기 위해 JSONParser를 불러온다.
		Object kopo38_obj = kopo38_parser
				.parse(new FileReader("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc09_data\\kopo38_test.json"));
		// json 파일을 파싱할 경로를 지정한다.
		JSONArray kopo38_array = (JSONArray) kopo38_obj;
		// json 파일에 서 읽어올 JSONArray를 생성한다.(datas)
		System.out.println("*************************");
		for (int kopo38_i = 0; kopo38_i < kopo38_array.size(); kopo38_i++) {
			// 0부터 시작해 kopo38_array의 크기보다 작은 정수 kopo38_i에 대해
			JSONObject kopo38_result = (JSONObject) kopo38_array.get(kopo38_i);
			// JSONObject를 불러오고 그 값이 생성한 kopo38_array의 kopo38_i번째 항목이 되도록 한다.
			System.out.println("이름 : " + kopo38_result.get("name"));
			System.out.println("학번 : " + kopo38_result.get("studentid"));
			// kopo38_array의 kopo38_i번째 항목에 대해 각 항목에 대응하는 값을 지정한 양식으로 출력한다.
			JSONArray kopo38_score = (JSONArray) kopo38_result.get("score");
			// JSONArray를 불러와 그 값을 score에 대응하는 JSONArray로 설정한다.
			long kopo38_kor = (long) kopo38_score.get(0);
			long kopo38_eng = (long) kopo38_score.get(1);
			long kopo38_mat = (long) kopo38_score.get(2);
			// 각 항목은 kopo38_score의 0, 1, 2번째 항목을 long변환한 값으로 설정한다.
			System.out.println("국어 : " + kopo38_kor);
			System.out.println("영어 : " + kopo38_eng);
			System.out.println("수학 : " + kopo38_mat);
			System.out.println("총점 : " + (kopo38_kor + kopo38_eng + kopo38_mat));
			System.out.println("평균 : " + ((kopo38_kor + kopo38_eng + kopo38_mat) / 3.0));
			// 추출한 점수를 지정한 양식으로 계산, 출력한다.
			System.out.println("*************************");
		}
	}
}
