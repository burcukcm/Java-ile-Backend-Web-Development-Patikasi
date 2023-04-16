import java.util.Scanner;
/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
public class DongulerOrnek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int top = 0;

        System.out.println("Sayi giriniz : ");
        while (true) {
            a = input.nextInt();

            if (a %2 == 1) { //tek sayi girince döngüden çıkıp toplamı yazdırdık.
                break;
            }

            if (a % 2 == 0 || a % 4 == 0) {
                top += a;
            }
        }

        System.out.println("Toplam: " + top);
    }
}