package kopo38_swc04;

public class kopo38_P02 {

	public static void main(String[] args) {
		int kopo38_il;
		double kopo38_iD;

		kopo38_il= 10 / 3;
		kopo38_iD= 10 / 3.0;
		// ���� kopo38_il�� �Ҽ� kopo38_iD�� �����ϰ� kopo38_il�� 10�� 3���� ���� ���� ������,
		// kopo38_iD�� 10�� 3.0���� ���� ������ �����Ѵ�.
		// (�׳� 10/3���� ���� 10�� 3���� ���� ���� 3�� double������ 3.0�� �ȴ�.
		// �Ҽ� ���� ���� ���� �ݵ�� ������ ���� �Ҽ� ���·� ������

		if (kopo38_il== kopo38_iD)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n", (double) kopo38_il, kopo38_iD);
		// kopo38_il�� kopo38_iD�� ������('=='�� �̿�) "equal"�� ���
		// �׷��� ������ double ��ȯ�� kopo38_il(���� 3�̹Ƿ� double ��ȯ ���� 3.000000)�� kopo38_iD���� ���

		kopo38_iD= (int) kopo38_iD;
		// kopo38_iD�� ���� ��ȯ(�Ҽ��� �Ʒ� ����). ������ ������ double ����(�Ҽ��� �Ʒ��� ǥ����. 3.0)�̴�.

		if (kopo38_il== kopo38_iD)
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[3.333333][%f]\n", kopo38_iD);
		// kopo38_il(==3)�� ���� ��ȯ�� kopo38_iD(==3.0)�� ���� ������ equal, �ٸ��� Not equal �� ���.
		// ǥ�� ���ĸ� �ٸ� �� ���� ���̹Ƿ� equal�� ���

		System.out.printf("int�� �μ�[%d][%f]\n", kopo38_il, kopo38_iD);
		System.out.printf("double�� �μ�[%f][%f]\n", (double) kopo38_il, kopo38_iD);

		// ���� kopo38_il�� kopo38_iD�� ���������� ��� �ҷ������� (%d �Ǵ� %f)�� ���� printf������ ǥ���� �޶�����.
		// %d�� �ҷ��� ��� �Ҽ��� ���� ���� ���� �״�� ǥ���Ǹ�, %f�� �ҷ��� ��� �Ҽ��� ���� 6�ڸ����� (3.000000) ǥ���ȴ�.
		// kopo38_il�� double�� ��ȯ�� ��� 3���� 3.0���� ǥ���� �޶����� �Ǹ� printf���� %f�� �ҷ��� ���
		// kopo38_iD�� ���� �Ҽ��� ���� 6�ڸ�����(3.000000) ǥ���ȴ�.

		char kopo38_a = 'c';
		// char kopo38_a�� c�� ����. char�� ������ ���� '�� �̿��Ѵ�.
		if (kopo38_a == 'b')
			System.out.printf("a�� b�̴�\n");
		if (kopo38_a == 'c')
			System.out.printf("a�� c�̴�\n");
		if (kopo38_a == 'd')
			System.out.printf("a�� d�̴�\n");
		// ���ڿ� ���������� '=='�� �̿��� char kopo38_a�� b�� ���� ��, c�� ���� ��, d�� ���� �� ���� ������ ����Ѵ�.

		String kopo38_aa = "abcd";
		// String kopo38_aa�� abcd�� ����. String�� ������ ���� "�� �̿��Ѵ�.
		if (kopo38_aa.equals("abcd"))
			System.out.printf("kopo38_aa�� abcd�̴�\n");
		else
			System.out.printf("kopo38_aa�� abcd�� �ƴϴ�\n");
		// ����, ���ڿʹ� �޸� String�� 'String.equals("���")'�� �̿��Ѵ�.
		// 'String.equals("���")'�� boolean���� String�� ����� ������ true, �ٸ��� false���� ������.

		boolean kopo38_bb = true;
		// boolean kopo38_bb�� true�� ����. boolean�� true �Ǵ� false���� ������.
		if (!!kopo38_bb)
			System.out.printf("kopo38_bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		else
			System.out.printf("kopo38_bb�� �ƴϰ� �����̴�\n");
		// !�� not�� �ǹ̸� �����Ƿ�(������) !!�̸� �������� ������, �� �ڱ� �ڽ��� �ȴ�. ���� kopo38_bb �� true �̹Ƿ�
		// !!kopo38_bb �� true
		// if (����)�� �⺻������ '������ true�̸�'�� �ǹ��̴�. ���� if ������ �����Ѵ�.
	}

}
