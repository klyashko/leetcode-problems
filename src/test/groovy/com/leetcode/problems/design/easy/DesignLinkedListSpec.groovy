package com.leetcode.problems.design.easy

import com.leetcode.problems.design.easy.DesignLinkedList.MyLinkedList as LL
import spock.lang.Specification
import spock.lang.Unroll

class DesignLinkedListSpec extends Specification {

	@Unroll
	def "myLinkedList"() {

		given:

			def ll = new LL()

		expect:

			[methods, args, results].transpose().each {
				method, arg, result ->
					println("$method with ($arg) expect $result")
					assert ll."$method"(arg) == result
					println(ll)
			}

		where:

			methods                                                                                                                                         | args                                                          || results
			["addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get", "deleteAtIndex"]                                                        | [[1], [3], [1, 2], [1], [1], [1], [0]]                        || [null, null, null, 2, null, 3, null]
			["addAtHead", "addAtHead", "deleteAtIndex", "addAtIndex", "addAtHead", "addAtHead", "addAtHead", "get", "addAtTail", "addAtIndex", "addAtHead"] | [[5], [2], [1], [1, 9], [4], [9], [8], [3], [1], [3, 6], [3]] || [null, null, null, null, null, null, null, 2, null, null, null]

	}

	@Unroll
	def "myLinkedList_quick_check"() {

		given:

			def ll = new LL()

		expect:

			[methods, args].transpose().each {
				method, arg ->
					println("$method with ($arg) result ${ll."$method"(arg)}")
			}

		where:

			methods | args
			["addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get", "deleteAtIndex"] | [[1], [3], [1, 2], [1], [1], [1], [0]]
			["addAtHead", "addAtHead", "addAtIndex", "addAtTail", "addAtTail", "addAtIndex", "get", "get", "get", "deleteAtIndex", "addAtTail", "addAtIndex", "get", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtIndex", "addAtHead", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "addAtIndex", "addAtTail", "addAtTail", "deleteAtIndex", "addAtHead", "addAtIndex", "addAtTail", "addAtIndex", "addAtTail", "addAtIndex", "get", "get", "get", "addAtIndex", "addAtHead", "addAtHead", "addAtHead", "deleteAtIndex", "addAtIndex", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtIndex", "deleteAtIndex", "addAtIndex", "addAtIndex", "get", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtIndex", "deleteAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "get", "addAtHead", "addAtHead", "addAtHead", "addAtIndex", "deleteAtIndex", "addAtHead", "addAtHead", "get", "addAtTail", "addAtHead", "addAtTail", "get", "addAtTail", "addAtHead", "get", "addAtHead", "deleteAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtHead", "addAtIndex", "addAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtIndex", "addAtIndex", "addAtTail", "addAtHead", "addAtIndex", "addAtTail", "get", "addAtHead", "deleteAtIndex", "addAtHead", "addAtIndex", "addAtHead", "addAtTail", "deleteAtIndex", "addAtHead", "addAtIndex", "addAtIndex", "addAtHead", "get", "addAtIndex", "addAtTail", "addAtHead", "deleteAtIndex", "addAtIndex", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtIndex", "get", "addAtIndex", "deleteAtIndex", "addAtHead", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtHead", "get", "deleteAtIndex", "addAtIndex", "get", "addAtHead", "addAtTail", "addAtHead", "get", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "get", "addAtTail", "addAtIndex", "addAtHead", "addAtIndex", "get", "addAtHead", "addAtHead", "get", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtTail", "addAtIndex", "addAtIndex", "addAtTail", "get", "deleteAtIndex", "addAtIndex", "addAtHead", "get", "get", "addAtHead", "addAtTail", "addAtHead", "get", "deleteAtIndex", "addAtIndex", "addAtTail", "addAtIndex", "addAtHead", "addAtIndex", "get", "get", "deleteAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtIndex", "addAtTail", "addAtHead", "get", "get", "addAtIndex", "deleteAtIndex", "addAtTail", "get", "deleteAtIndex", "deleteAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "addAtIndex", "deleteAtIndex", "deleteAtIndex", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "addAtHead", "get", "addAtIndex", "addAtIndex", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "addAtIndex", "addAtIndex", "addAtTail", "addAtIndex", "addAtHead", "addAtIndex", "deleteAtIndex", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtIndex", "get", "addAtHead", "addAtHead", "get", "deleteAtIndex", "addAtTail", "get", "addAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "get", "addAtTail", "addAtIndex", "addAtHead", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "get", "addAtTail", "addAtTail", "addAtHead", "get", "addAtHead", "addAtTail", "addAtHead", "addAtIndex", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtIndex", "addAtTail", "get", "addAtHead", "get", "addAtHead", "addAtTail", "addAtHead", "get", "deleteAtIndex", "get", "deleteAtIndex", "get", "addAtTail", "addAtHead", "addAtHead", "deleteAtIndex", "addAtIndex", "addAtHead", "addAtTail", "deleteAtIndex", "addAtTail", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "deleteAtIndex", "get", "addAtTail", "addAtIndex", "deleteAtIndex", "addAtIndex", "addAtIndex", "addAtTail", "addAtTail", "deleteAtIndex", "addAtTail", "addAtIndex", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtHead", "addAtHead", "addAtTail", "addAtIndex", "addAtTail", "get", "addAtTail", "addAtTail", "get", "get", "addAtIndex", "deleteAtIndex", "addAtHead", "addAtIndex", "addAtHead", "deleteAtIndex", "addAtTail", "addAtIndex", "addAtIndex", "get", "addAtHead", "addAtTail", "deleteAtIndex", "addAtTail", "addAtHead", "addAtTail", "get", "get", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "addAtHead", "deleteAtIndex", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "deleteAtIndex", "addAtTail", "get", "deleteAtIndex", "addAtTail", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtIndex", "deleteAtIndex", "deleteAtIndex", "addAtTail", "addAtHead", "get", "get", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtTail", "addAtTail", "addAtHead", "deleteAtIndex", "addAtHead", "addAtHead", "get", "get", "get", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "get", "addAtTail", "addAtHead", "get", "addAtTail", "addAtIndex", "addAtTail", "addAtTail", "deleteAtIndex", "addAtHead", "addAtHead", "addAtIndex", "addAtIndex", "addAtIndex", "deleteAtIndex", "addAtIndex", "addAtHead", "addAtHead", "addAtHead", "deleteAtIndex", "addAtTail", "addAtHead", "addAtTail", "get", "addAtHead", "get", "get", "addAtHead", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "get", "deleteAtIndex", "addAtTail", "get", "addAtHead", "addAtIndex", "addAtTail", "addAtTail", "get", "addAtHead", "get", "addAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "get", "get", "addAtHead", "deleteAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtHead", "addAtIndex", "addAtTail", "addAtIndex", "addAtHead", "addAtTail", "addAtIndex", "addAtTail", "deleteAtIndex", "addAtTail", "addAtHead", "addAtHead", "addAtHead", "get", "addAtHead", "addAtHead", "addAtTail", "deleteAtIndex", "addAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtIndex", "addAtTail", "get", "get", "get", "addAtHead", "addAtIndex", "addAtTail", "addAtTail", "deleteAtIndex", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "addAtIndex", "addAtTail", "addAtIndex", "addAtHead", "addAtIndex", "addAtHead", "deleteAtIndex", "addAtIndex", "addAtIndex", "addAtTail", "addAtHead", "addAtIndex", "addAtHead", "addAtTail", "addAtIndex", "get", "addAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtTail", "addAtIndex", "addAtTail", "addAtHead", "addAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "deleteAtIndex", "addAtTail", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "get", "get", "addAtHead", "addAtHead", "addAtIndex", "deleteAtIndex", "addAtHead", "get", "addAtHead", "deleteAtIndex", "addAtHead", "addAtIndex", "addAtHead", "addAtHead", "get", "addAtTail", "addAtIndex", "addAtTail", "deleteAtIndex", "addAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "get", "addAtTail", "deleteAtIndex", "get", "addAtHead", "addAtHead", "addAtHead", "addAtIndex", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "deleteAtIndex", "addAtHead", "addAtTail", "addAtTail", "get", "addAtIndex", "get", "addAtTail", "deleteAtIndex", "addAtTail", "addAtHead", "deleteAtIndex", "addAtHead", "addAtIndex", "addAtIndex", "addAtHead", "addAtIndex", "addAtIndex", "addAtHead", "get", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "addAtIndex", "addAtHead", "addAtIndex", "addAtTail", "get", "addAtTail", "deleteAtIndex", "addAtHead", "addAtTail", "addAtTail", "addAtTail", "addAtIndex", "addAtHead", "deleteAtIndex", "addAtHead", "get", "addAtHead", "addAtTail", "get", "get", "addAtHead", "get", "addAtIndex", "addAtHead", "addAtIndex", "get", "addAtTail", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtTail", "addAtIndex", "addAtTail", "addAtTail", "get", "addAtHead", "addAtTail", "addAtHead", "get", "addAtTail", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtIndex", "addAtTail", "addAtTail", "get", "addAtTail", "addAtTail", "addAtHead", "addAtIndex", "addAtIndex", "addAtIndex", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtIndex", "addAtTail", "deleteAtIndex", "addAtIndex", "deleteAtIndex", "addAtTail", "addAtTail", "addAtIndex", "addAtHead", "get", "addAtHead", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "deleteAtIndex", "addAtHead", "addAtHead", "deleteAtIndex", "addAtIndex", "get", "deleteAtIndex", "addAtTail", "get", "addAtIndex", "addAtTail", "addAtHead", "get", "addAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "addAtHead", "addAtIndex", "addAtHead", "addAtTail", "addAtIndex", "addAtHead", "addAtTail", "addAtTail", "deleteAtIndex", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtIndex", "addAtIndex", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "deleteAtIndex", "addAtTail", "addAtTail", "addAtHead", "get", "addAtTail", "get", "addAtTail", "addAtTail", "addAtTail", "addAtHead", "deleteAtIndex", "addAtHead", "addAtTail", "deleteAtIndex", "addAtHead", "addAtHead", "addAtIndex", "addAtHead", "addAtTail", "addAtIndex", "get", "addAtTail", "get", "get", "addAtHead", "addAtHead", "get", "addAtTail", "addAtTail", "addAtTail", "get", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "get", "addAtHead", "addAtTail", "deleteAtIndex", "get", "deleteAtIndex", "addAtTail", "deleteAtIndex", "addAtIndex", "deleteAtIndex", "addAtIndex", "get", "addAtHead", "addAtIndex", "get", "get", "deleteAtIndex", "deleteAtIndex", "get", "addAtHead", "addAtTail", "get", "addAtTail", "addAtTail", "addAtHead", "get", "addAtTail", "addAtTail", "deleteAtIndex", "addAtIndex", "addAtTail", "get", "deleteAtIndex", "addAtTail", "addAtIndex", "get", "addAtIndex", "deleteAtIndex", "addAtIndex", "addAtIndex", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtIndex", "addAtHead", "addAtTail", "get", "addAtHead", "get", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "get", "addAtTail", "addAtHead", "addAtHead", "get", "addAtHead", "get", "get", "get", "deleteAtIndex", "addAtIndex", "addAtTail", "addAtHead", "get", "addAtTail", "deleteAtIndex", "addAtTail", "addAtTail", "get", "addAtTail", "addAtTail", "addAtHead", "get", "addAtHead", "addAtHead", "addAtIndex", "addAtTail", "get", "addAtHead", "addAtHead", "addAtTail", "get", "addAtHead", "addAtHead", "addAtHead", "addAtTail", "addAtIndex", "addAtTail", "addAtTail", "get", "addAtTail", "addAtHead", "get", "addAtTail", "addAtHead", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "deleteAtIndex", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "get", "get", "get", "get", "get", "addAtTail", "deleteAtIndex", "addAtHead", "addAtTail", "deleteAtIndex", "addAtHead", "addAtTail", "deleteAtIndex", "addAtTail", "addAtIndex", "addAtHead", "addAtTail", "addAtIndex", "addAtIndex", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "deleteAtIndex", "get", "get", "addAtTail", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtIndex", "get", "addAtTail", "addAtTail", "addAtTail", "deleteAtIndex", "addAtHead", "addAtTail", "addAtIndex", "addAtTail", "deleteAtIndex", "addAtTail", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "addAtHead", "addAtTail", "addAtIndex", "addAtHead", "addAtHead", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "get", "get", "get", "get", "addAtTail", "get", "get", "addAtHead", "addAtIndex", "addAtTail", "deleteAtIndex", "addAtHead", "deleteAtIndex", "get", "addAtTail", "addAtTail", "addAtHead", "addAtTail", "deleteAtIndex", "addAtHead", "addAtIndex", "addAtHead", "get", "addAtIndex", "deleteAtIndex", "addAtTail", "addAtHead", "addAtTail", "addAtTail", "addAtHead", "addAtHead", "addAtTail", "addAtHead", "addAtIndex", "deleteAtIndex", "addAtTail", "get", "deleteAtIndex", "get", "get", "addAtTail", "addAtHead", "addAtIndex", "addAtHead", "addAtTail", "deleteAtIndex", "addAtTail", "addAtTail", "addAtTail", "deleteAtIndex", "addAtTail", "addAtIndex", "addAtHead", "addAtIndex", "deleteAtIndex", "addAtHead", "addAtHead", "addAtHead", "addAtTail", "addAtTail", "addAtIndex", "get", "addAtIndex", "addAtTail", "get", "get", "addAtTail", "addAtHead", "get"] | [[893], [84], [2, 521], [123], [403], [1, 794], [1], [3], [1], [4], [872], [2, 314], [5], [169], [966], [409], [89], [9, 598], [617], [689], [10, 528], [376], [221], [13, 526], [236], [812], [13], [62], [14, 244], [181], [19, 751], [343], [6, 707], [15], [11], [16], [20, 648], [470], [690], [89], [23], [5, 346], [467], [970], [996], [673], [1, 730], [17], [9, 525], [11, 667], [11], [657], [290], [326], [175], [867], [646], [729], [40, 305], [31], [583], [651], [773], [883], [903], [34], [842], [757], [407], [30, 519], [25], [720], [956], [19], [615], [588], [900], [38], [378], [786], [20], [915], [19], [961], [239], [946], [986], [431], [115], [793], [53, 614], [41, 616], [159], [988], [450], [161], [699], [660], [32, 326], [32, 364], [736], [313], [49, 90], [453], [62], [525], [68], [52], [23, 564], [510], [834], [65], [339], [26, 17], [28, 520], [941], [61], [57, 782], [415], [860], [75], [39, 131], [187], [242], [614], [301], [53, 876], [25], [1, 920], [86], [166], [218], [20, 839], [158], [499], [145], [328], [43], [590], [119], [478], [635], [101], [370], [8], [97], [45, 191], [37], [476], [987], [860], [31], [539], [177], [34], [109], [46], [734], [100, 499], [81], [73, 684], [86], [201], [691], [30], [937], [29], [452], [811], [422], [101, 807], [49, 130], [407], [33], [37], [8, 640], [728], [129], [24], [808], [937], [269], [39], [88], [21, 499], [425], [108, 550], [758], [19, 743], [134], [105], [95], [822], [352], [370], [125, 421], [783], [880], [80], [92], [117, 833], [106], [825], [100], [100], [74], [970], [829], [680], [560], [137, 54], [131], [49], [432], [104, 716], [754], [36], [110], [99], [86, 289], [32, 48], [526], [242], [479], [27], [104, 730], [93, 903], [890], [119, 763], [48], [45, 560], [94], [774], [542], [242], [583], [162, 710], [85], [943], [945], [163], [57], [402], [69], [60, 589], [406], [943], [494], [730], [13], [211], [710], [316], [266], [1], [923], [94, 17], [548], [606], [841], [126], [112], [515], [814], [18], [213], [899], [735], [47], [522], [171], [945], [67, 542], [662], [173], [937], [618], [109], [772], [171, 556], [255], [101], [429], [16], [903], [34], [854], [41], [97], [176], [197], [156], [307], [500], [615], [146], [157, 898], [138], [322], [62], [163], [701], [217], [266], [382], [948], [902], [449], [130], [175], [143], [155, 208], [133], [125, 365], [162, 794], [87], [212], [150], [631], [117, 927], [281], [572], [71], [15], [3], [529], [776], [132], [334], [113], [32, 260], [157], [152], [207], [113], [18], [100], [17, 874], [102], [344], [1, 722], [291], [190], [524], [143, 602], [88, 387], [46], [627], [719], [95], [423], [975], [441], [103], [216], [123], [205, 819], [365], [870], [297], [82], [971], [311], [878], [296], [35], [608], [58], [122], [74], [412], [213, 423], [962], [579], [775], [151, 22], [220], [80], [906], [746], [194], [100], [168], [832], [869], [855], [225], [221], [742], [46], [851], [317], [91], [15], [82], [901], [274], [76], [674], [57], [653], [176], [50], [829], [182, 974], [458], [427], [149], [760], [778], [117, 330], [229, 473], [65, 384], [9], [94, 551], [872], [448], [860], [173], [95], [170], [406], [19], [91], [180], [223], [727], [959], [476], [766], [194], [38], [106], [753], [223], [713], [19, 79], [12], [333], [87], [185], [123], [285, 233], [795], [434], [835], [174], [136], [616], [585], [120], [3], [303], [109], [516], [326], [961], [378], [745], [204], [10], [633], [323], [20, 210], [560], [231, 368], [325], [163], [204, 615], [142], [60], [282], [108], [645], [877], [33], [405], [743], [948], [14], [226, 400], [215], [323], [700], [891], [131, 293], [551], [136], [42], [46], [958], [233, 164], [67], [835], [56], [733], [214], [18], [821], [323], [323, 200], [218], [90, 877], [277], [2, 162], [120], [235], [227, 916], [324, 177], [404], [610], [14, 957], [473], [471], [66, 344], [271], [17, 172], [303], [657], [50], [173], [941], [390], [245, 221], [333], [75], [96, 812], [270], [748], [298], [271], [14], [792], [844], [178, 393], [927], [842], [311], [126], [129], [12], [192, 444], [69], [190], [348], [596], [59], [288], [6, 975], [380], [341], [288], [798], [194, 470], [187], [272], [66, 25], [911], [640], [547], [291], [83], [563], [27], [305], [61], [95], [265], [80, 607], [169], [700], [256], [505], [63, 500], [317], [689], [991], [708], [284], [943], [937], [992], [263], [368, 873], [132], [354], [173], [42], [601], [16], [13], [16, 674], [228, 168], [510], [87, 177], [375, 327], [982], [334], [806], [598], [719], [554], [49], [230], [71], [476], [403, 556], [678], [147, 859], [510], [340], [863], [269], [72], [485], [932], [929], [204, 565], [936], [80], [932], [322], [356], [819], [387], [267], [688], [334], [5, 324], [212], [205, 68], [21], [510], [397], [25], [762], [75], [5], [430, 163], [341], [722], [384], [711], [698], [543], [75], [388], [663], [754], [307], [772], [391, 275], [821], [796], [95], [993], [718], [852], [105, 119], [390, 526], [29, 570], [300], [301], [152], [205], [184, 60], [632], [221], [440, 161], [348], [535], [517], [67, 631], [417], [209], [340], [710], [975], [721], [731], [460], [360], [172], [241], [352, 4], [156], [104], [351], [119], [232, 671], [947], [103], [240], [107, 403], [583], [856], [145], [749], [907], [819], [457], [381, 666], [717], [8], [341, 728], [112], [794], [410], [156], [255], [380], [227], [948], [829], [785], [787], [375], [108, 657], [249, 772], [779], [976], [254], [560], [154], [314], [575], [765], [465], [321], [34], [36], [917], [162], [208], [27], [381], [570], [245], [50], [699], [246, 37], [249], [262], [373, 619], [12], [479], [141], [190], [222], [686], [301], [644], [204], [317], [375], [441], [697], [755], [530], [711], [398], [871], [445], [29], [280], [437], [214], [312], [206, 757], [472], [473, 853], [301], [605], [144, 503], [10], [493], [504], [103], [323], [635], [154], [86], [806], [762], [324], [233], [248], [545], [39], [86, 603], [847], [270], [349], [673], [331, 990], [309], [524, 660], [478], [147, 410], [534, 117], [843], [457], [932], [675], [408, 147], [852], [689], [33], [541], [175], [983], [321], [835], [13], [34], [865], [46], [730], [408], [984], [277], [126], [125], [345], [235, 847], [82], [493], [97], [394], [149], [12], [439], [56], [778], [880], [579], [97], [742], [55], [437, 222], [672], [74], [381], [372], [32], [209], [489], [472], [889], [437], [365, 397], [512], [540], [405], [114], [950], [233], [484], [811], [812], [178], [293], [184], [700], [152], [80], [16], [393], [564], [538], [192], [25], [273], [586], [14], [526], [0], [787], [378], [208], [705], [380], [922], [589, 275], [653], [833], [532, 167], [538, 644], [303], [429], [512], [186], [470], [85], [15], [256], [514], [168], [677], [209], [960], [182, 718], [533], [451], [906], [651], [511], [848], [496], [260, 57], [395], [176], [529], [981], [455], [796], [220], [66], [37], [816], [789], [685], [601, 674], [267], [718], [256], [82], [176], [757], [895], [935], [514], [256], [392], [386], [629], [434], [526], [272], [814], [72, 648], [612], [492], [654], [53], [87], [662], [783], [890], [363], [50], [320], [12, 920], [708], [206], [406, 337], [421], [571], [601], [463], [73], [829], [371], [944], [116], [399, 599], [358], [36], [530], [201], [143], [34], [277], [936], [100, 145], [426], [884], [196], [146], [372], [314], [301], [121], [549, 84], [343], [319, 239], [190], [224], [491], [843], [330], [465], [449, 562], [391], [264, 506], [162], [622], [351], [460], [290], [314]]
			["addAtIndex", "addAtIndex", "addAtIndex", "get"] || [[0, 1], [1, 2], [1, 3], [1]]
			["addAtHead", "get"] || [[1], [0]]
			["addAtTail", "get"] || [[1], [0]]

	}

}