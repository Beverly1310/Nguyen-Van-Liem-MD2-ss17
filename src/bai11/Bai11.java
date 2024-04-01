package bai11;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) throws DateException {
        Scanner scanner = new Scanner(System.in);
        checkDate(scanner);

    }

    public static void checkDate(Scanner scanner) throws DateException {

        System.out.println("Nhap vao nam: ");
        int year = Integer.parseInt(scanner.nextLine());
        if (year < 0) {
            throw new DateException("Nam khong hop le");
        }
        System.out.println("Nhap vao thang: ");
        int month = Integer.parseInt(scanner.nextLine());
        if (month < 1 || month > 12) {
            throw new DateException("Thang khong hop le");
        }
        System.out.println("Nhap vao ngay: ");
        int date = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (date < 1 || date > 31) {
                    throw new DateException("Ngay khong hop le");
                }
                break;
            case 4, 6, 9, 11:
                if (date < 1 || date > 30) {
                    throw new DateException("Ngay khong hop le");
                }
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (date < 1 || date > 29)
                        throw new DateException("Ngay khong hop le");
                }
                else {
                    if (date < 1 || date > 28)
                        throw new DateException("Ngay khong hop le");
                }
                break;
        }
        System.out.println("Ngay, thang, nam hop le");
    }

}
