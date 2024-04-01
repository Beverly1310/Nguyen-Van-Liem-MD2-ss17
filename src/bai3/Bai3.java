package bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap gia tri cho phan tu thu: "+i);
            arr[i] = scanner.nextLine();
        }
        int sum = 0;
        //xử lý ngoại lệ, nếu dữ liệu nhập vào ko phải là số thì in ra thông bao
        for (int i = 0; i < arr.length; i++) {
        try {
                sum+=Integer.parseInt(arr[i]);

        } catch (NumberFormatException e){
            System.out.println(arr[i]+" khong phai la so");
        }
        }
        System.out.println(sum);
    }
}
