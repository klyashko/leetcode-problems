package com.leetcode.problems.linkedlist.medium

import com.leetcode.problems.linkedlist.medium.AddTwoNumbers.Solution as S
import spock.lang.Specification
import spock.lang.Unroll

import static com.leetcode.problems.linkedlist.ListNode.valueOf as node

class AddTwoNumbersSpec extends Specification {

	@Unroll
	def "addTwoNumbers"() {

		expect:

			new S().addTwoNumbers(node(l1), node(l2)) == node(out)

		where:

			l1        | l2        || out
			[2, 4, 3] | [5, 6, 4] || [7, 0, 8]
			[1, 8]    | [0]       || [1, 8]
			[5]       | [5]       || [0, 1]

	}

}
