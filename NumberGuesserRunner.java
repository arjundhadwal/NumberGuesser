import java.util.*;
public class NumberGuesserRunner {

    public static final int NUMGUESSES = 3;
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number Guesser game! You have "+NUMGUESSES+" attempts to guess a number between 1 and 10 (inclusive)");
        while(true){
            playRound(input);
            System.out.println("Play another round? (y/n)");
            if(input.next().equals("n")){
                break;
            }
        }
    }

    public static void playRound(Scanner input){
            NumberGuesser ng = new NumberGuesser();
            //loops and output
            for(int i = 1; i <=NUMGUESSES; i++){
                //ask for a guess
                System.out.print("Enter a guess (integer): ");
                int myGuess = input.nextInt(); //taking an input for player's guess
                int result = ng.guessValue(myGuess);
                if(result == 1){ //checking the results of a guess
                    System.out.println("Too high!");
                } else if (result == 0){
                    System.out.println("You got it right! The value was "+ng.revealAnswer());
                    return;
                } else {
                    System.out.println("Too low!");
                }
            }
            System.out.println("You failed! The number was "+ng.revealAnswer()); //after the loop if no successful guesses are made, break
        }
    }
