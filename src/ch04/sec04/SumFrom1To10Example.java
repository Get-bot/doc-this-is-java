package ch04.sec04;

public class SumFrom1To10Example {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10 합 : " + sum);
    }
}
