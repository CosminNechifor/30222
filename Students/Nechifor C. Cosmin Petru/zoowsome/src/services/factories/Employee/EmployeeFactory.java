package services.factories.Employee;

import models.employees.Employee;

/**
 * Created by p on 11/9/2016.
 */
public abstract class EmployeeFactory {
    public abstract Employee getEmployee(String type) throws Exception;
}
