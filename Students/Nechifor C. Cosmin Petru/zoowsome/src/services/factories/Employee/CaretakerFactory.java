package services.factories.Employee;

import models.employees.Caretaker;
import models.employees.Employee;
import services.factories.Constants;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by p on 11/9/2016.
 */
public class CaretakerFactory extends EmployeeFactory {
    Random random = new Random();

    public Employee getEmployee(String type) throws Exception {
        int i = random.nextInt(Constants.Employee.NAME.length);
        BigDecimal salary = new BigDecimal((random.nextInt(10)+1) * Constants.numbers.ONETHOUSAND);
        if(Constants.Employee.CARETAKER.equals(type)){
            return new Caretaker(40, Constants.Employee.NAME[i], false, salary);
        }
        else{
            throw new Exception("Invalid Employee exception!");
        }
    }
}
