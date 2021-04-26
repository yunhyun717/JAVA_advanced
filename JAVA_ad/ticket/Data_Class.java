package ticket;

import java.util.ArrayList;

public class Data_Class {

	ArrayList<Array_Class> Arrayticket;

	public Data_Class() {
		Arrayticket = new ArrayList<Array_Class>();
	}

	public void add(Var_Class var) {
		var.array_size = Arrayticket.size();
		if (var.array_size == 0) {
			Arrayticket.add(new Array_Class(var));
		} else {
			for (int i = 0; i < var.array_size; i++) {
				if (Arrayticket.get(i).dorncode == var.dorncode && Arrayticket.get(i).agescode == var.agescode
						&& Arrayticket.get(i).treatcode == var.treatcode) {
					Arrayticket.get(i).numsedit(var.nums);

				} else {
					Arrayticket.add(new Array_Class(var));
				}
			}
		}
	}

}
