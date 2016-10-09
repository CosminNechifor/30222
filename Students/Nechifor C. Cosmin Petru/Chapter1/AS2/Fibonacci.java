package AS2;

/**
 * Created by p on 10/9/2016.
 */
public class Fibonacci {
    private long numberOne = 0;
    private long numberTwo = 1;
    private long thirdNumber;
    private long finishNumber;
    private long result;


    public Fibonacci(int finishNumber){
        this.finishNumber = finishNumber;
    }

    public long getSumEven(){
        if(finishNumber == 0){
            return numberOne;
        }

        for(int i = 1; i < finishNumber; i++){
            thirdNumber = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = thirdNumber;

            if(numberTwo % 2 == 0 ){
                result += numberTwo;
            }
        }
        return result;
    }
}
