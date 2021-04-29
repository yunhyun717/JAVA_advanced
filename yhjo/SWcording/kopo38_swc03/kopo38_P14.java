package kopo38_swc03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P14 {

	public static void main(String[] args) {
		Calendar kopo38_calt = Calendar.getInstance();
		// Calendar 클래스를 불러온다. kopo38_calt로 불러올 수 있으며 날짜 관련 정보를 불러올 수 있다.
		SimpleDateFormat kopo38_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		// SimpleDateFormat 클래스를 불러온다. kopo38_sdt로 불러올 수 있으며, 지정한 형식으로 날짜 형식을 변경할 수 있다.
		System.out.printf("최종실행시간: %s\n", kopo38_sdt.format(kopo38_calt.getTime()));
		System.out.printf("******************************\n");
		// String 값이므로 %s로 불러오며, 앞서 SimpleDateFormat에서 지정한 형식으로 getTime()명령어를 통해 현재 날짜를
		// 불러온다.
	}

}
