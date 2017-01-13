/**
 * Created by godjqb on 16-12-14.
 */
import java.util.Scanner;
public class Matrix3_3 {
    public static void main(String[] args) {
        System.out.println("Input a 3*3 matrix: ");
        Scanner sc = new Scanner(System.in);
        int ma[][] = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ma[i][j] = sc.nextInt();
            }
        }
        int sum = ma[0][0] + ma[0][2] + ma[2][0] + ma[2][2];
        System.out.println(sum);
    }
}
