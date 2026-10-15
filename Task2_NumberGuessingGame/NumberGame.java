import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); Random r = new Random();
        int number = r.nextInt(100)+1; int attempts=0;
        System.out.println("Guess number between 1-100 (5 attempts)");
        while(attempts<5){
            int guess = sc.nextInt(); attempts++;
            if(guess==number){ System.out.println("Correct! Score: "+(100-attempts*10)); return; }
            else if(guess<number) System.out.println("Too Low! Try again");
            else System.out.println("Too High! Try again");
        }
        System.out.println("Game Over! Number was: "+number);
    }
}
