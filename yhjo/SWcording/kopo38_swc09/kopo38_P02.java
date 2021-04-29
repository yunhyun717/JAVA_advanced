package kopo38_swc09;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class kopo38_P02 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilder kopo38_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml파일을 파싱하기 위해 DocumentBuild를 불러온다.
		Document kopo38_doc = kopo38_docBuilder
				.parse(new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc09_data\\kopo38_weather.xml"));
		// 파일 경로를 지정하고 파싱한다.
		Element kopo38_root = kopo38_doc.getDocumentElement();
		// 아직 쓰지는 않지만 구성요소를 불러오는 Element이다.
		NodeList kopo38_tag = kopo38_doc.getElementsByTagName("data");
		// tagname이 data인 항목들을 모아 nodelist에 입력한다.
		for (int kopo38_i = 0; kopo38_i < kopo38_tag.getLength(); kopo38_i++) {
			// 0부터 시작해 kopo38_tag의 길이보다 작은 정수 kopo38_i에 대해
			String kopo38_seq = kopo38_tag.item(kopo38_i).getAttributes().getNamedItem("seq").getNodeValue();
			// String kopo38_seq를 kopo38_tag의 kopo38_i번째항목의 이름이 seq인 항목의 값으로 설정한다.
			Element kopo38_elmt = (Element) kopo38_tag.item(kopo38_i);
			// Element kopo38_elmt를 kopo38_tag의 kopo38_i번째 항목을 Element 변환한 것으로 설정한다.
			String kopo38_hour = kopo38_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			String kopo38_day = kopo38_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			String[] kopo38_day_temp = { "오늘", "내일", "모레" };
			String kopo38_temp = kopo38_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			String kopo38_tmx = kopo38_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			String kopo38_tmn = kopo38_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			String kopo38_sky = kopo38_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			String[] kopo38_sky_temp = { "맑음", "구름조금", "구름많음", "흐림" };
			String kopo38_pty = kopo38_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			String[] kopo38_pty_temp = { "없음", "비", "비/눈", "눈/비", "눈" };
			String kopo38_wfKor = kopo38_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			String kopo38_wfEn = kopo38_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			String kopo38_pop = kopo38_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			String kopo38_r12 = kopo38_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			String kopo38_s12 = kopo38_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			String kopo38_ws = kopo38_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			String kopo38_wd = kopo38_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			String[] kopo38_wd_temp = { "북", "북동", "동", "남동", "남", "남서", "서", "북서" };
			String kopo38_wdKor = kopo38_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			String kopo38_wdEn = kopo38_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			String kopo38_reh = kopo38_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			String kopo38_r06 = kopo38_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			String kopo38_s06 = kopo38_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			// 각각의 String을 kopo38_elmt(kopo38_tag의 kopo38_i번째 항목의 자식들)에서 각각의 String에 해당하는
			// tagname을 가진 항목의 값으로 설정한다.
			System.out.printf("%s번째(%d/48)\n", kopo38_seq, (Integer.parseInt(kopo38_seq)*3));
			System.out.printf("시간 : %s시\n", kopo38_hour);
			System.out.printf("%s번째 날(%s)\n", kopo38_day, kopo38_day_temp[Integer.parseInt(kopo38_day)]);
			System.out.printf("현재시간 최고 온도 : %s℃\n", kopo38_temp);
			System.out.printf("최고온도 : %s℃\n", kopo38_tmx);
			System.out.printf("최저온도 : %s℃\n", kopo38_tmn);
			System.out.printf("날씨코드 : %s(%s)\n", kopo38_sky, kopo38_sky_temp[Integer.parseInt(kopo38_sky) - 1]);
			System.out.printf("강수코드 : %s(%s)\n", kopo38_pty, kopo38_pty_temp[Integer.parseInt(kopo38_pty)]);
			System.out.printf("날씨(Kor) : %s\n", kopo38_wfKor);
			System.out.printf("날씨(Eng) : %s\n", kopo38_wfEn);
			System.out.printf("강수확률: %s%%\n", kopo38_pop);
			System.out.printf("예상 강수량(12시간) : %s\n", kopo38_r12);
			System.out.printf("예상 적설량(12시간) : %s\n", kopo38_s12);
			System.out.printf("풍속 : %sm/s\n", kopo38_ws);
			System.out.printf("풍향코드 : %s(%s)\n", kopo38_wd, kopo38_wd_temp[Integer.parseInt(kopo38_wd)]);
			System.out.printf("풍향(Kor) : %s\n", kopo38_wdKor);
			System.out.printf("풍향(Eng) : %s\n", kopo38_wdEn);
			System.out.printf("습도 : %s%%\n", kopo38_reh);
			System.out.printf("예상 강우량(6시간) : %s\n", kopo38_r06);
			System.out.printf("예상 적설량(6시간) : %s\n", kopo38_s06);
			System.out.println("************************");
			// 각각의 String들을 지정한 양식으로 출력한다.
		}
	}
}
