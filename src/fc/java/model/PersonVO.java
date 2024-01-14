package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    public PersonVO(){
        name = "";
        age = 0;
        phone = "";
    }
    public PersonVO(String name, int age, String phone){
        this.name = name;
        if(0<age && age < 150){
            this.age = age;
        }else{
            System.out.println("에러");
        }
        this.phone = phone;
    }

    public void setAge(int age) {
        if(0<age && age < 150){
            this.age = age;
        }else{
            System.out.println("나이 에러");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    public String toString(){
        return name+"\t"+age+"\t"+phone;
    }
}
