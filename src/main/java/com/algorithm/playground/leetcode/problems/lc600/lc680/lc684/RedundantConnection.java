package com.algorithm.playground.leetcode.problems.lc600.lc680.lc684;

import java.util.*;

/**
 * https://leetcode.com/problems/redundant-connection/description/
 */
@SuppressWarnings("ConstantConditions")
public class RedundantConnection {

	class Solution {
		public int[] findRedundantConnection(int[][] edges) {
			int[] parents = new int[edges.length + 1];
			for (int[] edge : edges) {
				int p1 = find(parents, edge[0]);
				int p2 = find(parents, edge[1]);
				if (p1 == p2) {
					return edge;
				}
				parents[p2] = p1;
			}
			return null;
		}

		private int find(int[] parents, int key) {
			if (parents[key] == 0) {
				parents[key] = key;
				return key;
			} else if (parents[key] == key) {
				return key;
			}
			int parent = find(parents, parents[key]);
			parents[key] = parent;
			return parent;
		}
	}

	class BFS_DFS_Solution {
		public int[] findRedundantConnection(int[][] edges) {
			Map<Integer, List<Integer>> map = new HashMap<>();
			for (int[] edge : edges) {
				if (!map.containsKey(edge[0])) {
					map.put(edge[0], new ArrayList<>());
				}
				map.get(edge[0]).add(edge[1]);

				if (!map.containsKey(edge[1])) {
					map.put(edge[1], new ArrayList<>());
				}
				map.get(edge[1]).add(edge[0]);
			}
			Set<Integer> cycle = cycle(map);
			for (int i = edges.length - 1; i >= 0; i--) {
				int[] edge = edges[i];
				if (cycle.contains(edge[0]) && cycle.contains(edge[1])) {
					return edge;
				}
			}
			return null;
		}

		private Set<Integer> cycle(Map<Integer, List<Integer>> edges) {
			Set<Integer> seen = new HashSet<>();
			// [curr, from]
			Queue<int[]> queue = new ArrayDeque<>();
			queue.add(new int[]{1, 0});
			seen.add(1);
			Integer from = null;
			while (!queue.isEmpty() && from == null) {
				int[] curr = queue.poll();
				for (Integer next : edges.get(curr[0])) {
					if (seen.add(next)) {
						queue.offer(new int[]{next, curr[0]});
					} else if (!next.equals(curr[1])) {
						from = next;
					}
				}
			}

			seen.clear();
			// [curr, from]
			LinkedList<int[]> stack = new LinkedList<>();
			stack.push(new int[]{from, 0});

			while (!stack.isEmpty()) {
				int[] curr = stack.peek();
				if (seen.add(curr[0])) {
					if (curr[0] == from && curr[1] != 0) {
						return seen;
					}
					for (Integer next : edges.get(curr[0])) {
						if (next != curr[1]) {
							stack.push(new int[]{next, curr[0]});
						}
					}
				} else {
					seen.remove(curr[0]);
					stack.pop();
				}
			}

			return seen;
		}
	}

}
