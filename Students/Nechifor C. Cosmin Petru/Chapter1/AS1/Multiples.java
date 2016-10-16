package AS1;

/**
 * Created by p on 10/9/2016.
 */
public class Multiples {

    private int startingPoint;
    private int finishPoint;
    private int firstNumberMultiples;
    private int secondNumberMultiples;
    private int sumMultiples;


    public Multiples(int startingPoint, int finishPoint, int firstNumberMultiples, int secondNumberMultiples){
        this.startingPoint = startingPoint;
        this.finishPoint = finishPoint;
        this.firstNumberMultiples = firstNumberMultiples;
        this.secondNumberMultiples = secondNumberMultiples;
    }

    public void printMultiples(){

        System.out.println("\nMultiples: ");
        sumMultiples = 0;
        for(int i = startingPoint; i < finishPoint; i++){

            if(i % firstNumberMultiples == 0){
                System.out.printf("%d ",i);
                sumMultiples += i;
            }


            else if (i % secondNumberMultiples == 0){
                System.out.printf("%d ",i);
                sumMultiples += i;
            }

        }
        System.out.print(".");
    }

    public int mulptiplesSum{
        return sumMultiples;
    }

    public void setFinishPoint(int finishPoint) {
        this.finishPoint = finishPoint;
    }

    public void setFirstNumberMultiples(int firstNumberMultiples) {
        this.firstNumberMultiples = firstNumberMultiples;
    }

    public void setSecondNumberMultiples(int secondNumberMultiples) {
        this.secondNumberMultiples = secondNumberMultiples;
    }

    public void setStartingPoint(int startingPoint) {
        this.startingPoint = startingPoint;
    }

    public int getFinishPoint() {
        return finishPoint;
    }

    public int getFirstNumberMultiples() {
        return firstNumberMultiples;
    }

    public int getSecondNumberMultiples() {
        return secondNumberMultiples;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

}
