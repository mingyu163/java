package day1;

public class Print {
    public static void main(String[] args) {
        System.out.println("안녕하세요\n반갑습니다.");

        // \n은 줄바꿈

        // 문자 합치기(+)
        System.out.println("안녕하세요 나입니다");
        System.out.println("안녕하세요" + " 나입니다");

        // 숫자 더하기(산술 연산)
        System.out.println(100 + 200);
        System.out.println(2369 + 2271);

        // 숫자와 문자는 구분하기
        System.out.println("100"); //문자
        System.out.println(100);   //숫자

        // 문자 + 숫자 > 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        // 출력문을 이용해 더하기 식 표현하기
        // + 연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("100 + 200 = " + (1231564 + 534874));

        // 숫자 곱하기 (*)
        System.out.println(100 * 200);

        // 구구단 2단을 출력. 출력문은 한번만 사용
        System.out.println("2 X 1 = " + (2 * 1) + "\n2 X 2 = " + (2 * 2) + "\n2 X 3 = " + (2 * 3) + "\n2 X 4 = " + (2 * 4) + "\n2 X 5 = " + (2 * 5) + "\n2 X 6 = " + (2 * 6) + "\n2 X 7 = " + (2 * 7) + "\n2 X 8 = " + (2 * 8) + "\n2 X 9 = " + (2 * 9));











    }
}
