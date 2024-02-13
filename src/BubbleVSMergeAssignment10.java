package src;

import java.util.Arrays;
import java.util.Random;

public class BubbleVSMergeAssignment10 {
public static void mergeSort (int[] arr, int left, int right) {
    if (right - left > 1) {
        int mid = (left + right) / 2;
        mergeSort (arr, left, mid);
        mergeSort (arr, mid, right);
        merge(arr, left, mid, right);
    }
}
public static void bubbleSort(int[] array){
    int n = array.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
}            
    public static void merge(int[] arr, int left, int mid, int right) { 
        int[] leftArr = Arrays.copyOfRange (arr, left, mid);
        int[] rightArr = Arrays.copyOfRange (arr, mid, right);
        int i = 0, j = 0;
        for (int k = left; k < right; k++) { 
            if (i == leftArr.length) { 
                arr[k] = rightArr[j++];
            }else if (j==rightArr.length) {
                arr[k] = leftArr[i++];
            } else if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i++];
            } else {
                arr[k] = rightArr[j++];
            }
        }
    }
public static void main(String[] args) throws Exception {
    int n = 10;
    int[] arr = new int[n];
    Random rand = new Random();
    for (int i = 0; i < n; i++) {
        arr[i] = rand.nextInt(100); 
    }
    long start = System.currentTimeMillis();
    mergeSort(arr, 0, 10);
    long end = System.currentTimeMillis();
    System.out.println("The time taken to complete the merge sort is " + (end-start) + " ms");
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < n; i++) {
        arr[i] = rand.nextInt(100); 
    }
    start = System.currentTimeMillis();
    bubbleSort(arr);
    end = System.currentTimeMillis();
    System.out.println("The time taken to complete the bubble sort is " + (end-start) + " ms");
    System.out.println(Arrays.toString(arr));
    }
}


