import java.util.Scanner;
/*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin
kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int kg;
        double armut,elma,domates,patlican,muz;
        double total;
        System.out.print("Armut kaç kilo ? ");
        armut= inp.nextInt();

        System.out.print("Elma kaç kilo ? ");
        elma= inp.nextInt();

        System.out.print("Domates kaç kilo ? ");
        domates= inp.nextInt();

        System.out.print("Muz kaç kilo ? ");
        muz= inp.nextInt();

        System.out.print("Patlican kaç kilo ? ");
        patlican= inp.nextInt();

        total= (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);

        System.out.println("Ödenecek tutar : "+total);

    }
}
