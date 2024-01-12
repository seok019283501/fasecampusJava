package fc.java.model;
//object = 상태정보+ 행위정보
public class Person {
    public String name;
    public int age;
    public String phone;

    public void name(){
        System.out.println(name);
    }
    public Person(){
        name = "unknown";
        age = 0;
        phone = "000-0000-0000";
    }

    public Person(String name, int age, String phone){
        this.age = age;
        this.name = name;
        this.phone = phone;
    }
    public void play(){
        System.out.println("운동을 한다.");
    }
    public void eat(){
        System.out.println("음식을 먹다.");
    }
    public void walk(){
        System.out.println("걷다.");
    }

}
