package common_sort;

import java.util.Arrays;

public class Demo05_HeapSort {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustHeap(nums, i, nums.length - 1);
        }
        swap(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

        for (int i = nums.length - 2; i > 0; i--) {
            adjustHeap(nums, 0, i);
            swap(nums, 0, i);
            System.out.println(Arrays.toString(nums));
        }

        return nums;
    }


    public void adjustHeap(int[] nums, int start, int end) {
        for (int i = start; i <= end; ) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int max = i;
            if (left <= end && nums[i] < nums[left]) {
                max = left;
            }
            if (right <= end && nums[i] < nums[right]) {
                max = nums[right] > nums[max] ? right : max;
            }

            if (i != max) {
                swap(nums, i, max);
                i = max;
            } else {
                break;
            }

        }
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {
        Demo05_HeapSort no05 = new Demo05_HeapSort();
//        int[] array = no05.sortArray(new int[]{4, 6, 8, 5, 9});
//        int[] array = no05.sortArray(new int[]{5, 2, 3, 1});
        int[] array = no05.sortArray(new int[]{-4, 0, 7, 4, 9, -5, -1, 0, -7, -1});
        System.out.println(Arrays.toString(array));
    }
}
