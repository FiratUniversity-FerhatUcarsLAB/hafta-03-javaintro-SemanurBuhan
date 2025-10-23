package bonuslar;

public class Bonus3ParaBozma {
    public static void main(String[] args) {
        int toplamTutar = 576; // Örnek tutar
        int[] banknotlar = {200, 100, 50, 20, 10, 5, 1};
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        System.out.println("Bozulan Banknotlar:");
        for (int banknot : banknotlar) {
            int adet = toplamTutar / banknot;
            if (adet > 0) {
                System.out.println(banknot + " TL: " + adet + " adet");
                toplamTutar %= banknot;
            }
        }
	}
}
