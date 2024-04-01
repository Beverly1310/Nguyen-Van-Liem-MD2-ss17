package bai13;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can dao nguoc");
        String inputString = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(inputString);
        if (inputString==null||inputString.isBlank()){//ném ra ngoại lệ nếu chuỗi là null hoặc là chuỗi rỗng
            throw new RuntimeException("Chuoi nhap vao khong hop le");
        }
        System.out.println(stringBuilder.reverse());// đảo ngược chuỗi
    }
}
