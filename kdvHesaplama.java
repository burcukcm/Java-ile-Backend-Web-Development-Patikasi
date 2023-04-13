import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
/* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp
 ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den
büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */


                        Scanner input= new Scanner(System.in);
                        double tutar, kdvOran, kdvTutar, kdvliTutar;

                        System.out.print("Ücret Tutarını Giriniz: ");
                        tutar = input.nextDouble();

                        kdvOran = (tutar>0) && (tutar<1000) ? 0.18 : 0.8; //if else kullanmadik.

                        kdvTutar = tutar * kdvOran;
                        kdvliTutar = tutar + kdvTutar;

                        System.out.println("KDV oranı : " + kdvOran);
                        System.out.println("KDV Tutarı: " + kdvTutar);
                        System.out.println("KDV'li Tutar: " + kdvliTutar);
            }
        }

