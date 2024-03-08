package day3;
    class PPerson {

    int age;
    String name;

    public void introduce() {
        System.out.println("저는 " + age + "살 " + name + " 입니다.");
    }
}

public class PersonExam1 {
    public static void main(String[] args) {
        PPerson a사람1 = new PPerson();
        a사람1.name = "홍길동";
        a사람1.age = 22;

        a사람1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.

        PPerson a사람2 = new PPerson();
        a사람2.name = "홍길순";
        a사람2.age = 25;

        a사람2.introduce();
        // 출력 : 저는 25살 홍길순 입니다.

        a사람1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.
    }
}