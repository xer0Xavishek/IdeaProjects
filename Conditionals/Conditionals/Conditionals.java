package Conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int count = 2; //because we already have 2 numbers
        Scanner input_DEN= new Scanner(System.in);
        int n= input_DEN.nextInt();

        while (count<=n){
            int temp = second; // we need the 2nd number to be stored in a temp variable because for the next iteration we need to add the 2nd number

            second = second + first;

            first = temp;
            count++;

        }
        System.out.println(first);


    }
}
