package common_sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class Demo03_SelectSort {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        int start = 0;
        while (start < nums.length) {
            int minIndex = start;
            for (int i = start; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            swap(nums, minIndex, start);

            start++;
        }

        return nums;
    }


    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {
        Demo03_SelectSort no03 = new Demo03_SelectSort();
        int[] array = no03.sortArray(new int[]{4, 3, 1, 1, 8, 9});
        System.out.println(Arrays.toString(array));
    }
}
