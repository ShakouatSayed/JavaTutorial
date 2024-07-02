package PackageFive;
import java.util.Random;
import java.util.Scanner;

class gussing_game{
    public static boolean Gussing_Game(){
        Random ganerator = new Random();
        Scanner keybord = new Scanner(System.in);
        int answer = ganerator.nextInt(100)+1;
        int numguess = 1;
        int guess = 0;
        while(numguess <= 7 && guess != answer){
            System.out.println("Guess number: ");
            guess = keybord.nextInt();
            if(numguess < 7){
                if(guess < answer)
                    System.out.println("Higher: "+answer);
                else if(guess > answer)
                    System.out.println("Lower: "+answer);
                else{
                    System.out.println("You win.");
                    return true;
                } 
            }
            else{
                if(guess == answer){
                    System.out.println("You Win.");
                    return true;
                }else{
                    System.out.println("I win. The number was: "+ answer);
                    return false;
                }
            }
            numguess++;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner keybord = new Scanner(System.in);
        String  playAgain = "Y";
        int userWin = 0;
        int computerWin = 0;
        while (playAgain.compareToIgnoreCase("Y") == 0){
            if(Gussing_Game())
                userWin++;
            else 
                computerWin++;
            System.out.println("You went to paly another game? Y/N: ");
            playAgain = keybord.next();
        }
        System.out.println("Your final  score is : "+userWin+" Computer :"+computerWin);
    }
}