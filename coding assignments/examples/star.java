import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        if (size%2==0) {
            System.out.println("not possible");
        }
        for (int i=0;i<size;i++) { 
            for (int j=0;j<size;j++) {
                if (i==j||i==(size - 1 - j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

    }
}