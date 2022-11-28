package common_sort;

import java.util.Arrays;

/**
 *
 * 直接插入排序
 * 将数组中的所有元素依次跟前面已经排好的元素相比较，如果选择的元素比已排序的元素小，则交换，直到全部元素都比较过为止。
 * 时间复杂度O(n^2)
 */
public class No01_InsertionSort {

    public int[] insertSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i; j >= 0; j--) {
                if (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                } else {
                    arr[j] = temp;
                    break;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        No01_InsertionSort sort = new No01_InsertionSort();
        int[] ints = sort.insertSort(new int[]{6, 5, 3, 1, 8, 7, 2, 4});
//        int[] ints = sort.insertSort(new int[]{6, 5});
        System.out.println("res:" + Arrays.toString(ints));
    }
}
