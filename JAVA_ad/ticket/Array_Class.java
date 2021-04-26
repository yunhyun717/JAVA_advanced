package ticket;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Array_Class {
	public String date;
	public int dorncode;
	public int agescode;
	public int nums;
	public double price;
	public int treatcode;
	private Calendar calendar;
	private SimpleDateFormat sdf;
	private Var_Class var = new Var_Class();

	public Array_Class(Var_Class var) {
		calendar = Calendar.getInstance();
		sdf = new SimpleDateFormat("YYYYMMdd");
		this.date = sdf.format(calendar.getTime());
		this.dorncode = var.dorncode;
		this.agescode = var.agescode;
		this.nums = var.nums;
		this.treatcode = var.treatcode;
	}

	public String date() {
		return this.date;
	}

	public String dorn() {
		return var.DORN[this.dorncode];
	}

	public String ages() {
		return var.AGESTEMP[this.agescode];
	}

	public int nums() {
		return this.nums;
	}

	public int numsedit(int nums) {
		this.nums += nums;
		return this.nums;
	}

	public int price() {
		this.price = var.DORN_AGE_PRICE[this.dorncode][this.agescode] * nums * (1 - var.TREAT[this.treatcode]);
		return (int) this.price;
	}

	public String treat() {
		return var.TREAT2[this.treatcode];
	}

}
