package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class OnWah extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "OnWah";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� ����(On Wah) 1
"00e02f00340b81341281d01281331181331281341281331381d11281d11281d0128133118133118c441281321181d11281331281331281331181331181d11281d01281d1118134128133130000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(On Wah) 2
"00e02f00340b81331281331181331281331281341281331181d11181d11281d2128133138134128c451281331381341281331181341181331281331181d11281d01181d0128133118134110000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(On Wah) 3
"00a052003380ca80d23a2f3b80973a303a80973b303a303b303b80973a313b80973a303a303a80973a313a80973b2f3a80983c80973a80963a303a80983a313a80973b80973a882380d680d33a313b80973b303a80973a303a303a303a80973a303a80973b2f3a313b80973a2f00",
//���� ����(On Wah) 4
"00a051003480cf80d23a303a80963a80973b2f3a80983b313a303b80973a303a80963a303a303a80973b303a303b80973b303a80983a80973a2f3a80973b303a80973a80983b882380d680d13a313a80983a80983a303b80973a303b303a80973a303a80973a2f3a313b80973a00",
//���� ����(On Wah) 5
"00a052003480cf80d23a303a303a2f3a303a303a313b2f3a313a303b2f3a80983b80973a80963a80973b80973a80983a80973a80973b80973b80973a80963a303a89e080d780d33c2f3a313a303b2f3a313b2f3a313b303b2f3a313b80973a80963a80973b80973a80983a809800",
//���� ����(On Wah) 6
"00a052003480cc80d33b303b80973a303b80973a2f3b303a2f3a80973a303a80983b303b303b80983a303a80963a303a80963a80983b80973a2f3b80973a2f3a80973b80983a882680d680d23a303b80973a303b80963a303a303a303a80963a313a80983a313b313a80973a3000",
//���� ����(On Wah) 7
"00a051003480ce80d13b313a80983b80973a303b80973a303a2f3b80973a2f3a80973b303a303b80973b303a313b80973b303a80973a80973a303a80973b303b80973a80983a882480d680d23a303a80973b80973b2f3a80983b313a303b80973a303a80963a303a303a80973b00",
//���� ����(On Wah) 8
"00a052003480ce80d23a80983b303b2f3a80983a313a80973a303a303a303a303a303a80973b303b80973a80983a303b80973a303a80973a80973a80973b80973b80973a303a882480d680d33a80973a2f3a303a80973b313b80973b303a313b303b2f3a313b80983a303b809600",
//���� ����(On Wah) 9
"00a052003480cd80d13a80973a2f3a303a80963a313a80983a2f3b303a303b313a303a80973a303a80973b80973b2f3a80983a303a80963a80973b80973a80973b80973a303a882480d680d23a80963a303a303a80973b303a80973a313a303b2f3b303a303b80983a303a809700",
//���� ����(On Wah) 10
"00a052003480cf80d23a2f3a303a303a2f3a303a303b303b2f3a313a303b80973a80973a80973a80963a80983b80973a80963a80973a80973a80983b80973a303b89e080d680d23a2f3a303a303a313a303a313b303b2f3a313a303b80973a80983a80973a80973b80973b809700",
//���� ����(On Wah) 11
"00a051003480cf80d13a303a80963a80983b313a80983a313a303a80973a303a80963a313a303a80983b303a303b80973a303a80973b80973b303b80973b303a80973b80973a882480d680d13a303a80963a80973a303a80973b313a303b80973a303a80973a303a303a80973b00",
//���� ����(On Wah) 12
"00a052003480ca80d23b303b80973a303a80983a303a303a303a80963a303b80973a313b313a80973a303a80973a2f3a80973a80973a80973a303a80973a303a80973a80973b882480d580d23b303a80973a313b80973a303b313a303a80963a303a80963a313a303a80983c3000",
//���� ����(On Wah) 13
"00a052003480cf80d23a80973a303a303b80973a303a80973b303a2f3a313a303a2f3a80983b2f3a80983a80973a303a80973b303a80973a80963a80983b80973a80973a2f3b882380d680d23a80973a313a303a80983a303b80973a2f3b303a303a2f3b303a80973a303a809700",
//���� ����(On Wah) 14
"005029001b406940641d181d171d171d171d171d171d171d171d181d171d404b1c404b1d404b1d404b1d404b1d404b1c404b1d404b1d404b1d404b1d404b1d171d457a406d40651d181d171d181d171d171d181d171d171d171d171d404c1c404a1c404b1c404b1d404b1d404b00",
//���� ����(On Wah) 15
"00a052003480ce80d23a303a80963a303a80973a2f3a303b2f3a80983b313a80973a2f3a313a80973a303a80973a2f3a80973b80983a80983a303a80973a2f3b80973a80983a882480d580d13a303a80973b303a80973a2f3a303a2f3a80983b303b80973a313b313a80973a2f00",
//���� ����(On Wah) 16
"00a052003480cf80d23a303b303a303b303b303b2f3b303a303b303b303a80973a80973a80973a80983b80973b80973a80973b80973b80973a80983a80983a303a89df80d680d23a303b303a303b303b303b2f3b303a303b2f3b303a80973a80973a80983a80983b80973b809700",
//���� ����(On Wah) 17
"00a051003480cf80d23a2f3b80973a80963a303a80973a303a303b80973a303b80973a303b303a80973a2f3a303a80973a2f3a80973b80973a313b80973a303a80963a80973a882480d680d23a313b80983a80973a2f3b80973a303a303a80973a303a80983b2f3a313b80973a00",
//���� ����(On Wah) 18
"00a051003480cf80d23a2f3b80973a80973b303a80973a303b303b80973a2f3b80973a303a303a80963a313a303a80973b303b80973a80963a303a80963a313a80983a80983a882580d680d23a303a80973b80973a303a80973b313a313b80973b303a80973a303a303a80973b00",
//���� ����(On Wah) 19
"00a052003480ca80d23a80973a303a303b809939303a80973a303a3039303a303a2f3a80983b303a80983a80973a303a80963a303a80973a80983b80983a80973a80963a303a882380d680d23a80973a303a2f3b80973a303a80973b2f3a313a313a303a303a80983a303b809700",
};
}