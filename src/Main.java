
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException{

        String metin;

        SifrelemeMetodlari sifrelemeMetodlari = new SifrelemeMetodlari();

        String islem = "Sezar Şifreleme\n"
                + "---İşlemler---\n"
                + "1. Şifreleme\n"
                + "2. Çözme    \n"
                + "q. Çıkış    \n"
                + "--------------";
        boolean dongu = true;
        while (dongu) {
            System.out.println(islem);
            System.out.print("İşlem: ");
            String secim = scanner.nextLine();

            if (secim.equals("1")) {

                System.out.print("Şifrelenecek metin: ");
                metin = scanner.nextLine();
                sifrelemeMetodlari.sifreYapma(metin);
                System.out.println();
                System.out.println();

            }else if (secim.equals("2")) {

                System.out.print("Çözülecek metin: ");
                metin = scanner.nextLine();
                sifrelemeMetodlari.sifreCozme(metin);
                System.out.println();
                System.out.println();

            }else if (secim.equals("q")) {

                System.out.println("Çıkış yapılıyor...");
                Thread.sleep(2000);
                dongu = false;

            }else {
                System.out.println("Geçersiz karakter.");
            }

        }
    }
}
