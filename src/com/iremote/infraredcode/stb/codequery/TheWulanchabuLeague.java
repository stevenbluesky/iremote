package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class TheWulanchabuLeague extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "TheWulanchabuLeague";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ �����첼��(The Wulanchabu League) 1
"00e047003382358110281f2920281f2820282028202820281f28652965296528662966286629662866281f2965291f29652820281f282028202866291f2966291f286528652965286728899b823b8088280000000000000000000000000000000000000000000000000000000000",
//������ �����첼��(The Wulanchabu League) 2
"00e047003382348110281f2820282028202820291f281f281f286529652866286628662965286628652a1f2965291f2866282028202820281f2965291f29652920286529652866286628899c823b8087280000000000000000000000000000000000000000000000000000000000",
};
}