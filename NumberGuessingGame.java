package NumberGuessing;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int randomNumber = rand.nextInt(100)+1;
     System.out.println("random Number is " +  randomNumber);
    int tryCount = 0;
    while(true){
        System.out.println("Enter your guess(1-100):");
    
        int playerGuess = sc.nextInt();
        tryCount++;
        if(playerGuess == randomNumber){
            System.out.println("Correct! You Win!");
            System.out.println("It took you" + tryCount + "tries");
            break;
        }else if(randomNumber >playerGuess){
            System.out.println("Nope! The number is higher.Gusess Again!");
        }else{
            System.out.println("Nope! The number is lower.Gusess Again!");
        }
    }
}

}
