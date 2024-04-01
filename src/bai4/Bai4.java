package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {   public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
   String inputString = scanner.nextLine();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < inputString.length(); i++) {
        // xử lý ngoại lệ khi ký tự thêm vào không phải là số
        try {
         list.add(Integer.parseInt(String.valueOf(inputString.charAt(i))));
        }catch (NumberFormatException e){
            list.add(0);
        }
    }
    System.out.println(list);
}
}
