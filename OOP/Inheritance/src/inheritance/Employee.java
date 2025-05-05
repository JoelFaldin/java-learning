package inheritance;

public class Employee extends Person {
    int file_number;
    String position;
    Double salary;

    public Employee() {
    }

    public Employee(int file_number, String position, Double salary, int id, String dni, String name, String lastName, String address, String contact) {
        super(id, dni, name, lastName, address, contact);
        this.file_number = file_number;
        this.position = position;
        this.salary = salary;
    }

    public int getFile_number() {
        return file_number;
    }

    public void setFile_number(int file_number) {
        this.file_number = file_number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    
}
