package inheritance;

public class Consultant extends Person {
    String company_name;
    int job_number;

    public Consultant() {
    }

    public Consultant(String company_name, int job_number, int id, String dni, String name, String lastName, String address, String contact) {
        super(id, dni, name, lastName, address, contact);
        this.company_name = company_name;
        this.job_number = job_number;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getJob_number() {
        return job_number;
    }

    public void setJob_number(int job_number) {
        this.job_number = job_number;
    }
    
    
}
