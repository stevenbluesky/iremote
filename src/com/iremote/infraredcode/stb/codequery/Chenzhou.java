package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Chenzhou extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Chenzhou";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ����(Chenzhou) 1
"00e047003382348110281f2920282028202820281f2864281e2820282028662865292028662a1f291f2965291f2865291f291f292028662820282028652820286629652965281f2865298994823b8086290000000000000000000000000000000000000000000000000000000000",
//������ ����(Chenzhou) 2
"00e04700338234811028202820282028202820281f296428202820282028652866281f2a65282028202965281f28642820281f28202865291f29202966291f296528662865291f2866288993823b8086280000000000000000000000000000000000000000000000000000000000",
//������ ����(Chenzhou) 3
"00e047003582328110282028202820281f281f291f296628202820282028642866281f2965291f291f2966291f2965291f291f291f2865291f29202a65291f286528642865291f2965298994823b8086290000000000000000000000000000000000000000000000000000000000",
};
}