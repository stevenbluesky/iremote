package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class HappinessExpress extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "HappinessExpress";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ �Ҹ��쳵(Happiness Express) 1
"00e047003382338110291f291f29202820282028202820282028652966296529662966286528672866281f291f2966291f2865281f291f29202865286628202865291f2a652965286629899b823b8087290000000000000000000000000000000000000000000000000000000000",
//������ �Ҹ��쳵(Happiness Express) 2
"00e047003382348110281f281f29202820291f291f281f282028652965286728662865296529652865291f291f2965282028662820281f281f2965296529202866292028652865286628899b823b8087280000000000000000000000000000000000000000000000000000000000",
};
}