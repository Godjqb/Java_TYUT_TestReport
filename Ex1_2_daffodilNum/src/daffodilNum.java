/*
 * Created by godjqb on 16-11-16.
 */
public class daffodilNum {
    public static void main(String args[]) {
        for (int i = 100; i < 1000; i++) {
            int j = i%10, k = i/10%10, l = i/100;
            if (i == j*j*j+k*k*k+l*l*l ) {
                System.out.println(i);

            }
        }
    }
}
