package task2_rout;

import java.util.Scanner;

public class Q10_Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int count=0;
        while(num!=0){
            int dig=num%10;
            sum+=dig;
            count++;
            num/=10;
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
