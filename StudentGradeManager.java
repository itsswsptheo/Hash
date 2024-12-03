import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeManager {
    
    // HashMap to store student names and their respective grades
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the studentGrades HashMap
    public StudentGradeManager() {
        studentGrades = new HashMap<>();
    }

    // Method to add a student and their grade
    public void addStudentGrade(String studentName, int grade) {
        studentGrades.put(studentName, grade);
        System.out.println("Grade added for " + studentName + "!");
    }

    // Method to display a student's grade
    public void displayGrade(String studentName) {
        if (studentGrades.containsKey(studentName)) {
            System.out.println(studentName + "'s grade: " + studentGrades.get(studentName));
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to remove a student's grade
    public void removeStudentGrade(String studentName) {
        if (studentGrades.containsKey(studentName)) {
            studentGrades.remove(studentName);
            System.out.println("Grade removed for " + studentName + ".");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeManager manager = new StudentGradeManager();

        while (true) {
            // Menu
            System.out.println("\nStudent Grade Management System:");
            System.out.println("1. Add Student Grade");
            System.out.println("2. Display Student Grade");
            System.out.println("3. Remove Student Grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentNameToAdd = scanner.nextLine();
                    System.out.print("Enter grade for " + studentNameToAdd + ": ");
                    int gradeToAdd = scanner.nextInt();
                    manager.addStudentGrade(studentNameToAdd, gradeToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to display grade: ");
                    String studentNameToDisplay = scanner.nextLine();
                    manager.displayGrade(studentNameToDisplay);
                    break;
                case 3:
                    System.out.print("Enter student name to remove grade: ");
                    String studentNameToRemove = scanner.nextLine();
                    manager.removeStudentGrade(studentNameToRemove);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
