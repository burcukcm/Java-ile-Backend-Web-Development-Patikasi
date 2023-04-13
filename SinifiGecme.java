import java.util.Scanner;
/* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
public class SinifiGecme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, fiz, tur, kim, muz;
        double ort;

        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fiz = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        tur = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kim = inp.nextInt();
        System.out.print("Muzik notunuzu giriniz:");
        muz = inp.nextInt();

        ort = (mat + fiz + tur + kim + muz) / 5;
        System.out.println("ortalamaniz:" + ort);

        if (ort <= 100 && ort >= 0) {
            if (ort < 55)
            {
                System.out.println("Kaldiniz.");
            } else
            {
                System.out.println("Gectiniz.");
            }
        }
            else
                System.out.print("Hatalı giriş! Not ortalaması 0'dan büyük ve 100'den küçük olmalı");
            }
       }

