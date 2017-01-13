/*
 * Created by godjqb on 16-11-26.
 */
public class forStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4-i; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("☆");
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = (4-i)*2-1; k >0; k--) {
                System.out.print("☆");
            }
            System.out.print("\n");
        }
    }
}
