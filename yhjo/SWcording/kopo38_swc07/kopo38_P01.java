package kopo38_swc07;

public class kopo38_P01 {

	public static String HanBlankForeword(String kopo38_in, int kopo38_n) {
		int kopo38_charnum = 0;
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_in.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_in.charAt(kopo38_i));
			kopo38_charnum++;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
		}
		// 6강에서 한글을 포함한 String kopo38_in의 길이를 구하는 로직을 가져온다.
		String kopo38_result = "";
		for (int kopo38_i = 0; kopo38_i < (kopo38_n - kopo38_charnum - kopo38_kornum); kopo38_i++) {
			kopo38_result = kopo38_result + " ";
		}
		// 총 길이에서 입력한 String kopo38_in의 길이를 뺀 만큼의 길이만큼의 빈칸을 만든다.
		kopo38_result = kopo38_result + kopo38_in;
		// String kopo38_in을 이어붙인다.
		return kopo38_result;
		// 최종 String을 return한다.
	}

	public static String HanBlankBackword(String kopo38_in, int kopo38_n) {
		int kopo38_charnum = 0;
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_in.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_in.charAt(kopo38_i));
			kopo38_charnum++;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
		}
		// 6강에서 한글을 포함한 String kopo38_in의 길이를 구하는 로직을 가져온다.
		String kopo38_result = kopo38_in;
		// kopo38_in을 앞에 붙인다.
		for (int kopo38_i = 0; kopo38_i < (kopo38_n - kopo38_charnum - kopo38_kornum); kopo38_i++) {
			kopo38_result = kopo38_result + " ";
		}
		// 총 길이에서 입력한 String kopo38_in의 길이를 뺀 만큼의 길이만큼의 빈칸을 만들어 뒤에 이어 붙인다.
		return kopo38_result;
		// 최종 String을 return한다.
	}

	public static int HanCount(String in) {
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < in.length(); kopo38_i++) {
			int kopo38_charint = (int) (in.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
		}
		// 6강에서 한글을 포함한 String kopo38_in의 길이를 구하는 로직을 수정해 한글 개수를 센다.
		return kopo38_kornum;
		// 결과를 return 한다.
	}

	public static void main(String[] args) {
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글abcd", 15));
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("한글한글aa", 15));
		System.out.printf("한글은 [%d]개\n", HanCount("한글한글aa"));
	}
	// 메소드 결과 출력
}
