package com.leetcode.problems.math.easy

import com.leetcode.problems.math.easy.ExcelSheetColumnNumber.Solution as S
import spock.lang.Specification
import spock.lang.Unroll

class ExcelSheetColumnNumberSpec extends Specification {

	@Unroll
	def "titleToNumber"() {

		expect:

			new S().titleToNumber(s) == output

		where:

			s     || output
			"A"   || 1
			"B"   || 2
			"AB"  || 28
			"ZY"  || 701
			"AA"  || 27
			"AAA" || 703
	}

}
