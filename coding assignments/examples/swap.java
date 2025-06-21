import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b =sc.nextInt();

        System.out.println("before swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp=a;
        a=b;
        b=temp;
 System.out.println("after swapping:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        
    }
}