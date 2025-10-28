package _22_Bean;

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("배찬익");
        userEntity.setAge(23);
        userEntity.setEmail("bae9842");
        System.out.println(userEntity);

        UserEntity1 userEntity1 = new UserEntity1();
        userEntity1.setUserId("bae9842");
        userEntity1.setTitle("바이크");
        userEntity1.setLie("CG125 혼다");
        userEntity1.setUserId2("bae0408");
        userEntity1.setNic("배롱");
        System.out.println(userEntity1);
        /*
        * 게시물 엔티티
        * 게시물 아이디
        * 게시물 제목
        * 게시물 내용
        * 작성자 아이디
        * 작정자 닉네임
        * 생성시각
        * 수정시각
        *
        * */

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUsername("찬익");
        userEntityLombok.setAge(23);
        userEntityLombok.setEmail("bae9842");
        System.out.println(userEntityLombok);
        /*
        * Lombok
        * 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
        * 코드 다이어트를 위함
        * getter, setter, toString, 생성자, Builder
        *
        * Java는
        * .java 소스코드 => 컴파일(.class파일 형식으로 변환)
        * 바이트코드로 이루어짐 => JVM에 전달 => 실행
        * ===> 빌드
        * 빌드를 도와주는 빌더가 있는데 종류가 maven,gradle있음
        * 이친구들은 빌드를 전체적으로 효율적이고 자동화 해주기위한 외부 빌더 시스템
        *
        * */
    }
}
