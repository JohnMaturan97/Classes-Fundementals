package academy.learnprogramming;

import java.util.Scanner;

class BubbleShortExample {
    public BubbleShortExample() {
    }

    public static void main(String []args) {

        //Declare the variables
        int number, i, z, temp;
        //create the scanner
        Scanner input = new Scanner(System.in);

        //prompt the user to put a integer number
        System.out.println("Enter Any Number Of Integers To Sort:");
        //store the num for calculations
        number = input.nextInt();

        // declare array
        int array[] = new int[number];

        //Promp the user to enter the required integers
        System.out.println("Enter " + number + " Integers: ");

        //create condition statement
        for (i = 0; i < number; i++)
            array[i] = input.nextInt();

        //create condition statement
        for (i = 0; i < ( number - 1 ); i++) {
            for (z = 0; z < number - i - 1; z++) {
                if (array[z] < array[z+1])
                {
                    temp = array[z];
                    array[z] = array[z+1];
                    array[z+1] = temp;
                }
            }
        }

        //print back to console
        System.out.println("The Sorted List Of Integers:");

        for (i = 0; i < number; i++)
            System.out.println(array[i]);
    }
}