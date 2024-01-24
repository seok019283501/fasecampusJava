package fc.java.part4;

public class Employ {
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;
    public Employ(){
        super();
    }

    public Employ(String name, int age, String phone, String empDate, String dept, boolean marriage) {

        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
