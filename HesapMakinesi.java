import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int s1,s2;
        int islem;

        System.out.print("Birinci sayiyi giriniz :");
        s1=input.nextInt();
        System.out.print("İkinci sayiyi giriniz :");
        s2=input.nextInt();

        System.out.println("1-toplama\n2-cikarma\n3-carpma\n4-bolme");
        System.out.print("İslemlerden biriniz seciniz :");
        islem=input.nextInt();

        switch (islem) {
            case 1:
                System.out.print("Toplamin sonucu:"+(s1+s2));
            break;
            case 2:
                System.out.print("Farklarin sonucu:"+(s1-s2));
                break;
            case 3:
                System.out.print("Carpimin sonucu:"+(s1*s2));
                break;
            case 4:
                System.out.print("Bolumun sonucu:"+(s1/s2));
                break;
            default:
                System.out.println("Hatali secim yaptiniz!");
        }

    }
}
