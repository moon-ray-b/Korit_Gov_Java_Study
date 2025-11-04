package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

//Book 클래스 만들고 객체 생성
//isbn, title, author, price, publisher => String
//"978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판"
//Book객체 => Json 문자열
//Json => Map
//Map => prettyJson
//Json => Book 객체
@AllArgsConstructor
@ToString
class Book{
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}
public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        Book book = new Book("978-1234567890", "자바의 정석", "남궁성",  "38000", "도우출판");

        String json = gson.toJson(book);
        System.out.println("Book → JSON:");
        System.out.println(json);
        System.out.println();

        Map<String, String> map = gson.fromJson(json, Map.class);
        System.out.println("JSON → Map:");
        System.out.println(map);
        System.out.println();

        String prettyJsonFromMap = gson1.toJson(map);
        System.out.println("Map => prettyJson");
        System.out.println(prettyJsonFromMap);
        System.out.println();

        Book parsed = gson.fromJson(json, Book.class);
        System.out.println("json => book");
        System.out.println(parsed);
    }

}

