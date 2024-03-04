package day1;

public class VariableExam2 {public static void main(String[] args) {

    int a = 5;
    int b = 10;

    System.out.println("a : " + a);
    System.out.println("b : " + b);

    // 여기서 부터
    int c = a;
    a = b;
    b = c;

    // 변수 사용시 위에서 아래로 순차적으로 진행 되기 때문에 원래 값을 다른 변수에 저장 후 저장된 변수값을 적용
    // 여기까지 수정 가능

    System.out.println("a : " + a);
    // 출력 : a : 10
    System.out.println("b : " + b);
    // 출력 :  b : 5

}
}
