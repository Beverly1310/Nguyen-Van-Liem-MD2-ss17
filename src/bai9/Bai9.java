package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 1;
        List<Integer> list = new ArrayList<>();
        list.add(firstNumber);
        list.add(secondNumber);
        System.out.println("Nhap vao so n trong day Fibonaci");
        int n = Integer.parseInt(scanner.nextLine());
        if (n<=0) {
            throw new RuntimeException("n phai lon hon 0: ");
        }
        // tính số thứ n và đưa vào list
        for (int i = 2; i <= n; i++) {
            int tg = firstNumber;
            firstNumber = secondNumber;
            secondNumber = secondNumber+tg;
            list.add(secondNumber);
        };
        //lấy ra số thứ n
        System.out.println("So Fibonaci thu: "+ n + " la: "+list.get(n-1));
    }
}
