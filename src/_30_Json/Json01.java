package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
* JSON(JavaScript Object Notation)
* - 본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따랐지만, 언어 독립형 데이터 포멧으로 거듭
* 프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 및 JSON 데이터 생성을 위한 코드는
* JAVA / Python 등 다양한 언어에서 쉽게 야용가능
* 생겨먹은게 Map형태임
* */
public class Json01 {
    /*
    * Gson Google Json의 약자로 Java 객체를 Json 형태로 변환하거나 혹은 반대로 변환하는데 사용한다
    * 주요 클래스
    * Gson - 변환을 위해 (Json <=> Java객체) 주로 사용되는ㄴ 클래스
    * GsonBuilder - Gson 인스턴스에 대한 사용자 정의 구성을 허용(prettyPrinting)
    * JsonObject - Json 객체를 나타넴
    * */
    public static void main(String[] args) {
        //JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject1 = new JsonObject();
        //속성(key-value entry)을 추가 => addProperty()
        jsonObject1.addProperty("username", "chanik");
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "chanik123@naver.com");
        jsonObject1.addProperty("name", "배찬익");
        System.out.println(jsonObject1);

        jsonObject1.addProperty("job","코리아 아이티 학원");
        System.out.println(jsonObject1);
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String json1 = gson1.toJson(jsonObject1);
        System.out.println(json1);

        //중첩 내부 객체
        JsonObject address = new JsonObject();
        address.addProperty("city", "부산시");
        address.addProperty("district", "진구");
        address.addProperty("zipCode", "1234");

        jsonObject1.add("address", address);


        String  json2 = gson1.toJson(jsonObject1);
        System.out.println(json2);
        //Json => JsonObject
        JsonObject jsonObject2 = gson1.fromJson(json2, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
