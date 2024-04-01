package bai10;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) throws RadiusException {
        Scanner scanner = new Scanner(System.in);
        boolean isPositiveNumber = false;
        double radius=0;
        while (!isPositiveNumber){
            // xử lý ngoại lệ
                try {
                    radius = getRadius(scanner);
                    isPositiveNumber=true;
                } catch (RadiusException e){
                    System.err.println("Ban kinh phai lon hon 0");
                }
        }
        final double PI = 3.14f;
        System.out.println("Dien tich hinh  tron la: "+ PI*radius*radius);
    }
    //phương thức ném ra ngoại lệ
    public static double getRadius(Scanner scanner) throws RadiusException {
        double radius = 0;
        boolean isContinue = true;
        while (isContinue){
            try {
                System.out.println("Nhap vao ban kinh:");
                radius = Double.parseDouble(scanner.nextLine());
                if (radius<=0) {
                    throw new RadiusException();
                }
                isContinue=false;
            } catch (NumberFormatException e){
                System.out.println("Du lieu nhap vao phai la so");
            }
        }
        return radius;
    }
}
