package ticket;

public class Print_Class {

	Method_Class meth;
	ConstValue_Class cons;

	public Print_Class() {
		meth = new Method_Class();
	}

	public void inputDorN() {
		System.out.println("������ �����ϼ���");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
	}

	public void inputreginum() {
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���");
	}

	public void inputnums() {
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
	}

	public void inputtreat() {
		System.out.println("�������� �����ϼ���");
		System.out.println("1. ���� (���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
	}

	public void price_result(Data_Class data) {
		System.out.printf("������ %s �� �Դϴ�.\n�����մϴ�.\n\n", meth.price(data) * data.nums);
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
	}

	public void total_price_result(Data_Class data) {
		cons = new ConstValue_Class();
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.\n");
		System.out.println("=================== �������� ===================");
		for (int i = 0; i < data.DORNTEMP.length; i++) {
			for (int j = 0; j < data.AGESTEMP.length; j++) {
				for (int k = 0; k < data.TREATTEMP.length; k++) {
					if (data.tickets[i][j][k] != 0) {
						System.out.printf("%s %s X %s %s�� *%s\n", data.DORNTEMP[i], data.AGESTEMP[j],
								data.tickets[i][j][k], data.tickets[i][j][k] * meth.result_price(i, j, k),
								data.TREATTEMP[k]);
						data.totalprice += data.tickets[i][j][k] * meth.result_price(i, j, k);
					}
				}
			}
		}
		System.out.printf("\n\n����� �Ѿ��� %s�� �Դϴ�.\n", data.totalprice);
		System.out.println("================================================");
	}

	public void temp2() {
		System.out.print("\n��� ����(1.: ���ο� �ֹ�, 2: ���α׷� ����) : ");
	}

	public void thx() {
		System.out.println("�����մϴ�.\n");
	}

	public void errorocu() {
		System.out.println("\nó������ ���ư��ϴ�.\n");
	}

	public void error() {
		System.out.println("�ٽ� �Է��Ͻʽÿ�.");
	}
}