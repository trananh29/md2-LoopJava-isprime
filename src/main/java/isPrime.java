import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter a number");
        int number=num.nextInt();
        if (number==1 || number==2) {
            System.out.println("Ban da nhap sai so");
        } else {
            if (checkPrime(number)) {
                System.out.println(number + " la so nguyen to");
            } else System.out.println(number + " khong la so nguyen to");
        }
    }
    public static boolean checkPrime (int n) {
        boolean check = true;
        int i=2;
        while (i<n/2) {
            if (n%i==0) {
                check=false;
                break;
            } i++;
        }

       return check;
    }
}
