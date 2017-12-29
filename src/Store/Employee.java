package Store;

import java.util.List;

public class Employee {

     String name,  Shift ,type;
     int Attendance , id ;
     double salary, bonus;

    public String getShift() {
        return Shift;
    }

    public Employee(String name, String Shift, String type, int Attendance, double salary, double bonus) {
        this.name = name;
        this.Shift = Shift;
        this.type = type;
        this.Attendance = Attendance;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setShift(String Shift) {
        this.Shift = Shift;
    }

    public int getAttendance() {
        return Attendance;
    }

    public void setAttendance(int Attendance) {
        this.Attendance = Attendance;
    }

    public Employee(String name, String Shift, String type, int Attendance, int id, double salary, double bonus) {
        this.name = name;
        this.Shift = Shift;
        this.type = type;
        this.Attendance = Attendance;
        this.id = id;
        
        this.bonus = BonusCalc(salary, Attendance);
        this.salary = salary + this.bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    

   static double BonusCalc(double salary, int attendance) {

        if (attendance >= 29) {
            return salary * (0.05);
        } else {
            return 0;
        }

    }
    Employee Clone()
    {
    return new Employee(name, Shift, type, Attendance, id, salary, bonus);
    
    }

}

class Manager extends Employee {

    private void stock_check(List<Product> p) {

    }

    private void stock_update() {

    }

  

    private void show_employee() {

    }

    public Manager(String name, String Shift, String type, int Attendance, int id, double salary, double bonus) {
        super(name, Shift, type, Attendance, id, salary, bonus);
    }

    

}

class Cashier extends Employee {

    public Cashier(String name, String Shift, String type, int Attendance, int id, double salary, double bonus) {
        super(name, Shift, type, Attendance, id, salary, bonus);
    }

   

}


class N_man extends Employee {

    public N_man(String name, String Shift, String type, int Attendance, int id, double salary, double bonus) {
        super(name, Shift, type, Attendance, id, salary, bonus);
    }

}