package exchange_;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class File_Class {
	private Calendar cal;
	private File file;
	private FileWriter fw;
	private SimpleDateFormat sdt;
	private ExType_Class ext;

	public File_Class() {
		cal = Calendar.getInstance();
		ext = new ExType_Class();
		file = new File(ext.FILEDIR);
		sdt = new SimpleDateFormat(ext.SDT);
	}

	public void file(ExType_Class ext) throws IOException {
		fw = new FileWriter(file, true);
		if (file.length() == 0) {
			fw.write(ext.filemenu);
		}
		fw.write(sdt.format(cal.getTime()) + "," + ext.EX[ext.how] + "," + ext.won + "," + ext.money + "," + ext.won_chg
				+ "\n");
		fw.close();
	}
}
