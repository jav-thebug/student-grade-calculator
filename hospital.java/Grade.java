import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();

        int total = 0;

        // This loop runs once for every subject
        for (int i = 1; i <= subjects; i++) {
            int marks;

            // Keep asking until the marks are between 0 and 100
            do {
                System.out.print("Enter marks for subject " + i + " (out of 100): ");
                marks = input.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks. Please enter a number from 0 to 100.");
                }
            } while (marks < 0 || marks > 100);

            total = total + marks;
        }

        // Every subject is out of 100, so average marks = average percentage
        double percentage = (double) total / subjects;
        int maxMarks = subjects * 100;

        // Find the grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Show the result
        System.out.println();
        System.out.println("===== Result =====");
        System.out.println("Student name : " + name);
        System.out.println("Subjects     : " + subjects);
        System.out.println("Total marks  : " + total + " / " + maxMarks);
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("Grade        : " + grade);

        if (grade.equals("F")) {
            System.out.println("Status       : Fail");
        } else {
            System.out.println("Status       : Pass");
        }

        input.close();
    }
}