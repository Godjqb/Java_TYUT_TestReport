/**
 * Created by godjqb on 16-11-16.
 */
public class sum100 {
    public static void main(String args[]) {
        int j = 0;
        for (int i = 0; i <= 100; i += 2) {
            j += i;
        }
        System.out.println("100内偶数之和为"+j);
    }
}
