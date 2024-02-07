package src;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BubbleSort {
public static void main (String[] args){
    System.out.println("Type in a number 1-4 to select which operation you want to do.");

Scanner sc = new Scanner(System.in);
int input = sc.nextInt();
switch (input) {
    case 1:
        System.out.println("Type in the length of an array");
        int input1 = sc.nextInt();
        createRandomArray(input1);
        break;
    case 2:
        System.out.print("Enter the length of array: ");  
        int length2=sc.nextInt();  
        int[] array2 = new int[length2];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<length2; i++) {     
            array2[i]=sc.nextInt();  
        }  
        System.out.println("What is the name of the file you want the array in?: ");
        sc.nextLine();
        String string2 = sc.nextLine();
        writeArrayToFile(array2,string2);
        break;
    case 3:
        System.out.println("Insert name of file you want to be read: ");
        sc.nextLine();
        String string3 = sc.nextLine();
        try {
            readFileToArray(string3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        break;
    case 4:
    System.out.print("Enter the length of array: ");  
        int length4=sc.nextInt();  
        int[] array4 = new int[length4];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<length4; i++) {     
            array4[i]=sc.nextInt();  
        }
        bubbleSort(array4);
        break;
    default:
        System.out.println("Type a valid response!");
        break;
}
}
    public static int[] createRandomArray(int arrayLength) {
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i=0; i>arrayLength; i++) {
            int temp = random.nextInt(101);
            array[i]=temp;
        }
        return array;
        
    }
    public static void writeArrayToFile(int[] array, String filename){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int value : array) {
                writer.write(Integer.toString(value));
                writer.newLine(); 
            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    
    public static int[] readFileToArray(String filename) throws IOException{
    Scanner input = null;
    int i=0;
    int array3[] = new int[100];
        try {
            input = new Scanner(new File(filename));
        } catch (Exception ex) {
            System.out.println("File does not exist");
        }
        while(input.hasNextInt()) {
            int number = input.nextInt();
            array3[i]=number;
            i++;
            System.out.println(number);
        }
        input.close();
        return array3;
        
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
   

    
}


