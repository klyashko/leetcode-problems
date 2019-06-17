package com.algorithm.playground.google.codejam._2019.round3.task4

import spock.lang.Specification
import spock.lang.Unroll

import static Solution.main
import static com.algorithm.playground.google.utils.GoogleUtils.exec


class NapkinFoldingSpec extends Specification {

	@Unroll
	def "Napkin Folding"() {

		expect:

			output == expected

		where:

			[output, expected] << exec(
					{ -> main() },
					["""4 2
                        1 1
                        1 2
                        2 2
                        2 1""", "POSSIBLE"],
					["""3 2
                        1 1
                        1 2
                        2 1""", "POSSIBLE"],
					["""8 2
                        1 3
                        3 5
                        5 5
                        4 4
                        7 3
                        5 1
                        4 2
                        3 1""", "IMPOSSIBLE"],
					["""8 2
                        1 3
                        3 5
                        4 4
                        5 5
                        7 3
                        5 1
                        4 2
                        3 1""", "POSSIBLE"]
			)

	}

}