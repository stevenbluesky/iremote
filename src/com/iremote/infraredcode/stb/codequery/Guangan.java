package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Guangan extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Guangan";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ �㰲(Guangan) 1
"00e047003382358110291f291f2820282028202866281f29652965281f296629652965282028662820281f28652a1f296529202820281f29202865281f2966291f286529652965286628899b823c8087280000000000000000000000000000000000000000000000000000000000",
//������ �㰲(Guangan) 2
"00e0470033823481112920281f281f291f2a1f29652920286628662820286528662865281f2965291f281f286628202866281f291f2920291f296528202866282028652866286628652a899b823b80862a0000000000000000000000000000000000000000000000000000000000",
//������ �㰲(Guangan) 3
"00e047003382348110281f281f29202820291f2965291f281f2966281f28672866281f281f291f2a65291f2966281f2866286528202820291f2965281f28652920281f28672866286629899b823b8086290000000000000000000000000000000000000000000000000000000000",
};
}