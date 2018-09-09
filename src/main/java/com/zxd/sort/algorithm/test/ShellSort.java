package com.zxd.sort.algorithm.test;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: SortAlgorithm
 * @Package com.zxd.sort.algorithm.test
 * @description: 1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。它与插入排序的不同之处在于，
 * 它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 *
 * 不稳定算法。
 *
 * 在要排序的一组数中，根据某一增量分为若干子序列，并对子序列分别进行插入排序。
 * 然后逐渐将增量减小,并重复上述过程。直至增量为1,此时数据序列基本有序,最后进行插入排序。
 * @Version 1.0
 * @create 2018-09-03 23:51
 **/
public class ShellSort {
    public static void main(String[] args){
        int[] array = new int[]{3,48,5,15,2,46,17,1,2};
        int lenth = array.length;
        int temp = 0;
        int incre = lenth;
        while(true){
            incre = incre/2;
            for(int k = 0;k<incre;k++){    //根据增量分为若干子序列
                for(int i=k+incre;i<lenth;i+=incre){
                    for(int j=i;j>k;j-=incre){
                        if(array[j]<array[j-incre]){
                            temp = array[j-incre];
                            array[j-incre] = array[j];
                            array[j] = temp;
                        }else{
                            break;
                        }
                    }
                }
            }
            if(incre == 1){
                break;
            }
        }
        System.out.println(array);
    }
}
