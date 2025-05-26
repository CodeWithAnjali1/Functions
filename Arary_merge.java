import java.util.Scanner;

public class Arary_merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {2,4,6};
        int b[] = {8,10};
        int c[] = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }
        System.out.println("Merged array is: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
