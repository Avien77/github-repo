package src;

import java.util.Scanner;

public class PasswordAssignment12 {
    public static void main(String[] args) {
    int counter=0;
    boolean ifLowerCase = false;
    boolean ifUpperCase = false;
    boolean ifNumber = false;
    boolean ifSpecial = false;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type in a password: ");
    String password = scanner.nextLine();
    
    for (int i = 0; i < password.length(); i++) {
        char ch = password.charAt(i);
        if (Character.isLowerCase(ch)) {
            ifLowerCase = true;     
        } else if (Character.isUpperCase(ch)) {
            ifUpperCase = true;
        } else if (Character.isDigit(ch)) {
            ifNumber = true;
        } else if (password.toString().matches("[^a-z A-Z0-9]")) { 
            ifSpecial = true;
        } 
         
    }
    if (ifLowerCase) {
        counter++;
    }
    if (ifUpperCase) {
        counter++;
    }
    if (ifNumber) {
        counter++;
    }
    if (ifSpecial) {
        counter++;
    }

    if (counter>=3){
        System.out.println("The password is safe");
    } else {
        System.out.println("The password is not safe");
    }
}
}