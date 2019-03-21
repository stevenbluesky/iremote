package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class PuTian extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "PuTian";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ����(Pu Tian) 1
"00e04700338234811129662820291f29202820291f291f281f281f29652a65291f2865296528662866281f291f296628662820281f29652820286628652820282028662865281f2865288996823b8086290000000000000000000000000000000000000000000000000000000000",
//������ ����(Pu Tian) 2
"00e047003382348110286528202820282028202820281f291f291f29662965281f29652866286628642820282028662865282028202865292028652866281f291f2965296529202865298995823b8086280000000000000000000000000000000000000000000000000000000000",
//������ ����(Pu Tian) 3
"00e04700358232810f281f28202820286727202820281f281f296626662867272028672765286529652920286528202867281f29202820281f2866271f286628202865286827662965298996823b8086290000000000000000000000000000000000000000000000000000000000",
//������ ����(Pu Tian) 4
"00e047003382348110291f291f291f291f29202820281f28652965296629652a65296528652966282028202865281f292028662820282028642865282028662865282028652965291f298997823b80862a0000000000000000000000000000000000000000000000000000000000",
//������ ����(Pu Tian) 5
"00e04700338233810f28202820281f291f29202920291f29652865296628662865286428662865281f282028662920282028652820282128662865281f28662865291f296529662a1f298995823b8086290000000000000000000000000000000000000000000000000000000000",
};
}