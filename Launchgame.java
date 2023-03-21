package Strings;
import java.util.*;
class Guesser
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number");
        guessNum= scan.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;
    int guessingNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        guessNum= scan.nextInt();
        return guessNum;
    }
}
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
        void collectNumFromGuesser()
    {
        Guesser n=new Guesser();
        numFromGuesser= g.guessingNumber();
    }
        void collectNumFromPlayers()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }
        void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            System.out.println("Player1 Won the game");
        }
        else if (numFromGuesser==numFromPlayer2)
        {
           System.out.println("Player2 won the game");
        }
        else if (numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player3 Won the game");
        }
        else
        {
            System.out.println("Sorry! Lose the game");
        }

    }
}
public class Launchgame {
    public static void main(String []args){
            System.out.println("Game Started");
            Umpire u=new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers();
            u.compare();

    }
}
