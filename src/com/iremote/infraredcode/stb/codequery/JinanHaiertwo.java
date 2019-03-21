package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class JinanHaiertwo extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "JinanHaiertwo";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ���Ϻ�����(Jinan Haier two) 1
"00e0470035823381102820281f28202920291f291f281f2920286529652865286628662965296528652a1f291f2965286628662820281f291f2a6529652920281f281f29662866286628899b823b8087280000000000000000000000000000000000000000000000000000000000",
//������ ���Ϻ�����(Jinan Haier two) 2
"00e047003482348111271f291f2a1f291f291f2820282028202866286529662965286529652965286728202820286529662965281f281f291f2965286528202820281f28652965296529899c823c8086290000000000000000000000000000000000000000000000000000000000",
};
}