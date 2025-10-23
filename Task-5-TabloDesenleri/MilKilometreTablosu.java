package görev5karmaşıkçıktıformatları;

public class DonusumTablosu {
    public static void main(String[] args) {
        double mil = 1.0;
        System.out.println("Dönüşüm Tablosu");
        System.out.println("-----------------");
        System.out.printf("%-10s %-15s %-15s%n", "Mil", "Kilometre", "Metre");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= 10; i++) {
            double kilometre = mil * 1.60934;
            double metre = kilometre * 1000;
            System.out.printf("%-10.1f %-15.5f %-15.2f%n", mil, kilometre, metre);
            mil += 1.0;
        }
    }
    
}
