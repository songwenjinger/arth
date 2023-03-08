package common_sort;

import java.util.Arrays;

/**
 * 三路快排序
 */
public class Demo06_QuickSort2 {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }


    public void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }

        int lt = l;
        int gt = r + 1;
        int base = nums[l];

        int i = l + 1;
        while (i < gt) {
            if (nums[i] < base) {
                swap(nums, ++lt, i);
                i++;

            } else if (nums[i] == base) {
                i++;
            } else {
                swap(nums, --gt, i);
            }
        }

        swap(nums, l, lt);
        lt--;
        System.out.println(Arrays.toString(nums));
        quickSort(nums, l, lt);
        quickSort(nums, gt, r);


    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {
        Demo06_QuickSort2 demo07 = new Demo06_QuickSort2();
        int[] array = demo07.sortArray(new int[]{4,4,3,4,2,1,5,6,7,0});
        System.out.println(Arrays.toString(array));
    }
}
