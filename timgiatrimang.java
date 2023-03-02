import java.util.Scanner;

public class timgiatrimang {
    public static void main(String[] args) {
        String[] name = {"", "nam" , "tuấn" , "vinh" , "bảo" , "trọng", "hưng"};
        Scanner sanner = new Scanner(System.in);
        System.out.printf("nhập tên cần tìm : ");
        String main = sanner.nextLine();

        boolean pamyli = false;
        for (int i=0 ; i < name.length; i++){
            if (name[i].equals(main)) {
                System.out.printf("vị trí trong danh sách: " + main + " is: " + i);
                pamyli = true;
                break;
            }
        }
        if (!pamyli) {
            System.out.println("Not found" + main + " in the list.");
        }
    }
}
