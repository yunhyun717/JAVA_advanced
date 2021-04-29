package exchange_;

public class Value_Class {

	public void money(ExType_Class ext) {
		ext.exchangeResult = ext.won / ext.EX_RATE[ext.how - 1];
		ext.money = (int) (ext.won / ext.EX_RATE[ext.how - 1]);
	}

	public void won_chg(ExType_Class ext) {
		ext.won_chg = (int) Math.floor((ext.exchangeResult - ext.money) * ext.EX_RATE[ext.how - 1]);
	}

}
