package com.algorithm.playground.leetcode.problems.lc700.lc780.lc784

import com.algorithm.playground.leetcode.problems.lc700.lc780.lc784.LetterCasePermutation.Solution as S
import spock.lang.Specification
import spock.lang.Unroll

class LetterCasePermutationSpec extends Specification {

	@Unroll
	def "letterCasePermutation"() {

		expect:

			new S().letterCasePermutation(str) == output

		where:

			str     || output
			"a1b2"  || ["a1b2", "a1B2", "A1b2", "A1B2"]
			"3z4"   || ["3z4", "3Z4"]
			"12345" || ["12345"]

	}

}
