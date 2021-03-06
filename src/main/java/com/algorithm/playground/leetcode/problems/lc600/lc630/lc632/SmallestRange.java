package com.algorithm.playground.leetcode.problems.lc600.lc630.lc632;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/smallest-range/description/
 */
public class SmallestRange {

	class Solution {
		public int[] smallestRange(List<List<Integer>> nums) {
			int minx = 0, miny = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			int[] next = new int[nums.size()];
			boolean flag = true;
			Queue<Integer> min_queue = new PriorityQueue<>(Comparator.comparingInt(i -> nums.get(i).get(next[i])));
			for (int i = 0; i < nums.size(); i++) {
				min_queue.offer(i);
				max = Math.max(max, nums.get(i).get(0));
			}
			for (int i = 0; i < nums.size() && flag; i++) {
				for (int j = 0; j < nums.get(i).size(); j++) {
					//noinspection ConstantConditions
					int min_i = min_queue.poll();
					if (miny - minx > max - nums.get(min_i).get(next[min_i])) {
						minx = nums.get(min_i).get(next[min_i]);
						miny = max;
					}
					next[min_i]++;
					if (next[min_i] == nums.get(min_i).size()) {
						flag = false;
						break;
					}
					min_queue.offer(min_i);
					max = Math.max(max, nums.get(min_i).get(next[min_i]));
				}
			}
			return new int[]{minx, miny};
		}

	}

}
