package kopo38_swc07;

public class kopo38_P09_1 {
	private int kopo38_student_id;
	private String kopo38_name;
	private int kopo38_kor;
	private int kopo38_eng;
	private int kopo38_mat;

	public kopo38_P09_1(int kopo38_student_id, String kopo38_name, int kopo38_kor, int kopo38_eng, int kopo38_mat) {
		this.kopo38_student_id = kopo38_student_id;
		this.kopo38_name = kopo38_name;
		this.kopo38_kor = kopo38_kor;
		this.kopo38_eng = kopo38_eng;
		this.kopo38_mat = kopo38_mat;
	}

	public int kopo38_student_id() {
		return this.kopo38_student_id;
	};
	
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

	public int kopo38_sum() {
		return this.kopo38_kor + this.kopo38_eng + this.kopo38_mat;
	};

	public double kopo38_ave() {
		return this.kopo38_sum() / 3.0;
	};

	// 앞서와 마찬가지로 클래스를 설정한다.
}
