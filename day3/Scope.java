package day3;

public class Scope {

    public static void main(String[] args) {
        // 원론적으로는 함수 하나에 모든걸 만들 수 있음
        // 코드를 함수로 쪼개서 관리

        // 함수는 같은 클래스 내에 있는 함수끼리만 호출 및 사용 가능

        // 소유자에게 요청을 해야함
        double result = Calculator.plus(1, 2);{
            System.out.println(result);

            // Scope
            // 변수의 유효범위

            // 지역에서 만들어져서 지역에서만 사용되는 변수 > 지역변수
            // 함수 내의 변수는 모두 지역변수

            int a = 10; // a 변수의 유효범위는 main 함수 내부

            {
                int b = 20; // b 변수의 유효범위는 블록 내부
            }

            if(true) {
                int c = 50;
            }

            {
                int d;
            }

            // 결론
            // 같은 함수 내에서는 동일한 의름으로 변수를 2개 이상 만들 수 없다.

            // 인스턴스(객체) 변수
            // 클래스 내에서 만들어져서 객체가 사용하는 변수

        }
    }
}
