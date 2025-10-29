package _24_Builder.Book;
/*
* int bookId;
* String title;
* String author;
* string isbn;
* 빌더 패턴 객체 생성
* build()시 title 또는 author가 비었으면
* title 필드 또는 author 필드가 비어있습니다. 출력(객체는 생성)
* isbn(string isbn)호출 시 13자기락 아니라면
* ISBN형식이 아닙니다. 출력 (null 값 유지)
* toString 오버라이드 해서 모든 필드 츌력
* */
public class BookMain {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .bookId(1212)
                .title("맘마")
                .author("asdf")
                .isbn("qwqwqwqwqwqwq")
                .build();
        System.out.println(book);
    }
}
