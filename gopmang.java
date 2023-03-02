import java.util.Arrays;
import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = new int[5];
        int [] mang3;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.printf("nhập giá trị mang1 " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        int j = 0;
        while (j < array.length) {
            System.out.printf("nhập giá trị mang2: " + (j + 1)  + ":");
            array1[j] = scanner.nextInt();
            j++;
        }
        mang3 = new int[array.length + array1.length];
int index = 0;
        for (int a:array
             ) {
            mang3[index] =a;
            index++;
        }
        for (int b:array1
        ) {
            mang3[index] =b;
            index++;
        }System.out.println(Arrays.toString(mang3));




//        int name = array[0];
//
//        for (int c = 0; c < array.length ; c++) {
//            if (name == array.length) {
//                name = array[c];
//            }
//
//        }
//        int name1 = array1[0];
//        for (int v = 0 ; v < array1.length ; v++) {
//            if (name1==array1.length){
//                name1 = array1[v];
//            }
//
//        }





    }
}
