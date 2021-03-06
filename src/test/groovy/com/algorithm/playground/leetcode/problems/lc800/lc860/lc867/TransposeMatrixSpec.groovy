package com.algorithm.playground.leetcode.problems.lc800.lc860.lc867

import com.algorithm.playground.leetcode.problems.lc800.lc860.lc867.TransposeMatrix.Solution
import spock.lang.Specification
import spock.lang.Unroll

class TransposeMatrixSpec extends Specification {

	@Unroll
	def "transpose"() {
		expect:

			output as int[][] == new Solution().transpose(input as int[][])

		where:

			input                             || output
			[[1, 2, 3], [4, 5, 6], [7, 8, 9]] || [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
			[[1, 2, 3], [4, 5, 6]]            || [[1, 4], [2, 5], [3, 6]]
	}

}
