import java.util.Scanner;
/* Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
  sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
public class ucakBilet {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi (KM) girin: ");
        int mesafe = input.nextInt();
        System.out.print("Yaşı girin: ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini girin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        double biletFiyati = mesafe * 0.10;

        if (yas < 12) {
            biletFiyati *= 0.50;
        } else if (yas >= 12 && yas <= 24) {
            biletFiyati *= 0.90;
        } else if (yas >= 65) {
            biletFiyati *= 0.70;
        }
        if (yolculukTipi == 2) {
            biletFiyati *= 0.80;
        }
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        System.out.println("Toplam Bilet Fiyatı: " + biletFiyati + " TL");
    }
}
