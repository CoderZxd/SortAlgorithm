package com.zxd.sort.algorithm.test;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: SortAlgorithm
 * @Package com.zxd.sort.algorithm.test
 * @description: 在要排序的一组数中，假定前n-1个数已经排好序，现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。
 * 如此反复循环，直到全部排好顺序。
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，
 * 在已排序序列中从后向前扫描，找到相应位置并插入。
 *
 * 稳定算法
 *
 * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
 * 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 * @Version 1.0
 * @create 2018-09-03 23:11
 **/
public class InsertionSort {
    public static void main(String[] args){
        int[] arrays = new int[]{48,3,5,15,2,46,17,1,8};
        int length = arrays.length;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arrays[j]<arrays[j-1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j-1];
                    arrays[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        for(int i=0;i<length;i++){
            System.out.println(arrays[i]);
        }
    }
}
