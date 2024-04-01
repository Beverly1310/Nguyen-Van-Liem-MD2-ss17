package bai15;

public class Bai15 {
    public static void main(String[] args) throws IllegalTriangleException {
        System.out.println(isTriangle(2,1,1));
    }
    public static boolean isTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a<=0 || b<=0 || c<=0){
            throw new IllegalTriangleException("Do dai canh phai lon hon 0");
        }
        if (a+b<=c || a+c<=b || b+c<=a){
            throw new IllegalTriangleException("Tong do dai 2 canh phai lon hon canh con lai");
        }
        return true;
    }
}
