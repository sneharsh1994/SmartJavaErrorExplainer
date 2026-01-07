
import java.util.Scanner;
import java.util.Random;
public class project {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playChoice;
        String computerChoice;
        String playAgain = "Yes";

        public project() {
            startGame();
        }

        public void startGame() {
            while (playAgain.equalsIgnoreCase("Yes")) {
                System.out.print("Enter rock, paper, or scissors: ");
                playChoice = scanner.nextLine().toLowerCase();

                computerChoice = choices[random.nextInt(choices.length)];
                System.out.println("Computer chose: " + computerChoice);

                if (playChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if (
                        (playChoice.equals("rock") && computerChoice.equals("scissors")) ||
                                (playChoice.equals("paper") && computerChoice.equals("rock")) ||
                                (playChoice.equals("scissors") && computerChoice.equals("paper"))
                ) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }

                System.out.print("Do you want to play again? (Yes/No): ");
                playAgain = scanner.nextLine();
            }

            System.out.println("Thanks for playing!");
        }


        public static void main(String[] args) {
            new project();
        }
    }
