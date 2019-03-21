package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Anextensivenetwork extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Anextensivenetwork";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ��������(An extensive network) 1
"00e04700338234811029202820286529202820281f2821292028202866281f286529662965281f2965291f291f296529652965291f281f292028652965291f29202820286529652965288998823c8086280000000000000000000000000000000000000000000000000000000000",
//������ ��������(An extensive network) 2
"00e04700338234810f291f28202866292028202820281f281f292028662820286529652866282028652920282028662865286428202820282028652865282028202820286529652866288997823b8087280000000000000000000000000000000000000000000000000000000000",
//������ ��������(An extensive network) 3
"00e04700338232810f281f28212966282028202820281f291f29202a65291f28652965286628202865291f29202965286529652820291f291f286529652820291f291f28652a652965288996823c8086280000000000000000000000000000000000000000000000000000000000",
};
}