import java.util.Scanner;

public class giatrinhonhat {
    public static void main(String[] args) {

        final int SIZE = 5;
        int[] arr = new int[SIZE];

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập " + SIZE + " giá trị số nguyên cho mảng:");
        for (int i = 0; i < SIZE; i++) {
            arr[i] = input.nextInt();
        }

        int nam = arr[0];
        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < nam) {
                nam = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + nam);
    }
}
