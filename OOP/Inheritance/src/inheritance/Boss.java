package inheritance;

public class Boss extends Person {
    int boss_id;
    String department;

    public Boss() {
    }

    public Boss(int boss_id, String department, int id, String dni, String name, String lastName, String address, String contact) {
        super(id, dni, name, lastName, address, contact);
        this.boss_id = boss_id;
        this.department = department;
    }

    public int getBoss_id() {
        return boss_id;
    }

    public void setBoss_id(int boss_id) {
        this.boss_id = boss_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    
    
    
}
