package task2_rout;

public class Q13 {

    public static void main(String[] args) {
        int c = 0;
        String five = "";
        String six = "";
        int i;
        for (i = 100; i <= 200; i++) {
            System.out.println(i);
            c++;
            if (i % 5 == 0) {
                five = i + " ";
            }
            if (i % 6 == 0) {
                six = i + " ";
            }
            if (c % 10 == 0 && i > 100) {

                System.out.print(five);
                System.out.print(six);

            }

        }
    }

}
