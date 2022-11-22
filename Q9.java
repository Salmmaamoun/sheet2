package task2_rout;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int c=0;
        while(num>0){
            sum+=num;
            c++;
            num=sc.nextInt();
        }
        System.out.println(sum);
        System.out.println(sum/c);
    }

}
