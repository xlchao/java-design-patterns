package com.xlchao.sulotion;

/**
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 *
 * @author xulongchao
 * @cdate 2019/4/26
 * @email master@xlchao.com
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1==null||nums1.length==0) {
            return arraysMidian(nums2);
        }
        if(nums2==null||nums2.length==0) {
            return arraysMidian(nums1);
        }

        int n = nums1.length;
        int m = nums2.length;

        int i=n/2;
        int j=getJbyI(m,m,i);
        if(nums1[n-i]>=nums2[j]&&nums1[i]<=nums2[m-j]){
//            return
        }


        return 0d;
    }

    double getResultFromNMIJ(int n,int m,int i,int j){
        int sum = n + m;
        if((sum) %2==0){
            return (sum) /2-i;
        }else {
            return (sum -1)/2-i;
        }
    }

    int getJbyI(int n,int m,int i){
        int sum = n + m;
        if((sum) %2==0){
            return (sum) /2-i;
        }else {
            return (sum -1)/2-i;
        }
    }


    private double arraysMidian(int[] arrays){
        int length;
        if (arrays==null|| (length=arrays.length) ==0) {
            return 0d;
        }
        return length %2==0?(arrays[length /2-1]+arrays[length /2])/2:arrays[(int)((double) length /2+0.5)];

    }
}
