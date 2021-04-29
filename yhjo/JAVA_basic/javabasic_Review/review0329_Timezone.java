package javabasic_Review;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class review0329_Timezone {
	public static void main(String[] args) {
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� M�� d�� HH�� mm�� ss��");
		
		time = TimeZone.getTimeZone("Asia/Seoul");
		dateFormat.setTimeZone(time);
		System.out.printf("%s : %s\n",time.getDisplayName(),dateFormat.format(date));
		
		time = TimeZone.getTimeZone("America/New_York");
		dateFormat.setTimeZone(time);
		System.out.printf("%s : %s\n",time.getDisplayName(),dateFormat.format(date));

		time = TimeZone.getTimeZone("Europe/Madrid");
		dateFormat.setTimeZone(time);
		System.out.printf("%s : %s\n",time.getDisplayName(),dateFormat.format(date));
	}

}
