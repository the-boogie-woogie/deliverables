package Marcus.Refactored_Code;

import java.util.Random;
import java.util.Scanner;


public class HighLow {


    ////////////// GAME RUNNING METHOD //////////////
    public static void gameFunctions(int random){

        int count = 0;

        ////////////// INTRODUCTION //////////////
        System.out.println("  WORLD FAMOUS JAVA\nHIGH/LOW GUESSING GAME");
        System.out.println("-----------------------");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("A random number between 0 and 100 has been chosen.\n\nTry to guess.");

        int userGuess = scanner.nextInt();


        //////// BOOLEAN TO CONTINUE GUESSING LOOP ////////
        boolean correctGuess = false;



        ////////// DO/WHILE LOOP WHILE GUESSING ///////////
        do{

            if(userGuess > random){

                if(userGuess > 100){

                    count++;

                    System.out.println("\nOutside the number range. Try again.");

                    userGuess = scanner.nextInt();

                }

                count++;

                System.out.println("\nToo HIGH. Try again.");

                userGuess = scanner.nextInt();

            }else if(userGuess < random){

                if(userGuess < 0){

                    count++;

                    System.out.println("\nOutside the number range. Try again.");

                    userGuess = scanner.nextInt();

                }

                count++;

                System.out.println("\nToo LOW. Try again.");

                userGuess = scanner.nextInt();

            }else if(userGuess == random){

                ////////////// INITIAL OUTRO //////////////
                count++;

                System.out.format("\nYour CORRECT!! The number was %s", random);

                System.out.format("\nIt took you %s guesses." , count);

                correctGuess = true;

            }

        }while(!correctGuess);

        ////////////// USER CONTINUE SECTION //////////////

        System.out.println("\n------------------------------------");

        System.out.println("Do you want to play again? (y/n)");

        String playAgain = scanner.next();

        if(playAgain.equals("y")){

            Random innerRand = new Random();

            int innerRandNum = innerRand.nextInt(100);

            System.out.println("\n\n\n");

            gameFunctions(innerRandNum);

        }else{

            ////////////// FINAL OUTRO //////////////

            System.out.println("\nWe hope you enjoyed your stay.");
            System.out.println("GoodBye");

        }


    }



    ////////////// MAIN METHOD RUNNING GAME //////////////

    public static void main(String[] args) {

        Random rand = new Random();

        int randNum = rand.nextInt(100);

        gameFunctions(randNum );



    }


}
