package bai7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue){
            try {
                System.out.println("Nhap so thu nhat: ");
                int firstNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap so thu hai: ");
                int secondNumber = Integer.parseInt(scanner.nextLine());
                if (firstNumber>secondNumber){
                    System.out.println("So lon nhat la: "+firstNumber);
                }
                else {
                    System.out.println("So lon nhat la: "+secondNumber);
                }
                isContinue = false;
            }
            catch (NumberFormatException e){
                System.err.println("Gia tri nhap vao khong phai la kieu so nguyen");
            }
        }

    }
}
