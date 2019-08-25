package com.algorithm.playground.google.kickstart._2019.e.task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://codingcompetitions.withgoogle.com/kickstart/round/0000000000050edb/00000000001707b9
 */
public class Solution {

	public static void main(String[] args) {
		try (Scanner console = new Scanner(System.in)) {
			int tests = console.nextInt();
			for (int test = 1; test <= tests; test++) {
				int l = console.nextInt();
				int r = console.nextInt();
				int ans = solve(l, r);
				System.out.println(String.format("Case #%s: %s", test, ans));
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	private static Set<Integer> factorsOf(int val) {
		Set<Integer> set = new HashSet<>();

		for (int i = 2; i <= Math.ceil(Math.sqrt(val)); i++) {
			while (val % i == 0) {
				set.add(i);
				val /= i;
			}
		}
		if (val > 2) {
			set.add(val);
		}
		return set;
	}

	private static Set<Integer> countMultipliers(Integer n) {
		Set<Integer> primes = factorsOf(n);
		Set<Integer> multipliers = new HashSet<>(primes);

		Set<Integer> tmp = new HashSet<>(primes);

		while (!tmp.isEmpty()) {
			Set<Integer> next = new HashSet<>();
			for (Integer i : tmp) {
				for (Integer p : primes) {
					int c = i * p;
					if (n % c == 0) {
						next.add(c);
					}
				}
			}
			multipliers.addAll(tmp);
			tmp = next;
		}
		return multipliers;
	}

	private static int solve(int l, int r) {
		int count = 0;
		for (int i = r; i >= l; i--) {
			Set<Integer> set = countMultipliers(i);
			int odd = 1, even = 0;
			for (Integer j : set) {
				if ((j & 1) == 0) {
					even++;
				} else {
					odd++;
				}
			}

			if (Math.abs(even - odd) <= 2) {
				count++;
			}
		}
		return count;
	}

}
