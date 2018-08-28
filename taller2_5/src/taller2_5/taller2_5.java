package taller2_5;
import java.util.Scanner;

class taller2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float km;
		float m;
		
		System.out.println("ingrese la  velocidad en Km/h: ");
		km = sc.nextFloat();
		
		m = km*1000/3600;
		
		System.out.println("la velocidad "+ km +" km/h convertida a m/s es: "+ m);
		sc.close();

	}

}
