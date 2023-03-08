package common_sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class Demo02_ShellSort {
    public int[] shellSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        //初始步长=数组长度/2
        //gap取固定值也可以
        int step = arr.length / 2;
        while (step >= 1) {
            for (int i = step; i < arr.length; i++) {
                //子数组内部利用直接插入排序
                int temp = arr[i];
                for (int j = i; j >= 0; j -= step) {
                    if (j >= step && temp < arr[j - step]) {
                        arr[j] = arr[j - step];
                    } else {
                        arr[j] = temp;
                        break;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            step = step / 2;
        }


        return arr;
    }


    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int step = nums.length / 2;
        while (step >= 1) {
            System.out.println(step);
            for (int i = step; i < nums.length; i++) {
                int temp = nums[i];
                for (int j = i; j >= 0; j -= step) {
                    if (j >= step && temp < nums[j - step]) {
                        nums[j] = nums[j - step];
                    } else {
                        nums[j] = temp;
                        break;
                    }
                }

            }
            step = step / 2;


        }
        return nums;
    }

    public static void main(String[] args) {
        Demo02_ShellSort no02_shellSort = new Demo02_ShellSort();
        int[] ints = no02_shellSort.sortArray(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        System.out.println(Arrays.toString(ints));

    }

}
