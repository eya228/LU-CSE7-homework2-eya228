//Eyob Abate, eya228@lehigh.edu
//CSE 7 lab5
import java.util.Scanner;

class DataCheck {
    public static void main(String[] args) {

        // Create a new Scanner object to read user input
        Scanner myScanner = new Scanner(System.in);

        // Initialize courseNumber to 0 and loop until a valid input is provided
        int courseNumber = 0;
        while(courseNumber == 0) {  // Loop until a valid course number is entered
            System.out.print("Input the course number: ");
            if (myScanner.hasNextInt()) {  // Check if input is an integer
                courseNumber = myScanner.nextInt();  // Store the valid integer input
            } else {
                // If input is not an integer, discard it and show an error message
                String junkWord = "" + myScanner.next();  // Clear the invalid input
                System.out.println("ERROR! You need to input an integer!");  // Print error message
            }
        }

        // Initialize departmentName to an empty string and loop until valid input is provided
        String departmentName = "";
        while(departmentName.equals("")) {  // Loop until a valid department name is entered
            System.out.print("Input the department name: ");
            if (myScanner.hasNextInt()) {  // If input is an integer, it's invalid
                String junkWord = "" + myScanner.next();  // Clear invalid input
                System.out.println("ERROR! You need to input a String!");  // Print error message
            } else if (myScanner.hasNextDouble()) {  // If input is a decimal number, it's also invalid
                String junkWord = "" + myScanner.next();  // Clear invalid input
                System.out.println("ERROR! You need to input a String!");  // Print error message
            } else {
                departmentName = myScanner.next();  // If input is valid, store it
            }
        }

        // Initialize numberoftimesmetinaweek to 0 and loop until valid input is provided
        int numberoftimesmetinaweek = 0;
        while(numberoftimesmetinaweek == 0) {  // Loop until a valid number is entered
            System.out.print("Input the number of times met in a week: ");
            if (myScanner.hasNextInt()) {  // Check if input is an integer
                numberoftimesmetinaweek = myScanner.nextInt();  // Store the valid input
            } else {
                String junkWord = "" + myScanner.next();  // Clear invalid input
                System.out.println("ERROR! You need to input an integer!");  // Print error message
            }
        }

        // Initialize timetheclassstarts to 0 and loop until valid input is provided
        int timetheclassstarts = 0;
        while(timetheclassstarts == 0) {  // Loop until valid class start time is entered
            System.out.print("Input the time the class starts: ");
            if (myScanner.hasNextInt()) {  // Check if input is an integer
                timetheclassstarts = myScanner.nextInt();  // Store the valid input
            } else {
                String junkWord = "" + myScanner.next();  // Clear invalid input
                System.out.println("ERROR! You need to input an integer!");  // Print error message
            }
        }

        // Initialize instructorname to an empty string and loop until valid input is provided
        String instructorname = "";
        while(instructorname.equals("")) {  // Loop until a valid instructor name is entered
            System.out.print("Input the instructor name: ");
            if (myScanner.hasNextInt()) {  // If input is an integer, it's invalid
                String junkWord = "" + myScanner.next();  // Clear invalid input
                System.out.println("ERROR! You need to input a String!");  // Print error message
            } else if (myScanner.hasNextDouble()) {  // If input is a decimal number, it's also invalid
                String junkWord = "" + myScanner.next();  // Clear invalid input
                System.out.println("ERROR! You need to input a String!");  // Print error message
            } else {
                instructorname = myScanner.next();  // If input is valid, store it
            }
        }

        // Initialize numberofstudents to 0 and loop until valid input is provided
        int numberofstudents = 0;
        while(numberofstudents == 0) {  // Loop until a valid number of students is entered
            System.out.print("Input the number of students: ");
            if (myScanner.hasNextInt()) {  // Check if input is an integer
                numberofstudents = myScanner.nextInt();  // Store the valid input
            } else {
                String junkWord = "" + myScanner.next();  // Clear invalid input
                System.out.println("ERROR! You need to input an integer!");  // Print error message
            }
        }
    }
}
