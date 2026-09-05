// Name: Saim Ahmed
// Computing ID: sdf4jj@virginia.edu
// Homework Name: JavaIntro
// Resources used (if applicable): Java Programming Textbook

import java.util.*;
public class JavaIntro {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // hilo test #1
        System.out.println("Hilo method test: "+hilo(100,5));

        // Rpsls test #2
        System.out.print("\nInput for rpsls (String): ");
        String inputRpsls = sc.nextLine();
        System.out.println(rpsls(inputRpsls,"paper"));

        // fuzzbizz test #3
        System.out.print("\nInput for fuzzbizz program (integer): ");
        int inputFuzz = sc.nextInt();
        System.out.println(fuzzbizz(2,3,inputFuzz));

        // Count runs test #4
        int[] nums = {1,1,1,1,2,4,4,7,7,7,5};
        System.out.println("\n"+Arrays.toString(nums));
        System.out.println(countRuns(nums));
    }


    // 1. Create a random number generator that fixes the bounds per guess
    public static int hilo(int max, int target){
        Random rand = new Random();
        int min =1;
        int hit=min + rand.nextInt(max+1 - min);
        int guesses = 1;

        System.out.println("Guess " +guesses+": "+hit);
        while (hit!=target) {
            if (hit < target) min = hit+1;
            else if (hit > target) max = hit-1;
            hit=min + rand.nextInt(max+1 - min);
            guesses++;
            System.out.println("Guess " +guesses+": "+hit);
        }
        return guesses;
    }

    // 2. Rock paper scissors lizard spock
    public static int rpsls (String userChoice, String computerChoice){
        String battle = userChoice.toUpperCase() +" " +computerChoice.toUpperCase();

        return switch(battle){
            //Win cases for user, return 1
            case "ROCK SCISSORS", "ROCK LIZARD", "SPOCK SCISSORS",
                 "SPOCK ROCK", "PAPER SPOCK", "PAPER ROCK", "LIZARD PAPER",
                 "LIZARD SPOCK", "SCISSORS LIZARD", "SCISSORS PAPER" -> 1;

            //Lose cases for user, return 0
            case "ROCK SPOCK", "ROCK PAPER", "SPOCK PAPER", "SPOCK LIZARD",
                 "PAPER SCISSORS", "PAPER LIZARD", "LIZARD ROCK", "LIZARD SCISSORS",
                 "SCISSORS SPOCK", "SCISSORS ROCK" -> 0;

            //Tie cases, return -1
            case "ROCK ROCK", "PAPER PAPER", "SCISSORS SCISSORS",
                 "SPOCK SPOCK", "LIZARD LIZARD" -> -1;

            default -> -1;
        };

    }

    // 3. fuzzbizz program
    public static String fuzzbizz(int one, int two, int input){

        String output = "";

        // if input is divisible evenly by one (parameter)
        if (input % one ==0){
            output=output.concat("fuzz");
        }

        // if input is divisible evenly by one (parameter)
        if (input%two==0){
            output=output.concat("bizz");
        }

        // if input isn't divisble by either
        if (output.equals("")){
            output="none";
        }

        return output;
    }

    // 4. CountRuns
    public static int countRuns (int[] numbers){
        boolean runBool = false;
        int runs =0;

        // loops through index of array
        for (int i=0; i<numbers.length; i++){

            // ensures no index out of bound error
            if (i!=numbers.length-1) {

                // checks if current number is equal to next
                if (numbers[i]==numbers[i+1]){
                    runBool=true;
                }

                // if not
                else{
                    if (runBool){
                        runs++;
                        runBool=false;
                    }}
            }

            if (i==numbers.length-1){
                if (runBool){
                    runs++;
                    runBool=false;
                }}
        }

        return runs;
    }
}

