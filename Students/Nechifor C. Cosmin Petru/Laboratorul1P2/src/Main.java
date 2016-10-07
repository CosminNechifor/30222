import java.util.Scanner;

/**
 * Created by p on 10/3/2016.
 */
public class Main {
    public static void main(String[] args ){

        float firstNr, secondNr;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        firstNr = input.nextFloat();
        System.out.println("Enter the second number:");
        secondNr = input.nextFloat();

        System.out.println("Max: " + maxim(firstNr,secondNr));

    }

    public static float maxim(float firstNumber, float secondNumber){

        if(firstNumber >= secondNumber)
            return firstNumber;
        else
            return secondNumber;
    }

}
