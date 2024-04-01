package Bai12;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) throws ZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so thu hai: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if (secondNumber==0 && firstNumber==0){// ném ra ngoại lệ
            throw new ZeroException("Ca hai so nhap vao phai khac 0");
        }
        int greatesCommonDivisor = 1;
        for (int i = 1; i <= firstNumber; i++) {
            if (firstNumber%i==0 && secondNumber%i==0){
                greatesCommonDivisor=i;
            }
        }
        System.out.println("Uoc chung lon nhat cua "+firstNumber+" va "+secondNumber+" la: "+greatesCommonDivisor);
    }
}
