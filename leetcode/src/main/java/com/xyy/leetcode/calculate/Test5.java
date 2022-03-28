package com.xyy.leetcode.calculate;

/**
 * 验证交替位二进制数
 *
 * @author: zyf
 * @create: 2022-03-28 10:24
 **/
public class Test5 {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));

    }

    /**
     * 复杂度分析
     * <p>
     * 时间复杂度：O(logn)。输入 nn 的二进制表示最多有 O(logn) 位。
     * 空间复杂度：O(1)。使用了常数空间来存储中间变量。
     * 方法一:
     *
     * @param n
     * @return
     */
    private static boolean hasAlternatingBits(int n) {
        int flag = 2;
        while (n != 0) {
            if (n % 2 == flag) {
                return false;
            }
            flag = n % 2;
            System.out.print(flag);
            n /= 2;
        }
        return true;
    }

    /**
     * 复杂度分析
     *
     * 时间复杂度：O(1)。仅使用了常数时间来计算。
     *
     * 空间复杂度：O(1)。使用了常数空间来存储中间变量。
     * @param n
     * @return
     */
    private static boolean hasAlternatingBits2(int n) {
            int a = n ^ (n >> 1);
            return (a & (a + 1)) == 0;
        }


}
