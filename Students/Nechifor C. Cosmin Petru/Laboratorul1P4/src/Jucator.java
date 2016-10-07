/**
 * Created by p on 10/3/2016.
 */
public class Jucator {

    private int number = 0;
    private String nume;

    public Jucator(String nume){
        this.nume = nume;
    }

    public int getNumber() {
        return number;
    }

    public String getNume() {
        return nume;
    }

    public void adaugaNumar(int nr){
        number = number + nr;
    }

    /*
    public String situatie(){
        if(number == 21)
            return nume + " a castigat";
        else if(number > 21)
            return nume + " a pierdut";
        else
            return nume + " are " + number + " puncte."
    }
    */
}
