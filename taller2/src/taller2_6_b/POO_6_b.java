package taller2_6_b;

class POO_6_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nn=50;
		int n1=1;
		int n2;
		
		
			
			for(n2 = 1; n2 <= nn; n2++) {
				if(n2 % 2 == 0) {
				if(n2 < nn) {
					System.out.println(+ n2 +"+");
					
					
				}else {
					System.out.println(+ n2);
				}
				
				n1 = n2 + n1;
				
				if(n2 == nn) {
					System.out.println("="+ n1);
				}
			}
		}
		
		
	}

}
