import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        // Declare and initialize variables
        int number = 0;
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int total = 0;
        Scanner stdin = new Scanner(System.in);
        
        // Step 2: Prompt the user to read a number
        System.out.println("Enter integers (0 to stop):");
        
        // Step 3: Start the while loop
        while (true) {
            // Read input
            number = stdin.nextInt();
            
            // Step 3.1: Continue the loop until number equals 0
            if (number == 0) {
                break;
            }
            
            // Step 3.2: Count positive and negative numbers
            if (number > 0) {
                numberOfPositives++;
            } else if (number < 0) {
                numberOfNegatives++;
            }
            
            // Step 3.3: Add number to total
            total += number;
        }
// Step 4: Display results
        if (numberOfPositives + numberOfNegatives == 0) {
            // No numbers entered except 0
            System.out.println("No numbers are entered except 0.");
        } else {
            // Display the count of positives, negatives, the total, and the average
            double average = 1.0 * total / (numberOfPositives + numberOfNegatives);
            System.out.println("Number of positives: " + numberOfPositives);
            System.out.println("Number of negatives: " + numberOfNegatives);
            System.out.println("Total: " + total);  // Print the total sum
            System.out.println("Average: " + average);
        }
// Close the scanner
        stdin.close();
    }
}
