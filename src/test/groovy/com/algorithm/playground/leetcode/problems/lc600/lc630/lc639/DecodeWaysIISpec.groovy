package com.algorithm.playground.leetcode.problems.lc600.lc630.lc639

import com.algorithm.playground.leetcode.problems.lc600.lc630.lc639.DecodeWaysII.Solution as S
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Example 1:
 *
 * Input: "*"
 * Output: 9
 * Explanation: The encoded message can be decoded to the string: "A", "B", "C", "D", "E", "F", "G", "H", "I".
 *
 * Example 2:
 *
 * Input: "1*"
 * Output: 9 + 9 = 18
 *
 *
 * Note:
 *
 * The length of the input string will fit in range [1, 105].
 * The input string will only contain the character '*' and digits '0' - '9'.
 */
class DecodeWaysIISpec extends Specification {

	@Unroll
	def "numDecodings"() {

		expect:

			new S().numDecodings(s) == out

		where:

			s || out
			"*" || 9
			"1*" || 18
			"01" || 0
			"301" || 0
			"2*" || 15
			"**" || 96
			"1*72*" || 285
			"*1" || 11
			"9617278761" || 2
			"7278761" || 1
			"27" || 1
			"**********1111111111" || 133236775
			"********************" || 104671669
			"***" || 999
			"*1*1*0" || 404
			"2781892146981527747*75*4919652232129745787948739153598789*9*524*46863851811597567975943*7721799*59928552279681366383**7*178**3926528797158*5943688987171***216549568741383379581398568579611454348833371667115868398872455*936*74923572874265**446531983552994*669*7523517355429956794715*6*7228935189113436927618239889723638274299*6*6739679464872737358754911479*76541175445828*26586863195885875397187783212*26*55*775*551612*89266281828174*74366*18571933351178188*6611892*85563658577398417426989219629978657676373*1568195613914424137394935*3989975529966532263734*251*91*768478955266192445291958493129412836386729882561144354498761881432936354444279947*282385334465197*8578582*367**317288*1234*66*892*61464992448563*74455*63*887918*353*71659223*2895944*1721296924579969417774323997292*31361125196338**2192231746*42*1931299*3824285*3*857417*69871369748545794478*591*5729183955*94*75334*1597832794779537688**74*4451*41*445*82339394*11*682316562*4551616769385*871649*6822432484*5565*5241287241255522*7667*9446419672836192892464564957*79388841246223179762*2484834426294867778*6836231*19754427*729*5889192*4532893*24495*739388318568*255351*18988938274864329992*736218956*537567482556399599*41**69639959184587199328287214617993385783337617854*33499129952*81528*23**339279*9542795*2736722163891444*752274734652774717*94264391622219856286*66429*414791122*72162688*7532974991832945*619253*9112*777628*99915*69114693976348*264839222979859*9243688164*93647**197751478*552*142*254716412929986698334*969759794528788*43768772*3131124429212*64276*17691935311614861*661655728822427248*6275933353962729466171*999664***2383129*9676251895*789*59*6376555*5*462*542*364451*233927446279*35286*855843362268735739457918971945852*5493*9*345935176*8**84*8214557515157**81*224373882357427329*186*5*6644312313955612877*454*124**3*4754196182417*1358447285171929*7822213*718914479689181327*39*8*26964478569432786353*666*363*8465844*3337*644*84188277797224332481756*685284*8298182*59332485793781359585935834541*724*148*2*1593*9982***3711673*925916653571*578798*817381321869313124587745689722823868237989586896627*541*62*698259**8493264414683478*26771946*47849749*627*7*4758535237971786*541256483864174797136597*564826271141437*7716923188957*83*5*5646934299*32548134727594*219*4612458357653162659*2838273*7*8*64743843212765522*871184111313153751723*599231413486299888881398744*49*34785794*355*86*28912217*25647876151*3391*277*71493353784*8217741897*22429657815427*89364637326944919271868522321836299387261797632346486388424121793695438665819442862*6*851491*8723574395967632*798343586466949342327899*392837*98167943418*5143147561252*35619953*52874336292252943472534176689632866695377*1831329331852934*87*4822752498751967924798667897397535155663523365254574342438436*4969476*74938241254686758781625*8151*1189584*25548*4*8347192*2353714271*172332767591299464124578223956258457*71945842559165692733*4295764567387868831*1455**6776681*12526584793226357895621257988*95415123547981*48787778436825*351968847428367826824917483817395519948177468485*4213829277265941488*712491*2422443896**6297148263278*2*913124452164484886458486637252*18913495785936715216336968*8313*13566**9*2118463183*3*2825252*8*37*842*8835713339162*65442*289345787924*1352742*66778656936*324*47*88191676**8**728745439663172461*5144796719289945877515594*467877115326878*85379853638792*5499*61382427521942272273*2764*415844165*96185839462997*8791463829192*377*883434*149293*2383758658654516778727*3267577743484731375*93923**7187798**493282777789142741566582*8112*6*1544132*1575*72677687161*49531*7797515*83233224181*7498*83933523226161794157581556*25422*6*125384194635221**316847588**711262632266992564487457571283235671874466*31*684684687*1*76964813287*14113**44991117561499516*14213987824**631*3526267376828555444**219938133*5*85667657687664*9445*9*7857682*8*6477216635462212*2275417*5484277367*5844399931288832971168697*95*72783541444255*7**48771199511*849*6*642352549*7679**6679968111349589262*611*371*34454911134859128319199649631221455437789466225*21123422611689672891*718**953239999178326434267929586873336*7829825219139*33*3*265*15679228**6*8272595289*3749518866*369726**16725835541846*354579327957125*3497924237776375842214*876936*954*9964*392113213917612338266877318254*3*944214113**293*78315**2275686544944758357889257**795464*3*85786225788*8749*42757*96742618544863112134438749913433762286264*284846*32875288244129112217374*4*374*52*8***6979399251*9349184197637422*16621*3*9623*23572912987*69*1161381*52*953*4*56178282*213829854297546843*8252857243416727784**9591868*96648969*6293193*1755579342585647*85653549*759*1266348214266778*76224194599346785*755537711*7*21*34*24664*27881*19989481589799314953198*1282911*8*4998**49*458114*35652*236462**6923779*4581*511638238652513437867126273497432*262*3414397691675273416*43734186836*116817127996*619244*428793693756195266444617**6669*526582676728*668*824516331*9622557*4389418561*241776728531115539412**36478927785762743*87577685153355687779419971162224983**95*1686246262*42385954389575563438563967849358347*27181583*7761435781415*28*62129831*6985934*899349565675534985852*9623832788642832337*35*12674474429817521759263*98428281859163*84724293117628*51*9672729689*332*87554688663891169*6*5*1187*6*76476695873*8546788652778338593921*98*368*341674512*29*292577*7*2394835738938513817371728629318865518562326127913333152872*417*237962898767714816587*6165485128*31532861*323389768*9**5788848134132**916*62566*26313851923227*9755*516759329852773229552957874169286*9666778*774891583395*941135994122473786*9442146*3332485*623497739361*4*55753433149363645928393268883292366585734483*82*8595144938*19959121575133917898161789715824889897577*75*7698533*839825**812518312*73749172*1*83949733442*7676*86555*478648641295569526932435986***49*75996766256587235*53281*7**6141667149233*2*595**861791585448395679415722975783*64822749738582265831829551329323598464882993166821419456213937*5937161659*694922525*1777941781996891186**5*44231531*49929575689464131*1*12*145445537168123686*115*3*168123*4728221136*3*312676681*1913*4*136495139785*17*795693493863422*8**3222556955*55*2892944**4*3675167325931576154846*916441248912523889567963644*687879668672661611**3934829851643*64*5285396468*61*79391651*768*25*1762*7424*393649927195428194429752*46556393966719658353**81168382925752157794554418723958849297334119831113151989429553644491413*233647*98293*34257415749499*2935649*5224431935998757955*419226733132491384778953355*4654266899843572*89*553*398855*57*255*2*38924421384155164*5366697*487794316*578295953*5532759997747264215*2159259764712874294316*46961283876441*875*6156687356*113222851423479628886*5146351*2414646742538**515927533234956368135885*9738496125*373917645*9261883724*9435113749498243291547946917147*192714898716533415868238*1156*1887839**68524257*2627687834696*3985667**73221168681931336*29*311528557*7*69852*26*919559867213941529883991793142322*4514*8368714467379539928416344767249425*3*3*9835*222253*934923433845176635*61*36481*8496*4578346*42723*88516634537*8363535**83*1128*642*1586*89724*12445978*276816622783524*3269257273735853356133426223332*36455224183*3741*6*895541264525321841639149875*63899*73*234983*7842152444559758363522298229429755*665*41553762*286*8*457289428*727369143*14281*92427344123434819173186*2127946*58*7*96126885995153464*8*719224346*4348649226611647**56**26892*4916554162613314796**6565643**4373673664769378*96*31669726156243328*316877*36888354631933253366332377976263964191*74327*4972*12*892361469141515*6354*278497894818**8*7*473*32377647*96**6*1**5441*33694189*67262*373245271399**66**79555428246874*89*1353437*97174414*5147143592*477336177913829579128298597121*3253748888881241265883331942185216442556564351558263329*5145*264*6176446*116*441631317167449665**35944618355462326978313226*141267*389357245433922*34523523835741839767613634267821964724156536*296734163216*878268*326135198*73731882146*813*83816*1824871*18144595374531*556497334996214*48625629664638388322*1568*666214482139874*5*8433864146553615214*96928537358288**75*43782316488*63735447*4499264382288815128*94*1235*6531585221*8236655964367563133449776538239*73374678*9726*69646*798398755*3*4392399358921431414298675474*115742986424997557*137299644198589863771868*3361*86*963699116575744**2966*61*6864272858235628486642542676*5168391514815*34683683*81835682*6*87*4114247526734586931154131518943*465511138212*838547552264814794531541*7*159981511*3571*249147355216169632958933846958*2767554994911969*1**3946774*79335**66581947234*78*2195414937154644183*85459*4671414399971*1783466435899294324859*4884*19198562559259284*16783664317664769725348125782*991385*8137858591793*647177496*6953522227975832*22162153235365878726883*87567667698*389627224353**5996*45414*3512117339*49**4*29467996958398663*789849189967243492*547948*79169529*83*94*41576964573281*4261119239725*43767555365*14*618134529*861868533123743*56*6*5946354913292*841944879425*157*39932*73526779*1379772*5383683565142347916444183672374557**688132*522574616944415238773156*7677775486*228346685423*92446*3*67*754652**5698*5389552411*41343853*2694788896574993442*5*52497137918*341939*5*4*4177995*957768*3788*144611315*4*6768436141*263856894439*5*45698399956942971462793*57582**2493656966566284276229*67685119**7299*821526*5987*192694977638928*9*468666867939*6493836862117559878751*435*6624123867*748632833**824*553137537781419739**577*898413381157*7129365*761*81478268391619222*421*68941787954*54361*696*1468*627629842*4373531849211*687*28399791236*8357**252*581395514661424*25737752959174635153444431374188387894*35916*6*911*4*11941617*25*55*94*942914383**51675**445513*48315435*277676*622735654634243799188933976*6623268948396*63717194484881*47659*141425*183561217113947*63*142*7*1257117439**8673473686526*484125*6396376*7815345839*886886684679*487376438213311513559538589987*432359534*7*682318463449777*1796465**46169*572*826661538*4822*1*937549719463372227*1857931*72279934*26315144*5313186*44384887422432416515235234576641*9197291395387774**281836492318*8354326*3395*18695949511963536782251*5883182655*87333722375584*958815521277376455*96113142*742*8185*759341237*11447144*9776435968965" || 424827479

	}

}