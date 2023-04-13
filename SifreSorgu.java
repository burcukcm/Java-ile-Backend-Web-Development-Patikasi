import java.util.Scanner;
/* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
 lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
public class SifreSorgu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String password, password2, userName;
        int secim;

        System.out.print("Kullanici adi giriniz:");
        userName = inp.nextLine();

        System.out.print("Sifre giriniz:");
        password = inp.nextLine();

        if (password.equals("burcu1234") && userName.equals("burcu")) {
            System.out.print("Giris basarili.");
        } else {
            System.out.println("Giris basarisiz.");
            System.out.print("Sifrenizi sıfırlamak istiyor musunuz? İstiyorsan 1'e, İstemiyorsan 2'ye bas!");
            secim = inp.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yeni sifrenizi giriniz:");
                    password2 = inp.next();
                    if (password2.equals("burcu234")) {
                        System.out.print("Yeni sifreniz eskisiyle ayni olamaz.");
                    } else {
                        System.out.print("Sifreniz degistirilmistir.");
                    }
                    break;
                case 2:
                    System.out.print("İslem sonlandi.");
                    break;
                default:
                    System.out.print("Hatali giris!");
            }
        }
    }
}

