package AS2;

/**
 * Created by p on 10/9/2016.
 */
public class Main {
    public static void main(String[] args){
        Fibonacci fibonacci = new Fibonacci(4000000);
        System.out.println("Result " + fibonacci.getSumEven());

    }
}
