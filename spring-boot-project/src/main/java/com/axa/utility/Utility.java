package com.axa.utility;

import java.util.Arrays;
import java.util.List;

import com.axa.dto.Index;

public class Utility {

	public static List<Index> mockIndices() {
		return Arrays.asList(
				new Index("NIFTY 50 Pre Open", "9,168.85", "-70.35", "-0.76", "NIFTY_50_Pre_Open_open.png"),
				new Index("NIFTY 50", "9,096.50", "-142.70", "-1.54", "NIFTY_50_open.png"),
				new Index("NIFTY NEXT 50", "23,014.85", "-186.60", "-0.80", "NIFTY_NEXT_50_open.png"),
				new Index("NIFTY100 LIQ 15", "2,261.70", "-5.00", "-0.22", "NIFTY100_LIQ_15_open.png"),
				new Index("NIFTY BANK", "18,394.15", "-556.35", "-2.94", "NIFTY_BANK_open.png"),
				new Index("INDIA VIX", "38.0400", "0.00", "0.00", "INDIA_VIX_open.png"),
				new Index("NIFTY 100", "9,276.05", "-135.65", "-1.44", "NIFTY_100_open.png"),
				new Index("NIFTY 500", "7,449.80", "-106.60", "-1.41", "NIFTY_500_open.png"),
				new Index("NIFTY MIDCAP 100", "12,686.20", "-177.20", "-1.38", "NIFTY_MIDCAP_100_open.png"),
				new Index("NIFTY MIDCAP 50", "3,518.40", "-48.75", "-1.37", "NIFTY_MIDCAP_50_open.png"),
				new Index("NIFTY INFRA", "2,693.10", "-33.45", "-1.23", "NIFTY_INFRA_open.png"),
				new Index("NIFTY REALTY", "170.15", "-0.95", "-0.56", "NIFTY_REALTY_open.png"),
				new Index("NIFTY ENERGY", "12,710.90", "-209.25", "-1.62", "NIFTY_ENERGY_open.png"),
				new Index("NIFTY FMCG", "26,558.75", "-109.05", "-0.41", "NIFTY_FMCG_open.png"),
				new Index("NIFTY MNC", "11,935.70", "-14.65", "-0.12", "NIFTY_MNC_open.png"),
				new Index("NIFTY PHARMA", "9,208.10", "-99.20", "-1.07", "NIFTY_PHARMA_open.png"),
				new Index("NIFTY PSE", "2,226.00", "-9.55", "-0.43", "NIFTY_PSE_open.png"),
				new Index("NIFTY PSU BANK", "1,138.80", "-25.75", "-2.21", "NIFTY_PSU_BANK_open.png"),
				new Index("NIFTY SERV SECTOR", "12,133.25", "-171.30", "-1.39", "NIFTY_SERV_SECTOR_open.png"),
				new Index("NIFTY IT", "13,669.85", "76.30", "0.56", "NIFTY_IT_open.png"),
				new Index("NIFTY SMLCAP 100", "3,852.75", "-52.10", "-1.33", "NIFTY_SMLCAP_100_open.png"),
				new Index("NIFTY 200", "4,720.30", "-68.70", "-1.43", "NIFTY_200_open.png"),
				new Index("NIFTY AUTO", "5,617.15", "-62.55", "-1.10", "NIFTY_AUTO_open.png"),
				new Index("NIFTY MEDIA", "1,131.40", "-3.55", "-0.31", "NIFTY_MEDIA_open.png"),
				new Index("NIFTY METAL", "1,683.80", "-14.10", "-0.83", "NIFTY_METAL_open.png"),
				new Index("NIFTY DIV OPPS 50", "2,002.15", "-0.30", "-0.01", "NIFTY_DIV_OPPS_50_open.png"),
				new Index("NIFTY COMMODITIES", "2,505.65", "-22.40", "-0.89", "NIFTY_COMMODITIES_open.png"),
				new Index("NIFTY CONSUMPTION", "4,247.55", "-15.65", "-0.37", "NIFTY_CONSUMPTION_open.png"),
				new Index("NIFTY CPSE", "1,310.25", "-3.25", "-0.25", "NIFTY_CPSE_open.png"),
				new Index("NIFTY FIN SERVICE", "9,144.35", "-241.70", "-2.58", "NIFTY_FIN_SERVICE_open.png"),
				new Index("NIFTY GROWSECT 15", "4,454.90", "-86.40", "-1.90", "NIFTY_GROWSECT_15_open.png"),
				new Index("NIFTY50 VALUE 20", "4,497.50", "2.60", "0.06", "NIFTY50_VALUE_20_open.png"),
				new Index("NIFTY50 TR 2X LEV", "3,503.60", "-112.00", "-3.10", "NIFTY50_TR_2X_LEV_open.png"),
				new Index("NIFTY50 PR 2X LEV", "2,675.50", "-85.50", "-3.10", "NIFTY50_PR_2X_LEV_open.png"),
				new Index("NIFTY50 TR 1X INV", "422.60", "6.45", "1.55", "NIFTY50_TR_1X_INV_open.png"),
				new Index("NIFTY50 PR 1X INV", "483.30", "7.40", "1.55", "NIFTY50_PR_1X_INV_open.png"),
				new Index("NIFTY ALPHA 50", "11,358.85", "-58.85", "-0.52", "NIFTY_ALPHA_50_open.png"),
				new Index("NIFTY50 EQL WGT", "9,335.20", "-57.65", "-0.61", "NIFTY50_EQL_WGT_open.png"),
				new Index("NIFTY100 EQL WGT", "10,282.80", "-87.30", "-0.84", "NIFTY100_EQL_WGT_open.png"),
				new Index("NIFTY100 LOWVOL30", "7,501.10", "-64.30", "-0.85", "NIFTY100_LOWVOL30_open.png"),
				new Index("NIFTY MID LIQ 15", "3,053.55", "-38.95", "-1.26", "NIFTY_MID_LIQ_15_open.png"),
				new Index("NIFTY PVT BANK", "10,067.70", "-311.55", "-3.00", "NIFTY_PVT_BANK_open.png"),
				new Index("NIFTY100 QUALTY30", "2,187.90", "-11.85", "-0.54", "NIFTY100_QUALTY30_open.png"),
				new Index("NIFTY GS 8 13YR", "2,143.37", "0.66", "0.03", "NIFTY_GS_8_13YR_open.png"),
				new Index("NIFTY GS 10YR", "1,964.11", "1.10", "0.05", "NIFTY_GS_10YR_open.png"),
				new Index("NIFTY GS 10YR CLN", "970.26", "0.38", "0.03", "NIFTY_GS_10YR_CLN_open.png"),
				new Index("NIFTY GS 4 8YR", "2,286.24", "-2.44", "-0.10", "NIFTY_GS_4_8YR_open.png"),
				new Index("NIFTY GS 11 15YR", "2,308.74", "-2.00", "-0.08", "NIFTY_GS_11_15YR_open.png"),
				new Index("NIFTY GS 15YRPLUS", "2,502.38", "9.54", "0.38", "NIFTY_GS_15YRPLUS_open.png"),
				new Index("NIFTY GS COMPSITE", "2,186.30", "-1.12", "-0.05", "NIFTY_GS_COMPSITE_open.png"),
				new Index("NIFTY MIDCAP 150", "4,860.25", "-61.60", "-1.25", "NIFTY_MIDCAP_150_open.png"),
				new Index("NIFTY SMLCAP 50", "1,829.30", "-19.10", "-1.03", "NIFTY_SMLCAP_50_open.png"),
				new Index("NIFTY SMLCAP 250", "3,394.70", "-45.60", "-1.33", "NIFTY_SMLCAP_250_open.png"),
				new Index("NIFTY MIDSML 400", "4,331.80", "-55.85", "-1.27", "NIFTY_MIDSML_400_open.png"),
				new Index("NIFTY200 QUALTY30", "8,425.15", "-41.00", "-0.48", "NIFTY200_QUALTY30_open.png"));
	}

}
