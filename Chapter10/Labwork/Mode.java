package Chapter10.Labwork;


/**
 * Finds the mode of a list of numbers
 *
 * @aj
 * @10.3
 */

import java.io.*;
import java.util.Scanner;

public class Mode
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        double[] inputs = new double[10];
        double[] unique = new double[10];
        int[] occur = new int[10];
        int count = 0;
        
        // Takes in inputs
        while (count < inputs.length){
            count++;
            System.out.println("Enter number #" + count + ":");
            double number = reader.nextDouble();
            inputs[count-1] = number;
        }
        
        // Checks if there are any duplicates
        for (double value : inputs){
            int dupCount = 0;
            boolean duplicate = false;
            for (double value2 : inputs){
                if (value == value2){
                    duplicate = true;
                    dupCount++;
                }
            }
            
            if (!duplicate){
                
            }
        }
    }
    
    static double Mode(double[] d){
        double mode = 0;
        
        return mode;
    }
}
