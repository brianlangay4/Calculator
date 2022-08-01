
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //program starts here
        System.out.println("welcome ");
        System.out.println("enter the 1st number:");
        //first input from user
        Scanner number1 = new Scanner(System.in);
        int a = number1.nextInt();
        //second in input
        System.out.println("input 2nd number:");
        Scanner number2 = new Scanner(System.in);
        int b = number2.nextInt();
        //third input
        System.out.println("input the method example (plus or minus):");
        Scanner method = new Scanner(System.in);
        String c = method.next();
        //my conditions for the inputs
        if (c.equals("%")){
            System.out.println("result of:"+" "+(a%b));
        }
        if (c.equals("x")){
            System.out.println("result of:"+a+"x"+b+"="+(a*b));
        }
        if (c.equals("/")){
            System.out.println("result of:"+a+"/"+b+"="+(a/b));
        }

        if (c.equals("+")){
            System.out.println("result of:"+a+"+"+b+"="+(a+b));
        }
        if (c.equals("-")){
            System.out.println("the result of:"+a+"-"+b+"="+(a-b));
        }

        }


    }

