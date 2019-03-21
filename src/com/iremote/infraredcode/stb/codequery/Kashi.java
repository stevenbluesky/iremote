package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Kashi extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Kashi";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ��ʲ(Kashi) 1
"00e0470033823481112820291f28652a1f291f291f2965282028662866291f29662965281f291f29652965286728202866291f291f2a1f291f291f292028662920286628652866286529899b823b80862a0000000000000000000000000000000000000000000000000000000000",
//������ ��ʲ(Kashi) 2
"00e047003382328110281f29202a65291f292028202866282028662966282028652965291f291f296628662865281f2966291f281f281f291f291f291f2965281f286628662865296629899b823d8086280000000000000000000000000000000000000000000000000000000000",
//������ ��ʲ(Kashi) 3
"00e047003382348110291f282028202866281f281f2a65291f29652867286628202965286628652a1f291f29652820286728202820281f281f2965291f29652820286628652866286628899b823b8087280000000000000000000000000000000000000000000000000000000000",
};
}