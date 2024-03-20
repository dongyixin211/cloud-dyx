package com.dyx.test;

import org.junit.Test;

/**
 * leetCode 算法练习
 */
public class TestLeetCode {

    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * <p>
     * 你可以按任意顺序返回答案。
     */
    @Test
    public void leetCode01() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int f = i + 1; f < nums.length; f++) {
                if (nums[i] + nums[f] == target) {

                    System.out.println(new int[]{i, f});
                }
            }
        }
    }


    /**
     * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
     *
     * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
     * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
   @Test
    public void leetCode3(){
//        String strs[]={"eat", "tea", "tan", "ate", "nat", "bat"};
//       for (int i=0; i<strs.length ; i++) {
//           char[] chars = strs[i].toCharArray();
//
//
//       }

       System.out.println("翁美琳".length());
    }
}