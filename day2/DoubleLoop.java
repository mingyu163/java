package day2;

public class DoubleLoop {
    public static void main(String[] args) {
//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//        for(int i = 0; i < 3; i++) {
//            for(int j = 1; j <= 5; j++) {
//                System.out.println(j);
//            }
//        }
//        for(int i = 0; i < 3; i++) {
//            System.out.println("실행");
//            System.out.println("됩니다");
//        }

        // 구구단 2 ~ 9단 출력


        System.out.println("2 X 1 = 2");
        System.out.println("2 X 2 = 4");
        System.out.println("2 X 3 = 6");
        System.out.println("2 X 4 = 8");
        // 2단
        int dan = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
            // 3단
            dan = 3;
            for (i = 1; i <= 9; i++) {
                System.out.println(dan + " X " + i + " = " + (dan * i));

            }

            // 2단 8번 만들어보기.
            int dan2 = 2;
            for (i = 1; i <= 9; i++) {
                System.out.println(dan2 + " X " + i + " = " + (dan2 * i));
            }

            for (i = 0; i < 8; i++) {
                System.out.println(dan2 + " X " + i + " = " + (dan2 * i));
            }
            for(dan2 = 2; dan2 < 10; dan2++) {
                for( i =1; i<= 9; i++)
                System.out.println(dan2 + " X " + i + " = " + (dan2 * i));
            }
        }
    }
}
