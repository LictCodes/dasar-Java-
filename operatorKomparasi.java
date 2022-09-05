import java.io.* ; 
public class operatorKomparasi {
	public static void main(String[] args) {
		byte a,b;
		boolean hasilKomparasi; // deklarasi
		
		a = 6;
		b = 6;
		hasilKomparasi =(a == b );
		System.out.println("---------".repeat(2));
		System.out.printf("%d == %d ----> %s \n ",a,b,hasilKomparasi);
		
		a = 48;
		b = 9;
		hasilKomparasi = (a <= b );
		System.out.println("---------".repeat(2));
		System.out.printf("%d <= %d ----> %s \n ",a,b,hasilKomparasi);
		
		a = 82;
		b = 9;
		hasilKomparasi = (a >= b);
		System.out.println("---------".repeat(2));
		System.out.printf("%d >= %d ----> %s \n ",a,b,hasilKomparasi);
		
		
	}
}