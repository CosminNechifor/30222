import java.util.Random;
import java.util.Scanner;

/**
 * Created by p on 10/3/2016.
 */
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        Jucator jucator = new Jucator("Alex");
        Jucator dealer = new Jucator("Dealer-ul");

        int continua;
        int i;


        System.out.println("Jocul de 21 a inceput! Situatia initiala: ");
        System.out.println(jucator.getNume() + " are " + jucator.getNumber());
        System.out.println(dealer.getNume() + " are " + dealer.getNumber());



        while(true){

            i = rand.nextInt(11) + 1;
            jucator.adaugaNumar(i);
            i = rand.nextInt(11) + 1;
            dealer.adaugaNumar(i);

            if(jucator.getNumber() > 21) {
                System.out.println(jucator.getNume() + " a pierdut ");
                break;
            }
            else if(jucator.getNumber() == 21){
                System.out.println(jucator.getNume() + " a castigat.");
                break;
            }

            System.out.println(jucator.getNume() + " ai " + jucator.getNumber() + " puncte. Ce alegi HIT(1)/Stand(0)?");
            continua = input.nextInt();

            if(continua == 1)
                continue;

            else if( continua == 0){

                if(dealer.getNumber() > 21){
                    System.out.println(jucator.getNume() + " a castigat cu " + jucator.getNumber());
                    System.out.println(dealer.getNume() + " a pierdut pentru ca a depasit 21 cu " + (dealer.getNumber() - 21));
                    break;
                }

                else if(jucator.getNumber() > dealer.getNumber()){
                    System.out.println(jucator.getNume() + " a castigat cu " + jucator.getNumber());
                    System.out.println(dealer.getNume() + " a pierdut cu " + dealer.getNumber());
                    break;
                }

                else if(jucator.getNumber() < dealer.getNumber()){
                    System.out.println(dealer.getNume() + " a castigat cu " + dealer.getNumber());
                    System.out.println(jucator.getNume() + " a pierdut cu " + jucator.getNumber());
                    break;
                }
            }
        }

    }
}
