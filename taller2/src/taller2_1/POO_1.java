package taller2_1;
import java.util.Scanner;
class POO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner (System.in);
			
			int[] num= new int[4];
			int i;
			
			System.out.println("proceda a digitar 4 numeros: ");
			
			for(i=0;i<4;i++) {
				
				num[i]=sc.nextInt();
				
			}
			sc.close();
			for (i=3;i>=0;i--) {
				System.out.println(""+num[i]);
			}
	}

}
