public class tipeData{
	
	public static void main(String[] args){
	   // Tipe data di java adalah :
	   /*
	   integer : int
	   string : String
	   byte : byte
	   long 
	   short
	   double 
	   float
	   char
	   boolean 
	   */
	 /*
	1 bytes = 8 bit 
	*/
	System.out.println("\n\n1 bytes := 8 bit \n\n");
	   int i = 100; // (Satuan)
	 System.out.println("====== INTEGER ======");
	 System.out.println("Nilai dari variabel i dengan tipe data integer adalah : " + i);
	 System.out.println("Ninai Max dari integer adalah : " + Integer.MAX_VALUE);
	System.out.println("Ninai Min dari integer adalah : " + Integer.MIN_VALUE);
	System.out.println("Besar integer : " + Integer.BYTES + " bytes");
	System.out.println("Besar integer : " + Integer.SIZE + " bit");

	
	
	//
	byte b = 70; //  (Satuan)
	 System.out.println("\n====== BYTES ======");
	 System.out.println("Nilai dari variabel b dengan tipe data byte adalah : " + b);
	 System.out.println("Ninai Max dari byte adalah : " + Byte.MAX_VALUE);
	System.out.println("Ninai Min dari byte adalah : " + Byte.MIN_VALUE);
	System.out.println("Besar byte : " + Byte.BYTES + " bytes");
	System.out.println("Besar byte : " + Byte.SIZE + " bit");
	
	
	
	// 
	short s = 60; //  (Satuan)
	 System.out.println("\n====== SHORT ======");
	 System.out.println("Nilai dari variabel s dengan tipe data short adalah : " + s);
	 System.out.println("Ninai Max dari short adalah : " + Short.MAX_VALUE);
	System.out.println("Ninai Min dari short adalah : " + Short.MIN_VALUE);
	System.out.println("Besar Short : " + Short.BYTES + " bytes");
	System.out.println("Besar Short : " + Short.SIZE + " bit");
	
	
	long l = 800L; //  (Satuan)
	 System.out.println("\n====== LONG ======");
	 System.out.println("Nilai dari variabel l dengan tipe data long adalah : " + l);
	 System.out.println("Ninai Max dari long adalah : " + Long.MAX_VALUE);
	System.out.println("Ninai Min dari long adalah : " + Long.MIN_VALUE);
	System.out.println("Besar Long : " + Long.BYTES + " bytes");
	System.out.println("Besar Long : " + Long.SIZE + " bit");
	
	

		double d = 7.5d; //  (koma, bilangan real)
	 System.out.println("\n====== DOUBLE ======");
	 System.out.println("Nilai dari variabel d dengan tipe data double adalah : " + d);
	 System.out.println("Ninai Max dari double adalah : " + Double.MAX_VALUE);
	System.out.println("Ninai Min dari double adalah : " + Double.MIN_VALUE);
	System.out.println("Besar Double : " + Double.BYTES + " bytes");
	System.out.println("Besar Double  : " + Double.SIZE + " bit");
	

	float f = 0.5f; //  (koma, bilangan real)
	 System.out.println("\n====== FLOAT ======");
	 System.out.println("Nilai dari variabel f dengan tipe data float adalah : " + f);
	 System.out.println("Ninai Max dari float adalah : " + Float.MAX_VALUE);
	System.out.println("Ninai Min dari float adalah : " + Float.MIN_VALUE);
	System.out.println("Besar Float : " + Float.BYTES + " bytes");
	System.out.println("Besar Float  : " + Float.SIZE + " bit");
	
	
	
	//  (Karakter berdasarkan ascii)
	 char c = '&'; 
	 System.out.println("\n====== CHAR ======");
	 System.out.printf("Nilai dari variabel  dengan tipe data char adalah : %c \n",c);
	 System.out.println("Ninai Max dari Char adalah : " + Character.MAX_VALUE);
	System.out.println("Ninai Min dari Char adalah : " + Character.MIN_VALUE);
	System.out.println("Besar Char : " + Character.BYTES + " bytes");
	System.out.println("Besar Char  : " + Character.SIZE + " bit");
	
	
	// TRUE , FALSE : true , false
	boolean val_b = true;
	System.out.println("\n====== BOOLEAN ======");
	System.out.println("Nilai dari variabel val_b dengan tipe data boolean adalah : " + val_b);
	System.out.println("Ninai Max dari Char adalah : " + Boolean.TRUE);
	System.out.println("Ninai Min dari Char adalah : " + Boolean.FALSE);
	}
}