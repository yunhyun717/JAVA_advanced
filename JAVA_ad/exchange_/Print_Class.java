package exchange_;

public class Print_Class {

	public void input1() {
		System.out.print("���� ��ȭ �Է� : ");
	}

	public void input2() {
		System.out.println("\n� ȭ��� ȯ���ұ��?\n1.USD\n2.EUR\n3.JPY\nelse. ó������");
	}

	public void Exchange_Result(ExType_Class ext) {
		System.out.printf("\n%s�� ȯ�� ��� : ", ext.EX[ext.how]);
		System.out.printf("%s %d\n", ext.EX[ext.how], ext.money);
		for (int i = 0; i < ext.CHANGE[ext.how].length; i++) {
			int number = ext.money / ext.CHANGE[ext.how][i];
			if (number != 0) {
				System.out.printf("%s %d : %d\n", ext.EX[ext.how], ext.CHANGE[ext.how][i], number);
				ext.money = ext.money % ext.CHANGE[ext.how][i];
			}
		}
	}

	public void change_won(ExType_Class ext) {
		System.out.printf("\n\n��ȭ �Ž����� : %d��\n", ext.won_chg);
		for (int i = 0; i < ext.CHANGE[0].length; i++) {
			int number = (int) ext.won_chg / ext.CHANGE[0][i];
			if (number != 0) {
				System.out.printf("%s %d : %d\n", ext.EX[0], ext.CHANGE[0][i], number);
				ext.won_chg = ext.won_chg % ext.CHANGE[0][i];
			}
		}
		System.out.print("\n\n");
	}

	public void errorocu() {
		System.out.println("\nó������ ���ư��ϴ�.\n");
	}
}
