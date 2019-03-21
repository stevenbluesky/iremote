package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Goldstar1 extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Goldstar1";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� ���˴�(Goldstar) 1
"00e02f00376a313d333d313e323e313d333e323d323e673e3176323e947177333d323e323d323e323d313e323d323d683e3276333d000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ���˴�(Goldstar) 2
"00e02b00376f6676323e333d323d323e313d333e673d3276313e9472766676323e323d323d323e313e323e673d3276313e00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ���˴�(Goldstar) 3
"00e04700338233810f291f286628652965291f286529652820286628202820281f2866281f292028652965292028652965296528652866281f291f2965291f29202820281f281f2965298994823c8086280000000000000000000000000000000000000000000000000000000000",
};
}