package common_sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class Demo07_MergeSort {

    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        mergerSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergerSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        mergerSort(nums, start, mid);
        mergerSort(nums, mid + 1, end);

        int[] temp = new int[end - start + 1];
        int index = 0;
        int i1 = start;
        int i2 = mid + 1;
        while (i1 <= mid && i2 <= end) {
            if (nums[i1] <= nums[i2]) {
                temp[index++] = nums[i1];
                i1++;
            } else {
                temp[index++] = nums[i2];
                i2++;
            }
        }

        while (i1 <= mid) {
            temp[index++] = nums[i1++];
        }
        while (i2 <= end) {
            temp[index++] = nums[i2++];
        }


        for (int i = 0; i < temp.length; i++) {
            nums[start + i] = temp[i];
        }

        System.out.println(Arrays.toString(nums));

    }


    public static void main(String[] args) {
        Demo07_MergeSort demo07_mergeSort = new Demo07_MergeSort();
        int[] array = demo07_mergeSort.sortArray(new int[]{4, 4, 3, 4, 2, 1, 5, 6, 7, 0});
        System.out.println(Arrays.toString(array));
    }


}
