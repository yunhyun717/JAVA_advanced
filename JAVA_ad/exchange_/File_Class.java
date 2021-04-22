package exchange_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class File_Class {
	private File file;
	private FileWriter fw;
	private Calendar cal;
	private SimpleDateFormat sdt;
	String[] EX = ConstValue_Class.EX;
	String FILEDIR = ConstValue_Class.FILEDIR;

	public File_Class() throws IOException {
		file = new File(FILEDIR);
		cal = Calendar.getInstance();
		sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	}

	public void file(int won, int how, int money, int won_chg) throws IOException {
		fw = new FileWriter(file, true);
		if (file.length() == 0) {
			fw.write("날짜,환전대상,금액,환전결과,거스름돈\n");
		}
		fw.write(sdt.format(cal.getTime()) + "," + EX[how] + "," + won + "," + money + "," + won_chg + "\n");
		fw.close();
		
	}
}
