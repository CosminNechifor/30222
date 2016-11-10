package models.employees;

import models.animals.Animal;
import services.factories.Constants;

import java.math.BigDecimal;

/**
 * Created by p on 11/8/2016.
 */
public class Caretaker extends Employee implements Caretaker_I {
    private double workingHours;

    public Caretaker(double workingHours, String name, boolean dead, BigDecimal salary) {
        super(name, dead, salary);
        this.workingHours = workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    @Override
    public String takeCareOf(Animal animal) {
        if(animal.kill()){
            return Constants.Employee.Caretakers.TCO_KILLED;
        }
        if(this.workingHours < animal.getMaintenanceCost()){
            return Constants.Employee.Caretakers.TCO_NO_TIME;
        }

        animal.setTakenCareOf(true);
        this.workingHours = this.workingHours - animal.getMaintenanceCost();

        return Constants.Employee.Caretakers.TCO_SUCCESS;
    }
}
