package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class Condor extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "Condor";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� ��ӥ(Condor) 1
"00e04b0033821381022861271d2762261d2761271d271d271d278101265a271e265a261d265a271e271e271e268605821b81012861271d2761271d2762261d271d271d278101285a271d275a261d265a261d271e271e270000000000000000000000000000000000000000000000",
//���� ��ӥ(Condor) 2
"00e04b0033821281012761281d2761271d2662271d271d281d278101275a271e275a271d275a271d271e261d268608821881002661271d2761271d2762261d261d271d278101285a271e2659261d285a281d271e261d260000000000000000000000000000000000000000000000",
};
}