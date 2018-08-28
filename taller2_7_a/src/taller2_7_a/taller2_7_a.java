package taller2_7_a;
import java.util.Scanner;

class taller2_7_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int i;
		int x;
		
		System.out.println("ingrese el numero de la tabla que desea ver: ");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			
			for(x=1; x<=12; x++) {
				
				System.out.println(i + "x" + x +"="+i*x);
			}
			
			    System.out.println();
		}
sc.close();
	}

}
