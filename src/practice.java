
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //pushing new version
        //Program starts here
        //new version
        System.out.println("welcome:");
        System.out.println("enter the 1st number:");
        //first input from user
        Scanner number1 = new Scanner(System.in);
        int a = number1.nextInt();
        //second in input
        System.out.println("input 2nd number:");
        Scanner number2 = new Scanner(System.in);
        int b = number2.nextInt();
        //third input
        boolean rep = true;
        do {
            try {
                System.out.println("input the method example (plus as(+) or minus(-)):");
                Scanner method = new Scanner(System.in);
                String c = method.next();
                //my conditions for the inputs
                if (c.equals("%")) {
                    System.out.println("result of:" + " " + (a % b));
                    break;
                }
                if (c.equals("x")) {
                    System.out.println("result of:" + a + "x" + b + "=" + (a * b));
                    break;
                }
                if (c.equals("/")) {
                    System.out.println("result of:" + a + "/" + b + "=" + (a / b));
                    break;
                }
                if (c.equals("+")) {
                    System.out.println("result of:" + a + "+" + b + "=" + (a + b));
                    break;
                }
                if (c.equals("-")) {
                    System.out.println("the result of:" + a + "-" + b + "=" + (a - b));
                    break;
                } else {
                    System.out.println("invalid method identified");
                    System.out.println("please read this");
                    System.out.println("for multiplication use(x)");
                    System.out.println("for division use(/)");
                }
            } catch (ArithmeticException A){
                System.out.println("first value can not be / by 0");
                System.out.println("program Ends here re run");
                break;
            }
        }while (rep) ;
    }
}