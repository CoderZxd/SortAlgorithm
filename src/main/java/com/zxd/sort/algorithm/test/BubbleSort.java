package com.zxd.sort.algorithm.test;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: SortAlgorithm
 * @Package com.zxd.sort.algorithm.test
 * @description: 冒泡排序：冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，
 *               一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 *               走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 *               这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 *               稳定算法。
 *
 * @Version 1.0
 * @create 2018-09-03 0:40
 **/
public class BubbleSort {
    public static void main(String[] args){
        int[] arrays = new int[]{3,48,5,15,2,46,17,1,2};
        int length = arrays.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                if(arrays[j]>arrays[j+1]){
                    int temp = arrays[j+1];
                    arrays[j+1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
        for(int i=0;i<length;i++){
            System.out.println(arrays[i]);
        }
    }
}
