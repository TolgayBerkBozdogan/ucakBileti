import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, yolculukTipi;

        System.out.println("Yolculuk Tipini Seçiniz \n1-Tek yön \n2-Gidiş-Dönüş");
        yolculukTipi = input.nextInt();
        if (yolculukTipi == 1) {
            System.out.println("Tek Yön");
        } else if (yolculukTipi == 2) {
            System.out.println("Gidiş-Dönüş");
        } else {
            System.out.println("Hatalı Seçim");
        }

        System.out.print("Gideceğiniz km'yi yazınız: ");
        distance = input.nextInt();
        double km = distance * 0.10;
        double yasIndirimi = km * 0.5, yasIndirimi1 = km * 0.1, yasIndirimi3 = km * 0.3, gidisDonusIndirimi =km *0.20 ;

        if (distance <= 0) {
            System.out.println("Hatalı mesafe girdiniz!");
        } else {
            System.out.println("İndirimsiz Tutar " +km+ "TL");
        }

        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();
        if ((age < 12) && (yolculukTipi == 1)) {
            System.out.println("İndirimli Tutar: " + (km - yasIndirimi+ "TL"));
        }else if ((age < 12) && (yolculukTipi == 2)) {
            System.out.println("İndirimli Tutar: " + ((km - yasIndirimi)-gidisDonusIndirimi)+ "TL");

        } else if ((age >= 12) && (age <= 24) && (yolculukTipi == 1)) {
            System.out.println("İndirimli Tutar: " + ((km - yasIndirimi1) + "TL"));
        } else if ((age >= 12) && (age <= 24) && (yolculukTipi == 2)) {
            System.out.println("İndirimli Tutar: " + (((km - yasIndirimi1)-gidisDonusIndirimi) + "TL"));

        } else if ((age >= 65) && (yolculukTipi == 1)) {
            System.out.println("İndirimli Tutar: " + (km - yasIndirimi3 + "TL"));
        } else if ((age >= 65) && (yolculukTipi == 2)) {
            System.out.println("İndirimli Tutar: " + ((km - yasIndirimi3)-gidisDonusIndirimi) + "TL");
        } else if ((age >= 24) && (age <= 65) && (yolculukTipi == 2)) {
            System.out.println("Üzgünüz Yaşınız İndirimli Yaş Kategroisine Dahil Değildir. Gidiş-Dönüş Bilet Tutarı: " + ((km-gidisDonusIndirimi) + "TL"));
        } else {
            System.out.println("Üzgünüz Yaşınız İndirimli Yaş Kategroisine Dahil Değildir. Tutar: " + (km + "TL"));
        }



    }
}
