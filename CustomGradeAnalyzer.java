import java.util.Scanner;

public class CustomGradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displaySeparator();
        System.out.println("Welcome to the Custom Grade Analyzer!");
        System.out.println("************************************");

        // Step 1: Input the number of subjects
        System.out.print("Enter the number of subjects you studied: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        System.out.println("\nEnter marks for each subject:");

        // Collect marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Step 2: Calculate and display results
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
        char grade = determineGrade(averagePercentage);

        printFinalResults(totalMarks, averagePercentage, grade);
        displaySeparator();
    }

    // Method to calculate average percentage
    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }

    // Method to determine grade based on average percentage
    private static char determineGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display final results
    private static void printFinalResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nFinal Results:");
        System.out.println("------------------------------");
        System.out.println("Total Marks:          " + totalMarks);
        System.out.println("Average Percentage:   " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Your Grade:           " + grade);
        System.out.println("------------------------------");
    }

    // Method to display a separator
    private static void displaySeparator() {
        System.out.println("************************************");
    }
}
