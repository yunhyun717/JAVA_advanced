package kopo38_swc07;

public class kopo38_P06_1 {
	private String kopo38_name;
	private int kopo38_kor;
	private int kopo38_eng;
	private int kopo38_mat;
	// 전역변수로 각각의 값을 선언한다.

	public kopo38_P06_1(String kopo38_name, int kopo38_kor, int kopo38_eng, int kopo38_mat) {
		this.kopo38_name = kopo38_name;
		this.kopo38_kor = kopo38_kor;
		this.kopo38_eng = kopo38_eng;
		this.kopo38_mat = kopo38_mat;
		// this를 이용해 같은 이름을 가지는 인자를 각각의 전역변수 값에 대응시켜 설정한다.
	}

	public String kopo38_name() {
		return this.kopo38_name;
	};

	public int kopo38_kor() {
		return this.kopo38_kor;
	};

	public int kopo38_eng() {
		return this.kopo38_eng;
	};

	public int kopo38_mat() {
		return this.kopo38_mat;
	};
	// 메소드를 설정하고 각 메소드가 설정된 변수를 return하도록 설정한다.

	public int kopo38_sum() {
		return this.kopo38_kor + this.kopo38_eng + this.kopo38_mat;
	};

	public double kopo38_ave() {
		return this.kopo38_sum() / 3.0;
	};
	// 설정된 변수와 메소드를 이용한 계산값을 return하는 메소드를 설정한다. 

}
