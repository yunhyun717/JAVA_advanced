package javabasic003;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Numclass {
	public static void main(String[] args) {
		String text = "-31.54352435436426432543436436243";
		System.out.println(text);
		System.out.println(Float.parseFloat(text)); //String�� float�� ��ȯ
		System.out.println(Double.parseDouble(text)); //double�� float�� ��ȯ
		Double d = Double.parseDouble(text); //double�� float�� ��ȯ�ϰ� ���� ����
		System.out.println(d);
		System.out.println(d.intValue()); //�����κ�
		BigDecimal bd = new BigDecimal(text); //�Ҽ��� �����ϰ� ����(double�� �Ҽ��� 2���� �ٻ�ġ�� �����ؼ� ��Ȯ���� ���� �� ����. BigDecimal�� 10������ ����)
		System.out.println(bd);
		System.out.println(Math.round(d)); //�ݿø�
		System.out.println(Math.floor(d)); //�ø�
		System.out.println(Math.ceil(d)); //����
		float f = 3.26f;
		System.out.println(f);
		System.out.println((int)f); //�����κи� ����(�Ҽ��� ���� ��)
		

	}
			
}
