package _17_Inheritance;

public class Animal {
    private String  animalName;
    public  int animalAge;

    //AllArgs 생성자 하나 생성하고 getter/setter다 만들고
    //메소드에 move만들기
    //움직입니다. 출력

    public Animal() {

    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;

    }
    public void move(){
        System.out.println("움직입니다.");
    }
}
