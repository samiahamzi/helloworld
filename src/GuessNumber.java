import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) {

        int usersGuessAmount = 0;
        int guess = -1;
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10)+1;





        System.out.println("Indtast et nummer mellem 1-10: ");
        Scanner input = new Scanner(System.in);
        while (!(guess == numberToGuess)) {
             guess =  input.nextInt();
             usersGuessAmount++;
             if(guess < numberToGuess){
                 System.out.println("Forkert. Nummeret er større, prøv igen");
            }else if (guess > numberToGuess){
                 System.out.println("Forkert. Nummeret er mindre, prøv igen");
             } else {
                System.out.println("Korrekt! Du gættede rigtigt. Det rigtige nummer var " + numberToGuess);
                 System.out.println("Du har gættet " + usersGuessAmount + " antal gange!");
            }






        }

    }
}
