import java.util.Scanner;
public class ucgenAlan {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

        double cevre ,alan ,k1,k2,k3;
        double u;
        System.out.print("Birinci kenar uzunlugu : ");
        k1 =input.nextDouble();
        System.out.print("İkinci kenar uzunlugu : ");
        k2 =input.nextDouble();
        System.out.print("Ucuncu kenar uzunlugu : ");
        k3 =input.nextDouble();

        u =( k1 + k2 + k3) / 2;
        alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - k3));

        System.out.println("Ucgenin alanı= " +alan);



    }
}
