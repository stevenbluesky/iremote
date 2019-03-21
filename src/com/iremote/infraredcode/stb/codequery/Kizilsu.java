package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Kizilsu extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Kizilsu";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ��������(Kizilsu) 1
"00a060003382338110291f291f29652820282128202866281f29652965281f29662966281f281f28662866286529202965291f2820282028202820282028652920296528652965296528899c823c8086289a0e823c811028202820286528202820291f2865281f29652965282000",
//������ ��������(Kizilsu) 2
"00e047003382338111291f281f2966281f281f29202866281f28652965291f2966286628202820286528662865291f2965291f281f28202820282028202865291f2a6529652866296628899b823c8087280000000000000000000000000000000000000000000000000000000000",
//������ ��������(Kizilsu) 3
"00e0470033823481102820281f291f2966291f281f2966291f29652867286628202865296629652920281f2966281f286628202820281f281f2865291f29652820286728662865296629899b823b8087280000000000000000000000000000000000000000000000000000000000",
};
}