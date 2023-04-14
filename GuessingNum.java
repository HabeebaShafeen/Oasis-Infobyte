import java.util.Scanner;
import java.util.Random;
public class GuessingNum {
  public static void main(String[] args) {
    Random Rand_num= new Random();
    int correct_guess=Rand_num.nextInt(100);
    int turns=0;
    Scanner input=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You  have 10 turns!!!" );
    System.out.println("All The Best,Have Fun");
    
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      guess=input.nextInt();
      turns++;
    
    if(guess==correct_guess) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose! the correct answer was: "+correct_guess);
      return;
    }
    else if(guess<correct_guess){
      i++;
      System.out.println("Yor Guess is lower than the Right Guess!!! you have : "+(10-i) +" turns");
      
      
      
    }
    else if(guess>correct_guess) {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess! you have: "+(10-i)+"turns");
      
    }
    
    
  }
    System.out.println("Congratuations,You win");
    System.out.println("Then number was "+correct_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    
}
}