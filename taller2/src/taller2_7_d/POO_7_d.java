package taller2_7_d;
import java.util.Scanner;
class POO_7_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
		
		System.out.println(" serie fibonacci ");
		int ant=1;
		int ant2=1;
		int f=1;
		int num;
		int i;
		
		
		System.out.println(" ingrese hasta que serie quiere ver la serie de fibonacci:  ");
		num = sc.nextInt();
		
		System.out.println(ant);
		for(i=2; i<=num; i++) {
			System.out.println(f );
			f=ant+ant2;
			ant=ant2;
			ant2=f;
			
		}
		
		System.out.println();
		sc.close();
	}

}
