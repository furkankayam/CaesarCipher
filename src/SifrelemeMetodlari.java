import java.util.Scanner;

public class SifrelemeMetodlari {
    private static Scanner scanner = new Scanner(System.in);

    String metin;
    String alfabe = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

    String[] alfabeDizi = alfabe.split("");

    public int harfBul(String alfabe, char harf) {
        int sayac = 0;
        for (int i = 0; alfabe.length()>i; ++i) {
            if (harf == alfabe.charAt(i)) {
                break;
            }
            ++sayac;
        }
        return sayac;
    }

    public void sifreYapma(String metin) throws InterruptedException {

        String[] metinDizi = metin.split("");
        System.out.print("Kaç karakter ileri ötelensin: ");
        int oteleme = scanner.nextInt();

        Thread.sleep(2000);

        int kacinci = 0;

        for (int i = 0; metin.length()>i; ++i) {
            char a = metin.charAt(i);
            kacinci = harfBul(alfabe, a);
            metinDizi[i] = alfabeDizi[kacinci + oteleme];
        }

        System.out.print("Şifreli metin: ");
        for (String temp : metinDizi) {
            System.out.print(temp);

        }

    }

    public void sifreCozme(String metin) throws InterruptedException {

        String[] metinDizi = metin.split("");
        System.out.print("Kaç karakter geri ötelensin: ");
        int oteleme = scanner.nextInt();

        Thread.sleep(2000);

        StringBuffer buffer = new StringBuffer(alfabe);
        buffer.reverse();

        String tersAlfabe = buffer.toString();
        String[] tersAlfabeDizi = tersAlfabe.split("");

        int kacinci = 0;

        for (int i = 0; metin.length()>i; ++i) {
            char a = metin.charAt(i);
            kacinci = harfBul(tersAlfabe, a);
            metinDizi[i] = tersAlfabeDizi[kacinci + oteleme];
        }

        System.out.print("Çözülen metin: ");
        for (String temp : metinDizi) {
            System.out.print(temp);

        }

    }

}
