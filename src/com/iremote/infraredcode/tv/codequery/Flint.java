package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Flint extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Flint";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� ������(Flint) 1
"00e009000c816581000f86000e93000f8aa40f00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ������(Flint) 2
"00e02d0034814981d01281d11181331181d01381331281d0128133138134128133128133128c421281331181d01181d01281331181d11281331381d11281341281331281331381341200000000000000000000000000000000000000000000000000000000000000000000000000",
};
}