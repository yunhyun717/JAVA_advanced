package ticket;

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

	public void price_result(Data_Class data) {
		System.out.printf("������ %s �� �Դϴ�.\n�����մϴ�.\n", data.price);
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
	}

	public void total_price_result(Data_Class data) {
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
		System.out.println("=================== �������� ===================");
		for (int i = 0; i < data.ticketArray.size(); i++) {
			System.out.printf("%s %s X %s %s�� *%s\n", data.ticketArray.get(i).dorn(), data.ticketArray.get(i).ages(),
					data.ticketArray.get(i).nums(), data.ticketArray.get(i).price(), data.ticketArray.get(i).treat());
			data.totalprice += data.ticketArray.get(i).price();
		}
		System.out.printf("\n\n����� �Ѿ��� %s�� �Դϴ�.\n", data.totalprice);
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
