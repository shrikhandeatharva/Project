import java.util.*;
public class rockpaperscissor {
    public static void main(String[] args ) {
        System.out.println("Rock Paper Scissors GAME");
        System.out.println("1:rock   2:paper   3:scissor");
      Random hand = new Random();
      Scanner sc = new Scanner(System.in);
      int a,i,b;
      int win = 0,losses = 0;
      for(i=1;i<6;i++) 
      {
         a = 1+hand.nextInt(3);
         System.out.println("Round " + i);
         System.out.print("Enter any integer from  1,2,3 : ");
         b = sc.nextInt(4);
         System.out.println("Computer Chose : " +a);
         if(a==b)
         System.out.println("No Result");
         else if(a==1 && b==2 || a==2 && b==3 || a==3 && b==1)
         {
            System.out.println("Hurrah! You Won");
            win = win + 1;
           }
         else 
         {
         System.out.println("Hard Luck :( You Lose");
         losses = losses + 1;
         }
      }
      if(win>losses)
      System.out.println("MATCH FINAL RESULT : YOU WON!");
      else if(win==losses)
      System.out.println("MATCH FINAL RESULT : DRAW!");
      else
      System.out.println("MATCH FINAL RESULT : YOU LOSE!");
    }
}