package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Luzhou extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Luzhou";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ����(Luzhou) 1
"00e04700338233811028202820281f291f29202965281f29662966281f286628662866291f2966291f291f2966291f2966281f2820292028202965281f2965291f296528672866286629899c823b8086290000000000000000000000000000000000000000000000000000000000",
//������ ����(Luzhou) 2
"00e047003382348111292028202820282028202865291f2a652965281f28662865286728202866281f291f2a65291f2966281f292028202820286528202965281f296529652865286728899b823b8087280000000000000000000000000000000000000000000000000000000000",
//������ ����(Luzhou) 3
"00e04700358232811028202920291f291f29202966291f29202865282028662865281f2a1f291f296528202867282028662965291f291f281f2966291f2965281f28202866286528652a899b823b80862a0000000000000000000000000000000000000000000000000000000000",
};
}