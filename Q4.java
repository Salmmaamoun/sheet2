
package task2_rout;

import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
         int fact1=1;
        for (int i = 1; i <=power; i++) {
          
            fact1*=base;
        }
        System.out.println(fact1);
    }
}
