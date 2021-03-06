package com.algorithm.playground.leetcode.problems.lc400.lc470.lc477;

/**
 * https://leetcode.com/problems/total-hamming-distance/description/
 */
public class TotalHammingDistance {

	class Solution {
		public int totalHammingDistance(int[] nums) {
			int dist = 0;
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					dist += Integer.bitCount(nums[i] ^ nums[j]);
				}
			}
			return dist;
		}
	}

}
