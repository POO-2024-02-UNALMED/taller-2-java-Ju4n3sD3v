package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
	int cantidadAsientos() {
		int cont = 0;
		
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) cont ++;
		}
		return cont;
	}
	
	String verificarIntegridad() {
		String msg = "Las piezas no son originales";
		if (registro == motor.registro) {
			for (int i = 0; i < asientos.length; i++) {
				if (asientos[i] != null) {
					if (registro == asientos[i].registro) {
						msg = "Las piezas no son originales";
						break;
					}else {
						msg = "Auto original";
					}
				}
			}
			
		}
		return msg;
	}
}
