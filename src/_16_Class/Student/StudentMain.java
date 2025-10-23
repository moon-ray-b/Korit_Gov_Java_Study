package _16_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("배찬익", 23, "bae9842", "대연동");
        student.setName("이동윤");
        student.showInfo();
        System.out.println(student.getName());

//        student1.name1 = "배찬익";
//        student1.age1 = 27;
//        student1.mail = "bae9842";
//        student1.adress = "대연동 ";
//
//        System.out.println(student1.name1);
//        System.out.println(student1.age1);
//        System.out.println(student1.mail);
//        System.out.println(student1.adress);


    }
}
