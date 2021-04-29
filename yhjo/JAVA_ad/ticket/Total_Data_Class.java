package ticket;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Total_Data_Class extends ConstValue_Class {
	int[][][] tickets;
	String date;
	Calendar calendar;
	SimpleDateFormat sdf;

	public Total_Data_Class() {
		calendar = Calendar.getInstance();
		sdf = new SimpleDateFormat("YYYYMMdd");
		date = sdf.format(calendar.getTime());
		tickets = new int[DORNTEMP.length][AGESRAN.length][TREAT.length];
	}

	public void add(Data_Class data) {
		for (int i = 0; i < DORNTEMP.length; i++) {
			for (int j = 0; j < AGESTEMP.length; j++) {
				for (int k = 0; k < TREATTEMP.length; k++) {
					tickets[i][j][k] += data.tickets[i][j][k];
				}
			}
		}
	}
}