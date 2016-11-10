package models.employees;

import java.math.BigDecimal;

/**
 * Created by p on 11/7/2016.
 */
public abstract class Employee {
    private String name;
    private long id;
    private BigDecimal salary;
    //I named this boolean variable dead because it's sounds better then isDead
    //I named the method isDead
    private boolean dead;


    public Employee(String name, boolean dead, BigDecimal salary) {
        setSalary(salary);
        setName(name);
        setDead(dead);
        setId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    private void setId() {
        this.id = idEmployee.getAnId();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
