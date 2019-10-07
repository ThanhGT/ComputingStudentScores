package class62exerciseproblem1v2;

import java.util.Scanner;

/**
 * Program: Class 6-2 Exercise Problem 1 Version 1
 * Average score computation using do-while loop
 * Date:October 15, 2018
 * @author Muhammad Shafique
 */
public class Class62ExerciseProblem1V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pre-loop
        int numberOfStudents = 0; // Count the number of students in the class
        double score = 0.0; // Score of each student
        double sumOfScores = 0.0; // sum of scores
        double averageScore = 0.0; // average of scores
        // create a Scanner object and get a score
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter score of a student");
        score = s.nextDouble();
        
        // Compute sume of scores, count the students
        // ask for a score to continue
        do { 
            // Compute sum of scores
            sumOfScores = sumOfScores + score;
            // Count the students
            numberOfStudents++;
            
            // Get next score to continue
            System.out.println("Please enter score of a student");
            score = s.nextDouble();
        } while (score != -1);
        
        // compute average
        averageScore = sumOfScores / numberOfStudents;
        
        //. display the results
        System.out.printf("Number of scores: %7d%n", numberOfStudents);
        System.out.printf("Sum of scores = %10.2f\n", sumOfScores);
        System.out.printf("Average of scores = %10.2f\n", averageScore);
        
        // Terminate the program
        System.out.println("Thank you for using the program.");
    }
    
}
