package kopo38_swc04;

public class kopo38_P02 {

	public static void main(String[] args) {
		int kopo38_il;
		double kopo38_iD;

		kopo38_il= 10 / 3;
		kopo38_iD= 10 / 3.0;
		// 정수 kopo38_il과 소수 kopo38_iD를 설정하고 kopo38_il은 10을 3으로 나눈 값의 몫으로,
		// kopo38_iD는 10을 3.0으로 나눈 값으로 설정한다.
		// (그냥 10/3으로 쓰면 10을 3으로 나눈 몫인 3의 double형태인 3.0이 된다.
		// 소수 값을 원할 때는 반드시 나누는 값을 소수 형태로 써주자

		if (kopo38_il== kopo38_iD)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double) kopo38_il, kopo38_iD);
		// kopo38_il과 kopo38_iD가 같으면('=='을 이용) "equal"을 출력
		// 그렇지 않으면 double 변환된 kopo38_il(값이 3이므로 double 변환 값은 3.000000)과 kopo38_iD깂을 출력

		kopo38_iD= (int) kopo38_iD;
		// kopo38_iD를 정수 변환(소숫점 아래 버림). 하지만 여전히 double 형태(소숫점 아래가 표현됨. 3.0)이다.

		if (kopo38_il== kopo38_iD)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[3.333333][%f]\n", kopo38_iD);
		// kopo38_il(==3)과 정수 변환한 kopo38_iD(==3.0)의 값이 같으면 equal, 다르면 Not equal 을 출력.
		// 표현 형식만 다를 뿐 같은 수이므로 equal이 출력

		System.out.printf("int로 인쇄[%d][%f]\n", kopo38_il, kopo38_iD);
		System.out.printf("double로 인쇄[%f][%f]\n", (double) kopo38_il, kopo38_iD);

		// 현재 kopo38_il과 kopo38_iD는 정수이지만 어떻게 불러오는지 (%d 또는 %f)에 따라 printf에서의 표현이 달라진다.
		// %d로 불러올 경우 소숫점 없는 정수 형태 그대로 표현되며, %f로 불러올 경우 소숫점 이하 6자리까지 (3.000000) 표현된다.
		// kopo38_il을 double로 변환할 경우 3에서 3.0으로 표현이 달라지게 되며 printf에서 %f로 불러올 경우
		// kopo38_iD와 같이 소숫점 이하 6자리까지(3.000000) 표현된다.

		char kopo38_a = 'c';
		// char kopo38_a를 c로 설정. char를 설정할 때는 '를 이용한다.
		if (kopo38_a == 'b')
			System.out.printf("a는 b이다\n");
		if (kopo38_a == 'c')
			System.out.printf("a는 c이다\n");
		if (kopo38_a == 'd')
			System.out.printf("a는 d이다\n");
		// 숫자와 마찬가지로 '=='를 이용해 char kopo38_a가 b와 같을 때, c와 같을 때, d와 같을 때 각각 내용을 출력한다.

		String kopo38_aa = "abcd";
		// String kopo38_aa를 abcd로 설정. String을 설정할 때는 "를 이용한다.
		if (kopo38_aa.equals("abcd"))
			System.out.printf("kopo38_aa는 abcd이다\n");
		else
			System.out.printf("kopo38_aa는 abcd이 아니다\n");
		// 숫자, 문자와는 달리 String은 'String.equals("대상")'을 이용한다.
		// 'String.equals("대상")'은 boolean으로 String과 대상이 같으면 true, 다르면 false값을 가진다.

		boolean kopo38_bb = true;
		// boolean kopo38_bb를 true로 설정. boolean은 true 또는 false값을 가진다.
		if (!!kopo38_bb)
			System.out.printf("kopo38_bb가 아니고 아니면 참이다\n");
		else
			System.out.printf("kopo38_bb가 아니고 거짓이다\n");
		// !는 not의 의미를 가지므로(여집합) !!이면 여집합의 여집합, 즉 자기 자신이 된다. 따라서 kopo38_bb 가 true 이므로
		// !!kopo38_bb 도 true
		// if (조건)은 기본적으로 '조건이 true이면'의 의미이다. 따라서 if 조건을 만족한다.
	}

}
