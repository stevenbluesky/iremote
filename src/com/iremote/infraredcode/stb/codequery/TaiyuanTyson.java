package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class TaiyuanTyson extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "TaiyuanTyson";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ̫ԭ̩ɭ(Taiyuan Tyson) 1
"00e0470033823581112966292028202820281f291f2920291f291f291f2866296628652866286628652966291f281f2820281f282028202820281f28652a652965296529652866286628899b823b8087280000000000000000000000000000000000000000000000000000000000",
//������ ̫ԭ̩ɭ(Taiyuan Tyson) 2
"00e0470035823381112866281f281f291f2a1f291f291f291f2820282028662865296529652865296529652820281f28202820281f281f281f2a1f296529652867286628652866286529899b823b80862a0000000000000000000000000000000000000000000000000000000000",
};
}