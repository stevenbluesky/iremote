package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Huaihua extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Huaihua";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ����(Huaihua) 1
"00e04700358232810f281f291f292028202820281f2965291f291f292028662a65291f2965281f281f29652820286628202820281e2864281f28202866281f286628652965291f2865288993823c8086280000000000000000000000000000000000000000000000000000000000",
//������ ����(Huaihua) 2
"00e047003382348110282028202820282028202820286528202820282028652965281f29662a1f2a1f2965281f2864281f2920282028662820282028652820286529652965281f2864288995823a8086290000000000000000000000000000000000000000000000000000000000",
//������ ����(Huaihua) 3
"00e04700338230810f291f281f291f291f291f291f2866291f291f291f29652965281f2965282028202866282028652820282028202866281f28202866291f296529652865291f2966288994823b8085280000000000000000000000000000000000000000000000000000000000",
};
}