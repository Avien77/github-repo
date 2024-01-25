package src;
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Type in a string to be reversed: ");
        String input= scanner.nextLine();
        
        for (int i = input.length() - 1; i >= 0; i--) {
            ch=input.charAt(i);
            System.out.print(ch);
            
        }
        
    }





    }