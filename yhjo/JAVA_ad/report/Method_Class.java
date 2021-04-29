package report;

import java.io.IOException;

public class Method_Class {
	Print_Class print;
	File_Class file;

	public void organize(Data_Class data) {
		for (int i = 0; i < data.va.length; i++) {
			data.dataset = new int[data.DORNTEMP.length][data.AGESTEMP.length][data.TREATTEMP.length];
			for (int j = 1; j < data.FileArray.size(); j++) {
				if (data.va[i].equals(data.FileArray.get(j)[0])) {
					data.dataset[Integer.parseInt(data.FileArray.get(j)[1])][Integer
							.parseInt(data.FileArray.get(j)[2])][Integer.parseInt(data.FileArray.get(j)[5])] += Integer
									.parseInt(data.FileArray.get(j)[3]);
				}
			}
			data.OrganizedData.add(data.dataset);
		}
	}

	public void data_calc(Data_Class data) {
		data.dornageticket = new int[data.DORNTEMP.length][data.AGESTEMP.length];
		data.daysell = new int[data.OrganizedData.size()];
		data.treatticket = new int[data.TREATTEMP.length];
		data.dagesum = data.nagesum = data.dagetotalprice = data.nagetotalprice = data.ticketsum = 0;
		for (int i = 0; i < data.OrganizedData.size(); i++) {
			for (int j = 0; j < data.DORNTEMP.length; j++) {
				for (int k = 0; k < data.AGESTEMP.length; k++) {
					for (int l = 0; l < data.TREATTEMP.length; l++) {
						data.dornageticket[j][k] += data.OrganizedData.get(i)[j][k][l];
						data.daysell[i] += (int) (data.DORN_AGE_PRICE[j][k] * data.OrganizedData.get(i)[j][k][l]
								* (1 - data.TREAT[l]));
						data.treatticket[l] += data.OrganizedData.get(i)[j][k][l];
						data.ticketsum += data.OrganizedData.get(i)[j][k][l];
						if (j == 0) {
							data.dagesum += data.OrganizedData.get(i)[j][k][l];
							data.dagetotalprice += (int) (data.DORN_AGE_PRICE[j][k] * data.OrganizedData.get(i)[j][k][l]
									* (1 - data.TREAT[l]));
						} else {
							data.nagesum += data.OrganizedData.get(i)[j][k][l];
							data.nagetotalprice += (int) (data.DORN_AGE_PRICE[j][k] * data.OrganizedData.get(i)[j][k][l]
									* (1 - data.TREAT[l]));
						}
					}
				}
			}
		}
	}
	
	public void choice1_result(Data_Class data) {
		print = new Print_Class();
		switch (data.choice1) {
		case 1:
			print.dornsell(data);
			break;
		case 2:
			print.daysell(data);
			break;
		case 3:
			print.treatticket(data);
			break;
		}
	}
	
	public void choice2_result(Data_Class data) throws IOException {
		file = new File_Class();
		switch (data.choice2 ) {
		case 1 :
			if (data.choice1 == 1) {
				file.file_Write_dornage(data);
			} else if (data.choice1 == 2){
				file.file_Write_daysell(data);
			} else {
				file.file_Write_treatticket(data);
			}
		}
	}
}
