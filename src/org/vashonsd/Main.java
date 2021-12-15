package org.vashonsd;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String user;
        String computerPlay = "";
        int computerInt;
        String response;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Lets play rock paper scissors! R = rock, P = paper, S = scissors.");


        computerInt = generator.nextInt(3)+1;

        if (computerInt == 1) {
            computerPlay = "R";
        } else if (computerInt == 3) {
            computerPlay = "P";
        } else{
            computerPlay = "S";
        }
        System.out.println("Enter your move: ");
        String userMove = scan.nextLine();
        userMove = userMove.toUpperCase();

        System.out.println("Computer plays: " + computerPlay);


            if (userMove.equals(computerPlay))
                System.out.println("It's a tie!");
            else if (userMove.equals("R"))
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors. You win!!");
                else if (computerPlay.equals("P"))
                    System.out.println("Paper beats rock. You lose!!");
                else if (userMove.equals("P"))
                    if (computerPlay.equals("S"))
                        System.out.println("Scissor cuts paper. You lose!!");
                    else if (computerPlay.equals("R"))
                        System.out.println("Paper beats rock. You win!!");
                    else if (userMove.equals("S"))
                        if (computerPlay.equals("P"))
                            System.out.println("Scissor cuts paper. You win!!");
                        else if (computerPlay.equals("R"))
                            System.out.println("Rock breaks scissors. You lose!!");
                        else
                            System.out.println("Invalid user input.");
        }
    }



