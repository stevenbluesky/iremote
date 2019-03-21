package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Jiangxicable extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Jiangxicable";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ��������(Jiangxi cable) 1
"00e047003382348110281f281f29202820291f291f2865281f291f29202865286628202865291f2a1f29652966281f282028202820281f291f29202a1f29652966296628652866286628899b823b8087280000000000000000000000000000000000000000000000000000000000",
//������ ��������(Jiangxi cable) 2
"00e047003382348110281f291f291f291f2920281f286728202820281f28652a65291f2966281f2820286628652820291f291f281f2920281f291f292028652866286628652a65296529899c823c8086280000000000000000000000000000000000000000000000000000000000",
};
}