package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Xuancheng extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Xuancheng";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ����(Xuancheng) 1
"00e0370033823481102920281f291f2963291f291f2963281f281f291f292029202864282028642820286328642863291f2963291f2963281f288bc0823c808629000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//������ ����(Xuancheng) 2
"00e037003582338110281f29202a1f29632820281f2863281e281f281f282028202864282028632820286428632a63291f2963281f2863281e288bbf823b808729000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//������ ����(Xuancheng) 3
"00e03700358232810f281f291f2964292029632a1f2a63291f291f281f281f281f296329202864282028642863286428202863291f2963291f298bc0823b808628000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//������ ����(Xuancheng) 4
"00e047003382348111281f281f2a65291f291f29202820282028202866281f286528662866281f286628202820286529652866281f281f281f2a652965281f281f291f2965296528652a8997823c8086280000000000000000000000000000000000000000000000000000000000",
};
}