/**
 * Created by godjqb on 16-12-14.
 */
import java.util.Scanner;
public class StringWord {
    public static void main(String[] args) {
        String s;
        System.out.println("Input a sentence: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(s);
        String[] split = s.split(" ");
        int num = split.length;
        System.out.print("There are " + num + " words");
    }
}
