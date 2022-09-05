import java.util.Scanner;

public class javaScann{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Masukan Umurmu? : ");	
		byte a = input.nextByte();
		System.out.println("Umurmu adalah : " + a);
		
	}
}