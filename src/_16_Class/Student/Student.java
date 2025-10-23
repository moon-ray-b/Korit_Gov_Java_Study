package _16_Class.Student;

public class Student {

    private String name;
    private int age;
    private String mail;
    private String adress;

    public Student(String name, int age, String adress, String mail) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    //기능 => 클래스의 메소드
    public void showInfo() {
        System.out.println("[정보출력]");
        System.out.println("이름은 " + name + ", 나이는 " + age +"살, " + " 이메일은 " + mail + ",  주소는 " + adress);
    }
}
