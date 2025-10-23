package görev4metinvestring;

public class HesapOzeti {
    public static void main(String[] args) {
        String isim = "Semanur Buhan";
        String hesapNo = "1234567890";
        double bakiye = 2500.75;
        double sonIslemMiktari = -150.50; // Eksi değer para çekme işlemi için

        System.out.println("===== HESAP ÖZETİ =====");
        System.out.println("İsim: " + isim);
        System.out.println("Hesap Numarası: " + hesapNo);
        System.out.printf("Bakiye: %.2f TL%n", bakiye);
        System.out.printf("Son İşlem Miktarı: %.2f TL%n", sonIslemMiktari);
        System.out.println("=======================");
    }
    
}
