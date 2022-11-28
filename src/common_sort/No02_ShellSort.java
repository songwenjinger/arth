package common_sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class No02_ShellSort {
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


    public static void main(String[] args) {
        No02_ShellSort no02_shellSort = new No02_ShellSort();
        int[] ints = no02_shellSort.shellSort(new int[]{49, 38, 65, 97, 76, 13, 27, 49, 55, 4});
        System.out.println(Arrays.toString(ints));

    }

}
