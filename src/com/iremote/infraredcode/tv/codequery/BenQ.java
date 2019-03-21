package com.iremote.infraredcode.tv.codequery;

import com.iremote.infraredcode.tv.codequery.CodeQueryBase;

public class BenQ extends CodeQueryBase {

		@Override
		public String getProductor() {
			return "BenQ";
		}
		@Override
		public String[] getQueryCodeLiberay() {
			return querycode;
		}
		private static String[] querycode = new String[]
{
//���� ����(BenQ) 1
"00e0470035823281102820286628652920281f291f291f29652965286428202865291f29652966281f296528662866281f281f28202820281f281f29202820286529662a6528662866288993823a8086280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 2
"00e047003582328110281f28652966282028202820281f286428652965291f2966291f2a652965281f286428642865291f2920281f281f2820281f2820282028662865286629652965288994823b8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 3
"00e047003382348110281f291f291f2920291f29652864281f296628662865296629652a1f291f2965281f281f291f292028202820291f281f28652965286529652965286529662866288994823b8085280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 4
"00e047003382338110291f281f281f291f29202820296528202820281f291f29202820282028662820281f2866281f2965291f291f291f281f28652920296628202866286528662965298993823b8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 5
"00e04700338234810f2a1f281f281f291f291f291f2965281f286529652866286628652866291f2965291f2865291f291f29662820281f281f2865292028662866281f286628652965298994823b8087290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 6
"00e04700338233810f291f29652965281f291f291f292029652866286528202867281f29652965281f296528662866281f281f28202820282028202820282028652866286529652865288994823b8086280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 7
"00e04700338232811028202820291f281f281f286529662820286628652866296529652820281f286529202820282028202820281f291f291f29662866286528662965296628662865288995823a8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 8
"00e047003382328110281f292028202820291f28652865282028652965296528642866281f291f296529652865291f292028202820282028202820281f296428662965296528652965288994823a8085280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 9
"00e047003382328110291f291f291f291f2965281f281f291f2a65291f28652864282028662820282028652866296529652865281f291f2920282028202820281f281f286529652965298994823b8086280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 10
"00e0470033823481102820282028202820281f281e282028202866282028652966296528662820286528652920281f291f291f291f291f291f281f2966296528662865286529662966288994823b8086280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 11
"00e04700338232810f281f291f28202820281f281f291f291f296528652864286629652965286628652966291f29202820291f291f281f281f281f2965286529652965286529642865298993823a8085280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 12
"00e04700358232810f291f291f281f281f281f291f29652820286628652966286529662865291f2965292029652920291f2965281f281f281e2865281f29652965281f286529642865298993823b80872a0000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 13
"00e04700338232810f2a1f281f2865291f292028202820282028662865282028652965296528652866281f291f291f2965291f281f281f281f296528662865291f2966286529662865298993823b8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 14
"00e04700338233810f291f291f291f291f282028662965291f29652865296628652965292028202866291f291f291f291f292028202820281f29652965286529652866286628652966298994823b8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 15
"00e04700338233810f291f291f291f29652865291f29202820286628652866281f281f296529652865281f282028202865291f2920281f282028662865296528202864286528662965298993823a8087280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 16
"00e04700338232810f291f291f291f29652865291f2a1f291f296528642864281f2820286529652966291f2a1f291f2965281f281f291f291f29662866286528202866296529652865288994823b8086280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 17
"00e04100301e5a2719265b2619265b26192719271a261a26192685fa275a2619265b261a275a261a271a2619261a27192785fa265a2719265a2719265b2619261a27192719261a260000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 18
"00e04b003382118101271d2761271d271d271d261e271d281d288101271d275a275b275a261d271d271d271e268606821a8101261e2661261d271e271d271e261d261d278101281d275a275a2659261d261d281d271e260000000000000000000000000000000000000000000000",
//���� ����(BenQ) 19
"00e02f00366f323e313d333d333d323e323d333e323d673d3278333d947276313d333d333d323d313d333e323d323c673e3177323e000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 20
"00e0470033823481102820282028662820281f281f2820282028662865291f286628652a652866286528202820281f2965291f291f29202820286629652965281f2865296528652965288994823b8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 21
"00e047003382338110281f281f291f2a1f291f291f2965281f2965286529652965286529652820286628202865282028202865291f291f291f2966281f2a6528662820286528662865298993823a8087280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 22
"00a0650034116e182b182b182c182c182d186d196d192b186d172b172b192b196d192b188a6a186b182d182f192e182f186c182e182e196c182e186c186c196b182e186c188995196e182c182c192c192c192b186d186e182c186e182c192d192d186e182c188a69186b182d1800",
//���� ����(BenQ) 23
"00e0470033823281102920281f291f291f292028202965282028642866286529652865286529202866282028652820281f2865291f292028202865282028652965291f286528652966288994823a8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 24
"00e047003382328110282028202820281f281f281f2965282028662865286528662a6528662820286528202866291f291f2965281f2920281f2965291f29652865291f296628652965288994823a8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 25
"00e03d0042228095251b261a261b271a261b2538261b251b261a2683672a8095261a261a261a2537261a4838261b271a269a5b2a8097241a271b261a2538271a4738271a261a26000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 26
"00e04700338234810f291f291f291f291f291f291f2865281f296428652965296528642866281f2865291f2965281f281f29652820282028202866281f286628652920286628662865298993823b80872a0000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 27
"00e04700338232810f281f291f2866281f2a1f2a1f291f291f296528642820286529652965286528642820281f291f2965291f29202920282028652966286628202865286629652866288993823a8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 28
"00e04700338234810f291f291f281f28652965282028202820286528652866291f291f2965286529642820282028202866281f282028202820286529652965281f2965286628652965288993823b8085280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 29
"00e047003382338110281f2820292028652965291f291f281f286529662865291f291f2965286529652820282028202865282028202820281f296529652866281f286628652a652866288993823a8085280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 30
"00e04100341e62251c2561251d2561261d251d251e251d261d2583952561251d2561261d2561261d261d251e251d251d2583942660251d2462261d2660251d261d251d261d251d250000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 31
"00e04b003382138101271d2761261e271d271d281d271d261d268102261d265b275a275a271d271d271d271e278605821b8101271e2661261d261d271d271d271d271e268100261d275a265a275b271e271e271e261d260000000000000000000000000000000000000000000000",
//���� ����(BenQ) 32
"00e02b0036706777313d323e333d323d323e313d683e3277323e9472766777323d323d333d323d323e313d673d3377323e00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 33
"00e04100341960251d2561251d2660251d261d251d251d251e2483942661251d2661251d2661251d251d251d251e251c2583952661251d2562251d2562251c251d251d261d251d260000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 34
"00e047003382338110281f281f291f29202820282029652820286528662965296528662865292028652920286628202820286528202820281f2965291f296528642820286528652965288992823b80872a0000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 35
"00e04700338234811028202866286528202820281f281f296529652865291f29662820286628652820286629652965281f281f291f2a1f291f291f291f281f28652965286628662865288995823b8086290000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 36
"00e02d0034814981331281d01381d11281d21381d0128134128133128133128134128133118c431181331281341281d01281d01181d01281d01281331381341281331281331281331200000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 37
"00e049003481188114281e286429632863281e281e291e281f291e286528642863281e291e291e281f291e281f2964281f2864281e291e281e29632863281f2864291f286428632964288b3e811f8114286228000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 38
"00a063003481188114296329622862281f281e281f291f281f296328622862281e291e281e291e291e291e2862281e291f281e291e281e291e2962281f296328622862296229632861288ac681208114296329622862281f291f281f291f281f286328622962281e291e281e2900",
//���� ����(BenQ) 39
"00e047003382338110281f291f29202920282028202866281f286528652966286628652965281f2965282028662820282028652820291f281f29652820296528652820286629652866288993823a8085280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 40
"00e04b003480ba80b32558265825582559255825582580952558255826582558265825809525592580962680952580ee25858b80c180b32558255925572558255925582680952559255825592558265825809525582580952580952680ef25000000000000000000000000000000",
//���� ����(BenQ) 41
"00e04b003380ba80b22558255825592558255925582680952658255924582557255825809625582580952580952580ee25858c80c280b32558265925582658255825582580952558265825582558255825809525582680952580952580f025000000000000000000000000000000",
//���� ����(BenQ) 42
"00e0490034811881152820286429632964281e291e281f291e2820286429632963291e281e281f291e281f296428632a1e281e291e281e291e2a63291e282028642963296428642964298b3e811f8115286129000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 43
"00e04700358232810f2a1f291f281f281f281f291f29662820286628652966296528662865291f2866291f2a65291f291f2965281f281f291f2965281f29652965281f286529652865298993823b80862a0000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 44
"00e047003382348110281f29202820296528652866281f281f296529652865291f2920282029652864281f2865281f29202865281f282028202865291f29652865281f296528662865298994823b8086280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 45
"00e02b00376a6676323d333d323e323e323d333d673e3277323e946f786776323d323e313d333e323d323e673e3177323e00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 46
"00e04700338234810f281f2a1f2a1f29652865281f28202820286629652965281f281f296528652965291f291f281f2966291f29202820291f296528652866281f2965296528652865288994823c8086280000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 47
"00e04300340d6b166b176c172d162c172c176b172c172c176b162b162c172c172c172c162c168689166b176c176b162c172d182c166b172c172d176a172c172c162b162b162c172c1700000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 48
"00e04b003382128101271d2861281d281d261d261d261d281d288101271d275b275b265a271d261e271d281d288606821b8101281e2761271e261d261d261d271d271d278101261d275b265a265a261d271e271e271d260000000000000000000000000000000000000000000000",
//���� ����(BenQ) 49
"00e045003382108101255e255d251d241d251c251c251c251c255d255e245d251c255d251d251c241d25855a255e255d251c241d251c251c251c251c255e255d265d251c255d251c251c251c25000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 50
"00e04b003382138101271d2861281d271d261e271d281d281d268101271d265b275a275a271d271d271d271e278605821a8101271d2861271d261d261e271d281d281d268101271d265a265b275a271d271d271d271e270000000000000000000000000000000000000000000000",
//���� ����(BenQ) 51
"00e049003481188115281e286328652864281e2a1e281e291e291e296328652864291f291e281f291e281f281e2964281f2864291e291e291f29642864291f2863281e286429642963288b40811f8116286229000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 52
"00e049003381148114291e296428642963291e2820281e281e281f286428632964281f281f281e281f291e281f2964291e2864281e281f281f2864296328202864291e286328652864288b3f81208114296228000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 53
"00e049003481118115291e296429632865281f281e281f291e291e296429632865281f281e281f291e28642964281e2864291f281e281f281e281f291e2863291f2963286528642963288b3f811f8114286229000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 54
"00e02f00366c313d323e323d323e313d323e323d323d673e3277323d947377313d323e323d323e313d323e323d323d673d3276323d000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000",
//���� ����(BenQ) 55
"00e049003481188115281f286428632864281f291f281e281f281e296329642864281e291f281e291e281e291e2a64281e2865281f291e281e29642963281f2864281e296328652864288b3f811f8115286128000000000000000000000000000000000000000000000000000000",
};
}