package bai14;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang");
        int size = Integer.parseInt(scanner.nextLine());
        if (size<=0){//ném ra ngoại lệ nếu só ptu cua mang <= 0
            throw new RuntimeException("So phan tu cua mang phai lon hon 0");
        }
        int[] arr = new int[size];
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            try {// xử lý ngle khi tính TBC với ptu = 0
                System.out.println("Nhap gia tri cho phan tu thu: "+i);
                arr[i] = Integer.parseInt(scanner.nextLine());
                average += (double) arr[i] /size;
            } catch (ArithmeticException e){
            }
        }
        System.out.println("Trung binh cong cac phan tu cua mang la: "+average);
    }
}
