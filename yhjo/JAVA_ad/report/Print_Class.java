package report;

public class Print_Class {

	public void data(Data_Class data) {
		System.out.println("====================REPORT====================");
		System.out.printf("%4.2s%6.2s%4.2s%4.2s%8.2s%6.4s\n", data.FileArray.get(0)[0], data.FileArray.get(0)[1],
				data.FileArray.get(0)[2], data.FileArray.get(0)[3], data.FileArray.get(0)[4], data.FileArray.get(0)[5]);
		for (int i = 1; i < data.FileArray.size(); i++) {
			System.out.printf("%8.8s%5.1s%6.1s%6.3s%12.10s%6.1s\n", data.FileArray.get(i)[0], data.FileArray.get(i)[1],
					data.FileArray.get(i)[2], data.FileArray.get(i)[3], data.FileArray.get(i)[4],
					data.FileArray.get(i)[5]);
		}
		System.out.println();
	}

	public void choice1() {
		System.out.println("\n���� ��Ȳ�� �����ϼ���.");
		System.out.println("1. ���� �� �Ǹ� ��Ȳ");
		System.out.println("2. ���ں� ���� ��Ȳ");
		System.out.println("3. ���� �Ǹ� ��Ȳ");
	}
	
	public void choice2() {
		System.out.println("\n����� ���Ϸ� ����Ͻðڽ��ϱ�?");
		System.out.println("1. Yes");
		System.out.println("2. No");
	}

	public void dornsell(Data_Class data) {
		System.out.println("\n==================���� �� �Ǹ���Ȳ====================");
		for (int i = 0; i < data.DORNTEMP.length; i++) {
			System.out.printf("%s �� ", data.DORNTEMP[i]);
			if (i == 0) {
				System.out.printf("%s��\n", data.dagesum);
			} else {
				System.out.printf("%s��\n", data.nagesum);
			}
			for (int j = 0; j < data.AGESTEMP.length; j++) {
				if (j != 0) {
					System.out.printf(", ");
				}
				System.out.printf("%s %s��", data.AGESTEMP[j], data.dornageticket[i][j]);
			}
			System.out.println();
			System.out.printf("%s ���� : ", data.DORNTEMP[i]);
			if (i == 0) {
				System.out.printf("%s��\n", data.dagetotalprice);
			} else {
				System.out.printf("%s��\n", data.nagetotalprice);
			}
			System.out.println();
		}

	}

	public void daysell(Data_Class data) {
		System.out.println("\n=======���ں� ���� ��Ȳ=======");
		for (int i = 0; i < data.va.length; i++) {
			System.out.printf("%s�� %s�� %s�� :%10.9s��\n", data.va[i].toString().substring(0, 4),
					data.va[i].toString().substring(4, 6), data.va[i].toString().substring(6), data.daysell[i]);

		}
	}

	public void treatticket(Data_Class data) {
		System.out.println("\n===���� �Ǹ� ��Ȳ===");
		System.out.printf("�� �Ǹ� Ƽ�� �� : %s��\n", data.ticketsum);
		for (int i = 0; i < data.TREATTEMP.length; i++) {
			System.out.printf("%s : %s��\n", data.TREATTEMP[i], data.treatticket[i]);

		}
	}
	
	public void error() {
		System.out.println("\n�ٽ� �Է��Ͻʽÿ�.");
	}
}
