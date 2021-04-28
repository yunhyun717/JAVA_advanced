package ticket;

import java.util.Calendar;

public class Method_Class {
	
	public void getAge(Data_Class data) {
		Calendar calendar = Calendar.getInstance();
		data.current = new int [3];	data.birth = new int [3];
		data.current[0] = calendar.get(Calendar.YEAR);
		data.current[1] = calendar.get(Calendar.MONTH) + 1;
		data.current[2] = calendar.get(Calendar.DAY_OF_MONTH);
		data.birth[0] = Integer.parseInt(data.reginum.substring(0, 2))+1900;
		if (data.reginum.charAt(6) == '3' || data.reginum.charAt(6) == '4') {
			data.birth[0] += 100;
		} 
		data.birth[1] = Integer.parseInt(data.reginum.substring(2, 4));
		data.birth[2] = Integer.parseInt(data.reginum.substring(4, 6));
		data.age = data.current[0] - data.birth[0];

		if (data.birth[1] * 100 + data.birth[2] > data.current[1] * 100 + data.current[2]) {
			data.age--;
		}
		for (int i = 0; i < 5; i++) {
			if (data.AGESRAN[i] < data.age) {
				data.agescode = i;
			}
		}
	}
	
	public void add(Data_Class data) {
		data.tickets[data.dorncode][data.agescode][data.treatcode] += data.nums;
	}

	public int price(Data_Class data) {
		return (int) (data.DORN_AGE_PRICE[data.dorncode][data.agescode] * (1 - data.TREAT[data.treatcode]));
	}
	
	public int result_price(int i, int j, int k) {
		ConstValue_Class cons = new ConstValue_Class();
		return (int) (cons.DORN_AGE_PRICE[i][j] * (1 - cons.TREAT[k]));
	}
}
