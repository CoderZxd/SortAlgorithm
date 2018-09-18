package com.zxd.sort.algorithm.test;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: SortAlgorithm
 * @Package com.zxd.sort.algorithm.test
 * @description: 快速排序的基本思想：通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，
 * 则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 * 基本思想：（分治）

 * 先从数列中取出一个数作为key值；
 * 将比这个数小的数全部放在它的左边，大于或等于它的数全部放在它的右边；
 * 对左右两个小数列重复第二步，直至各区间只有1个数。
 *
 * 平均时间复杂度：O(N*logN)
 *
 * 不稳定
 *
 * @Version 1.0
 * @create 2018-09-18 23:28
 **/
public class QuickSort {

    public static void quickSort(int a[],int l,int r){
        if(l>=r) {
            return;
        }
        int i = l; int j = r; int key = a[l];//选择第一个数为key
        while(i<j){
            while(i<j && a[j]>=key) {//从右向左找第一个小于key的值
                j--;
            }
            if(i<j){
                a[i] = a[j];
                i++;
            }
            while(i<j && a[i]<key) {//从左向右找第一个大于key的值
                i++;
            }
            if(i<j){
                a[j] = a[i];
                j--;
            }
        }
        //i == j
        a[i] = key;
        quickSort(a, l, i-1);//递归调用
        quickSort(a, i+1, r);//递归调用
    }
    public static void main(String[] args){
        int[] test = new int[]{72,6,57,88,60,42,83,73,48,85};
        quickSort(test,0,9);
        System.out.println(test);
    }
}
