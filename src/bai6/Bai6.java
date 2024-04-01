package bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so bi chia: ");
        int fisrtNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so chia: ");
        int quotient = 0;
        int secondNumber = Integer.parseInt(scanner.nextLine());
        try {
            // xử lý ngoại lệ khi số chia = 0
             quotient = fisrtNumber / secondNumber;
            System.out.println("ket qua: " + quotient);
        } catch (ArithmeticException e){
            System.err.println("So chia phai khac 0");
        }
    }
}
