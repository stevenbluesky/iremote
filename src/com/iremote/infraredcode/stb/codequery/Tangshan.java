package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Tangshan extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Tangshan";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ��ɽ(Tangshan) 1
"00e04700338234810f28202820281f2866281f29202820282028202965286628202820286428652966286528662865291f291f29202866281f291f29202820286528662965291f2966298996823b8086280000000000000000000000000000000000000000000000000000000000",
//������ ��ɽ(Tangshan) 2
"00e047003382348110291f291f2920286528202820281f282028202865286628202820286628652866296529652966291f291f291f296529202820281f291f2965296529662a1f2965298995823c80862a0000000000000000000000000000000000000000000000000000000000",
//������ ��ɽ(Tangshan) 3
"0070230019411a40081432140f140f1432140f140f140f1433140f14321432140f143214321432140f140f143214101432140f140f140f140f1532140f1432140f143214331433143214444b411d4043140000000000000000000000000000000000000000000000000000000000",
//������ ��ɽ(Tangshan) 4
"00e047003382348110281f291f291f2920281f281f2820282028662865286528662866286528662965292028652820286529202820281f2820296628202866281f2866286628652866288996823b8087290000000000000000000000000000000000000000000000000000000000",
//������ ��ɽ(Tangshan) 5
"00e04700338234810f286529202820282028202820282028652820286628662865286628652965281f2920281f2865291f291f28202866281f296529652920286529652965281f29652a8995823b8087290000000000000000000000000000000000000000000000000000000000",
};
}