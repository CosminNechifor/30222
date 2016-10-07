import java.util.Scanner;
/**
 * Created by p on 10/3/2016.
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        boolean prim;

        System.out.println("Introduceti numarul ca sa vedeti daca e prim:");

        number = input.nextInt();
        prim = testPrime(number);

        if(prim == true)
            System.out.println("Numarul este prim.");

        else
            System.out.println("Numarul nu este prim.");


    }

    public static boolean testPrime(int nr ){

        for(int i=2; i < Math.sqrt(nr);i++){
            if( nr % i == 0)
                return false;
        }

        return true;
    }
}
