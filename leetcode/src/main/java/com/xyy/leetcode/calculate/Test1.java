package com.xyy.leetcode.calculate;

import java.util.HashMap;

/**
 * @author: zyf
 * @create: 2022-03-25 14:49
 **/
public class Test1 {


    public static void main(String[] args) {
        System.out.println(trailingZeroes(10));
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




}
