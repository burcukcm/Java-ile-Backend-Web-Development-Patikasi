import java.util.Scanner;
/*Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360 */
public class DaireDilimiAlani {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double r,merkezAcisi,alan;

        System.out.print("yarciap degerini giriniz :");
        r= inp.nextDouble();

        System.out.print("merkez aci degerini giriniz :");
        merkezAcisi= inp.nextDouble();

        alan = Math.PI * r * r * merkezAcisi / 360;
        System.out.print("Daire diliminin alani : " +alan);

    }
}
