import mymaths.ThreeDigits;

/**
 * Created by godjqb on 16-11-30.
 */
public class index {
    public static void main(String[] args) {
        ThreeDigits arr = new ThreeDigits(10,20,15);
        System.out.println("min "+arr.minimum());
        System.out.println("max "+arr.maximum());
    }
}
