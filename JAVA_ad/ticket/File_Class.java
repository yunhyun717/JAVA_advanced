package ticket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Class {
	private File file;
	private FileWriter fw;
	private Print_Class print;
	private Data_Class data;

	public File_Class() {
		data = new Data_Class();
		print = new Print_Class();
		file = new File(data.FILEPATH);
	}

	public void file(Data_Class data) throws IOException {
		fw = new FileWriter(file, true);
		if (file.length() == 0) {
			fw.write(data.FILEMENU);
		}
		for (int i = 0; i < data.ticketArray.size(); i++) {
			fw.write(data.ticketArray.get(i).fileString());
		}
		fw.close();
		print.thx();
	}
}
