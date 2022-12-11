
import java.util.Scanner;

public class main4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz  : ");
        float boy = scan.nextFloat();
        System.out.print("Kilonuzu giriniz : ");
        float kilo = scan.nextFloat();

        float bki = kilo / (boy*boy);
        System.out.println("Beden Kitle İndeksiniz = " + bki);

        if(bki < 0.0018) {
            System.out.println("Zayıf");
        }
        else if(bki < 0.0025) {
            System.out.println("Normal");
        }
        else if (bki < 0.0030) {
            System.out.println("Hafif şişman");
        }
        else if(bki < 0.0035) {
            System.out.println("Sisman");
        }
        else {
            System.out.println("Obez");
        }
    }
}
