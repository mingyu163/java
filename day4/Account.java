package day4;

public class Account {

        int remainder = 0;
        public void deposit(int depositmoney) {

//          int remainder = 0;; // 지역변수
            remainder += depositmoney;
            System.out.println(depositmoney + "원을 예금했습니다.");
            System.out.println("잔액 " + remainder + "원");
}

        public int withdraw(int withdrawmoney) {
            remainder -= withdrawmoney;

            return withdrawmoney;

        }
        public int getRemainder() {
            return remainder;
        }
}