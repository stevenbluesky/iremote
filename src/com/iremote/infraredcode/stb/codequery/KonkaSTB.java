package com.iremote.infraredcode.stb.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class KonkaSTB extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "KonkaSTB";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//������ ���ѻ�����(Konka STB) 1
"00a065003480d768211620162048211522482115214821172049204921492016204920152048201520482049201620162049201520482115211621172017204a204920162149201521152115201620162049201520482116214a1f48204a1f16204b1f1520482116218c3580de00",
//������ ���ѻ�����(Konka STB) 2
"00a065003480d767201520152049201621492016204920152048204820492017204a2016204822152248204920172017204a20162048211521152015201520482049201520492016201620162016201720492015204a1f15214a204a1f4b1f152148201520482215228c3480de00",
//������ ���ѻ�����(Konka STB) 3
"00e047003382348110291f291f291f291f281f281f281f291f2964286529652965286428682665296627202820286529662865291f291f2920286629652820281f281f296727662665298990823a8086280000000000000000000000000000000000000000000000000000000000",
//������ ���ѻ�����(Konka STB) 4
"00a065003480d9692116204e2016214d204d2016204d2116204d214e204d201621162017214d2116214e204d20162016204d2016204d2016201720162116214e204d2016204d20162016211621162017204d2016214d2116204d204c214e2016204c2016204c2016208bf680e600",
//������ ���ѻ�����(Konka STB) 5
"00e04700338233811028202820281f292028202865291f286529642820286529652865291f2965281f281f29652820286628202820281f28202865291f2964281f2865296528662865288990823a8086280000000000000000000000000000000000000000000000000000000000",
//������ ���ѻ�����(Konka STB) 6
"00e04700338231810f291f281f291f2965291f281f28642820286628652865291f296529652865282028202866292029662820281f291f291f2965282028652820286629662866286529898f823a8086290000000000000000000000000000000000000000000000000000000000",
//������ ���ѻ�����(Konka STB) 7
"00e04700338233811028642820281f291f291f2920281f281f28202820281f28652965286528652866296528202820282028202820281f281f28202866296529652866286528652964288992823b8086290000000000000000000000000000000000000000000000000000000000",
};
}