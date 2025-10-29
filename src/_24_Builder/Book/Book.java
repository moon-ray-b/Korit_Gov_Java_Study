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
public class Book  {
    private int bookId;
    private String title;
    private String author;
    private String isbn;

    @Override
    public String toString() {
        return "BookId: " + bookId + ", Title: " + title + ", Author: " + author + ", Isbn: " + isbn;
    }

    private Book(Builder builder){
        this.bookId = builder.bookId;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;

    }

    public static class Builder{
        private int bookId;
        private String title;
        private String author;
        private String isbn;

        public Builder bookId(int bookId){
            this.bookId = bookId;
            return this;
        }
        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder author(String author){
            this.author = author;
            return this;
        }
        public Builder isbn(String isbn){
            this.isbn = isbn;
            if (isbn.length() != 13 ){
                System.out.println("ISBN형식이 아닙니다.");
                this.isbn = null;
            }
            return this;
        }
        public Book build(){
            if((title == null || title.isBlank()) || (author == null || author.isBlank())){
                System.out.println("필드가 비어있습니다.");
            }
            return new Book(this);
        }
    }
}

