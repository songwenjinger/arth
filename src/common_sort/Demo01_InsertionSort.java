package common_sort;

import java.util.Arrays;

/**
 * 直接插入排序
 * 将数组中的所有元素依次跟前面已经排好的元素相比较，如果选择的元素比已排序的元素小，则交换，直到全部元素都比较过为止。
 * 时间复杂度O(n^2)
 */
public class Demo01_InsertionSort {


    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i; j >= 0; j--) {
                if (j > 0 && temp < nums[j - 1]) {
                    nums[j] = nums[j - 1];
                } else {
                    nums[j] = temp;
                    break;
                }
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        Demo01_InsertionSort sort = new Demo01_InsertionSort();
        int[] ints = sort.sortArray(new int[]{6, 5, 3, 1, 8, 7, 2, 4});
//        int[] ints = sort.insertSort(new int[]{6, 5});
        System.out.println("res:" + Arrays.toString(ints));
    }
}
