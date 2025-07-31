public import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the student:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter score of " + names[i] + ": ");
            scores[i] = sc.nextInt();
            sc.nextLine();
        }

        int total = 0;
        int highest = scores[0];
        int lowest = scores[0];
        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 0; i < n; i++) {
            total += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
                highestIndex = i;
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
                lowestIndex = i;
            }
        }

        double average = (double) total / n;

        System.out.println("\nStudent Grade Summary");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + scores[i]);
        }

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + names[highestIndex] + " (" + highest + ")");
        System.out.println("Lowest Score: " + names[lowestIndex] + " (" + lowest + ")");
    }
}
 
