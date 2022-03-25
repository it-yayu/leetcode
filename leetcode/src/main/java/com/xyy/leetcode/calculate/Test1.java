package com.xyy.leetcode.calculate;

import java.util.HashMap;

/**
 * @author: zyf
 * @create: 2022-03-25 14:49
 **/
public class Test1 {


    public static void main(String[] args) {
//        System.out.println(trailingZeroes(10));
        int[] ints = towSum2(new int[]{1, 2, 3, 5, 6}, 9);
        System.out.println();
    }


    /**
     *  阶乘后的0的个数
     * 给定一个整数 n ，返回 n! 结果中尾随零的数量。
     * @param num
     * @return
     */
    private static int trailingZeroes(int num){
        int count = 0;
        while (num > 0) {
            count += num / 5;
            num = num / 5;
        }
        return count;
    }


    /**
     * 两数之和
     * 方法一：暴力解法
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


    /**
     * 两数之和
     * 方法二:has表
     * @param nums
     * @param target
     * @return
     */
    private static int[] towSum2(int[] nums,int target){
        //创建一个hash表,key,存放元素,value存放元素下标
        HashMap<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }


}
