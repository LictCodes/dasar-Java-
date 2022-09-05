public class konversiTipeData {
	public static void main(String[] args) {
		int i = 10;
		long h = (long)i ;
		System.out.printf("%d \n",h);
		byte g = (byte) i ;
		System.out.printf("%d \n",g);
		// Modulus 
		i = 80;
		float j = 6;
		float has = i %h;
		System.out.printf(" %d %% %f = %f ",i,j,has);
	}
}