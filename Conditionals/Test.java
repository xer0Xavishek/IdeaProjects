import java.util.Scanner;
import java.math.BigInteger;

public class Test{
    public static void main(String[] args) {
        Scanner den= new Scanner(System.in);

        BigInteger a= den.nextBigInteger();
        BigInteger b= den.nextBigInteger();

        System.out.println("The sum of the two numbers is: " + a.add(b));
    }
}