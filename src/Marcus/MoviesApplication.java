package Marcus;

import java.util.Scanner;

public class MoviesApplication {

    private Scanner movieAppScanner;

    public MoviesApplication(){
        movieAppScanner = new Scanner(System.in);
    }

    public void runApp(){

        System.out.println(this.getMenu());
        this.menuChoice();
    }

    private String getMenu(){
        return "\nWhat would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - animated category movies\n" +
                "3 - drama category movies\n" +
                "4 - horror category movies\n" +
                "5 - sci/fi category movies\n";
    }

    private int menuChoice(){

        System.out.println("\nPlease enter a number from 0 - 5: ");

        int userChoice = movieAppScanner.nextInt();

        if(userChoice == 0){

            System.out.println("EXIT");

        }else if(userChoice == 1){

            System.out.println("VIEW ALL");
            System.out.println(this.movieFilter("all"));


        }else if(userChoice == 2){

            System.out.println("ANIMATED");
            System.out.println(this.movieFilter("animated"));


        }else if(userChoice == 3){

            System.out.println("DRAMA");
            System.out.println(this.movieFilter("drama"));


        }else if(userChoice == 4){

            System.out.println("HORROR");
            System.out.println(this.movieFilter("horror"));


        }else if(userChoice == 5){

            System.out.println("SCI-FI");
            System.out.println(this.movieFilter("scifi"));

        }
        movieAppScanner.nextLine();

        System.out.println("Would you like to choose again? (y/n)");
        String userContinue = movieAppScanner.next();

        if(userContinue.equalsIgnoreCase("y")){
            this.runApp();
        }else{
            System.out.println("\n\nGoodBye\nWe hoped you enjoyed your stay.");
        }

        return userChoice;

    }


    private String movieFilter(String category){
        String newMovie = "";

        Movie[] allMovies = MoviesArray.findAll();

        for(int i = 0; i < allMovies.length; i++){

            if(allMovies[i].getCategory() == category){

                newMovie += allMovies[i].getName() + "---" + allMovies[i].getCategory() + "\n";

            } else if(category == "all") {

                newMovie += allMovies[i].getName() + "---" + allMovies[i].getCategory() + "\n";
            }
        }
        return newMovie;
    }


    public static void main(String[] args) {

        MoviesApplication mA = new MoviesApplication();

        mA.runApp();


    }


}
