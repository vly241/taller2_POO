package taller2_7_b;
import java.util.Scanner;
class POO_7_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("ingrese el numero para sacar su factorial: ");
		num = sc.nextInt();
		System.out.println("el factorial es: "+fac(num));
		sc.close();
	}
	
	public static int fac(int num) {
		
		int x=1;
		
		for(int i=1; i <= num;i++) {
			x *=i;
		}
		return x;
	}

}
