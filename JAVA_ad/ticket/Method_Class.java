package ticket;

import java.util.Calendar;

public class Method_Class {
	Print_Class print;

	public void getAge(Var_Class var) {
		Calendar calendar = Calendar.getInstance();
		var.currentYear = calendar.get(Calendar.YEAR);
		var.currentMonth = calendar.get(Calendar.MONTH) + 1;
		var.currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		var.birthYear = Integer.parseInt(var.reginum.substring(0, 2));
		if (var.reginum.substring(6,7).equals("1") || var.reginum.substring(6,7).equals("2")) {
			var.birthYear += 1900;
		} else {
			var.birthYear += 2000;
		}
		var.birthMonth = Integer.parseInt(var.reginum.substring(2, 4));
		var.birthDay = Integer.parseInt(var.reginum.substring(4, 6));
		var.age = var.currentYear - var.birthYear;
		
		if (var.birthMonth * 100 + var.birthDay > var.currentMonth * 100 + var.currentDay) {
			var.age--;
		}
		var.agescode = 4;
		for (int i = 3; i > -1; i--) {
			if (var.age < var.AGESRAN[i]) {
				var.agescode = i;
			}
		}
	}

	public void price(Var_Class var) {
		var.price = (int) (var.DORN_AGE_PRICE[var.dorncode][var.agescode] * var.nums * (1 - var.TREAT[var.treatcode]));
	}

	public void temp(Var_Class var, Data_Class data) {
		print = new Print_Class();
		print.total_price_result(var, data.Arrayticket);
	}
	

}
