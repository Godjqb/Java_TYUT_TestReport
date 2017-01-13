import java.util.Scanner;

/*
 * Created by godjqb on 16-11-16.
 */
public class mathFunction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input x: ");
        int x = sc.nextInt();
        int y = 0;
        if (x < 1) {
            y = x;
        } else if (x < 10) {
            y = 3*x-2;
        } else {
            y = 4*x;
        }
        System.out.print(y);
    }
}
