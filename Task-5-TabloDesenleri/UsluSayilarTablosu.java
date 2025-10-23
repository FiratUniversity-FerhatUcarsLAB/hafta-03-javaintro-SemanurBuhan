package görev5karmaşıkçıktıformatları;

public class UsluSayılarTablosu {
    public static void main(String[] args) {
	        System.out.println("Üslü Sayılar Tablosu");
	        System.out.println("---------------------");
	        System.out.printf("%-10s %-10s %-10s %-10s%n", "Sayı", "Karesi", "Küpü", "Dördüncü Kuvveti");
	        System.out.println("----------------------------------------------");
	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%-10d %-10d %-10d %-10d%n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3), (int)Math.pow(i, 4));
	        }
	  }
     }
