package jacobcreator;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Driver {

        private static Scanner input;

        public static void main(String[] args) {
            input = new Scanner(System.in);
            System.out.println("> > Calculator (That only does positives!) < <\n");

            System.out.print("Choose an operation\n" +
                    "1. Multiply\n" +
                    "2. Divide\n" +
                    "3. Add\n" +
                    "4. Subtract\n\n" +
                    "Select an operation (1/2/3/4): ");

            int choice;

            try {
                choice = input.nextInt();
            } catch(InputMismatchException e){
                throw new InputMismatchException("AYE YO! This is INCORRECT! Please put one of the answers choices! (1/2/3/4)!");
            }
            if(choice < 1){
                throw new NumberFormatException("What the heck. We need a Positive number! Why're you going backwards??? Valid numbers are (1/2/3/4)!");
            }
            if(choice > 4){
                throw new InputMismatchException("AYE YO! This is INCORRECT! Please put one of the answers choices! (1/2/3/4)!");
            }

            switch(choice) {
                case 1: {
                    double[] numbers = getInput();
                    System.out.println(numbers[0] + " * " + numbers[1] + " = " + multiply(numbers[0], numbers[1]));
                    break;
                }
                case 2: {
                    double[] numbers = getInput();
                    System.out.println(numbers[0] + " / " + numbers[1] + " = " + divide(numbers[0], numbers[1]));
                    break;
                }
                case 3: {
                    double[] numbers = getInput();
                    System.out.println(numbers[0] + " + " + numbers[1] + " = " + add(numbers[0], numbers[1]));
                    break;
                }
                case 4: {
                    double[] numbers = getInput();
                    System.out.println(numbers[0] + " - " + numbers[1] + " = " + subtract(numbers[0], numbers[1]));
                    break;
                }
            }
        }

        private static double[] getInput() {
            double[] array = new double[2];

            System.out.print("\nEnter number one: ");
            try {
            array[0] = input.nextDouble();
            } catch(Exception e){
                throw new InputMismatchException("AYE YO! This is INCORRECT! Please put a Positive number here.");
            } if(array[0] < 0){
                array[0] = array[0] * -1;
                System.out.println("Assuming you meant to put a Positive. I got you!");
            }
            System.out.print("\nEnter number two: ");
            try {
                array[1] = input.nextDouble();
            } catch(Exception e){
                throw new InputMismatchException("AYE YO! This is INCORRECT! Please put a Positive number here.");
            }if(array[1] < 0){
                array[1] = array[1] * -1;
                System.out.println("Assuming you meant to put a Positive. I got you!\n");
            }

            return array;


        }
        private static double multiply(double x, double y) {
            return x * y;
        }

        private static double divide(double x, double y) {
            if(y == 0) {
                throw new ArithmeticException("Divided by zero");
            } else {
                return x / y;
            }
        }

        private static double add(double x, double y) {
            return x + y;
        }

        private static double subtract(double x, double y) {
            return x - y;
        }

    }
