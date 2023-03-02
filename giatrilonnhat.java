import java.util.Scanner;

public class giatrilonnhat {
    public static void main(String[] args) {
        int size;
        int [] name ;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a size: ");
        size = scanner.nextInt();
        if (size > 20) {
            System.out.printf("kích thước không vượt quá 20: ");
        }
        while (size >20) ;
         name = new int[size];
         int i = 0;
         while (i < name.length){
        System.out.print("Enter element" + (i + 1) + " : ");
        name[i] = scanner.nextInt();
        i++;
        }
        System.out.println("Property list: ");
        for (int j = 0; j < name.length; j++) {
            System.out.println(name[j]+"  ");
        }
        int max = name[0];
        int index = 1;
        for (int j = 0; j < name.length; j++) {
            if (name[j] > max) {
                max = name[j];
                index = j + 1;
            }
        }
        System.out.println("giá trị lớn nhất trong danh sách là : " + max + " tại vị trí :  " + index);
    }
}
