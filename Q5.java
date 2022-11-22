package task2_rout;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact1 = 1;
        for (int i = 1; i <= num; i++) {

            fact1 *= i;
        }
        System.out.println(fact1);
    }

}
