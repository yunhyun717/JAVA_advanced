package report;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Class {
	private File file;
	private File file1;
	private File file2;
	private File file3;
	private FileWriter fw;
	private BufferedReader br;
	private ConstValue_Class cons;

	public File_Class() throws FileNotFoundException {
		cons = new ConstValue_Class();
		file = new File(cons.FILEPATH);
		file1 = new File(cons.FILEPATH1);
		file2 = new File(cons.FILEPATH2);
		file3 = new File(cons.FILEPATH3);
		br = new BufferedReader(new FileReader(file));
	}

	public void file_read(Data_Class data) throws IOException {
		data.field_name = br.readLine();
		data.FileArray.add(data.field_name.split(","));
		while ((data.field = br.readLine()) != null) {
			data.fieldsp = data.field.split(",");
			data.date.add(data.fieldsp[0]);
			for (int i = 0; i < cons.DORNTEMP.length; i++) {
				if (data.fieldsp[1].equals(cons.DORNTEMP[i])) {
					data.fieldsp[1] = Integer.toString(i);
				}
			}
			for (int i = 0; i < cons.AGESTEMP.length; i++) {
				if (data.fieldsp[2].equals(cons.AGESTEMP[i])) {
					data.fieldsp[2] = Integer.toString(i);
				}
			}
			for (int i = 0; i < cons.TREATTEMP.length; i++) {
				if (data.fieldsp[5].equals(cons.TREATTEMP[i])) {
					data.fieldsp[5] = Integer.toString(i);
				}
			}
			data.FileArray.add(data.fieldsp);
		}
		data.va = data.date.toArray();
		br.close();
	}

	public void file_Write_dornage(Data_Class data) throws IOException {
		fw = new FileWriter(file1, true);
		fw.write(data.FILEMENU1);
		for (int i = 0; i < data.AGESTEMP.length; i++) {
			fw.write(data.AGESTEMP[i] + "," + data.dornageticket[0][i] + "," + data.dornageticket[1][i] + "\n");
		}
		fw.write("합계," + data.dagesum + "," + data.nagesum + "\n");
		fw.write("매출," + data.dagetotalprice + "," + data.nagetotalprice + "\n");
		fw.close();
	}

	public void file_Write_daysell(Data_Class data) throws IOException {
		fw = new FileWriter(file2, true);
		fw.write(data.FILEMENU2);
		for (int i = 0; i < data.va.length; i++) {
			fw.write(data.va[i].toString().substring(0, 4) + "-" + data.va[i].toString().substring(4, 6) + "-"
					+ data.va[i].toString().substring(6) + "," + data.daysell[i] + "\n");
		}
		fw.close();
	}

	public void file_Write_treatticket(Data_Class data) throws IOException {
		fw = new FileWriter(file3, true);
		fw.write(data.FILEMENU3);
		fw.write("총 판매," + data.ticketsum + "\n");
		for (int i = 0; i < data.TREATTEMP.length; i++) {
			fw.write(data.TREATTEMP[i] + "," + data.treatticket[i] + "\n");
		}
		fw.close();
	}
}
