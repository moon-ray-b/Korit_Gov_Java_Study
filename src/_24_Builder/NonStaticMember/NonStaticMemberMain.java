package _24_Builder.NonStaticMember;

public class NonStaticMemberMain {
    public static void main(String[] args) {
        NonStaticMember nonStaticMember = NonStaticMember.builder()
                .name("배찬익")
                .age(23)
                .email("bae9842")
                .build();
    }
}
