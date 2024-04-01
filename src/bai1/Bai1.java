package bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        boolean isExit = true;
        while (isExit){
            //xử lý ngoại lệ
            try {
                System.out.println("Nhap so thu nhat");
                firstNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap so thu hai");
                secondNumber = Integer.parseInt(scanner.nextLine());
                isExit=false;
            } catch (NumberFormatException e) {
                System.out.println("Nhap so nguyen");
            }
        }
        int sum = firstNumber+secondNumber;
        System.out.println("Tong hai so la: "+sum);
    }
}
