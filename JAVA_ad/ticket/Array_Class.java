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
	private Data_Class data = new Data_Class();

	public Array_Class(Data_Class data) {
		calendar = Calendar.getInstance();
		sdf = new SimpleDateFormat("YYYYMMdd");
		this.date = sdf.format(calendar.getTime());
		this.dorncode = data.dorncode;
		this.agescode = data.agescode;
		this.nums = data.nums;
		this.treatcode = data.treatcode;
	}

	public String date() {
		return this.date;
	}

	public String dorn() {
		return data.DORN[this.dorncode];
	}

	public String ages() {
		return data.AGESTEMP[this.agescode];
	}

	public int nums() {
		return this.nums;
	}

	public int numsedit(int nums) {
		this.nums += nums;
		return this.nums;
	}

	public int price() {
		this.price = data.DORN_AGE_PRICE[this.dorncode][this.agescode] * nums * (1 - data.TREAT[this.treatcode]);
		return (int) this.price;
	}

	public String treat() {
		return data.TREAT2[this.treatcode];
	}

	public String fileString() {
		return date + "," + dorn() + "," + ages() + "," + nums() + "," + price() + ","
				+ treat().replaceAll("�������", "").trim() + "\n";
	}

	public boolean dupltest(Data_Class data) {
		if (this.dorncode == data.dorncode && this.agescode == data.agescode && this.treatcode == data.treatcode) {
			return true;
		} else {
			return false;
		}
	}

}
