import java.util.Scanner;

   class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
         int i = 2;
        boolean isPrime = true;

        while (i<num) {
            if (num % i==0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (num <= 1) {
            System.out.println(" is not a prime number.");
        } else if (isPrime) {
            System.out.println(" is a prime number.");
        } else {
            System.out.println( " is not a prime number.");
        }
        
    }
}

