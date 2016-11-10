package models.employees;

/**
 * Created by p on 11/9/2016.
 */
public class idEmployee {
    private static long number = 1_000_000_000_000l;
    public static long getAnId(){
        return number++;
    }
}
