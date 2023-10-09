import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int Subjects = sc.nextInt();

        int total= 0;

        for (int j = 1; j <= Subjects; j++) {
            System.out.print("Enter marks obtained in subject " + j + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double avgPercentage = (double) total / (Subjects * 100) * 100;

        char grade;
        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
