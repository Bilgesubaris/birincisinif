import java.util.Random;
import java.util.Scanner;
public class main9 {
    public static void main(String[] args) {
        int sayac1=0,sayac2=0;
        Scanner sc = new Scanner(System.in);

        Random rastgele = new Random();
        int sayi = rastgele.nextInt(100);

        System.out.println("Lütfen 1-100 arasında bir sayı giriniz: ");
        int tahmin = sc.nextInt();

        while (tahmin != sayi) {

            if(tahmin > 100 || tahmin < 0) {
                System.out.println("Tahmininiz 1-100 arasında olmalıdır!: ");
                tahmin = sc.nextInt(); }

            else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz: ");
                tahmin = sc.nextInt();
                sayac1++;
            }
            else{
                System.out.println("Daha küçük bir sayı giriniz: ");
                tahmin = sc.nextInt();
                sayac2++;
            }
        }
        int TahminSayisi=sayac1+sayac2;
        System.out.println("Tebrikler doğru tahmin");
        System.out.println("Random sayı:"+sayi);
        System.out.println("Deneme sayınız:"+TahminSayisi);
        System.out.println("----------------------- ");
    }
}
