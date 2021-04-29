package kopo38_swc05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P06 {
	static int kopo38_receiptwidth = 41;
	// ¿µ¼öÁõ °¡·Î Ä­¼ö ¼³Á¤, ÃÖ¼Ò 34Ä­À» ¼³Á¤ÇØ¾ßÇÑ´Ù.

	public static void main(String[] args) {
		String[][] kopo38_items = { { "tf", "ÀúÅº¼ÒÀÎÁõ »ç°ú 4~7ÀÔ/ºÀ (1.3kg³»¿Ü)", "9900", "2" },
				{ "tf", "[±¹³»»ê] ¼ºÁÖÂü¿Ü 3~6ÀÔ/ºÀ (1.2kg³»¿Ü)", "10900", "1" }, { "tf", "Àû»óÃß 200g", "1480", "2" },
				{ "tf", "¾ÖÈ£¹Ú 200g", "1280", "2" }, { "tf", "ÀÏÆÇ¶õ 30°³ÀÔ (Æ¯¶õ, 1800g)", "6980", "1" },
				{ "tf", "[±¹³»»ê] ¼ºÁÖÂü¿Ü 3~6ÀÔ/ºÀ (1.2kg³»¿Ü)", "10900", "2" }, { "tf", "[20³â»ê] ÀÌ¸À½Ò 20kg", "58900", "1" },
				{ "tf", "[±¹³»»ê] ´çÂù»ç°ú 4~11ÀÔ/ºÀ (1.8kg)", "12800", "2" }, { "tf", "[±¹³»»ê] ´ëÃß¹æ¿ïÅä¸¶Åä 1kg/ÆÑ", "7900", "2" },
				{ "tf", "[Ç®¹«¿ø] ±¹»êÄá Äá³ª¹° 340g", "2500", "2" }, { "tf", "[±¹³»»ê] ¹æ¿ïÅä¸¶Åä 600g/ÆÑ", "5400", "3" },
				{ "tf", "[¼­¿ï¿ìÀ¯] ÈÄ·¹½¬ ¹ĞÅ© ±âÈ¹(900ml*2) 1800ml", "3870", "3" }, { "0", "³ëºê·£µå µµÅèÇÑ ¹°Æ¼½´ 100¸Å", "980", "3" },
				{ "0", "³ëºê·£µå À§»ıÀå°©125¸Å", "1680", "4" }, { "0", "ÇÇÁö ÆÄ¿öÁ© ¼¼Á¦ ÇÁ·¹½¬2.7L", "6900", "1" },
				{ "0", "¿¡ÀÌÇ»¸® À¯¾îÇÁ¸® KF94 ÀÇ¾à¿ÜÇ° ±¹»ê ´ëÇü ºí·¢ È­ÀÌÆ® ÀÏÈ¸¿ë¸¶½ºÅ© 100¸Å", "15900", "1" },
				{ "0", "ÇÁ¸± º£ÀÌÅ·¼Ò´Ù Ç»¾î·¹¸ó 750ML ¿ë±â", "6500", "1" }, { "0", "³ëºê·£µå Äİµåºê·ç ¾Æ¸Ş¸®Ä«³ë 500m", "1880", "5" },
				{ "0", "[³ëºê·£µå] ½¡ºÒµ¥¸®¾ß³¢´ß²¿Ä¡ 800g", "12980", "1" }, { "0", "ÇÇÄÚÅ© Äİ·Òºñ¾Æ ¾ÈÆ¼¿ÀÅ°¾Æ ¼öÇÁ¸®¸ğ 1kg (È¦ºó)", "14980", "1" },
				{ "0", "¿À¶öºñ Ä©¼Ö ¾îµå¹êÆ¼Áö 5¿şÀÌ 3°³ÀÔ+Å©·Î½º¾×¼Ç Å¹¿ùÇÑ ¼¼Á¤·Â 2°³ÀÔ", "9900", "2" }, { "0", "³ó½É ¹èÈ«µ¿ºñºö¸é 4ÀÔ", "2980", "2" },
				{ "0", "[Ç®¹«¿ø]±¹»êÄá ÅõÄÅ µÎºÎ 600g", "4980", "2" }, { "0", "2080 ¿À¸®Áö³¯ ¾ËÆÄ ºí·ç 140g*3ÀÔ", "7900", "1" },
				{ "0", "[¸ÅÀÏ] ¸¶ÀÌ Ä«Æä¶ó¶¼ 220ml*6ÀÔ ±âÈ¹ (±âÈ¹·£´ı±¸¼º)", "5980", "6" },
				{ "0", "³ëºê·£µå Äİ·Òºñ¾Æ ¾Æ¸Ş¸®Ä«³ë ºí·¢ 2.1L", "2980", "4" }, { "0", "[¼­¿ï¿ìÀ¯] ½ºÆä¼ÈÆ¼ Ä«Æä¶ó¶¼ ¸ğÄ« 250ml", "1000", "5" },
				{ "0", "[¸Æ½É] TOP º¼µå ¿¡½ºÇÁ·¹¼Ò ¶ó¶¼ 300ml", "1000", "10" },
				{ "0", "[¼­¿ï¿ìÀ¯] ½ºÆä¼ÈÆ¼ Ä«Æä¶ó¶¼ ¾ÆÆ÷°¡Åä 250ml", "1000", "10" },
				{ "0", "(¾³¹è¼Û)[¸Æ½É] ¸ğÄ«°ñµå ¸¶ÀÏµå Ä¿ÇÇ¹Í½º 250ÀÔ(12g*250ÀÔ)", "27200", "1" } };
		// String ´ÙÁß ¹è¿­ kopo38_items¸¦ ¼³Á¤ÇÑ´Ù. { °ú¼¼¿©ºÎ, »óÇ°¸í, ´Ü°¡, ¼ö·® } ¼øÀÌ´Ù.(°ú¼¼ ¿©ºÎ¿¡ ¸é¼¼ÀÏ °æ¿ì
		// "tf", ¾Æ´Ò°æ¿ì "0"¸¦ ÀÔ·ÂÇÑ´Ù.)

		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		SimpleDateFormat kopop38_sdf2 = new SimpleDateFormat("YYYYMMdd");
		// »ç¿ëÇÒ methodµéÀ» ºÒ·¯¿Â´Ù. kopo38_df´Â ¼ıÀÚ¿¡ ¼¼ÀÚ¸®¸¶´Ù ','¸¦ Âï´Â´Ù. kopo38_calendar´Â ½Ã°£Àº ºÒ·¯¿Â´Ù.
		// kopo38_sdf¿Í kopo38_sdf2´Â ½Ã°£À» Ãâ·ÂÇÏ´Â Çü½ÄÀ» ÁöÁ¤ÇÑ´Ù.

		System.out.printf("  *******   ÀÌ¸¶Æ® Á×ÀüÁ¡ (031)888-1234\n");
		System.out.printf("  *      *  206-85-50913 °­Èñ¼®\n");
		System.out.printf("  *******   ¿ëÀÎ ¼öÁö±¸ Æ÷Àº´ë·Î 552\n");
		System.out.printf("\n¿µ¼öÁõ ¹ÌÁöÂü½Ã ±³È¯/È¯ºÒ ºÒ°¡\n");
		System.out.printf("Á¤»ó»óÇ°¿¡ ÇÑÇÔ, 30ÀÏ ÀÌ³»(½Å¼±7ÀÏ)\n");
		System.out.printf("¡ØÀÏºÎ ºê·£µå¸ÅÀå Á¦¿Ü(¸ÅÀå °íÁö¹°ÂüÁ¶)\n");
		System.out.printf("±³È¯/È¯ºÒ ±¸¸ÅÁ¡¿¡¼­ °¡´É(°áÁ¦Ä«µå ÁöÂü)\n\n");
		// ³»¿ëÀ» Ãâ·ÂÇÑ´Ù.
		kopo38_twostring("[±¸ ¸Å]" + kopo38_sdf.format(kopo38_calendar.getTime()), "POS:0011-9861");
		// ÀÛ¼ºÇÑ method¸¦ È°¿ëÇØ ³ª´® Á¤·ÄÀ» ÇÑ´Ù. ³»¿ëÀ¸·Î kopo39_sdf°ú kopo38_calendar¸¦ È°¿ëÇÏ¿© ÇöÀç ½Ã°£À» ÁöÁ¤ÇÑ
		// Çü½ÄÀ¸·Î ºÒ·¯¿Â´Ù.
		kopo38_drawline();
		// kopo38_receiptwidth¸¸Å­ ¼±À» ±ß´Â methodÀÎ kopo38_lineÀ» ½ÇÇàÇÑ´Ù.
		int kopo38_tax_name = kopo38_receiptwidth - 25;
		int kopo38_tnsf = (int) Math.ceil((kopo38_tax_name - 8) / 2.0);
		int kopo38_tnsb = (int) Math.floor((kopo38_tax_name - 8) / 2.0);

		System.out.printf(
				"%" + (kopo38_tnsf + 5) + "." + 5 + "s%" + kopo38_tnsb + "." + kopo38_tnsf + "s%8.5s%3.2s%8.5s\n",
				"»ó Ç° ¸í", "", "´Ü   °¡", "¼ö·®", "±İ   ¾×");
		// ÇÑÁÙÀÇ ±æÀÌ¸¦ kopo38_receiptwidth·Î ¼³Á¤ÇßÀ» ¶§, °¢°¢ÀÇ Ç×¸ñÀÌ Â÷ÁöÇÏ´Â ±æÀÌ´Â '´Ü°¡' : 10Ä­, '¼ö·®' : 4Ä­,
		// '±İ¾×' : 11Ä­ , '»óÇ°¸í' : kopo38_receiptwidth -10 -4 -11·Î ¼³Á¤ÇÑ´Ù.
		// (´Ü°¡, ¼ö·®, ±İ¾× ºÎºĞÀº ÁÙÀÏ ¼ö ¾øÀ¸¹Ç·Î »óÇ°¸íÀ» ÁÙÀÎ´Ù. '»óÇ°¸í'ÀÇ ¿µ¿ªÀº °ú¼¼ ¿©ºÎ¿Í »óÇ°¸í ºÎºĞÀ» Æ÷ÇÔÇÑ´Ù.)
		// ÀÌ¶§, ÇÁ·Î±×·¥Àº ÇÑ±ÛÀÌ 1Ä­À» Â÷ÁöÇÏ´Â °ÍÀ¸·Î ÀÎ½ÄÇÏ°í ½ÇÇàÇÏÁö¸¸, ½ÇÁ¦·Î´Â 2Ä­À» Â÷ÁöÇÏ¹Ç·Î ÇÑ±Û ÇÑ ±ÛÀÚ´ç ±æÀÌ¸¦ ÇÑÄ­¾¿ ÁÙ¿©¾ßÇÑ´Ù.
		// '»óÇ°¸í' Ç×¸ñÀº °¡¿îµ¥ Á¤·ÄÀ» À§ÇØ kopo38_tax_nameÄ­¿¡¼­ '»óÇ°¸í' ³»¿ëÀÇ ±æÀÌÀÎ 8±ÛÀÚ¸¸Å­À» »« »óÅÂ¿¡¼­ 2·Î ³ª´©¾î
		// ¿Ã¸²ÇÑ Ä­¸¸Å­À» ¾Õ¿¡, ³»¸²ÇÑ Ä­¸¸Å­À» µÚ¿¡ ¹èÄ¡ÇÏ¿© Ã³¸®ÇÑ´Ù.
		// '´Ü°¡' Ç×¸ñÀº 10Ä­¿¡¼­ ÇÑ±Û 2±ÛÀÚ¸¸Å­ÀÇ ±æÀÌ¸¦ »« 8Ä­À¸·Î Ã³¸®Çß´Ù.
		// '¼ö·®' Ç×¸ñÀº 4Ä­¿¡¼­ ÇÑ±Û 2±ÛÀÚ¸¸Å­ÀÇ ±æÀÌ¸¦ »« 2Ä­À¸·Î Ã³¸®ÇØ¾ß ÇÏÁö¸¸ À§Ä¡ Á¶Á¤À» À§ÇØ 3Ä­À¸·Î Ã³¸®ÇÏ¿´´Ù.
		// '±İ¾×' Ç×¸ñÀº 11Ä­¿¡¼­ ÇÑ±Û 2±ÛÀÚ¸¸Å­ÀÇ ±æÀÌ¸¦ »« 9Ä­À¸·Î Ã³¸®ÇØ¾ß ÇÏÁö¸¸ '¼ö·®'ÀÇ À§Ä¡ Á¶Á¤À¸·Î 8Ä­À¸·Î Ã³¸®ÇÏ¿´´Ù.
		int kopo38_nums = kopo38_items.length;
		// ÃÑ ¹°Ç° ¼ö·®ÀÎ kopo38_nums¸¦ kopo38_items ´ÙÁß ¹è¿­ÀÇ ±æÀÌ·Î ¼³Á¤Çß´Ù.
		int kopo38_taxfreeprice = 0;
		int kopo38_taxitemprice = 0;
		// ¸é¼¼ ¹°Ç° °ªÀÇ ÇÕÀÎ kopo38_taxfreeprice¿Í °ú¼¼ ¹°Ç° °ªÀÇ ÇÕÀÎ kopo38_taxitemprice¸¦ °¢°¢ 0À¸·Î ¼³Á¤ÇÏ°í
		// ½ÃÀÛÇÑ´Ù.
		for (int kopo38_i = 0; kopo38_i < kopo38_items.length; kopo38_i++) {
			// 0ºÎÅÍ ½ÃÀÛÇØ kopo38_items.lengthÀÇ ±æÀÌº¸´Ù ÀÛÀº Á¤¼ö kopo38_i¿¡ ´ëÇØ(¸ğµç ¹°Ç°À» Ãâ·Â ¹× Ã³¸®ÇÏ±â À§ÇØ ¹İº¹¹®
			// »ç¿ë)
			if (kopo38_i % 5 == 0) {
				kopo38_drawline();
			}
			// kopo38_i°¡ 0ÀÌ ¾Æ´Ï°í(½ÃÀÛÁ¡¿¡¼­´Â ½Ç¼±À» ±ßÁö ¾Ê´Â´Ù.) kopo38_i°¡ 5·Î ³ª´©¾î ¶³¾îÁö¸é ½Ç¼±À» ±ß´Â´Ù.(Ç×¸ñ 5°³¸¶´Ù
			// ½Ç¼±À» ±ß´Â´Ù.)
			int kopo38_iprice = Integer.parseInt(kopo38_items[kopo38_i][2])
					* Integer.parseInt(kopo38_items[kopo38_i][3]);
			// Á¤¼ö kopo38_iprice¸¦ Á¤¼ö Ã³¸®ÇÑ(String°ªÀ¸·Î ÀÔ·ÂµÆÀ¸¹Ç·Î) ¹°Ç° °¡°İ°ú ¹°Ç° ¼ö·®À» °öÇÑ °ªÀ¸·Î ¼³Á¤ÇÑ´Ù.(ÇöÀç ¹°Ç°
			// ±İ¾×)
			if (kopo38_items[kopo38_i][0].equals("tf")) {
				System.out.printf("* ");
				kopo38_taxfreeprice += kopo38_iprice;
				// kopo38_items[kopo38_i][0]ÀÌ "tf"ÀÌ¸é(ÇöÀç Ã³¸®µÇ°íÀÖ´Â ¹°Ç°ÀÌ ¸é¼¼ ´ë»óÀÌ¸é) ¸Ç ¾Õ¿¡ "* "À» ³Ö´Â´Ù.
				// ¶ÇÇÑ kopo38_taxfreeprice(¸é¼¼ ¹°Ç° °¡°İÀÇ ÇÕ)¿¡ kopo38_iprice(ÇöÀç ¹°Ç° ±İ¾×)¸¦ ´õÇÑ´Ù.
			} else {
				System.out.printf("  ");
				kopo38_taxitemprice += kopo38_iprice;
			}
			// kopo38_items[kopo38_i][0]ÀÌ "tf"°¡ ¾Æ´Ï¸é(ÇöÀç Ã³¸®µÇ°íÀÖ´Â ¹°Ç°ÀÌ °ú¼¼ ´ë»óÀÌ¸é) ¸Ç ¾Õ¿¡ " "À» ³Ö´Â´Ù.("*
			// "°¡ µé¾î°¡´Â ±æÀÌ¸¦ ¸ÂÃçÁÖ±â À§ÇØ)
			// ¶ÇÇÑ kopo38_taxitemprice(¸é¼¼ ¹°Ç° °¡°İÀÇ ÇÕ)¿¡ kopo38_iprice(ÇöÀç ¹°Ç° ±İ¾×)¸¦ ´õÇÑ´Ù.
			int kopo38_namewidth = kopo38_tax_name - 2;
			// »óÇ°¸í¿µ¿ª¿¡¼­ °ú¼¼ ¿©ºÎ¸¦ Á¦¿ÜÇÑ ±æÀÌ¸¦ Á¤¼ö namewidth·Î ¼³Á¤ÇÑ´Ù. namewidth´Â ´Ü°¡, ¼ö·®, ±İ¾×ÀÌ ¿ì¼± Ãâ·ÂµÇ°í
			// ³²Àº ºÎºĞ¿¡ Ãâ·ÂµÇ¾î¾ßÇÏ¹Ç·Î kopo38_tax_name¿¡¼­ °ú¼¼¿©ºÎ±æÀÌ 2¸¦ Á¦¿ÜÇÑ ºÎºĞÀ¸·Î ¼³Á¤ÇÑ´Ù.
			int kopo38_charnum = 0;
			int kopo38_kornum = 0;

			for (int kopo38_j = 0; kopo38_j < kopo38_items[kopo38_i][1].length(); kopo38_j++) {
				int kopo38_charint = (int) (kopo38_items[kopo38_i][1].charAt(kopo38_j));
				kopo38_charnum = kopo38_j + 1;
				if (44031 < kopo38_charint && 55204 > kopo38_charint) {
					kopo38_kornum++;
				}
				if (kopo38_kornum + kopo38_charnum == kopo38_namewidth) {
					break;
				} else if (kopo38_kornum + kopo38_charnum == kopo38_namewidth + 1) {
					kopo38_kornum--;
					kopo38_charnum--;
					break;
				}
			}
			// »óÇ°¸íÀ» Ã³¸®ÇÏ±âÀ§ÇØ ¹İº¹¹®À» »ç¿ëÇÑ´Ù.
			// »óÇ°¸íÀÇ ¹®Á¦´Â ÇÑ±ÛÀÌ µé¾î°£´Ù´Â Á¡ÀÌ´Ù. ÇÑ±ÛÀÌ µé¾î°£ StringÀ» ¿øÇÏ´Â ±æÀÌ·Î Ãâ·ÂÇÏ±â À§ÇØ¼­´Â ¿øÇÏ´Â ±æÀÌ¿¡¼­ String¿¡
			// Æ÷ÇÔµÈ ÇÑ±ÛÀÇ °¹¼ö¸¦ »©ÁÖ¸é µÈ´Ù.(ÇÑ±ÛÀÌ 2Ä­À» Â÷ÁöÇÏ¹Ç·Î)
			// ÇÑ±ÛÀÇ ASCIIÄÚµå´Â '°¡'°¡ 44032ÀÌ°í, ¸¶Áö¸· ±ÛÀÚÀÎ 'ÆR'ÀÌ 55203ÀÇ °ªÀ» °¡Áø´Ù.
			// ¹İº¹¹®À» ÀÌ¿ëÇØ »óÇ°¸íÀÇ Ã¹±ÛÀÚºÎÅÍ ÇÑ±ÛÀÎÁö ¾Æ´ÑÁö È®ÀÎÇÑ´Ù. ¸ÕÀú ¸î¹øÂ° ±ÛÀÚ±îÁö È®ÀÎÇß´ÂÁö¸¦ Á¤¼ö kopo38_charnumÀ¸·Î
			// È®ÀÎÇÑ´Ù.
			// (kopo38_i´Â 0ºÎÅÍ ½ÃÀÛÇÏ¹Ç·Î) ÀÌÈÄ Á¤¼ö kopo38_charint¸¦ ÇöÀç È®ÀÎÇÏ°í ÀÖ´Â ±ÛÀÚÀÇ Á¤¼ö º¯È¯À¸·Î ¼³Á¤ÇÏ°í
			// kopo38_charintÀÇ Å©±â·Î ÇÑ±Û ¿©ºÎ¸¦ È®ÀÎÇÑ´Ù. ¸¸¾à ÇÑ±ÛÀÌ¸é ÇÑ±Û ±ÛÀÚ¼öÀÎ kopo38_kornum¿¡ 1À» ´õÇÑ´Ù.
			// ÇöÀç±îÁö ¼¾ ±ÛÀÚ ±æÀÌÀÇ ÇÕÀº °¢ (ÇÑ±ÛÀÎ ±ÛÀÚ¼ö)*2 + (ÇÑ±ÛÀÌ ¾Æ´Ñ ±ÛÀÚ)*1 =
			// kopo38_kornum*2 + (kopo38_charnum-kopo38_kornum)*1 =
			// kopo38_kornum+kopo38_charnumÀÌ´Ù.
			// ±æÀÌ°¡ 1¶Ç´Â 2¾¿ Áõ°¡ÇÏ¹Ç·Î »óÇ°¸íÀÌ kopo38_namewidthº¸´Ù ±æ´Ù¸é ÇÏ³ª¾¿ ¼¼¾î³ª°¬À» ¶§
			// ¼¼¾îÁø »óÇ°¸íÀÇ ±æÀÌ´Â kopo38_namewidth¿¡ Á¤È®È÷ µµ´ŞÇÏ°Å³ª kopo38_namewidth+1¿¡ µµ´ŞÇÏ°Ô µÈ´Ù.(¹«Á¶°Ç)
			// »óÇ°¸íÀÇ ±æÀÌ°¡ kopo38_namewidthÀÌ µÇ¾úÀ» ¶§ breakÇÏ¿© ÇØ´ç ºÎºĞ±îÁö Ãâ·ÂÇÏ°Å³ª
			// »óÇ°¸íÀÇ ±æÀÌ°¡ kopo38_namewidth+1ÀÌ µÇ¾úÀ» ¶§ kopo38_namewidthÀ» °Ç³Ê¶Ù°í µµ´ŞÇßÀ¸¹Ç·Î ¸¶Áö¸· ±ÛÀÚ´Â ÇÑ±ÛÀÓÀ»
			// ¾Ë ¼ö ÀÖ´Ù.
			// µû¶ó¼­ ÇÑ±Û °¹¼ö¿¡¼­ ÇÏ³ª¸¦ »©°í(¸¶Áö¸·±ÛÀÚ´Â Ãâ·ÂÀÌ ºÒ°¡´ÉÇÏ¹Ç·Î) Ç¥½ÃÇÒ ±ÛÀÚ ¼ö¿¡¼­µµ ÇÏ³ª¸¦ »©ÁÖ°í breakÇÑ´Ù.
			System.out.printf(
					"%-" + (kopo38_namewidth - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n",
					kopo38_items[kopo38_i][1], kopo38_df.format(Integer.parseInt(kopo38_items[kopo38_i][2])),
					kopo38_items[kopo38_i][3], kopo38_df.format(kopo38_iprice));
			// ÀÌÀü°ú °°ÀÌ »óÇ°¸í¿¡ Á¤ÇØÁø ¿µ¿ªÀÎ namewidth¿¡¼­ Ãâ·ÂÇÒ ³»¿ë¿¡¼­ ÇÑ±ÛÀÎ ±ÛÀÚ¸¦ »©ÁØ ¿µ¿ªÀ» »óÇ°¸í ¿µ¿ªÀ¸·Î ¼³Á¤ÇÏ°í,
			// ÇØ´ç ¿µ¿ª¸¸Å­ÀÇ ±æÀÌ¸¦ °¡Áöµµ·Ï ¼¾ ±ÛÀÚ¼ö¸¸Å­À» Ãâ·ÂÇÑ´Ù.
			// ´Ü°¡´Â 10Ä­ÀÇ ¿µ¿ª¿¡¼­ °£°İÀ» À§ÇØ 9Ä­±îÁö Ãâ·ÂÇÑ´Ù.
			// ¼ö·®Àº 4Ä­ÀÇ ¿µ¿ª¿¡¼­ °£°İÀ» À§ÇØ 3Ä­±îÁö Ãâ·ÂÇÑ´Ù.
			// ±İ¾×Àº 11Ä­ÀÇ ¿µ¿ª¿¡¼­ °£°İÀ» À§ÇØ 10Ä­±îÁö Ãâ·ÂÇÑ´Ù.
		}
		kopo38_drawline();
		System.out.println();
		kopo38_calc("ÃÑ Ç°¸ñ ¼ö·®", kopo38_df.format(kopo38_nums));
		kopo38_calc("(*)¸é ¼¼  ¹° Ç°", kopo38_df.format(kopo38_taxfreeprice));
		kopo38_calc("°ú ¼¼  ¹° Ç°", kopo38_df.format(Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("ºÎ   °¡   ¼¼", kopo38_df.format(kopo38_taxitemprice - Math.round(kopo38_taxitemprice / 1.1)));
		kopo38_calc("ÇÕ        °è", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		// °è»ê ºÎºĞ Çü½ÄÀ» ¸ÂÃß±â À§ÇÑ method kopo38_calc¸¦ ÀÌ¿ëÇÑ´Ù.
		// ¼ıÀÚ Çü½ÄÀº kopo38_df¸¦ È°¿ëÇÏ¿© ÁöÁ¤ÇÑ Çü½ÄÀ¸·Î Ãâ·ÂÇÑ´Ù.
		// ÃÑ Ç°¸ñ¼ö·®Àº kopo38_nums¸¦ Ãâ·ÂÇÑ´Ù.
		// ¸é¼¼¹°Ç°Àº kopo38_taxfreeprice¸¦ Ãâ·ÂÇÑ´Ù.
		// °ú¼¼¹°Ç°Àº kopo38_taxitemprice¸¦ 1.1·Î ³ª´« °ªÀÇ ¼Ò¼ıÁ¡ Ã¹Â°ÀÚ¸®¿¡¼­ ¹İ¿Ã¸²À¸·Î ¼³Á¤ÇÑ´Ù.
		// ºÎ°¡¼¼´Â kopo38_taxitemprice¿¡¼­ °ú¼¼¹°Ç° °¡°İÀ» »« °ªÀ¸·Î ¼³Á¤ÇÑ´Ù.
		// ÇÕ°è´Â ¸é¼¼¹°Ç°°ú °ú¼¼¹°Ç°°¡°İÀÇ ÇÕÀÌ´Ù.
		kopo38_twostring("°áÁ¦´ë»ó±İ¾×", kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		// °áÁ¦ ´ë»ó±İ¾×Àº kopo38_twostringÀ» È°¿ëÇÑ Çü½ÄÀ¸·Î ¸é¼¼¹°Ç°°ú °ú¼¼¹°Ç° °¡°İÀÇ ÇÕÀ» Ãâ·ÂÇÑ´Ù.
		kopo38_drawline();
		kopo38_twostring("0012 KEB ÇÏ³ª", "541707**0484/35860658");
		kopo38_twostring("Ä«µå°áÁ¦(IC)", "ÀÏ½ÃºÒ /" + kopo38_df.format(kopo38_taxitemprice + kopo38_taxfreeprice));
		kopo38_drawline();
		// kopo38_twostring°ú kopo38_drawline¸¦ È°¿ëÇÏ¿© Ãâ·ÂÇÑ´Ù.
		kopo38_center("[½Å¼¼°èÆ÷ÀÎÆ® Àû¸³]");
		System.out.printf("%s\n", "Á¶*Çö °í°´´ÔÀÇ Æ÷ÀÎÆ® ÇöÈ²ÀÔ´Ï´Ù.");
		kopo38_threestring("±İÈ¸¹ß»ıÆ÷ÀÎÆ®", "9350**9995",
				kopo38_df.format((int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)));
		kopo38_twostring("´©°è(°¡¿ë)Æ÷ÀÎÆ® ",
				kopo38_df.format(1000000 + (int) ((kopo38_taxitemprice + kopo38_taxfreeprice) / 100)) + "("
						+ kopo38_df.format(1000000) + ")");
		// kopo38_threestringÀ» È°¿ëÇÏ¿© StringÀÌ 3°³ ÀÖÀ» ¶§ °£°İÀ» µ¿ÀÏÇÏ°Ô Á¤·ÄÇÏ¿© Ãâ·ÂÇÑ´Ù.
		// ¹ß»ı Æ÷ÀÎÆ®´Â ÃÑ °áÁ¦ ±İ¾×ÀÇ 1%·Î, ´©°è Æ÷ÀÎÆ®´Â ±âÁ¸ Æ÷ÀÎÆ®¿¡ ¹ß»ıÆ÷ÀÎÆ®¸¦ ÇÕÇÑ °ªÀ¸·Î Ãâ·ÂÇÑ´Ù.
		System.out.printf("*½Å¼¼°èÆ÷ÀÎÆ® À¯È¿±â°£Àº 2³âÀÔ´Ï´Ù.\n");
		kopo38_drawline();
		kopo38_center("±¸¸Å±İ¾×±âÁØ ¹«·áÁÖÂ÷½Ã°£ ÀÚµ¿ºÎ¿©");
		kopo38_twostring("Â÷·®¹øÈ£ :", "34Àú****");
		kopo38_twostring("ÀÔÂ÷½Ã°£ :", "2021-04-14 15:00:15");
		kopo38_drawline();
		kopo38_twostring("Ä³¼Å:084599 ¾çOO", "1150");
		kopo38_center("|||||||||||||||||||||||||||||||||");
		kopo38_center("|||||||||||||||||||||||||||||||||");
		kopo38_center(kopop38_sdf2.format(kopo38_calendar.getTime()) + "/00119861/00164980/31");
		// method¸¦ ÀÌ¿ëÇØ ³»¿ëÀ» Ãâ·ÂÇÑ´Ù.

	}

	public static void kopo38_twostring(String kopo38_a, String kopo38_b) {
		int kopo38_a_kornum = 0;
		int kopo38_b_kornum = 0;
		String kopo38_space = "";

		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < kopo38_b.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_b.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_b_kornum++;
			}
		}
		// kopo38_a_kornumÀº String kopo38_a¿¡ Æ÷ÇÔµÈ ÇÑ±ÛÀÇ ¼ö,
		// kopo38_b_kornumÀº String kopo38_b¿¡ Æ÷ÇÔµÈ ÇÑ±ÛÀÇ ¼öÀÌ´Ù.
		// °¢°¢ ¹İº¹¹®°ú ASCIIÄÚµå¸¦ È°¿ëÇÏ¿© ¹®ÀÚ¿­¿¡ Æ÷ÇÔµÈ ÇÑ±Û ¼ö¸¦ ¼¼¾îÁØ´Ù.
		int kopo38_spacenum = kopo38_receiptwidth
				- (kopo38_a.length() + kopo38_b.length() + kopo38_a_kornum + kopo38_b_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenumÀº ÃÑ ±æÀÌ 41¿¡¼­ kopo38_a¿Í kopo38_bÀÇ ±ÛÀÚ ¼ö, ±×¸®°í ÇÑ±Û·Î ÀÎÇØ ´Ã¾î³­ ±æÀÌ¸¸Å­À»
		// Á¦¿ÜÇØÁØ ¼ıÀÚÀÌ´Ù.
		// Áï, kopo38_a¿Í kopo38_b°¡ Â÷ÁöÇÏ°í ÀÖ´Â ¿µ¿ªÀ» Á¦¿ÜÇÑ ºó °ø°£ÀÇ ±æÀÌÀÌ´Ù.
		// kopo38_spacenum¸¸Å­ ºóÄ­À» kopo38_space·Î ¼³Á¤ÇÑ´Ù.
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, kopo38_b);
		// ÁÂÃø¿¡ kopo38_a, °¡¿îµ¥¿¡ µÑÀ» Á¦¿ÜÇÑ ¸¸Å­ÀÇ °ø°£, ¿ìÃø¿¡ kopo38_b¸¦ ¹èÄ¡ÇÏ¿© µÎ StringÀ» ¾çÂÊ Á¤·Ä ÇÑ´Ù.
	}

	public static void kopo38_threestring(String kopo38_a, String kopo38_b, String kopo38_c) {
		int kopo38_a_kornum = 0;
		int kopo38_b_kornum = 0;
		int kopo38_c_kornum = 0;
		String kopo38_space = "";

		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < kopo38_b.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_b.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_b_kornum++;
			}
		}
		for (int kopo38_i = 0; kopo38_i < kopo38_c.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_c.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_c_kornum++;
			}
		}
		// kopo38_a_kornumÀº String kopo38_a¿¡ Æ÷ÇÔµÈ ÇÑ±ÛÀÇ ¼ö,
		// kopo38_b_kornumÀº String kopo38_b¿¡ Æ÷ÇÔµÈ ÇÑ±ÛÀÇ ¼ö,.
		// kopo38_C_kornumÀº String kopo38_c¿¡ Æ÷ÇÔµÈ ÇÑ±ÛÀÇ ¼öÀÌ´Ù.
		// °¢°¢ ¹İº¹¹®°ú ASCIIÄÚµå¸¦ È°¿ëÇÏ¿© ¹®ÀÚ¿­¿¡ Æ÷ÇÔµÈ ÇÑ±Û ¼ö¸¦ ¼¼¾îÁØ´Ù.
		int kopo38_spacenum = kopo38_receiptwidth - (kopo38_a.length() + kopo38_b.length() + kopo38_c.length()
				+ kopo38_a_kornum + kopo38_b_kornum + kopo38_c_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum / 2; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenumÀº ÃÑ ±æÀÌ¿¡¼­ kopo38_a¿Í kopo38_b, kopo38_cÀÇ ±ÛÀÚ ¼ö,
		// ±×¸®°í ÇÑ±Û·Î ÀÎÇØ ´Ã¾î³­ ±æÀÌ¸¸Å­À» Á¦¿ÜÇØÁØ ¼ıÀÚÀÌ´Ù.
		// Áï, kopo38_a¿Í kopo38_b, kopo38_c°¡ Â÷ÁöÇÏ°í ÀÖ´Â ¿µ¿ªÀ» Á¦¿ÜÇÑ ºó °ø°£ÀÇ ±æÀÌÀÌ´Ù.
		// kopo38_spacenumÀÇ ¹İ¸¸Å­ÀÇ ºóÄ­À» kopo38_space·Î ¼³Á¤ÇÑ´Ù.
		System.out.printf("%s%s%s%s%s\n", kopo38_a, kopo38_space, kopo38_b, kopo38_space, kopo38_c);
	}

	public static void kopo38_center(String kopo38_a) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charnum = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charnum && 55204 > kopo38_charnum) {
				kopo38_a_kornum++;
			}
		}
		// kopo38_a_numÀ» ÀÌ¿ëÇØ String kopo38_a¿¡ Æ÷ÇÔµÈ ÇÑ±ÛÀ» ¼¼¾îÁØ´Ù.
		int kopo38_spacenum = (kopo38_receiptwidth - (kopo38_a.length() + kopo38_a_kornum)) / 2;
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenumÀº ÃÑ ±æÀÌ¿¡¼­ kopo38_aÀÇ ±ÛÀÚ¼ö¿¡ ÇÑ±Û·Î ÀÎÇØ ´Ã¾î³­ ±æÀÌ¸¸Å­À» Á¦¿ÜÇØÁØ ¼ıÀÚ¸¦ 2·Î ³ª´« ¸òÀÌ´Ù.
		// Áï, kopo38_a°¡ Â÷ÁöÇÏ°í ÀÖ´Â ¿µ¿ªÀ» Á¦¿ÜÇÑ ºó°ø°£À» ¹İÀ¸·Î ³ª´« ¸òÀÌ µÈ´Ù.
		// ÇØ´ç ±æÀÌ¸¸Å­ ºóÄ­À» kopo38_space·Î ¼³Á¤ÇÑ´Ù.
		System.out.printf("%s%s\n", kopo38_space, kopo38_a);
		// kopo38_space¸¸Å­ÀÇ ºó°ø°£À» Ãâ·ÂÇÏ°í ÀÌ¾î¼­ kopo38_a¸¦ Ãâ·ÂÇÏ¸é °¡¿îµ¥ Á¤·ÄÀÌ µÈ´Ù.
	}

	public static void kopo38_calc(String kopo38_a, String kopo38_b) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		// °è»êºÎºĞ Çü½ÄÀ» Ãâ·ÂÇÏ±âÀ§ÇØ kopo38_a¿¡ Æ÷ÇÔµÈ ÇÑ±ÛÀ» ¼¼¾îÁØ´Ù.

		int kopo38_spacenum = kopo38_receiptwidth - 19 - (kopo38_a.length() + kopo38_a_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenumÀº ÃÑ ±æÀÌ¿¡¼­ kopo38_b°¡ Â÷ÁöÇÒ ºÎºĞ 19¿Í
		// kopo38_a°¡ Â÷ÁöÇÏ°í ÀÖ´Â ºÎºĞ(kopo38_aÀÇ ±æÀÌ + ÇÑ±Û ±ÛÀÚ¼ö)À» Á¦¿ÜÇÑ °ø°£À¸·Î kopo38_aÀÇ ¾Õ¿¡ µé¾î°¥ ºó °ø°£ÀÇ
		// ±æÀÌÀÌ´Ù.

		System.out.printf("%s%s%19.19s\n", kopo38_space, kopo38_a, kopo38_b);
		// kopo38_space¸¸Å­ÀÇ ºó°ø°£À» Ãâ·ÂÇØÁÖ°í ÀÌ¾î¼­ kopo38_a¸¦ Ãâ·ÂÇÑ´Ù. ¸¶Áö¸· kopo38_b°¡ Â÷ÁöÇÏ´Â ±æÀÌ´Â 19·Î
		// ¼³Á¤ÇÑ´Ù.
	}

	public static void kopo38_drawline() {
		for (int i = 0; i < kopo38_receiptwidth; i++) {
			System.out.printf("-");
		}
		System.out.printf("\n");
		// ¿µ¼öÁõ ±æÀÌ¸¸Å­ ¼±À» ±ß´Â methodÀÌ´Ù.
	}
}