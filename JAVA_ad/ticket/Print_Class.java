package ticket;

import java.util.ArrayList;

public class Print_Class {

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

	public void price_result(Var_Class var) {
		System.out.printf("������ %s �� �Դϴ�.\n�����մϴ�.\n", var.price);
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
	}

	public void total_price_result(Var_Class var, ArrayList<Array_Class> Arrayticket) {
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
		System.out.println("=================== �������� ===================");
		for (int i = 0; i < Arrayticket.size(); i++) {
			System.out.printf("%s %s X %s %s�� *%s\n", Arrayticket.get(i).dorn(), Arrayticket.get(i).ages(),
					Arrayticket.get(i).nums(), Arrayticket.get(i).price(), Arrayticket.get(i).treat());
			var.totalprice += Arrayticket.get(i).price();

		}
		System.out.printf("\n\n����� �Ѿ��� %s�� �Դϴ�.\n", var.totalprice);
		System.out.println("================================================");
	}

	public void temp2() {
		System.out.print("\n��� ����(1.: ���ο� �ֹ�, 2: ���α׷� ����) : ");
	}

	public void thx() {
		System.out.println("�����մϴ�.");
	}

	public void errorocu() {
		System.out.println("\nó������ ���ư��ϴ�.\n");
	}
}