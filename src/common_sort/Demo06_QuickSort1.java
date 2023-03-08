package common_sort;

import java.util.Arrays;

/**
 * 二路快排
 */
public class Demo06_QuickSort1 {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }


    public void quickSort(int[] nums, int start, int end) {
        // System.out.println("start:" + start + ",end:" + end);
        if (start >= end) {
            return;
        }
        int base = nums[start];
        int i = start + 1;
        int j = end;
        while (i >= 0 && j <= nums.length - 1 && i <= j) {
            while (j >= 0 && i <= j && nums[j] >= base) {
                j--;
            }
            while (i <= nums.length - 1 && i <= j && nums[i] <= base) {
                i++;
            }
            if (i > j) {
                break;
            }
            swap(nums, i, j);
            i++;
            j--;
        }
        swap(nums, start, j);
        System.out.println(Arrays.toString(nums));
        quickSort(nums, start, j - 1);
        quickSort(nums, j + 1, end);

    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        Demo06_QuickSort1 no06 = new Demo06_QuickSort1();
//        int[] array = no05.sortArray(new int[]{4, 6, 8, 5, 9});
//        int[] array = no05.sortArray(new int[]{5, 2, 3, 1});
        int[] array = no06.sortArray(new int[]{-4, 0, 7, 4, 9, -5, -1, 0, -7, -1});
//        int[] array = no06.sortArray(new int[]{19, 97, 9, 17, 1, 8});
        System.out.println(Arrays.toString(array));
    }
}
