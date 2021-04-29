package kopo38_swc02;

import java.util.Scanner;

public class kopo38_P08 {

	public static void main(String[] args) {

		short kopo38_sMin = -32768;
		short kopo38_sMax = 32767;
		char kopo38_cMin = 0;
		char kopo38_cMax = 65535;
		// short와 char를 각각 설정한다.

		System.out.println("sMin = " + kopo38_sMin);
		System.out.println("sMin-1 = " + (short) (kopo38_sMin - 1));
		// 그냥 1을 빼서 출력하면 일반 계산값으로 출력되지만, (short)가 붙으면 부호가 바뀐 값에서 1을 뺀 값을 출력한다.
		System.out.println("sMax = " + kopo38_sMax);
		System.out.println("sMax+1 = " + (short) (kopo38_sMax + 1));
		// 마찬가지로 (short)가 붙었으므로 부호가 바뀐 값에서 1을 뺀 값이 출력된다.
		System.out.println("cMin = " + (int) kopo38_cMin);
		System.out.println("cMin-1 = " + (int) --kopo38_cMin);
		// char의 정수형 최솟값은 0이므로 1을 뺐을 때 다시 최댓값(65535)으로 돌아간다. 따라서 65535가 출력된다. 
		System.out.println("cMin = " + (int) kopo38_cMax);
		System.out.println("cMin+1 = " + (int) ++kopo38_cMax);
		// 역시 char의 정수형 최댓값은 65535이므로 1을 더했을 때 다시 최솟값(0)으로 돌아간다. 따라서 0이 출력된다.

	}
}
