//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
import java.util.Scanner;
public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;

        System.out.print("Birinci sayiyi giriniz :");
        a=input.nextInt();
        System.out.print("İkinci sayiyi giriniz :");
        b=input.nextInt();
        System.out.print("Ucuncu sayiyi giriniz :");
        c=input.nextInt();

        if(a>b && a>c && b>c){
                System.out.println("a>b>c");
            }
        else if(a>b && c>b){
                System.out.println("a>c>b");
            }
        else if(b>a && a>c){
                System.out.println("b>a>c");
            }
        else if(c>a&&a>b){
                System.out.println("c>a>b");
            }
        else if(b>c && c>a){
                System.out.println("b>c>a");
            }
        else {
                System.out.println("c>b>a");
            }







        }
    }

