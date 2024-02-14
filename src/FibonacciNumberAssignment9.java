package src;

public class FibonacciNumberAssignment9 {
    public static void main(String[] args){
    int firstArg = -1;
    if (args.length > 0) {
    try {
        firstArg = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
        System.err.println("Argument" + args[0] + " must be an integer.");
        System.exit(1);
    }
    }
    switch (firstArg) {
        case 0:
            System.out.println("0");
            break;
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("1");
            break;
        case 3:
            System.out.println("2");
            break;
        case 4:
            System.out.println("3");
            break;
        case 5:
            System.out.println("5");
            break;
        case 6:
            System.out.println("8");
            break;
        case 7:
            System.out.println("13");
            break;
        case 8:
            System.out.println("21");
            break;
        case 9:
            System.out.println("34");
            break;
        case 10:
            System.out.println("55");
            break;
        case 11:
            System.out.println("89");
            break;
        case 12:
            System.out.println("144");
            break;
        case 13:
            System.out.println("233");
            break;
        case 14:
            System.out.println("377");
            break;
        case 15:
            System.out.println("610");
            break;
        case 16:
            System.out.println("987");
            break;
        case 17:
            System.out.println("1597");
            break;
        case 18:
            System.out.println("2584");
            break;
        case 19:
            System.out.println("4181");
            break;
}
}
}