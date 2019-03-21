package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Brandt extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Brandt";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� ������(Brandt) 1
"00e00b003438522a272a9c413f52292829000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ������(Brandt) 2
"00e00d0034220017522928299c4340522a282a00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ������(Brandt) 3
"00e02d003c821c82221282211182211282211381551282211382221282211281551282211389941282041282221282211382211282201281551282211282211182211281541182211200000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ������(Brandt) 4
"00e02f003737313d3278333d323d323e313e6877323e313d323e313e95c73c333d3277323e323d313e323d6876313d333d323e323d000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
};
}