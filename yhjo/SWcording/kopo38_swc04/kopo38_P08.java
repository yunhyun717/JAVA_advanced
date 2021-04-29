package kopo38_swc04;

public class kopo38_P08 {

	public static void main(String[] args) {
		int kopo38_iNumVal = 1001034567;
		// 숫자 읽기의 대상이 되는 정수 kopo38_iNumVal 을 설정
		String kopo38_sNumVal = String.valueOf(kopo38_iNumVal);
		// String kopo38_sNumVal을 정수 kopo38_iNumVal을 String으로 변환한, 즉 "1001034567"로 설정
		String kopo38_sNumVoice = " ";
		// String kopo38_sNumVoice를 공백으로 설정
		System.out.printf("==> %s [%d자리]\n", kopo38_sNumVal, kopo38_sNumVal.length());
		// String kopo38_sNumVal과 그 길이를 출력(kopo38_sNumVal은 kopo38_iNumVal을 그대로 가져왔으므로
		// kopo38_sNumVal의 길이는 kopo38_iNumVal의 자릿수가 된다)
		int kopo38_i, kopo38_j;
		String[] kopo38_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] kopo38_unitX = { " ", "십", "백", "천", "만", "십", "백", "천", "억", "십" };
		// 정수 kopo38_i와 kopo38_j 를 설정하고 String 배열 kopo38_units와 kopo38_unitX를 위와 같이
		// 설정한다.

		kopo38_i = 0;
		kopo38_j = kopo38_sNumVal.length() - 1;
		// 정수 kopo38_i는 0으로, kopo38_j는 kopo38_sNumVal의 길이에서 1을 뺀 값으로 설정한다.

		while (true) {
			// break까지 무한 반복
			if (kopo38_i >= kopo38_sNumVal.length())
				break;
			// kopo38_i가 kopo38_sNumval의 길이보다 크거나 같아지면 break
			System.out.printf("%s[%s]", kopo38_sNumVal.substring(kopo38_i, kopo38_i + 1),
					kopo38_units[Integer.parseInt(kopo38_sNumVal.substring(kopo38_i, kopo38_i + 1))]);
			// 첫번째 출력되는 String은 kopo38_sNumVal의 kopo38_i번째부터 kopo38_i+1번째 전까지의 String이다.
			// 즉, 앞에서부터 kopo38_i번째 숫자가 된다.(0부터 시작)
			// 이후 앞서 출력된 숫자를 정수형태로 변환하고(숫자이지만 String 형태였음)
			// kopo38_units의 해당 숫자번째 요소를 두번째로 출력한다([]내부).
			// 즉, 해당 숫자를 한글로 읽은 글자가 출력된다.
			if (kopo38_sNumVal.substring(kopo38_i, kopo38_i + 1).equals("0")) {
				if (kopo38_unitX[kopo38_j].equals("만") || kopo38_unitX[kopo38_j].equals("억")) {
					// kopo38_unitx[kopo38_j]는 kopo38_i번째 숫자의 단위가 된다.
					kopo38_sNumVoice = kopo38_sNumVoice + "" + kopo38_unitX[kopo38_j];
					// kopo38_i번째 숫자가 0일때, kopo38_i번째 숫자의 단위가 만이거나(||) 억이면
					// kopo38_sNumVoice 뒤에 단위를 붙여준다.(만 또는 억)
				} else {
				}
				// 단위가 만 또는 억이 아니면 지나감
			} else {
				kopo38_sNumVoice = kopo38_sNumVoice
						+ kopo38_units[Integer.parseInt(kopo38_sNumVal.substring(kopo38_i, kopo38_i + 1))]
						+ kopo38_unitX[kopo38_j];
			}
			// kopo38_i번째 숫자가 0이 아니면 kop38_sNumVoice는 kopo38_sNumVoice에 (String값)
			// kopo38_i번째 숫자를 읽는 법(kopo38_units)에 단위(kopo38_unitX)를 붙인다.

			kopo38_i++;
			kopo38_j--;
			// kopo38_i에 1을 더하고 kopo38_j에는 1을 뺀다.
		}
		System.out.printf("\n %s[%s]\n", kopo38_sNumVal, kopo38_sNumVoice);
		// kopo38_sNumVal과 kopo38_sNumVoice를 위와 같이 출력한다.
	}
}