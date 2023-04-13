import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        /* Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r; */
        Scanner input= new Scanner(System.in);
        double yaricap,cevre,alan;
        double pi=3.14;
        System.out.print("Yaricap degerini giriniz :");
        yaricap = input.nextDouble();

        cevre= 2*pi*yaricap;
        alan=pi*yaricap*yaricap;

        System.out.println("Cevrenin degeri:" +cevre);
        System.out.println("Alanin degeri: "  +alan);

    }
}
