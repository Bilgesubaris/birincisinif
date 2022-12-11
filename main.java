import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner tarayıcı = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayı = tarayıcı.nextInt();

        if (sayı == 0) {
            System.out.println("Girdiğiniz sayı sıfırdır.");
        }


        if(sayı>0) {
            System.out.println("Girdiğiniz değer pozitiftir");
        }
        if   (sayı < 0){

            System.out.println("Girdiğiniz değer negatiftir.");

        }

    }
}