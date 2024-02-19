package src;

import java.util.Arrays;

public class GenericsAssignment11 <T>{
public static <T extends Comparable<T>> void mergeSort (T[] arr, int left, int right) {
    if (right - left > 1) {
        int mid = (left + right) / 2;
        mergeSort (arr, left, mid);
        mergeSort (arr, mid, right);
        merge(arr, left, mid, right);
    }
}
public static <T extends Comparable<T>> void bubbleSort(T[] array){
    int n = array.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (array[j].compareTo(array[j+1]) > 0) {
                T temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
}   
    public static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) { 
    int n1 = mid - left;
    int n2 = right - mid;
    T[] leftArr = Arrays.copyOfRange(arr, left, mid);
    T[] rightArr = Arrays.copyOfRange(arr, mid, right);
    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if (leftArr[i].compareTo(rightArr[j]) <= 0) {
            arr[k++] = leftArr[i++];
        } else {
            arr[k++] = rightArr[j++];
        }
    }
    while (i < n1) {
        arr[k++] = leftArr[i++];
    }
    while (j < n2) {
        arr[k++] = rightArr[j++];
    }
}
 
public static void main(String[] args) throws Exception {
    Integer[] arr = {5,3,7,2,1,6,0,9,8,4};
    mergeSort(arr, 0, 10);
    System.out.println("Merge Sorted Integer Array: " + Arrays.toString(arr));
    bubbleSort(arr);
    System.out.println("Bubble Sorted Integer Array: " + Arrays.toString(arr));
    Double[] Doublearr = {5.2,3.5,7.6,2.2,1.1,6.6,0.0,9.5,8.4,4.3};
    mergeSort(Doublearr, 0, 10);
    System.out.println("Merge Sorted Double Array: " + Arrays.toString(Doublearr));
    bubbleSort(Doublearr);
    System.out.println("Bubble Sorted Double Array: " + Arrays.toString(Doublearr));
    }
}

