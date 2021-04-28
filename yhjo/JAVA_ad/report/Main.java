package report;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Data_Class data = new Data_Class();
		Ticket_Class ticket = new Ticket_Class();
		ticket.Process(data);
	}
}
