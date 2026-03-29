import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.print("Rock, Paper, or Scissors: ");
        String userChoice = scanner.nextLine().trim();

        boolean isValid = false;
        for (String c : choices) {
            if (c.equals(userChoice)) {
                isValid = true;
                break;
            }
        }

        if (!isValid) {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            return;
        }

        String computerChoice = choices[random.nextInt(3)];
        System.out.print("Computer chose " + computerChoice + ". ");

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        } else if (
            (userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}
