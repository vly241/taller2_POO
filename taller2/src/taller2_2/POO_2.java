package taller2_2;
import java.util.Scanner;
class POO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int numero;
		int n2;
		int n4;
		int n5;
		
		System.out.println("ingrese el numero: ");
		numero = sc.nextInt();
		
	
	sc.close();
		n2 = numero*2;
		n4 = numero*4;
		n5 = numero*5;
		
		System.out.println("el nuemro: "+ numero +" y su doble es: "+ n2 +" su cuadruple es: "+ n4 +" y su quintople es: "+ n5);
	
	}

}
