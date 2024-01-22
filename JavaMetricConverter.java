import java.util.Scanner;

public class JavaMetricConverter {
    public static void main(String[] args) {
        int integer;
        double result;
        int response;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the metric converter! Input 1 for kg to lbs. Input 2 for km to m. Input 3 for mm to in. Input 4 for grams to ounces. Input 5 to exit program.");
        while (response != 5) {
        
        response = scanner.nextInt();
        switch(response)
        {
            case 1:
            System.out.println("Input kg: ");
            integer = scanner.nextInt();
            result = (integer*2.20462);
            System.out.println(result);
            break;
            case 2:
            System.out.println("Input km: ");
            integer = scanner.nextInt();
            result = (integer*1000);
            System.out.println(result);
            break;
            case 3:
            System.out.println("Input mm: ");
            integer = scanner.nextInt();
            result = (integer*0.0393701);
            System.out.println(result);
            break;
            case 4:
            System.out.println("Input grams: ");
            integer = scanner.nextInt();
            result = (integer*0.0393701);
            System.out.println(result);
            break;
            case 5:
            System.out.println("Terminating system. ");
            default:
            System.out.println("Please input a valid response");
        }
        }
        java.util.Scanner.close()
    }
}