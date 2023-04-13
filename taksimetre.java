 import java.util.Scanner;
public class taksimetre {
    /* Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int km;
        double totalPrice=10;
        double perKm=2.20;

        System.out.print("Mesafeyi km cinsinden giriniz :");
        km=input.nextInt();

       totalPrice +=(km*perKm);

        totalPrice = (totalPrice < 20) ? 20 : totalPrice;

        System.out.print("Toplam tutar : "+totalPrice);

    }
}
