package AS1;

import java.util.Scanner;

/**
 * Created by p on 10/9/2016.
 */

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int finish;

        Multiples multiples = new Multiples(1,1000,3,5);
        multiples.printMultiples();

        System.out.println("");
        System.out.println("Enter a new finish point:");
        finish = input.nextInt();

        multiples.setFinishPoint(finish);
        multiples.printMultiples();
        System.out.println("Result:" + multiples.mulptiplesSum);




    }
}
