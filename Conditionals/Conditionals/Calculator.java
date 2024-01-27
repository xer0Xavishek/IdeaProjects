package Conditionals;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner den= new Scanner(System.in);

        while(true){
            System.out.println("Enter Operator : * / + - ");
            char op=den.next().trim().charAt(0);



            if (op == '+'|| op== '-' || op== '*' || op== '/' | op== '%'){
                System.out.println("Enter The First Number: ");
                int a= den.nextInt();
                System.out.println("Enter the second number: ");
                int b= den.nextInt();


                // if operator is valid then only perform one of these operations


                if(op=='+'){
                    System.out.println("The sum of the two number is");
                    System.out.println(a+b);
                }
                else if(op=='-'){
                    System.out.println("The difference of the two number is");
                    System.out.println(a-b);
                }
                else if(op=='*'){
                    System.out.println("The product of the two number is");
                    System.out.println(a*b);
                }
                else if(op=='/'){
                    System.out.println("The division of the two number is");
                    System.out.println(a/b);
                }
                else if (op == '%') {
                    System.out.println("The remainder of the two number is");
                    System.out.println(a % b);
                }

                else {
                    System.out.println("Invalid Operator");
                }
            }



            // if you press x or X then the program will stop


            // this is inside the while loop.

            if (op == 'x' | op == 'X') {
                break;
            }
        } // closing brace for the while loop
    }
}
