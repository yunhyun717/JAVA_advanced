package ticket;

import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Method_Class {
	Print_Class print;

	public void getAge(Data_Class data) {
		Calendar calendar = Calendar.getInstance();
		data.currentYear = calendar.get(Calendar.YEAR);
		data.currentMonth = calendar.get(Calendar.MONTH) + 1;
		data.currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		data.birthYear = Integer.parseInt(data.reginum.substring(0, 2));
		if (data.reginum.charAt(6) == '1' || data.reginum.charAt(6) == '2') {
			data.birthYear += 1900;
		} else {
			data.birthYear += 2000;
		}
		data.birthMonth = Integer.parseInt(data.reginum.substring(2, 4));
		data.birthDay = Integer.parseInt(data.reginum.substring(4, 6));
		data.age = data.currentYear - data.birthYear;

		if (data.birthMonth * 100 + data.birthDay > data.currentMonth * 100 + data.currentDay) {
			data.age--;
		}
		System.out.println(data.age);
		for (int i = 0; i < 5; i++) {
			if (data.AGESRAN[i] < data.age) {
				data.agescode = i;
			}
		}
	}

	public void price(Data_Class data) {
		data.price = (int) (data.DORN_AGE_PRICE[data.dorncode][data.agescode] * data.nums
				* (1 - data.TREAT[data.treatcode]));
	}
	
	public void add(Data_Class data) {
		data.array_size = data.ticketArray.size();
		if (data.array_size == 0) {
			data.ticketArray.add(new Array_Class(data));
		} else {
			for (int i = 0; i < data.array_size; i++) {
				if (data.ticketArray.get(i).dataset().equals(data.dataset)) {
					data.ticketArray.get(i).numsedit(data.nums);
				} else {
					data.ticketArray.add(new Array_Class(data));
				}
			}
		}
	}

	public void dataSort(Data_Class data) {
		Comparator<Array_Class> bytreat = new Comparator<Array_Class>() {
			public int compare(Array_Class a1, Array_Class a2) {
				return (a1.treatcode - a2.treatcode);
			}
		};
		Comparator<Array_Class> byages = new Comparator<Array_Class>() {
			public int compare(Array_Class a1, Array_Class a2) {
				return (a1.agescode - a2.agescode);
			}
		};
		Collections.sort(data.ticketArray, bytreat);
		Collections.sort(data.ticketArray, byages);
		Collections.sort(data.ticketArray, byages);
	}

}
