package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Tongliao extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Tongliao";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ͨ��(Tongliao) 1
"00e0470033823481122820282028202820281f281f291f291f29652866286628652866286628652965291f2965281f28662820281f281f29202965281f2865291f296528662866286629899b823b8087290000000000000000000000000000000000000000000000000000000000",
//������ ͨ��(Tongliao) 2
"00e04700358233811128202820281f281f291f2a1f291f2920286528662866286529662965296529652920286628202866281f291f2a1f291f296529202865292028652866286628652a899b823b80862a0000000000000000000000000000000000000000000000000000000000",
};
}