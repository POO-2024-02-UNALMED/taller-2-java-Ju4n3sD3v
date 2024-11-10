package test;


public class prueba {
	
	
	public static void main(String[] args) {
		Auto a = new Auto();
		
		a.asientos = new Asiento[5];
		
		a.asientos[0] = new Asiento();
		a.asientos[4] = new Asiento();
		
		for (int i = 0; i < a.asientos.length; i++) {
			System.out.println(a.asientos[i]);
		}

		
		}
	}