import java.util.Scanner;

public class xoaphantumang {
    public static void main(String[] args) {
        int array;
        int[] mang = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhập phần tử cần xóa :");
        int X = scanner.nextInt();
        int index = 1;
        for (int i = 0; i < mang.length; i++) {
            if (X == mang[i]) {
                continue;
            }
            System.out.print(mang[i]);
        }
    }
}
