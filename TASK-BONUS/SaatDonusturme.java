package bonuslar;

public class Bonus1SaatDonusturme {
    public static void main(String[] args) {
        int totalSeconds = 5000; // Örnek toplam saniye
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%d saniye = %d saat, %d dakika, %d saniye%n", totalSeconds, hours, minutes, seconds);
    }
}
