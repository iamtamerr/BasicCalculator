import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws Exception {
        int choice,num1,num2,result;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the choice\n" + 
                        "1)Sum\n" + 
                        "2)Extraction\n" +
                        "3)Multiplication\n" +
                        "4)Division\n"+
                        "Your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                result = num1+num2;
                System.out.println("Sum of two numbers: " + result);
                break;
            case 2:
                result = num1-num2;
                System.out.println("Extraction  of two numbers: " + result);
                break;
            case 3:
                result = num1*num2;
                System.out.println("Multiplication of two numbers: " + result);
                break;
            case 4:
                float res;
                float x=num1,y=num2;

                res = x/y;
                System.out.println("Division of two numbers: " + res);
                break;
            default:
                System.out.println("You entered an invalid number");
                break;
        }
        input.close();
    }
}
