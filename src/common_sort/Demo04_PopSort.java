package common_sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Demo04_PopSort {
    public int[] sortArray(int[] nums) {
        boolean flag = true;
        while (true) {
            flag = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    flag = false;
                }
            }

            if (flag) {
                break;
            }

        }

        return nums;
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {
        Demo04_PopSort no04 = new Demo04_PopSort();
        int[] array = no04.sortArray(new int[]{3, 2, 4, 8, 7, 6, 9, 3});
        System.out.println(Arrays.toString(array));
    }
}
