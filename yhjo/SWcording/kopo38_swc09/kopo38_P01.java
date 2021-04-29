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

public class kopo38_P01 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilder kopo38_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		// xml파일을 파싱하기 위해 DocumentBuild를 불러온다.
		Document kopo38_doc = kopo38_docBuilder
				.parse(new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc09_data\\kopo38_score.xml"));
		// 파일 경로를 지정하고 파싱한다.
		Element kopo38_root = kopo38_doc.getDocumentElement();
		// 아직 쓰지는 않지만 구성요소를 불러오는 Element이다.
		NodeList kopo38_tag_name = kopo38_doc.getElementsByTagName("name");
		NodeList kopo38_tag_studentid = kopo38_doc.getElementsByTagName("studentid");
		NodeList kopo38_tag_kor = kopo38_doc.getElementsByTagName("kor");
		NodeList kopo38_tag_eng = kopo38_doc.getElementsByTagName("eng");
		NodeList kopo38_tag_mat = kopo38_doc.getElementsByTagName("mat");
		// 각각의 element를 kopo38_tagname으로 검색해 nodelist에 저장한다.
		System.out.printf("**************\n");
		for (int kopo38_i = 0; kopo38_i < kopo38_tag_name.getLength(); kopo38_i++) {
			System.out.printf("이름 : %s\n", kopo38_tag_name.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", kopo38_tag_studentid.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", kopo38_tag_kor.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", kopo38_tag_eng.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", kopo38_tag_mat.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("**************\n");
		}
		// 0부터 시작해 nodelist tag_name의 길이보다 작은 kopo38_i에 대해
		// kopo38_i번째 항목에 대한 firstchild 각각의 값(nodevalue)를 출력한다.
		// (kopo38_i번째 항목은 하나씩 입력되어 firstchild밖에 없다.)

	}
}
