import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int maxValue;
        System.out.print("Please enter the maximum available number: ");
        maxValue = scanner.nextInt();
        int realNumber = random.nextInt(maxValue);
        System.out.println(realNumber);

        int attemptNumber;
        int counter = 1;
        System.out.print("The number created. Please try to enter a positive integer number between 1 and " + maxValue + " to guess it. \nAttempt 1 : ");

        do {
            counter++;
            attemptNumber = scanner.nextInt();
            if (attemptNumber > realNumber)
                System.out.print("Attempt " + counter + ". No, please enter number less then " + attemptNumber + " : ");
            else if (attemptNumber < realNumber)
                System.out.print("Attempt " + counter + ". No, please enter number more then " + attemptNumber + " : ");
        } while (attemptNumber != realNumber);
        System.out.println("Yes! It is " + realNumber + "! The number of attempts is " + (counter-1) + ". ");
    }
}
