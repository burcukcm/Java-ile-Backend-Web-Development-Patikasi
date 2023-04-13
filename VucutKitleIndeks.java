import java.util.Scanner;
/*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
 Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül
Kilo (kg) / Boy(m) * Boy(m)*/
public class VucutKitleIndeks {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double boy,kilo ,kitleEndeks;


        System.out.print("Lutfen boyunuzu giriniz (m) :");
        boy=inp.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz (kg) :");
        kilo=inp.nextDouble();

         kitleEndeks = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz : "+kitleEndeks);
    }
}
