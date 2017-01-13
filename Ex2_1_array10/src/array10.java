import java.util.Scanner;

/**
 * Created by godjqb on 16-11-30.
 */
public class array10 {
    public static void main(String[] args) {
        System.out.println("Input ten int:");
        int arr[] = new int[10];
        String str;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < 9; i++) {
            for(int j=0; j < 9; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
