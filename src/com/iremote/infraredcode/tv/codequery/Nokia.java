package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Nokia extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Nokia";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� ŵ����(Nokia) 1
"00e047003382338110281f281f291f286528662866281f281f286628652965291f281f281f28652966282028202865286628652920291f291f29652864282028202820286628652865298993823b8087290000000000000000000000000000000000000000000000000000000000",
//���� ŵ����(Nokia) 2
"00e047003382348110282028202820286628652866281f291f29652965286428202820282028652965281f281f2965296628662820281f281f28662865291f291f291f286528642866298993823b80872a0000000000000000000000000000000000000000000000000000000000",
};
}