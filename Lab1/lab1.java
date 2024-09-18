import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            int s = my.nextInt();
            arr[i] = s;

        }
        int c = my.nextInt();
        int p = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == c) {
                p++;
            }

        }
        System.out.println(p);
    }

}
