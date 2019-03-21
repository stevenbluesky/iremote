package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Hantarex extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Hantarex";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� Hantarex(Hantarex) 1
"00e04700338232810f29662a65282029652820281e2864281f2820282028652820286628652820296528202820281f2864281f281f291f292028652865296528202866286529652865298993823a8086280000000000000000000000000000000000000000000000000000000000",
//���� Hantarex(Hantarex) 2
"00e04700358232811028652965291f2865291f291f29662820282028202865282028662965291f2965281f281e281f2965281f29202820282028652966296528202866286529662865298993823b8085280000000000000000000000000000000000000000000000000000000000",
};
}