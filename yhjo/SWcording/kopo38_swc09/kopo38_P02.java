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
		// xml������ �Ľ��ϱ� ���� DocumentBuild�� �ҷ��´�.
		Document kopo38_doc = kopo38_docBuilder
				.parse(new File("C:\\Users\\yunhyun jo\\Documents\\kopo38_swc09_data\\kopo38_weather.xml"));
		// ���� ��θ� �����ϰ� �Ľ��Ѵ�.
		Element kopo38_root = kopo38_doc.getDocumentElement();
		// ���� ������ ������ ������Ҹ� �ҷ����� Element�̴�.
		NodeList kopo38_tag = kopo38_doc.getElementsByTagName("data");
		// tagname�� data�� �׸���� ��� nodelist�� �Է��Ѵ�.
		for (int kopo38_i = 0; kopo38_i < kopo38_tag.getLength(); kopo38_i++) {
			// 0���� ������ kopo38_tag�� ���̺��� ���� ���� kopo38_i�� ����
			String kopo38_seq = kopo38_tag.item(kopo38_i).getAttributes().getNamedItem("seq").getNodeValue();
			// String kopo38_seq�� kopo38_tag�� kopo38_i��°�׸��� �̸��� seq�� �׸��� ������ �����Ѵ�.
			Element kopo38_elmt = (Element) kopo38_tag.item(kopo38_i);
			// Element kopo38_elmt�� kopo38_tag�� kopo38_i��° �׸��� Element ��ȯ�� ������ �����Ѵ�.
			String kopo38_hour = kopo38_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			String kopo38_day = kopo38_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			String[] kopo38_day_temp = { "����", "����", "��" };
			String kopo38_temp = kopo38_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			String kopo38_tmx = kopo38_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			String kopo38_tmn = kopo38_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			String kopo38_sky = kopo38_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			String[] kopo38_sky_temp = { "����", "��������", "��������", "�帲" };
			String kopo38_pty = kopo38_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			String[] kopo38_pty_temp = { "����", "��", "��/��", "��/��", "��" };
			String kopo38_wfKor = kopo38_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			String kopo38_wfEn = kopo38_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			String kopo38_pop = kopo38_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			String kopo38_r12 = kopo38_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			String kopo38_s12 = kopo38_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			String kopo38_ws = kopo38_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			String kopo38_wd = kopo38_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			String[] kopo38_wd_temp = { "��", "�ϵ�", "��", "����", "��", "����", "��", "�ϼ�" };
			String kopo38_wdKor = kopo38_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			String kopo38_wdEn = kopo38_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			String kopo38_reh = kopo38_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			String kopo38_r06 = kopo38_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			String kopo38_s06 = kopo38_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			// ������ String�� kopo38_elmt(kopo38_tag�� kopo38_i��° �׸��� �ڽĵ�)���� ������ String�� �ش��ϴ�
			// tagname�� ���� �׸��� ������ �����Ѵ�.
			System.out.printf("%s��°(%d/48)\n", kopo38_seq, (Integer.parseInt(kopo38_seq)*3));
			System.out.printf("�ð� : %s��\n", kopo38_hour);
			System.out.printf("%s��° ��(%s)\n", kopo38_day, kopo38_day_temp[Integer.parseInt(kopo38_day)]);
			System.out.printf("����ð� �ְ� �µ� : %s��\n", kopo38_temp);
			System.out.printf("�ְ�µ� : %s��\n", kopo38_tmx);
			System.out.printf("�����µ� : %s��\n", kopo38_tmn);
			System.out.printf("�����ڵ� : %s(%s)\n", kopo38_sky, kopo38_sky_temp[Integer.parseInt(kopo38_sky) - 1]);
			System.out.printf("�����ڵ� : %s(%s)\n", kopo38_pty, kopo38_pty_temp[Integer.parseInt(kopo38_pty)]);
			System.out.printf("����(Kor) : %s\n", kopo38_wfKor);
			System.out.printf("����(Eng) : %s\n", kopo38_wfEn);
			System.out.printf("����Ȯ��: %s%%\n", kopo38_pop);
			System.out.printf("���� ������(12�ð�) : %s\n", kopo38_r12);
			System.out.printf("���� ������(12�ð�) : %s\n", kopo38_s12);
			System.out.printf("ǳ�� : %sm/s\n", kopo38_ws);
			System.out.printf("ǳ���ڵ� : %s(%s)\n", kopo38_wd, kopo38_wd_temp[Integer.parseInt(kopo38_wd)]);
			System.out.printf("ǳ��(Kor) : %s\n", kopo38_wdKor);
			System.out.printf("ǳ��(Eng) : %s\n", kopo38_wdEn);
			System.out.printf("���� : %s%%\n", kopo38_reh);
			System.out.printf("���� ���췮(6�ð�) : %s\n", kopo38_r06);
			System.out.printf("���� ������(6�ð�) : %s\n", kopo38_s06);
			System.out.println("************************");
			// ������ String���� ������ ������� ����Ѵ�.
		}
	}
}
