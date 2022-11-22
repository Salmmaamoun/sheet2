
package task2_rout;

import java.util.Scanner;


public class Q12 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        //12/2=6
        while(num%2==0){
            count++;
            num/=2;
        }
        System.out.println(count);
    }
  
}
