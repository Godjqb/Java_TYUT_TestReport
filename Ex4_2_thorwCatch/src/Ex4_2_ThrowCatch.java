/**
 * Created by godjqb on 17-1-5.
 */
public class Ex4_2_ThrowCatch {
    public static void main(String args[]){
        for (int i = 0; i < 4; i++) {
            int k;
            try {
                switch (i) {
                    case 0:
                        int zero = 0;
                        k = 911;
                        break;
                    case 1:
                        int b[] = null;
                        k = b[0];
                        break;
                    case 2:
                        int c[] = new int[2];
                        k = c[9];
                        break;
                    case 3:
                        char ch = "abc".charAt(99);
                        break;
                }
            } catch (Exception e) {
                System.out.println("\n Testcase:#" + i + "\n");
                System.out.println(e);
            }
        }
    }
}
