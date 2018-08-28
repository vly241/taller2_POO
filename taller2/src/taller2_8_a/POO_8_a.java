package taller2_8_a;
import java.util.Calendar;
class POO_8_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar now = Calendar.getInstance();
		 
		System.out.println("Fecha del sistema actual: " + (now.get(Calendar.MONTH) + 1)
						+ "-"
						+ now.get(Calendar.DATE)
						+ "-"
						+ now.get(Calendar.YEAR));
 
		
		String[] strMonths = new String[]{
						"Enero",
						"Febebro",
						"Marzo",
						"Abril",
						"Mayo",
						"Junio",
						"Julio",
						"Agosto",
						"Septiembre",
						"Octubre",
						"Noviembre",
						"Diciembre"};
 
		System.out.println("estamos en el mes de: "+strMonths[now.get(Calendar.MONTH)]);
	}

}
