package com.google;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] pid = {1, 3, 10, 5};
        int[] ppid = {3, 0, 5, 3};
        int kill = 5;

        List pid1 = List.of(pid);
        List ppid1 = List.of(ppid);

        Solution solution = new Solution();
        solution.killProcess(pid1, ppid1, kill);


    }

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        if (kill == 0) return pid;

        int n = pid.size();
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        for (int i = 0; i < n; i++) {
            tree.put(pid.get(i), new HashSet<Integer>());
        }
        for (int i = 0; i < n; i++) {
            if (tree.containsKey(ppid.get(i))) {
                Set<Integer> children = tree.get(ppid.get(i));
                children.add(pid.get(i));
                tree.put(ppid.get(i), children);
            }
        }

        List<Integer> result = new ArrayList<>();
        traverse(tree, result, kill);

        return result;
    }

    private void traverse(Map<Integer, Set<Integer>> tree, List<Integer> result, int pid) {
        result.add(pid);
        Set<Integer> children = tree.get(pid);
        for (Integer child : children) {
            traverse(tree, result, child);
        }
    }
}