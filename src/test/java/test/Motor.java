package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int nuevoRegistro) {
		registro = nuevoRegistro;
	}
	
	void asignarTipo(String nuevoTipo) {
		nuevoTipo = nuevoTipo.toLowerCase();
		String[] tipos = {"electrico", "gasolina"};
		
		for (int i = 0; i < tipos.length; i++) {
		      if (tipos[i].equals(nuevoTipo)) {
		    	  tipo = nuevoTipo;
		      }
		    }
	}
}
