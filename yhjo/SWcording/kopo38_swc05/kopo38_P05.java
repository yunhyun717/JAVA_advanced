package kopo38_swc05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class kopo38_P05 {

	public static void main(String[] args) {
		String kopo38_itemname1 = "Ç»¾î¿¡¾î ºñ¸»Â÷´Ü¿ë¸¶½ºÅ©(ÃÖ°í±ŞÇü)";
		String kopo38_itemcode1 = "1031615";
		int kopo38_price1 = 3000;
		int kopo38_amount1 = 1;

		String kopo38_itemname2 = "½½¶óÀÌµå½Ä¸íÂû(°¡·ÎÇü)(100È£)";
		String kopo38_itemcode2 = "11008152";
		int kopo38_price2 = 1000;
		int kopo38_amount2 = 1;

		String kopo38_itemname3 = "¸ÅÁ÷ÈíÂø ÀÎÅ×¸®¾îÈÄÅ©(¾Ë·ç¹Ì´½Å¸ÀÔ)";
		String kopo38_itemcode3 = "1020800";
		int kopo38_price3 = 1000;
		int kopo38_amount3 = 1;
		// ¼¼°³ÀÇ »óÇ°¿¡ ´ëÇÑ Á¤º¸¸¦ ÀÔ·ÂÇÑ´Ù.(»óÇ°¸í, »óÇ°ÄÚµå, °¡°İ, °¹¼ö)

		DecimalFormat kopo38_df = new DecimalFormat("###,###,###,###");
		Calendar kopo38_calendar = Calendar.getInstance();
		SimpleDateFormat kopo38_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat kopo38_sdf2 = new SimpleDateFormat("(MM¿ùddÀÏ)");
		// »ç¿ëÇÒ method¸¦ ºÒ·¯¿Â´Ù. kopo38_df´Â ¼ıÀÚ ½°Ç¥, kopo38_calendar´Â ½Ã°£ºÒ·¯¿À±â
		// kopo38_sdf´Â ½Ã°£ Çü½Ä ÁöÁ¤

		kopo38_center("\"±¹¹Î°¡°Ô, ´ÙÀÌ¼Ò\"");
		System.out.printf("(ÁÖ)¾Æ¼º´ÙÀÌ¼Ò_ºĞ´ç¼­ÇöÁ¡\n");
		System.out.printf("ÀüÈ­:031-702-6016\n");
		System.out.printf("º»»ç:¼­¿ï °­³²±¸ ³²ºÎ¼øÈ¯·Î 2748 (µµ°îµ¿)\n");
		System.out.printf("´ëÇ¥:¹ÚÁ¤ºÎ,½ÅÈ£¼· 213-81-52063\n");
		System.out.printf("¸ÅÀå:°æ±âµµ ¼º³²½Ã ºĞ´ç±¸ ºĞ´ç·Î53¹ø±æ 11 (¼­Çöµ¿)\n");
		System.out.printf("=========================================\n");
		kopo38_center("¼ÒºñÀÚÁß½É°æ¿µ(CCM) ÀÎÁõ±â¾÷");
		kopo38_center("ISO 9001 Ç°Áú°æ¿µ½Ã½ºÅÛ ÀÎÁõ±â¾÷");
		System.out.printf("=========================================\n");
		kopo38_calendar.add(Calendar.DAY_OF_MONTH,14);
		kopo38_center("±³È¯/È¯ºÒ 14ÀÏ"+kopo38_sdf2.format(kopo38_calendar.getTime())+"ÀÌ³»,");
		kopo38_calendar.add(Calendar.DAY_OF_MONTH,-14);
		// kopo38_calendarÀ» ÀÌ¿ëÇØ 14ÀÏÀ» ´õÇØÁÖ°í kopo38_sdf2¿¡¼­ ¼³Á¤ÇÑ Çü½ÄÀ¸·Î Ãâ·ÂÇÑ´Ù.
		// ÀÌÈÄ 14ÀÏÀ» ´Ù½Ã »©ÁØ´Ù.
		kopo38_center("(ÀüÀÚ)¿µ¼öÁõ, °áÁ¦Ä«µå ÁöÂü ÈÄ ");
		kopo38_center("±¸ÀÔ¸ÅÀå¿¡¼­ °¡´É");
		kopo38_center("Æ÷Àå/°¡°İ ÅÃ ÈÑ¼Õ½Ã ±³È¯/È¯ºÒ ºÒ°¡");
		kopo38_center("Ã¼Å©Ä«µå Ãë¼Ò ½Ã ÃÖ´ë 7ÀÏ ¼Ò¿ä");
		System.out.printf("=========================================\n");
		kopo38_twostring("[POS 1058231]", kopo38_sdf.format(kopo38_calendar.getTime()));
		System.out.printf("=========================================\n");
		// kopo38_center¿Í kopo38_twostringÀ» È°¿ëÇØ ³»¿ëÀ» Ãâ·ÂÇÑ´Ù.
		// ½Ã°£Àº kopo38_calendar·Î ºÒ·¯¿Í kopo38_sdf¿¡¼­ ÁöÁ¤ÇÑ Çü½ÄÀ¸·Î Ãâ·ÂÇÑ´Ù.
		int kopo38_price = 0;
		// ÃÑ °¡°İ ÇÕ°èÀÎ Á¤¼ö kopo38_price¸¦ 0À¸·Î ¼³Á¤ÇÑ´Ù.
		int kopo38_charnum = 0;
		int kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname1.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname1.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
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
		// ±æÀÌ°¡ 1¶Ç´Â 2¾¿ Áõ°¡ÇÏ¹Ç·Î »óÇ°¸íÀÌ 16º¸´Ù ±æ´Ù¸é ÇÏ³ª¾¿ ¼¼¾î³ª°¬À» ¶§
		// ¼¼¾îÁø »óÇ°¸íÀÇ ±æÀÌ´Â 16¿¡ Á¤È®È÷ µµ´ŞÇÏ°Å³ª 17¿¡ µµ´ŞÇÏ°Ô µÈ´Ù.(¹«Á¶°Ç)
		// »óÇ°¸íÀÇ ±æÀÌ°¡ 16ÀÌ µÇ¾úÀ» ¶§ breakÇÏ¿© ÇØ´ç ºÎºĞ±îÁö Ãâ·ÂÇÏ°Å³ª
		// »óÇ°¸íÀÇ ±æÀÌ°¡ 17ÀÌ µÇ¾úÀ» ¶§ 16À» °Ç³Ê¶Ù°í µµ´ŞÇßÀ¸¹Ç·Î ¸¶Áö¸· ±ÛÀÚ´Â ÇÑ±ÛÀÓÀ» ¾Ë ¼ö ÀÖ´Ù.
		// µû¶ó¼­ ÇÑ±Û °¹¼ö¿¡¼­ ÇÏ³ª¸¦ »©°í(¸¶Áö¸·±ÛÀÚ´Â Ãâ·ÂÀÌ ºÒ°¡´ÉÇÏ¹Ç·Î) Ç¥½ÃÇÒ ±ÛÀÚ ¼ö¿¡¼­µµ ÇÏ³ª¸¦ »©ÁÖ°í breakÇÑ´Ù.

		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname1, kopo38_df.format(kopo38_price1), kopo38_df.format(kopo38_amount1),
				kopo38_df.format(kopo38_price1 * kopo38_amount1), kopo38_itemcode1);
		
		// »óÇ°¸í¿¡ Á¤ÇØÁø ¿µ¿ªÀÎ 16Ä­¿¡¼­ Ãâ·ÂÇÒ ³»¿ë¿¡¼­ ÇÑ±ÛÀÎ ±ÛÀÚ¸¦ »©ÁØ ¿µ¿ªÀ» »óÇ°¸í ¿µ¿ªÀ¸·Î ¼³Á¤ÇÏ°í,
		// ÇØ´ç ¿µ¿ª¸¸Å­ÀÇ ±æÀÌ¸¦ °¡Áöµµ·Ï ¼¾ ±ÛÀÚ¼ö¸¸Å­À» Ãâ·ÂÇÑ´Ù.
		// ´Ü°¡´Â 10Ä­ÀÇ ¿µ¿ª¿¡¼­ °£°İÀ» À§ÇØ 9Ä­±îÁö Ãâ·ÂÇÑ´Ù,
		// ¼ö·®Àº 4Ä­ÀÇ ¿µ¿ª¿¡¼­ °£°İÀ» À§ÇØ 3Ä­±îÁö Ãâ·ÂÇÑ´Ù.
		// ±İ¾×Àº 11Ä­ÀÇ ¿µ¿ª¿¡¼­ °£°İÀ» À§ÇØ 10Ä­±îÁö Ãâ·ÂÇÑ´Ù.
		kopo38_price += kopo38_price1 * kopo38_amount1;
		// ÃÑ°¡°İ¿¡ ÇöÀç »óÇ°ÀÇ °¡°İ°ú °¹¼ö¸¦ °öÇÏ¿© ´õÇÑ´Ù.
		kopo38_charnum = 0;
		kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname2.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname2.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
				kopo38_kornum--;
				kopo38_charnum--;
				break;
			}
		}

		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname2, kopo38_df.format(kopo38_price2), kopo38_df.format(kopo38_amount2),
				kopo38_df.format(kopo38_price2 * kopo38_amount2), kopo38_itemcode2);
		kopo38_price += kopo38_price2 * kopo38_amount2;
		kopo38_charnum = 0;
		kopo38_kornum = 0;
		for (int kopo38_i = 0; kopo38_i < kopo38_itemname3.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_itemname3.charAt(kopo38_i));
			kopo38_charnum = kopo38_i + 1;
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_kornum++;
			}
			if (kopo38_kornum + kopo38_charnum == 16) {
				break;
			} else if (kopo38_kornum + kopo38_charnum == 17) {
				kopo38_kornum--;
				kopo38_charnum--;
				break;
			}
		}
		System.out.printf("%-" + (16 - kopo38_kornum) + "." + kopo38_charnum + "s%10.9s%4.3s%11.10s\n[%s]\n",
				kopo38_itemname3, kopo38_df.format(kopo38_price3), kopo38_df.format(kopo38_amount3),
				kopo38_df.format(kopo38_price3 * kopo38_amount3), kopo38_itemcode3);
		kopo38_price += kopo38_price3 * kopo38_amount3;
		// ´Ù¸¥ »óÇ°µµ µ¿ÀÏÇÏ°Ô ÁøÇàÇÑ´Ù.
		
		kopo38_calc("°ú¼¼ÇÕ°è", kopo38_df.format(Math.round(kopo38_price / 1.1)));
		kopo38_calc("ºÎ°¡¼¼", kopo38_df.format(kopo38_price - Math.round(kopo38_price / 1.1)));
		// kopo38_method ÇÔ¼ö¸¦ ÀÌ¿ëÇØ °ú¼¼ÇÕ°è¿Í ºÎ°¡¼¼¸¦ Ãâ·ÂÇÑ´Ù.
		// °ú¼¼ÇÕ°è´Â ÃÑ°¡°İÀ» 1.1·Î ³ª´« °ªÀÇ ¹İ¿Ã¸²À» kopo38_df¿¡¼­ Á¤ÇÑ Çü½ÄÀ¸·Î Ãâ·ÂÇÏ¸ç
		// ºÎ°¡¼¼´Â ÃÑ °¡°İ¿¡¼­ °ú¼¼ÇÕ°è¸¦ Á¦¿ÜÇÑ °ªÀ» kopo38_df¿¡¼­ Á¤ÇÑ Çü½ÄÀ¸·Î Ãâ·ÂÇÑ´Ù.

		System.out.printf("-----------------------------------------\n");
		kopo38_twostring("ÆÇ¸ÅÇÕ°è", kopo38_df.format(kopo38_price));
		System.out.printf("=========================================\n");
		kopo38_twostring("½Å¿ëÄ«µå", kopo38_df.format(kopo38_price));
		System.out.printf("-----------------------------------------\n");
		kopo38_twostring("¿ì¸®Ä«µå", "538720**********");
		kopo38_twostring("½ÂÀÎ¹øÈ£ 77982843(0)", "½ÂÀÎ±İ¾× " + kopo38_df.format(kopo38_price));
		System.out.printf("=========================================\n");
		kopo38_center(kopo38_sdf.format(kopo38_calendar.getTime()) + " ºĞ´ç¼­ÇöÁ¡");
		System.out.printf("»óÇ° ¹× ±âÅ¸ ¹®ÀÇ : 1522-4400\n");
		System.out.printf("¸â¹ö½Ê ¹× ¼¥´ÙÀÌ¼Ò °ü·Ã ¹®ÀÇ : 1599-2211\n");
		kopo38_center("||||||||||||||||||||");
		kopo38_center("||||||||||||||||||||");
		kopo38_center("2112820610158231");
		System.out.printf("-----------------------------------------\n");
		kopo38_center("¢Â ´ÙÀÌ¼Ò ¸â¹ö½Ê ¾Û ¶Ç´Â È¨ÆäÀÌÁö¿¡ Á¢¼Ó");
		kopo38_center(" ÇÏ¼Å¼­ È¸¿ø°¡ÀÔ ÈÄ ´Ù¾çÇÑ ÇıÅÃÀ» ");
		kopo38_center("´©·Áº¸¼¼¿ä! ¢Â");
		// kopo38_center¿Í kopo38_twostringÀ» È°¿ëÇØ ³»¿ëÀ» Ãâ·ÂÇÑ´Ù.
		// ½Ã°£Àº kopo38_calendar·Î ºÒ·¯¿Í kopo38_sdf¿¡¼­ ÁöÁ¤ÇÑ Çü½ÄÀ¸·Î Ãâ·ÂÇÑ´Ù.
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
		int kopo38_spacenum = 41 - (kopo38_a.length() + kopo38_b.length() + kopo38_a_kornum + kopo38_b_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenumÀº ÃÑ ±æÀÌ 41¿¡¼­ kopo38_a¿Í kopo38_bÀÇ ±ÛÀÚ ¼ö, ±×¸®°í ÇÑ±Û·Î ÀÎÇØ ´Ã¾î³­ ±æÀÌ¸¸Å­À» Á¦¿ÜÇØÁØ ¼ıÀÚÀÌ´Ù.
		// Áï, kopo38_a¿Í kopo38_b°¡ Â÷ÁöÇÏ°í ÀÖ´Â ¿µ¿ªÀ» Á¦¿ÜÇÑ ºó °ø°£ÀÇ ±æÀÌÀÌ´Ù.
		// kopo38_spacenum¸¸Å­ ºóÄ­À» kopo38_space·Î ¼³Á¤ÇÑ´Ù.
		System.out.printf("%s%s%s\n", kopo38_a, kopo38_space, kopo38_b);
		// ÁÂÃø¿¡ kopo38_a, °¡¿îµ¥¿¡ µÑÀ» Á¦¿ÜÇÑ ¸¸Å­ÀÇ °ø°£, ¿ìÃø¿¡ kopo38_b¸¦ ¹èÄ¡ÇÏ¿© µÎ StringÀ» ¾çÂÊ Á¤·Ä ÇÑ´Ù.
	}

	public static void kopo38_center(String kopo38_a) {
		int kopo38_a_kornum = 0;
		String kopo38_space = "";
		for (int kopo38_i = 0; kopo38_i < kopo38_a.length(); kopo38_i++) {
			int kopo38_charint = (int) (kopo38_a.charAt(kopo38_i));
			if (44031 < kopo38_charint && 55204 > kopo38_charint) {
				kopo38_a_kornum++;
			}
		}
		// kopo38_a_numÀ» ÀÌ¿ëÇØ String kopo38_a¿¡ Æ÷ÇÔµÈ ÇÑ±ÛÀ» ¼¼¾îÁØ´Ù.
		int kopo38_spacenum = (41 - (kopo38_a.length() + kopo38_a_kornum)) / 2;
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenumÀº ÃÑ ±æÀÌ 41¿¡¼­ kopo38_aÀÇ ±ÛÀÚ¼ö¿¡ ÇÑ±Û·Î ÀÎÇØ ´Ã¾î³­ ±æÀÌ¸¸Å­À» Á¦¿ÜÇØÁØ ¼ıÀÚ¸¦ 2·Î ³ª´« ¸òÀÌ´Ù.
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

		int kopo38_spacenum = 41 - 19 - (kopo38_a.length() + kopo38_a_kornum);
		for (int kopo38_i = 0; kopo38_i < kopo38_spacenum; kopo38_i++) {
			kopo38_space = kopo38_space + " ";
		}
		// kopo38_spacenumÀº ÃÑ ±æÀÌ 41¿¡¼­ kopo38_b°¡ Â÷ÁöÇÒ ºÎºĞ 19¿Í
		// kopo38_a°¡ Â÷ÁöÇÏ°í ÀÖ´Â ºÎºĞ(kopo38_aÀÇ ±æÀÌ + ÇÑ±Û ±ÛÀÚ¼ö)À» Á¦¿ÜÇÑ °ø°£À¸·Î kopo38_aÀÇ ¾Õ¿¡ µé¾î°¥ ºó °ø°£ÀÇ ±æÀÌÀÌ´Ù. 

		System.out.printf("%s%s%19.19s\n", kopo38_space, kopo38_a, kopo38_b);
		// kopo38_space¸¸Å­ÀÇ ºó°ø°£À» Ãâ·ÂÇØÁÖ°í ÀÌ¾î¼­ kopo38_a¸¦ Ãâ·ÂÇÑ´Ù. ¸¶Áö¸· kopo38_b°¡ Â÷ÁöÇÏ´Â ±æÀÌ´Â 19·Î ¼³Á¤ÇÑ´Ù.
	}

}