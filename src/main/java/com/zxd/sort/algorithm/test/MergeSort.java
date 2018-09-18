package com.zxd.sort.algorithm.test;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: SortAlgorithm
 * @Package com.zxd.sort.algorithm.test
 * @description: 归并排序（Merge Sort）
 * 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。将已有序的子序列合并，
 * 得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。
 *
 *  算法描述
 *   把长度为n的输入序列分成两个长度为n/2的子序列；
 *   对这两个子序列分别采用归并排序；
 *   将两个排序好的子序列合并成一个最终的排序序列。
 *
 *   平均时间复杂度：O(NlogN)
 *
 *   归并排序的效率是比较高的，设数列长为N，将数列分开成小数列一共要logN步，每步都是一个合并有序数列的过程，时间复杂度可以记为O(N)，
 *   故一共为O(N*logN)。
 *
 * @Version 1.0
 * @create 2018-09-18 23:54
 **/
public class MergeSort {

    public static void main(String[] args){
        int[] test = new int[]{72,6,57,88,60,42,83,73,48,85};
        int[] temp = new int[test.length];
        merge_sort(test,0,test.length-1,temp);
        System.out.println(test);
    }
    
    public static void merge_sort(int a[],int first,int last,int temp[]){
        if(first < last){
            int middle = (first + last)/2;
            merge_sort(a,first,middle,temp);//左半部分排好序
            merge_sort(a,middle+1,last,temp);//右半部分排好序
            mergeArray(a,first,middle,last,temp); //合并左右部分
        }
    }

    //合并 ：将两个序列a[first-middle],a[middle+1-end]合并
    public static void mergeArray(int a[],int first,int middle,int end,int temp[]){
        int i = first;
        int m = middle;
        int j = middle+1;
        int n = end;
        int k = 0;
        while(i<=m && j<=n){
            if(a[i] <= a[j]){
                temp[k] = a[i];
                k++;
                i++;
            }else{
                temp[k] = a[j];
                k++;
                j++;
            }
        }
        while(i<=m){
            temp[k] = a[i];
            k++;
            i++;
        }
        while(j<=n){
            temp[k] = a[j];
            k++;
            j++;
        }
        for(int ii=0;ii<k;ii++){
            a[first + ii] = temp[ii];
        }
    }
}
