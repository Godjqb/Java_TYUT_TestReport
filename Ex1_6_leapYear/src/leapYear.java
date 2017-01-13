/*
 * Created by godjqb on 16-11-26.
 */
public class leapYear {
    public static void main(String[] args) {
        int arr [];
        arr = new int [60];
        int j = 0;
        for (int i = 1900; i <= 2100; i++) {
            if (i%100 == 0) {
                if (i%400 == 0) {
                    arr[j] = i;
                    j++;
                }
            } else if (i%4 == 0) {
                arr[j] = i;
                j++;
            }
        }
        for (int k = 0; k < j; k++) {
            if (k%5 == 0) {
                System.out.print("\n");
            }
            System.out.print(arr[k]+" ");
        }
    }
}
