/*
Programmer: Moosa
Date: 30th April 2024
Desription: Making a java arcade game with 2 games
 */
package thejavaarcade;

import java.util.Scanner;

public class TheJavaArcade 
{

    public static void main(String[] args) 
    {
        //creating scanner object
        Scanner scanN = new Scanner(System.in);
        //welcome msg
        System.out.println("Welcome to the MENSA'S Arcade!");
        
        //menu
        System.out.println("Which game would you like to play?");
        
        //intializing variable
        int userChoice;
        
        //start of do while loop
        do
        {
            //menu
            System.out.println("\nChoose one of the following:\n\t1."
                + " Guess My Number\n\t2. Rock Paper Scissors\n\t3. "
                + "Exit Program");
            //user input
            userChoice = scanN.nextInt();
            
            //start of if for menu
            if(userChoice == 1)
            {
                System.out.println("You chose to play \"Guess My number\"!");
                System.out.println("You will get 5 tries to guess a number"
                        + " between 1-50.");
                
                //initializing variables
                int ranNum = (int) (1+Math.random()*49);
                int tries;
                int guess;
                
                //start of for loop for GAME 1
                for (tries = 5; tries >= 1; tries--)
                {
                    System.out.println("You have " + tries + "/5 lives.");
                    guess = scanN.nextInt();
                    
                    //start of if for GAME 1
                    if(guess > 50 || guess <= 0)
                    {
                        System.out.println("Please pick a number from 1-50!");
                    }else if(guess > ranNum && guess < 51)
                    {
                        System.out.println("A little lower!");
                    }else if(guess < ranNum)
                    {
                        System.out.println("A little higher!");
                    }else if(guess == ranNum)
                    {
                        System.out.println("BRILLIANT!! You have guessed it correctly.");
                        break;
                    }//end of if for GAME 1
                    
                    
                }//end of for loop for GAME 1
            }else if(userChoice == 2)
            {
                //GAME 2 Instructions
                System.out.println("WELCOME TO ROCK, PAPER, SCISSORS");
                System.out.println("Your task is to beat me in a game of rock, paer, scissors.");
                System.out.println("You will be playing a best of 3.");
                System.out.println("Pick one: | 1. Rock | 2. Paper | 3. Scissors");
                //initializing variables
                int rps;
                int bot = (int) (1+Math.random()*3);
                
                //start of for loop for GAME 2
                for (rps = 0; rps < 3; rps++) 
                {
                    rps = scanN.nextInt();
                    
                    //statr of if for GAME 2
                    if(rps == bot)
                    {
                        System.out.println("It's a Tie!");
                    }else if(rps == 1 && bot == 2)
                    {
                        System.out.println("You LOSE!");
                    }else if(rps == 2 && bot == 1)
                    {
                        System.out.println("You WIN!");
                    }else if(rps == 1 && bot == 3)
                    {
                        System.out.println("You WIN!");
                    }else if(rps == 3 && rps == 1)
                    {
                        System.out.println("You LOSE!");
                    }else if(rps == 2 && bot == 3)
                    {
                        System.out.println("You LOSE!");
                    }else if(rps == 3 && bot ==2)
                    {
                        System.out.println("You WIN");
                    }else if(rps > 3)
                    {
                        System.out.println("Invalid Choice");
                    }else
                    {
                        System.out.println("GAME OVER!");
                    }//end of if for GAME 2
                }//end of for loops for GAME 2
                
                
            }else if(userChoice == 3)
            {
                System.out.println("*SUCCESSFULLY EXITED PROGRAM*");
                break;
            }else if(userChoice > 3)
            {
                System.out.println("Choose a number from the menu!");
                continue;
                
            }
            
            
        }while(userChoice != 3);
        
    }
    
}
