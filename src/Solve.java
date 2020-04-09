import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String students [] = {"Đức","Nam","Trung","Hoàng","Sơn","Thủy","Tuấn"};

        System.out.println("Mời nhập vào giắ trị cần check:");
        String value = scanner.nextLine();
        checkMang(students, value);

    }

    public static void checkMang(String arr[],String str){
        boolean isExist = false;
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(str)){
                System.out.println("Vị trí của "+str+" trong mảng là :"+i);
                isExist =true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Phan Tu khong thuoc mang!");
        }
    }
}
