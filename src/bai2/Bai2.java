package bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cho mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap gia tri cho phan tu thu: "+i);
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        findMax(arr);
    }
    public static void findMax(int[] arr){
        if (arr.length==0){
            throw new RuntimeException("Mang rong");
        } else {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("Max la: "+max);
        }
    }
}
