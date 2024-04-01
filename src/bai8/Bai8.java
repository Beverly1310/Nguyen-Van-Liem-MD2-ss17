package bai8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) throws PrimeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can kiem tra: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        if (inputNumber<2){
            throw new PrimeNumberException("So nhap vao phai lon hon 1");
        }
        boolean check = true;
        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber%i==0){
                check=false;
                break;
            }
        }
        if (inputNumber == 2){
            System.out.println("So nhap vao la so nguyen to.");
        }
       else if (check){
            System.out.println("So nhap vao la so nguyen to.");
        } else {
            System.out.println("So nhap vao khong la so nguyen to.");
        }
    }
}
