package _24_Builder.NonStaticMember;

import java.lang.reflect.Field;

public class NonStaticMember {
    private String name;
    private int age;
    private String email;

    private NonStaticMember() { //(외부클래스)외부에서 생성할수 없는 객체
    }

    //정적 내부클래스 static
    //지역 클래스
    //익명 클래스
    public class Builder { //인스턴스 클래스(내부클래스)비정적
        private final NonStaticMember target;

        private Builder(NonStaticMember target){
            this.target = target;
        }

        public Builder name(String name){
            target.name = name;
            return this;
        }

        public Builder age(int age){
            target.age = age;
            return this;
        }
        public Builder email(String email){
            target.email = email;
            return this;
        }

        public NonStaticMember build(){
            return target;
        }
    }

    public static NonStaticMember.Builder builder(){ //팩토리 메소드
        NonStaticMember nonStaticMember = new NonStaticMember();
        return nonStaticMember.new Builder(nonStaticMember);
    }
}
