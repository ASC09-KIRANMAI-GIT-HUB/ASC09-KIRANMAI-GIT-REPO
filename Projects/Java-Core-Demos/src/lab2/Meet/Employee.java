package lab2.Meet;

public class Employee {

    private String employeeId;
    private String employeeName;

    public Employee(String employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString(){
        return "Employee ID: " + employeeId + ", Name: " + employeeName;
    }

}
