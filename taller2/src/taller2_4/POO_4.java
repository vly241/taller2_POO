package taller2_4;
import java.util.Scanner;
class POO_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		int v;
		
		System.out.println("ingrese el valor a convertir: ");
		v = sc.nextInt();
		
		System.out.println("programa para determinar conversiones  ");
		System.out.println("ingrese el numero siguiento lo siguiente: ");
		System.out.println("escoja una medida: ");
		System.out.println("1.Bit");
		System.out.println("2.Bytes");
		System.out.println("3.KiloBytes");
		System.out.println("4.MegaBytes");
		System.out.println("5.GigaBytes");
		System.out.println("6.TeraBytes");
		
		x = sc.nextInt();
		
		switch(x) {
		case '1':
			System.out.println("");
			
			break;
		case '2':
			System.out.println("");
			
			break;	
		case '3':
			System.out.println("");
			
			break;
		case '4':
			System.out.println("");
			
			break;
		case '5':
			System.out.println("");
			
			break;
		case '6':
			System.out.println("");
			
			break;
		 default:
	           System.out.println("error" );
	           break;	
	           
	           
		}
		sc.close();
	}

}
