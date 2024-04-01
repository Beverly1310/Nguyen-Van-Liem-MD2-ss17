package bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhap so can tim");
        int number = Integer.parseInt(scanner.nextLine());
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (start==end && arr[mid]!=number){
                // ném ra ngoại lệ nếu không tìm thấy
                throw new RuntimeException("Khong co so can tim");
            }
            if (arr[mid] == number) {
                System.out.println("So can tim o vi tri: " + mid);
                break;
            } else if (arr[mid] > number) {
                end = mid - 1;
            } else if (arr[mid] < number) {
                start = mid + 1;
            }
        }
    }
}
