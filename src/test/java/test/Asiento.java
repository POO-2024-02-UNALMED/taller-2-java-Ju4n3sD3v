package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String nuevoColor) {
		nuevoColor = nuevoColor.toLowerCase();
		String[] colores = {"rojo", "verde", "amarillo", "negro", "blanco"};
		
		for (int i = 0; i < colores.length; i++) {
		      if (colores[i].equals(nuevoColor)) {
		    	  color = nuevoColor;
		      }
		    }
	}
}
