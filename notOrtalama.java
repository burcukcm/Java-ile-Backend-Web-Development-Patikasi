import java.util.Scanner;
public class notOrtalama {
    public static void main(String[] args) {
        /*  Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
Aynı program içerisinde koşullu ifadeler kullanılarak,
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not : If ve Else kullanılmayacak...  */

        int mat, fizik, kimya, turkce, tarih, muzik;
        int ort;
        Scanner input = new Scanner(System.in);

        System.out.print("fizik notunuzu giriniz :");
        fizik = input.nextInt();

        System.out.print("matematik notunuzu giriniz :");
        mat = input.nextInt();

        System.out.print("kimya notunuzu giriniz :");
        kimya = input.nextInt();

        System.out.print("turkce notunuzu giriniz :");
        turkce = input.nextInt();

        System.out.print("tarih notunuzu giriniz :");
        tarih = input.nextInt();

        System.out.print("muzik notunuzu giriniz :");
        muzik = input.nextInt();

        ort = ((mat + fizik + kimya + tarih + turkce + muzik) / 6);

        System.out.print("ortalamaniz=" + ort);
        System.out.println(" ");

        System.out.println(ort >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");
    }
}
