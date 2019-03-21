package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Zigong extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Zigong";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ �Թ�(Zigong) 1
"00e0470033823481112920282028202820281f28652a1f29652966291f29662866286628202865291f2a1f296529202866292028202820291f2966291f2965291f296529652867286628899c823b8087280000000000000000000000000000000000000000000000000000000000",
//������ �Թ�(Zigong) 2
"00e047003382358110291f291f2820282028202866281f28652a65291f296628662865282028662820281f28652a1f296529202820281f28202866281f2965291f296529652965286528899c823b8087280000000000000000000000000000000000000000000000000000000000",
//������ �Թ�(Zigong) 3
"00e047003582338110291f282028202820291f2865291f2a1f29652920286628662820281f291f2966291f2865281f29662865281f282028202965281f2a65291f291f29662866286528899b823b8086280000000000000000000000000000000000000000000000000000000000",
};
}