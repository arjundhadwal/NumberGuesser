
public class NumberGuesser{
    //fields
    private int secretNumber;

    //constructors
    public NumberGuesser(){
        secretNumber = (int)(Math.random()*10)+1;
        //System.out.println("DEBUG: "+secretNumber);
    }

    //methods
    public void startNewGame(){
        secretNumber = (int)(Math.random()*10)+1;
        //System.out.println("DEBUG: "+secretNumber);
    }
    /**
     * secret number guessing method
     * @param value the value that one guesses
     * @return 1 if guess is too high, 0 if it is spot on, and -1 if it is too low
     */
    public int guessValue(int value){
        if (value > secretNumber){
            return 1;
        } else if (value == secretNumber){
            return 0;
        } else {
            return -1;
        }
    }

    public int revealAnswer(){
        return secretNumber;
    }
}