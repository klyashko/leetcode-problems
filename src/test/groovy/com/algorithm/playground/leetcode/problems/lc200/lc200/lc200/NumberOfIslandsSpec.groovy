package com.algorithm.playground.leetcode.problems.lc200.lc200.lc200

import com.algorithm.playground.leetcode.problems.lc200.lc200.lc200.NumberOfIslands.DFSSolution as DFSS
import com.algorithm.playground.leetcode.problems.lc200.lc200.lc200.NumberOfIslands.Solution as S
import spock.lang.Specification
import spock.lang.Unroll

class NumberOfIslandsSpec extends Specification {

	@Unroll
	def "numIslands"() {

		expect:

			new S().numIslands(grid as char[][]) == output

		where:

			grid                        || output
			[['1', '1', '1', '1', '0'],
			 ['1', '1', '0', '1', '0'],
			 ['1', '1', '0', '0', '0'],
			 ['0', '0', '0', '0', '0']] || 1
			[['1', '1', '0', '0', '0'],
			 ['1', '1', '0', '0', '0'],
			 ['0', '0', '1', '0', '0'],
			 ['0', '0', '0', '1', '1']] || 3

	}

	@Unroll
	def "numIslands_dfs"() {

		expect:

			new DFSS().numIslands(grid as char[][]) == output

		where:

			grid                        || output
			[['1', '1', '1', '1', '0'],
			 ['1', '1', '0', '1', '0'],
			 ['1', '1', '0', '0', '0'],
			 ['0', '0', '0', '0', '0']] || 1
			[['1', '1', '0', '0', '0'],
			 ['1', '1', '0', '0', '0'],
			 ['0', '0', '1', '0', '0'],
			 ['0', '0', '0', '1', '1']] || 3

	}

}
