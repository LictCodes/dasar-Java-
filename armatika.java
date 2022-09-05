public class armatika {
	public static void main(String[] args) {
		// OPERASI ARITMATIKA 
		/*
		1.Penjumlahan 
		2.pengurangan 
		3.perkalian 
		4.pembagian
		5.modulus
		*/
		
		
		// penjumlahan 
		int e,w,hasil;
		e = 100;
		w = 291;
		hasil = e + w ;
		System.out.println("=== PENJUMLAHAN ===");
		System.out.printf("%d + %d = %d ",e,w,hasil);
		hasil = e - w ;
		System.out.println("\n=== PENGURANGAN ===");
		System.out.printf("%d - %d = %d ",e,w,hasil);
		hasil = e * w ;
		System.out.println("\n=== PERKALIAN ===");
		System.out.printf("%d x %d = %d ",e,w,hasil);
		hasil = e / w ;
		System.out.println("\n=== PEMBAGIAN ===");
		System.out.printf("%d / %d = %d ",e,w,hasil);
	hasil = e % w ;
		System.out.println("\n=== Modulus ===");
		System.out.printf("%d %% %d = %d ",e,w,hasil);
	}
	
}