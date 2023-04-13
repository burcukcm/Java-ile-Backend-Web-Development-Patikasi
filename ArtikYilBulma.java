import java.util.Scanner;
public class ArtikYilBulma {
    //Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil;
        int artikyil;

        System.out.print("Lutfen bir yil giriniz: ");
        yil=input.nextInt();

        if(yil%4==0){
            System.out.print(+yil+" bir artık yildir. ");
        }
        else if (yil%100==0 && yil%400==0) {
            System.out.print(yil+ "bir artik yildir.");
        }
        else {
            System.out.print(yil+ " bir artık yıl değildir.");
        }

    }
}
