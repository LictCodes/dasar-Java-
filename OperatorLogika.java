import java.util.*;

public class OperatorLogika {
	public static void main(String[] args) {
		int m,Umur;
		Scanner input = new Scanner(System.in);	
		System.out.print("Masukan Umur mu  ");
		Umur = input.nextInt();
		if(Umur > 12){
			System.out.println("Remaja berumur " + Umur);
		}
		else if(Umur < 12){
			System.out.println("Anak - Anak berumur " + Umur );
		}
		else if( Umur < 1){
		}
		else if(Umur > 20){
			System.out.println("Dewas Berumur " + Umur );
			
		}
	}
}