package bonuslar;

public class Bonus2VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double kilo = 70.0; // Kilo (kg)
	        double boy = 1.75 ; // Boy (metre)
	        double bmi = kilo / (boy * boy);
	        
	        System.out.println("Boy =" + boy);
	        System.out.println("Kilo =" + kilo);
	        System.out.println("BMI = Kilo / (Boy * Boy) =" + kilo /(boy * boy));
	        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f%n", bmi);
	    }
	}
