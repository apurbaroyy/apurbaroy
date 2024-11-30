import java.util.Scanner;

public class CGPACalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Student ID
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        // Input number of courses
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        // Process each course
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Enter details for Course C" + i + ":");

            // Input course credit
            System.out.print("Credit (Max 3): ");
            int credit = scanner.nextInt();

            // Input Continuous Assessment Test (CT) marks
            System.out.print("CT Marks (Max 30): ");
            int ctMarks = scanner.nextInt();

            // Input Assignment Test (AT) marks
            System.out.print("AT Marks (Max 10): ");
            int atMarks = scanner.nextInt();

            // Input Final Exam (FE) marks
            System.out.print("FE Marks (Max 60): ");
            int feMarks = scanner.nextInt();

            // Total marks for the course
            int totalMarks = ctMarks + atMarks + feMarks;

            // Calculate grade point based on total marks
            double gradePoint;
            if (totalMarks >= 90) {
                gradePoint = 10;
            } else if (totalMarks >= 80) {
                gradePoint = 9;
            } else if (totalMarks >= 70) {
                gradePoint = 8;
            } else if (totalMarks >= 60) {
                gradePoint = 7;
            } else if (totalMarks >= 50) {
                gradePoint = 6;
            } else {
                gradePoint = 0; // Fail
            }

            // Accumulate total credits and weighted grade points
            totalCredits += credit;
            totalGradePoints += gradePoint * credit;
        }

        // Calculate CGPA
        double cgpa = totalGradePoints / totalCredits;

        // Output results
        System.out.println("\n--- Student Result ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.printf("CGPA: %.2f\n", cgpa);

        scanner.close();
    }
}
