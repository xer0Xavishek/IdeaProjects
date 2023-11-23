import java.time.temporal.ChronoField;
//import java.util.Scanner;
//public class IO {
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        int initialization=0;
//        int sum = 0;
//        while (initialization<=5){
//            System.out.print("Enter a number: ");
//            int x = keyboard.nextInt();
//            sum+=x;
//            initialization++;
//        }
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        int sum = 0;
//
//        for (int i = 0; i <= 5; i++) {
//            System.out.print("Enter a number: ");
//            int x = keyboard.nextInt();
//            sum += x;
//        }
//
//        System.out.println(sum);
//    }
//}
import java.util.Scanner;
public class IO{
    public static void main(String[] args) {//ok
        Scanner sc=new Scanner(System.in);//ok
        String x=sc.next();//ok
        char newL = x.trim().charAt(0);//ok
        System.out.println(newL);//ok
        if (newL>='a' && newL <= 'z'){
            System.out.println("lowercase");

        }
        else if (newL<='Z' && newL>='A'){
            System.out.println("uppercase");

        }

    }
}

