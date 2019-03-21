package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class HewlettPackard extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "HewlettPackard";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� ����(Hewlett Packard) 1
"00a065003480a335201821192033202e53332119201820182118201920192018201821193e33201920193c342118211820183d192035201821001e1821182019203420183d1920911980aa34211820172034222d53352018201821182218201920182019201821193d3420182100",
//���� ����(Hewlett Packard) 2
"00a065003380a334201821182133202e54352018211920182119201820182118211820193c34201820183d182033201920193c182134201920001d1920182018203420193c1821911c80a834201820182034202d53352018201920182119201820192018221820193c3421182000",
//���� ����(Hewlett Packard) 3
"00a065003480a334201821182133202e53332119211820182119201821192018201821193e33201920193c34211920183c3420183c3421182118211820193c172034211820910080aa34201920182133202e53332018201820182118201920192019201821193c34201920193c00",
//���� ����(Hewlett Packard) 4
"00a065003380a335201920182034202e54342018201820182118201920182019201920183c34201920183c19203421183e3320183d3520182118201920193c18213520192090ff80aa34201821192035202e54342119201921182118201821192019201920183c35201820193c00",
//���� ����(Hewlett Packard) 5
"00a065003780a135201a2018213420345834201821182018211920192018201920182119201820182018211920193c3420183c3420193c3420192019201820183c18213520192090c380aa3420192019203320345934201822182019201821192019201920182118201820192000",
//���� ����(Hewlett Packard) 6
"00a065003780a23421192018203458352034201820182018201820182119201a201820193c35201820183d34201920193c3420183d3520192018201920193d19203420192090c280aa3320192019203357342035201821182019201a201920182119201820193d34201820193c00",
};
}