package exchange_;

public class Print_Class {

	public void input1() {
		System.out.print("받은 원화 입력 : ");
	}

	public void input2() {
		System.out.println("\n어떤 화폐로 환전할까요?\n1.USD\n2.EUR\n3.JPY\nelse. 처음으로");
	}

	public void Exchange_Result(ExType_Class ext) {
		System.out.printf("\n%s로 환전 결과 : ", ext.EX[ext.how]);
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
		System.out.printf("\n\n원화 거스름돈 : %d원\n", ext.won_chg);
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
		System.out.println("\n처음으로 돌아갑니다.\n");
	}
}
