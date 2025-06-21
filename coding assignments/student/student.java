import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[4];
        for (int i=0;i<4;i++) {
            System.out.println("Enter details for Student "+(i+1)+":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            String rollNo = scanner.nextLine();
            System.out.print("Mark 1: ");
            int mark1 = scanner.nextInt();
            System.out.print("Mark 2: ");
            int mark2 = scanner.nextInt();
            System.out.print("Mark 3: ");
            int mark3 = scanner.nextInt();
            scanner.nextLine(); 
            students[i] = new Student(name, rollNo, mark1, mark2, mark3);
        }
        Arrays.sort(students, Comparator.comparingInt(Student::getTotalMarks).reversed());
        System.out.println("\n--- Student Ranking by Total Marks ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Rank "+(i+1)+": "+students[i].name +"-"+students[i].totalMarks +"marks");
        }
    }
    static class Student {
        String name;
        String rollNo;
        int mark1, mark2, mark3;
        int totalMarks;
        Student(String name, String rollNo, int mark1, int mark2, int mark3) {
            this.name = name;
            this.rollNo = rollNo;
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
            this.totalMarks = mark1 + mark2 + mark3;
        }

        int getTotalMarks() {
            return totalMarks;
        }
    }
}