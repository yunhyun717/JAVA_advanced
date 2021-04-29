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
		// xml������ �Ľ��ϱ� ���� DocumentBuild�� �ҷ��´�.
		Document kopo38_doc = kopo38_docBuilder
				.parse(new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc09_data\\kopo38_score.xml"));
		// ���� ��θ� �����ϰ� �Ľ��Ѵ�.
		Element kopo38_root = kopo38_doc.getDocumentElement();
		// ���� ������ ������ ������Ҹ� �ҷ����� Element�̴�.
		NodeList kopo38_tag_name = kopo38_doc.getElementsByTagName("name");
		NodeList kopo38_tag_studentid = kopo38_doc.getElementsByTagName("studentid");
		NodeList kopo38_tag_kor = kopo38_doc.getElementsByTagName("kor");
		NodeList kopo38_tag_eng = kopo38_doc.getElementsByTagName("eng");
		NodeList kopo38_tag_mat = kopo38_doc.getElementsByTagName("mat");
		// ������ element�� kopo38_tagname���� �˻��� nodelist�� �����Ѵ�.
		System.out.printf("**************\n");
		for (int kopo38_i = 0; kopo38_i < kopo38_tag_name.getLength(); kopo38_i++) {
			System.out.printf("�̸� : %s\n", kopo38_tag_name.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", kopo38_tag_studentid.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", kopo38_tag_kor.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", kopo38_tag_eng.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", kopo38_tag_mat.item(kopo38_i).getFirstChild().getNodeValue());
			System.out.printf("**************\n");
		}
		// 0���� ������ nodelist tag_name�� ���̺��� ���� kopo38_i�� ����
		// kopo38_i��° �׸� ���� firstchild ������ ��(nodevalue)�� ����Ѵ�.
		// (kopo38_i��° �׸��� �ϳ��� �ԷµǾ� firstchild�ۿ� ����.)

	}
}
