package AS1;

/**
 * Created by p on 10/9/2016.
 */
public class Multiples {

    private int startingPoint;
    private int finishPoint;
    private int firstNumberMultiples;
    private int secondNumberMultiples;


    public Multiples(int startingPoint, int finishPoint, int firstNumberMultiples, int secondNumberMultiples){
        this.startingPoint = startingPoint;
        this.finishPoint = finishPoint;
        this.firstNumberMultiples = firstNumberMultiples;
        this.secondNumberMultiples = secondNumberMultiples;
    }

    public void getMultiples(){

        System.out.println("\nMultiples: ");

        for(int i = startingPoint; i < finishPoint; i++){

            if(i % firstNumberMultiples == 0)
                System.out.printf("%d ",i);

            else if (i % secondNumberMultiples == 0)
                System.out.printf("%d ",i);

            i++;
        }
        System.out.print(".");
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
