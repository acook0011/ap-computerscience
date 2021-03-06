package Chapter7.Ch7Prog1;


/**
 * User thinks of the number and computer tries to guess it.
 *
 * @aj
 * @cs7.2
 */

import java.util.Scanner;
import java.util.Random;

public class GuessingGameV2
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();
        
        //Initializing Variables
        int guess = 0;
        int times = 1;
        int max = 100;
        int min = 0;
        int range = 100;
        
        System.out.println("Start thinking about a number! Don't tell me.");
        int answer = reader.nextInt();
        //Checks if in range
        while (answer > 100 || answer <= 0){
                    System.out.println("Not that I'm scanning your brain, but that's out of range.\nTry again:");
                    answer = reader.nextInt();
            }
        //First guess by computer
        guess = generator.nextInt(100) + 1;    
        while (guess != answer){
            //When guess is higher than answer
            if (guess > answer){
                System.out.println("Is it " + guess + "? Oh, my guess is too high.");
                max = guess - 1;
                range = max - min;
                times++;
                guess = generator.nextInt(range) + min + 1;
            }
            //When guess is lower than answer
            if (guess < answer){
                System.out.println("Is it " + guess + "? Oh, my guess is too low.");
                min = guess;
                range = max - min;
                times++;
                guess = generator.nextInt(range) + min + 1;
            }
        }
        System.out.println("Is it " + guess + "?");
        System.out.println("Wow! I guessed your number in " + times + " tries!");
   }
}
