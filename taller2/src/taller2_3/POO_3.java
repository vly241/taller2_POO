package taller2_3;
import java.util.Scanner;
class POO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float grados;
		float fah;
		
		System.out.println("ingrese el numero: ");
		grados = sc.nextFloat();
		sc.close();
		
		fah = 32+(9*grados/5);
		
		System.out.println("los grados centigrados "+ grados +" covertidos a fahrenheit es: "+ fah);
		
	}

}
