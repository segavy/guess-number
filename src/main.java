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

        int attemptNumber = 0;
        int counter = 1;
        System.out.print("The number created. Please try to enter the positive integer number between 1 and " + maxValue + " to guess it : ");
        while (attemptNumber != realNumber) {
            counter++;
            attemptNumber = scanner.nextInt();
            if (attemptNumber == realNumber) {
                System.out.println("Yes! It is " + realNumber + ". The number of attempts is " + counter + ". ");
                break;
            } else {
                if (attemptNumber > realNumber) System.out.print(counter + ". Please enter number less then " + attemptNumber + " : ");
                else System.out.print(counter + ". Please enter number more then " + attemptNumber + " : ");
            }
        }

    }

    public void enterNumber() {

    }
}
