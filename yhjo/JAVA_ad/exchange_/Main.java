package exchange_;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		ExType_Class ext = new ExType_Class();
		Exchange_Class exchange = new Exchange_Class();
		exchange.exchange(ext);
	}
}
